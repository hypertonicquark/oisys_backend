package cn.njcit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author njcit
 * @since 2024-09-02
 */
@TableName("aoa_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    private String address;

    private String bank;

    private LocalDateTime birth;

    private String eamil;

    private String fatherId;

    private LocalDateTime hireTime;

    private String userIdcard;

    private String imgPath;

    private Integer isLock;

    private String lastLoginIp;

    private LocalDateTime lastLoginTime;

    private LocalDateTime modifyTime;

    private Long modifyUserId;

    private String password;

    private String realName;

    private Double salary;

    private String userSchool;

    private String sex;

    private String themeSkin;

    private String userEdu;

    private String userName;

    private String userSign;

    private String userTel;

    private Long deptId;

    private Long positionId;

    private Long roleId;

    private Integer superman;

    private Integer holiday;

    private String pinyin;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 入学日期
     */
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate entranceDate;

    /**
     * 学籍状态
     */
    private Integer studentStatus;

    /**
     * 人脸唯一Id
     */
    private String faceId;

    /**
     * 人脸特征
     */
    private byte[] faceFeature;

    @TableField(exist = false)
    public OIClass oiClass;

    public OIClass getOiClass() {
        return oiClass;
    }

    public void setOiClass(OIClass oiClass) {
        this.oiClass = oiClass;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }

    public LocalDateTime getHireTime() {
        return hireTime;
    }

    public void setHireTime(LocalDateTime hireTime) {
        this.hireTime = hireTime;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getThemeSkin() {
        return themeSkin;
    }

    public void setThemeSkin(String themeSkin) {
        this.themeSkin = themeSkin;
    }

    public String getUserEdu() {
        return userEdu;
    }

    public void setUserEdu(String userEdu) {
        this.userEdu = userEdu;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getSuperman() {
        return superman;
    }

    public void setSuperman(Integer superman) {
        this.superman = superman;
    }

    public Integer getHoliday() {
        return holiday;
    }

    public void setHoliday(Integer holiday) {
        this.holiday = holiday;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public LocalDate getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(LocalDate entranceDate) {
        this.entranceDate = entranceDate;
    }

    public Integer getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(Integer studentStatus) {
        this.studentStatus = studentStatus;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public byte[] getFaceFeature() {
        return faceFeature;
    }

    public void setFaceFeature(byte[] faceFeature) {
        this.faceFeature = faceFeature;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId = " + userId +
            ", address = " + address +
            ", bank = " + bank +
            ", birth = " + birth +
            ", eamil = " + eamil +
            ", fatherId = " + fatherId +
            ", hireTime = " + hireTime +
            ", userIdcard = " + userIdcard +
            ", imgPath = " + imgPath +
            ", isLock = " + isLock +
            ", lastLoginIp = " + lastLoginIp +
            ", lastLoginTime = " + lastLoginTime +
            ", modifyTime = " + modifyTime +
            ", modifyUserId = " + modifyUserId +
            ", password = " + password +
            ", realName = " + realName +
            ", salary = " + salary +
            ", userSchool = " + userSchool +
            ", sex = " + sex +
            ", themeSkin = " + themeSkin +
            ", userEdu = " + userEdu +
            ", userName = " + userName +
            ", userSign = " + userSign +
            ", userTel = " + userTel +
            ", deptId = " + deptId +
            ", positionId = " + positionId +
            ", roleId = " + roleId +
            ", superman = " + superman +
            ", holiday = " + holiday +
            ", pinyin = " + pinyin +
            ", classId = " + classId +
            ", entranceDate = " + entranceDate +
            ", studentStatus = " + studentStatus +
            ", faceId = " + faceId +
            ", faceFeature = " + faceFeature +
        "}";
    }
}
