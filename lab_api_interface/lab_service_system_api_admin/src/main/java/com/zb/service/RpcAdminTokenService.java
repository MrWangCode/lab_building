package com.zb.service;

import com.zb.entity.Admin;

public interface RpcAdminTokenService {
    //生成token
    public String gengateToken(String strAdminAgent, Admin admin);
    //放到redis
    public void saveAdminToken(String token,Admin admin);

}
