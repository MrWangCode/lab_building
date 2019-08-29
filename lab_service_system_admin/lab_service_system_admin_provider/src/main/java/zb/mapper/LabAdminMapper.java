package zb.mapper;

import com.zb.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LabAdminMapper {
    public Admin getLabAdminById(@Param("aid")Integer aid)throws Exception;

    public List<>

}
