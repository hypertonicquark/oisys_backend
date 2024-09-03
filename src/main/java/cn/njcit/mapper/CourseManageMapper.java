package cn.njcit.mapper;

import cn.njcit.entity.CourseManage;
import cn.njcit.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 课程管理表 Mapper 接口
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
public interface CourseManageMapper extends BaseMapper<CourseManage> {
    public List<CourseManage> getAllCourseManages();
    public List<CourseManage> searchCourseManage(String searchName);
}
