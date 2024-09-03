package cn.njcit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 考勤打卡
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@TableName("aoa_attends_list")
public class AttendsList implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "attends_id", type = IdType.AUTO)
    private Long attendsId;

    /**
     * 经度
     */
    private String longitude;

    private String attendsRemark;

    private LocalDateTime attendsTime;

    /**
     * 考勤状态：10-正常  11-迟到  12-早退
     */
    private Long statusId;

    /**
     * 类型：8-上课打卡  9-下课打卡
     */
    private Long typeId;

    /**
     * 打卡日期
     */
    private String attendsDate;

    private Long attendsUserId;

    private String attendHmtime;

    private String weekOfday;

    private Object holidayDays;

    private LocalDate holidayStart;

    /**
     * 课程id
     */
    private Long courseId;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 打卡类型(0-pc 1-手机)
     */
    private Integer clockType;

    /**
     * 打卡头像
     */
    private String clockImage;

    /**
     * 打卡地址
     */
    private String clockAdress;

    /**
     * 课程设置id
     */
    private Long settingId;

    public Long getAttendsId() {
        return attendsId;
    }

    public void setAttendsId(Long attendsId) {
        this.attendsId = attendsId;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAttendsRemark() {
        return attendsRemark;
    }

    public void setAttendsRemark(String attendsRemark) {
        this.attendsRemark = attendsRemark;
    }

    public LocalDateTime getAttendsTime() {
        return attendsTime;
    }

    public void setAttendsTime(LocalDateTime attendsTime) {
        this.attendsTime = attendsTime;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getAttendsDate() {
        return attendsDate;
    }

    public void setAttendsDate(String attendsDate) {
        this.attendsDate = attendsDate;
    }

    public Long getAttendsUserId() {
        return attendsUserId;
    }

    public void setAttendsUserId(Long attendsUserId) {
        this.attendsUserId = attendsUserId;
    }

    public String getAttendHmtime() {
        return attendHmtime;
    }

    public void setAttendHmtime(String attendHmtime) {
        this.attendHmtime = attendHmtime;
    }

    public String getWeekOfday() {
        return weekOfday;
    }

    public void setWeekOfday(String weekOfday) {
        this.weekOfday = weekOfday;
    }

    public Object getHolidayDays() {
        return holidayDays;
    }

    public void setHolidayDays(Object holidayDays) {
        this.holidayDays = holidayDays;
    }

    public LocalDate getHolidayStart() {
        return holidayStart;
    }

    public void setHolidayStart(LocalDate holidayStart) {
        this.holidayStart = holidayStart;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getClockType() {
        return clockType;
    }

    public void setClockType(Integer clockType) {
        this.clockType = clockType;
    }

    public String getClockImage() {
        return clockImage;
    }

    public void setClockImage(String clockImage) {
        this.clockImage = clockImage;
    }

    public String getClockAdress() {
        return clockAdress;
    }

    public void setClockAdress(String clockAdress) {
        this.clockAdress = clockAdress;
    }

    public Long getSettingId() {
        return settingId;
    }

    public void setSettingId(Long settingId) {
        this.settingId = settingId;
    }

    @Override
    public String toString() {
        return "AttendsList{" +
            "attendsId = " + attendsId +
            ", longitude = " + longitude +
            ", attendsRemark = " + attendsRemark +
            ", attendsTime = " + attendsTime +
            ", statusId = " + statusId +
            ", typeId = " + typeId +
            ", attendsDate = " + attendsDate +
            ", attendsUserId = " + attendsUserId +
            ", attendHmtime = " + attendHmtime +
            ", weekOfday = " + weekOfday +
            ", holidayDays = " + holidayDays +
            ", holidayStart = " + holidayStart +
            ", courseId = " + courseId +
            ", latitude = " + latitude +
            ", clockType = " + clockType +
            ", clockImage = " + clockImage +
            ", clockAdress = " + clockAdress +
            ", settingId = " + settingId +
        "}";
    }
}
