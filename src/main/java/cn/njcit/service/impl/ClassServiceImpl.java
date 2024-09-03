package cn.njcit.service.impl;

import cn.njcit.entity.OIClass;
import cn.njcit.entity.User;
import cn.njcit.mapper.ClassMapper;
import cn.njcit.service.IClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 班级信息 服务实现类
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, OIClass> implements IClassService {

    private final int PAGE_SIZE = 10;

    @Override
    public PageInfo<OIClass> getClassList(Integer page, String searchName) {
        PageHelper.startPage(page, PAGE_SIZE);
        List<OIClass> classList = null;
        if(searchName == null || searchName.trim().equals("")){
            classList = baseMapper.getAllClasses();
        }else{
            classList = baseMapper.searchClasses(searchName);
        }
        return new PageInfo<>(classList);
    }

    @Override
    public OIClass getClassById(Long id) {
        OIClass oiClass = baseMapper.getClassById(id);
        return oiClass;
    }
}
