package com.zb.service;

import com.zb.entity.Admin;

public interface RpcAdminService {
    //登录
    public Admin findUserLogin(String aname,String apwd);
    //用户是否登录
    Admin findUserByToken(String token);
}
