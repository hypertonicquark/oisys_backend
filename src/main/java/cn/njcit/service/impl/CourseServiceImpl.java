package cn.njcit.service.impl;

import cn.njcit.entity.Course;
import cn.njcit.entity.User;
import cn.njcit.mapper.CourseMapper;
import cn.njcit.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 课程信息 服务实现类
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

    private final int PAGE_SIZE = 10;

    @Override
    public PageInfo<Course> getCourseList(Integer page) {
        PageHelper.startPage(page, PAGE_SIZE);
        List<Course> courseList = null;
        courseList = baseMapper.getAllCourses();
        return new PageInfo<>(courseList);
    }

    @Override
    public Course getCourseById(Long id) {
        Course course = baseMapper.getCourseById(id);
        return course;
    }
}
