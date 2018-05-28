package com.cainchao.blogs.mapper;

import com.cainchao.blogs.entity.result.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author:CainChao
 * @Description:
 * @Date:2018/5/23 13:42
 **/
@Repository
public interface SysUserMapper {

    SysUser queryInfoByUserName(@Param("loginName") String loginName);
}
