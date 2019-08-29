package com.zb.service;

import com.zb.entity.Admin;

public interface RpcAdminTokenService {

    public String gengateToken(String strAdminAgent, Admin admin);

    public void saveAdminToken(String token,Admin admin);

}
