package com.zb.service;

import com.zb.entity.Admin;

public interface RpcAdminService {

    public Admin findUserLogin(String aname,String apwd);

}
