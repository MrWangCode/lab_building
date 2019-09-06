package zb.mapper;

import com.zb.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface LabAdminMapper {
    /**
     * 分页查询Data
     */
    public List<Admin> pageList(@Param("start") Integer start,
                                @Param("size") Integer size,String aname);
    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("offset") int offset,
                             @Param("pagesize") int pagesize);

    /**
     * 新增
     */
    public int insert(@Param("admin") Admin admin);


    /**
     * 更新
     */
    public int update(@Param("admin") Admin admin);

}
