package com.byxm.SpringBootByxm.modules.account.mapper;

import com.byxm.SpringBootByxm.modules.account.entity.*;
import com.byxm.SpringBootByxm.modules.account.entity.System;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface StudentsMapper {

    @Select("select * from students where account_number = #{accountNumber}")
    Students getStudentsByAccountNumber(String accountNumber);

    @Select("SELECT course.* FROM students INNER JOIN pick_course " +
            "ON students.s_id = pick_course.s_id INNER JOIN course " +
            "ON pick_course.c_id = course.c_id " +
            "where students.s_id = #{studentsId} and c_time = #{cTime} and semester = #{semester}")
    List<Course> getCourseByStudentsId(int sId, String cTime, String semester);

    @Select("select * from course where c_time = #{cTime} and semester = #{semester}")
    List<Course> getCourses(String cTime, String semester);

    @Select("select * from students where s_id = #{sId}")
    Students getStudentBysId(int sId);

    @Update("update students set password = #{password} where account_number = #{accountNumber}")
    int updateStudentByPassword(Students students);

    @Select("select * from students where account_number = #{accountNumber} and password = #{password}")
    Students getStudentBysIdAndPassword(Students students);

    @Select("select * from professional where p_id = #{pId}")
    Professional getProfessionalBypId(int pId);

    @Select("select * from system where sys_id = #{sysId}")
    System getSystemBySysId(int sysId);

    @Select("select * from hospital where h_id = #{hId}")
    Hospital getHospitalByhId(int hId);

    @Select("select * from teachers where t_id = #{tId}")
    Teachers getTeacherBytId(int tId);

    @Insert("insert into pick_course (s_id, c_id) values (#{studentId}, #{cId})")
    void insertChooseCourse(int studentId, int cId);
}
