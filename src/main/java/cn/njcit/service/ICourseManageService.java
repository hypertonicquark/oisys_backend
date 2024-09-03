package cn.njcit.service;

import cn.njcit.entity.CourseManage;
import cn.njcit.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 课程管理表 服务类
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
public interface ICourseManageService extends IService<CourseManage> {
    public PageInfo<CourseManage> getCourseManageList(Integer page, String searchName);
}
