package zb.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.Admin;
import com.zb.service.RpcAdminService;
import com.zb.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zb.mapper.LabAdminMapper;

import java.util.HashMap;
import java.util.Map;

@Service
@Component
public class RpcTokenServiceImpl implements RpcAdminService {

    @Autowired(required = false)
    private LabAdminMapper labAdminMapper;

    @Autowired(required = false)
    private RedisUtils redisUtils;

    @Override
    public Admin findUserLogin(String aname, String apwd) {
        Map<String,Object>params=new HashMap<String, Object>();
       // params.put("");

        return null;
    }

    @Override
    public Admin findUserByToken(String token) {
        return null;
    }
}
