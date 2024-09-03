package cn.njcit.mapper;

import cn.njcit.entity.OIClass;
import cn.njcit.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 班级信息 Mapper 接口
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
public interface ClassMapper extends BaseMapper<OIClass> {
    public List<OIClass> getAllClasses();
    public List<OIClass> searchClasses(String searchName);
    public OIClass getClassById(Long id);
}
