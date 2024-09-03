package cn.njcit.mapper;

import cn.njcit.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
public interface UserMapper extends BaseMapper<User> {
    public List<User> getAllStudents();
    public List<User> searchStudents(String searchName);
    public User getStudentById(Long id);
}
