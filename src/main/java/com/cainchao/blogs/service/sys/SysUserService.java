package com.cainchao.blogs.service.sys;

import com.cainchao.blogs.entity.result.SysUser;

/**
 * @Author:CainChao
 * @Description:
 * @Date:2018/5/23 12:01
 **/
public interface SysUserService {

    SysUser queryInfoByUserName(String loginName);
}
