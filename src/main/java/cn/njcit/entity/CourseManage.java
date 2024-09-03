package cn.njcit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 课程管理表
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@TableName("aoa_course_manage")
public class CourseManage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 课程编号
     */
    private String courseNo;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 教师编号
     */
    private String teacherNo;

    /**
     * 教师名称
     */
    private String teacherName;

    /**
     * 班级编号
     */
    private String classNo;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建用户
     */
    private String createUser;

    /**
     * 更新用户
     */
    private String updateUser;

    /**
     * 删除标识,0未删除 1删除
     */
    private Integer delFlag;

    private List<AttendClassSetting> attendClassSettingList;

    public List<AttendClassSetting> getAttendClassSettingList() {
        return attendClassSettingList;
    }

    public void setAttendClassSettingList(List<AttendClassSetting> attendClassSettingList) {
        this.attendClassSettingList = attendClassSettingList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "CourseManage{" +
            "id = " + id +
            ", courseNo = " + courseNo +
            ", courseName = " + courseName +
            ", teacherNo = " + teacherNo +
            ", teacherName = " + teacherName +
            ", classNo = " + classNo +
            ", className = " + className +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
            ", createUser = " + createUser +
            ", updateUser = " + updateUser +
            ", delFlag = " + delFlag +
        "}";
    }
}
