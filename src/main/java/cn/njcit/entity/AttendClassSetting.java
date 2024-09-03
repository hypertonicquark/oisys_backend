package cn.njcit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 课程时间设置
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@TableName("aoa_attend_class_setting")
public class AttendClassSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 课程id
     */
    private Long courseId;

    /**
     * 上课周期
     */
    private String attendClassWeek;

    /**
     * 上课时间
     */
    private String startTime;

    /**
     * 下课时间
     */
    private String endTime;

    /**
     * 教学地点
     */
    private String address;

    /**
     * 0未删除 1删除
     */
    private Integer delFlag;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getAttendClassWeek() {
        return attendClassWeek;
    }

    public void setAttendClassWeek(String attendClassWeek) {
        this.attendClassWeek = attendClassWeek;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "AttendClassSetting{" +
            "id = " + id +
            ", courseId = " + courseId +
            ", attendClassWeek = " + attendClassWeek +
            ", startTime = " + startTime +
            ", endTime = " + endTime +
            ", address = " + address +
            ", delFlag = " + delFlag +
            ", longitude = " + longitude +
            ", latitude = " + latitude +
        "}";
    }
}
