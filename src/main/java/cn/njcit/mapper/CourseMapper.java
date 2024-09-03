package cn.njcit.mapper;

import cn.njcit.entity.Course;
import cn.njcit.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 课程信息 Mapper 接口
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
public interface CourseMapper extends BaseMapper<Course> {
    public List<Course> getAllCourses();
    public Course getCourseById(Long id);
}
