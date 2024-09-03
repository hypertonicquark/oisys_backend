package cn.njcit.controller;

import cn.njcit.entity.OIClass;
import cn.njcit.entity.User;
import cn.njcit.service.IClassService;
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
 * 班级信息 前端控制器
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private IClassService classService;

    @GetMapping("/list")
    public ResponseResult classManage(@RequestParam(defaultValue = "1") Integer page,
                                        @RequestParam(required = false) String searchName){
        PageInfo<OIClass> classList = classService.getClassList(page, searchName);
        return ResponseResult.ok().put("classList", classList);
    }

    @GetMapping("/edit")
    public ResponseResult classEdit(@RequestParam(required = false) Long classId){
        ResponseResult responseResult = ResponseResult.ok();
        if(classId != null){
            OIClass oiClass = classService.getClassById(classId);
            responseResult.put("class", oiClass);
        }
        return responseResult;
    }

    @PostMapping("/save")
    public ResponseResult saveStudent(OIClass oiClass) throws IOException, InterruptedException {
        if(oiClass.getClassId() == null){
            QueryWrapper<OIClass> wrapper = new QueryWrapper<>();
            wrapper.eq("class_no", oiClass.getClassNo());
            if(classService.count(wrapper) > 0){
                return ResponseResult.error("班级编号被占用，请换一个");
            }
        }
        return classService.saveOrUpdate(oiClass) ? ResponseResult.ok("保存成功") : ResponseResult.error("保存失败");
    }

    @DeleteMapping("/delete")
    public ResponseResult deleteStudent(Long classId){
        return classService.removeById(classId) ? ResponseResult.ok("成功删除!") : ResponseResult.error("删除失败!");
    }
}
