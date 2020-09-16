package com.byxm.SpringBootByxm.modules.account.mapper;

import com.byxm.SpringBootByxm.modules.account.entity.Teachers;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface TeachersMapper {

    @Select("select * from teachers where t_number = #{name}")
    Teachers getTeachersBytName(String name);
}
