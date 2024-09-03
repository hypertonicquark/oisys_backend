package cn.njcit.controller;

import cn.njcit.entity.CourseManage;
import cn.njcit.entity.User;
import cn.njcit.service.ICourseManageService;
import cn.njcit.util.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 课程管理表 前端控制器
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@RestController
@RequestMapping("/courseManage")
public class CourseManageController {
    @Autowired
    private ICourseManageService courseManageService;

    @GetMapping("/list")
    public ResponseResult studentManage(@RequestParam(defaultValue = "1") Integer page,
                                        @RequestParam(required = false) String searchName){
        PageInfo<CourseManage> courseManageList = courseManageService.getCourseManageList(page, searchName);
        return ResponseResult.ok().put("courseManageList", courseManageList);
    }
}
