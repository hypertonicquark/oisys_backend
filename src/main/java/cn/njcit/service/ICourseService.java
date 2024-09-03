package cn.njcit.service;

import cn.njcit.entity.Course;
import cn.njcit.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 课程信息 服务类
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
public interface ICourseService extends IService<Course> {
    public PageInfo<Course> getCourseList(Integer page);
    public Course getCourseById(Long id);
}
