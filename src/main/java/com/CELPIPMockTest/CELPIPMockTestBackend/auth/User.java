package com.CELPIPMockTest.CELPIPMockTestBackend.auth;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = -4050670182652326488L;

    private Long id;
    private String username;
    private String email;
    private String password;
    private String role;
    private Long createBy;
    private Date createTime;
    private Long updateBy;
    private Date updateTime;
    private Boolean isEnabled;
    private Boolean isDeleted;

    // setters and getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    // constructors
    public User() {
        super();
    }

    public User(Long id, String username, String email, String password, String role, Long createBy, Date createTime,
            Long updateBy, Date updateTime, Boolean isEnabled, Boolean isDeleted) {
        super();
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.isEnabled = isEnabled;
        this.isDeleted = isDeleted;
    }


    // toString
    @Override
    public String toString() {
        return "User [createBy=" + createBy + ", createTime=" + createTime + ", email=" + email + ", id=" + id
                + ", isEnabled=" + isEnabled + ", isDeleted=" + isDeleted + ", password=" + password + ", role=" + role
                + ", updateBy=" + updateBy + ", updateTime=" + updateTime + ", username=" + username + "]";
    }
}
