package cn.njcit.service;

import cn.njcit.entity.OIClass;
import cn.njcit.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 班级信息 服务类
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
public interface IClassService extends IService<OIClass> {
    public PageInfo<OIClass> getClassList(Integer page, String searchName);
    public OIClass getClassById(Long id);
}
