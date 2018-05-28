package com.cainchao.blogs.entity.result;

/**
 * @Author:CainChao
 * @Description:
 * @Date:2018/5/23 12:01
 **/
public class SysUser {
    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 随机数盐
     */
    private  String salt;
    /**
     * 是否有效  1有效   0无效   默认1
     */
    private Integer valid;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}
