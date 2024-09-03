package cn.njcit.controller;

import cn.njcit.entity.OIClass;
import cn.njcit.entity.User;
import cn.njcit.service.IClassService;
import cn.njcit.service.IUserService;
import cn.njcit.util.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@RestController
@RequestMapping("/studentManage")
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IClassService classService;

    @GetMapping("/list")
    public ResponseResult studentManage(@RequestParam(defaultValue = "1") Integer page,
                                        @RequestParam(required = false) String searchName){
        PageInfo<User> studentList = userService.getStudentList(page, searchName);
        return ResponseResult.ok().put("studentList", studentList);
    }

    @GetMapping("/edit")
    public ResponseResult studentEdit(@RequestParam(required = false) Long userId){
        ResponseResult responseResult = ResponseResult.ok();
        if(userId != null){
            User user = userService.getStudentById(userId);
            responseResult.put("student", user);
        }
        List<OIClass> classes = classService.list();
        responseResult.put("classes", classes);
        return responseResult;
    }

    @PostMapping("/save")
    public ResponseResult saveStudent(User user, @RequestParam(required = false) MultipartFile filePath,
                                      @RequestParam(required = false) boolean resetPassword) throws IOException, InterruptedException {
        if(user.getUserId() == null){
            QueryWrapper<User> wrapper = new QueryWrapper<>();
            wrapper.eq("is_lock", 0).eq("role_id", 4).eq("user_name", user.getUserName());
            if(userService.count(wrapper) > 0){
                return ResponseResult.error("用户名被占用，请换一个");
            }
            user.setRoleId(4L);
            user.setIsLock(0);
        }
        String imgPath = userService.upload(filePath);
        if(!StringUtil.isEmpty(imgPath)){
            user.setImgPath(imgPath);
        } else if (user.getUserId() == null) {
            user.setImgPath("oasys.jpg");
        }
        if(resetPassword){
            user.setPassword("123456");
        }
        user.setModifyTime(LocalDateTime.now());
        return userService.saveOrUpdate(user) ? ResponseResult.ok("保存成功") : ResponseResult.error("保存失败");
    }

    @DeleteMapping("/delete")
    public ResponseResult deleteStudent(Long userId){
        User user = new User();
        user.setUserId(userId);
        user.setIsLock(1);
        return userService.updateById(user) ? ResponseResult.ok("成功删除!") : ResponseResult.error("删除失败!");
    }
}
