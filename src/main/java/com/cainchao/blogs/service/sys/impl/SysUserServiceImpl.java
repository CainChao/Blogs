package com.cainchao.blogs.service.sys.impl;

import com.cainchao.blogs.entity.result.SysUser;
import com.cainchao.blogs.mapper.SysUserMapper;
import com.cainchao.blogs.service.sys.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:CainChao
 * @Description:
 * @Date:2018/5/23 13:41
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser queryInfoByUserName(String loginName) {
        return sysUserMapper.queryInfoByUserName(loginName);
    }
}
