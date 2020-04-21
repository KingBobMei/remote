package com.mei.hermes.entity;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesmiser_user.id
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesmiser_user.username
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesmiser_user.password
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesmiser_user.salt
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesmiser_user.is_active
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    private Byte isActive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesmiser_user.needModify
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    private Boolean needmodify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesmiser_user.login_time
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    private Long loginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesmiser_user.create_time
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lesmiser_user.update_time
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    private Long updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesmiser_user.id
     *
     * @return the value of lesmiser_user.id
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesmiser_user.id
     *
     * @param id the value for lesmiser_user.id
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesmiser_user.username
     *
     * @return the value of lesmiser_user.username
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesmiser_user.username
     *
     * @param username the value for lesmiser_user.username
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesmiser_user.password
     *
     * @return the value of lesmiser_user.password
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesmiser_user.password
     *
     * @param password the value for lesmiser_user.password
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesmiser_user.salt
     *
     * @return the value of lesmiser_user.salt
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesmiser_user.salt
     *
     * @param salt the value for lesmiser_user.salt
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesmiser_user.is_active
     *
     * @return the value of lesmiser_user.is_active
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public Byte getIsActive() {
        return isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesmiser_user.is_active
     *
     * @param isActive the value for lesmiser_user.is_active
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesmiser_user.needModify
     *
     * @return the value of lesmiser_user.needModify
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public Boolean getNeedmodify() {
        return needmodify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesmiser_user.needModify
     *
     * @param needmodify the value for lesmiser_user.needModify
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public void setNeedmodify(Boolean needmodify) {
        this.needmodify = needmodify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesmiser_user.login_time
     *
     * @return the value of lesmiser_user.login_time
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public Long getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesmiser_user.login_time
     *
     * @param loginTime the value for lesmiser_user.login_time
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesmiser_user.create_time
     *
     * @return the value of lesmiser_user.create_time
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesmiser_user.create_time
     *
     * @param createTime the value for lesmiser_user.create_time
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lesmiser_user.update_time
     *
     * @return the value of lesmiser_user.update_time
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lesmiser_user.update_time
     *
     * @param updateTime the value for lesmiser_user.update_time
     *
     * @mbg.generated Wed Mar 25 22:39:31 CST 2020
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}