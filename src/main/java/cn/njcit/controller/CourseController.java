package cn.njcit.controller;

import cn.njcit.entity.Course;
import cn.njcit.entity.OIClass;
import cn.njcit.entity.User;
import cn.njcit.service.ICourseService;
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
 * 课程信息 前端控制器
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @GetMapping("/list")
    public ResponseResult studentManage(@RequestParam(defaultValue = "1") Integer page){
        PageInfo<Course> courseList = courseService.getCourseList(page);
        return ResponseResult.ok().put("courseList", courseList);
    }

    @GetMapping("/edit")
    public ResponseResult studentEdit(@RequestParam(required = false) Long courseId){
        ResponseResult responseResult = ResponseResult.ok();
        if(courseId != null){
            Course course = courseService.getCourseById(courseId);
            responseResult.put("course", course);
        }
        return responseResult;
    }

    @PostMapping("/save")
    public ResponseResult saveStudent(Course course) throws IOException, InterruptedException {
        if(course.getId() == null){
            QueryWrapper<Course> wrapper = new QueryWrapper<>();
            wrapper.eq("course_no", course.getCourseNo());
            if(courseService.count(wrapper) > 0){
                return ResponseResult.error("课程编号被占用，请换一个");
            }
        }
        return courseService.saveOrUpdate(course) ? ResponseResult.ok("保存成功") : ResponseResult.error("保存失败");
    }
}
