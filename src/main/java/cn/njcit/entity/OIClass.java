package cn.njcit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 班级信息
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@TableName("aoa_class")
public class OIClass implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "class_id", type = IdType.AUTO)
    private Long classId;

    /**
     * 班级编号
     */
    private String classNo;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 所在院系
     */
    private String faculty;

    /**
     * 年级
     */
    private String grade;

    /**
     * 专业
     */
    private String major;

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Class{" +
            "classId = " + classId +
            ", classNo = " + classNo +
            ", className = " + className +
            ", faculty = " + faculty +
            ", grade = " + grade +
            ", major = " + major +
        "}";
    }
}
