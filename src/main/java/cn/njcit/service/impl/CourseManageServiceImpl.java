package cn.njcit.service.impl;

import cn.njcit.entity.CourseManage;
import cn.njcit.entity.User;
import cn.njcit.mapper.CourseManageMapper;
import cn.njcit.service.ICourseManageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 课程管理表 服务实现类
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@Service
public class CourseManageServiceImpl extends ServiceImpl<CourseManageMapper, CourseManage> implements ICourseManageService {

    private final int PAGE_SIZE = 5;

    @Override
    public PageInfo<CourseManage> getCourseManageList(Integer page, String searchName) {
        PageHelper.startPage(page, PAGE_SIZE);
        List<CourseManage> courseManageList = null;
        if(searchName == null || searchName.trim().equals("")){
            courseManageList = baseMapper.getAllCourseManages();
        }else{
            courseManageList = baseMapper.searchCourseManage(searchName);
        }
        return new PageInfo<>(courseManageList);
    }
}
