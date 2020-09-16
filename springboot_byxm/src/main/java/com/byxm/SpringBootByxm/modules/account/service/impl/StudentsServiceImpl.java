package com.byxm.SpringBootByxm.modules.account.service.impl;

import com.byxm.SpringBootByxm.modules.account.entity.*;
import com.byxm.SpringBootByxm.modules.account.entity.System;
import com.byxm.SpringBootByxm.modules.account.mapper.StudentsMapper;
import com.byxm.SpringBootByxm.modules.account.service.StudentsService;
import com.byxm.SpringBootByxm.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public Students getStudentsByAccountNumber(String name) {
        return studentsMapper.getStudentsByAccountNumber(name);
    }

    @Override
    public List<Course> getCourseByStudentsId(int studentsId, Course course) {
        List<Course> courses = studentsMapper.getCourseByStudentsId(studentsId, course.getcTime(), course.getSemester());
        for (Course cours : courses) {
            Teachers teachers = studentsMapper.getTeacherBytId(cours.gettId());
            System system = studentsMapper.getSystemBySysId(cours.getSysId());
            cours.setTeachers(teachers);
            cours.setSystem(system);
        }
        return courses;
    }

    @Override
    public List<Course> getCourses(Course course) {
        List<Course> courses = studentsMapper.getCourses(course.getcTime(), course.getSemester());
        for (Course cours : courses) {
            Teachers teachers = studentsMapper.getTeacherBytId(cours.gettId());
            System system = studentsMapper.getSystemBySysId(cours.getSysId());
            cours.setTeachers(teachers);
            cours.setSystem(system);
        }
        return courses;
    }

    @Override
    public Students getStudentBysId(int sId) {
        Students students = studentsMapper.getStudentBysId(sId);
        Professional professional = studentsMapper.getProfessionalBypId(students.getpId());
        System system = studentsMapper.getSystemBySysId(professional.getSysId());
        Hospital hospital = studentsMapper.getHospitalByhId(system.gethId());
        students.setProfessional(professional);
        students.setSystem(system);
        students.setHospital(hospital);
        return students;
    }

    @Override
    public String getStudentBysIdAndPassword(Students students) {
//        将传进来的密码加密
        String pwd = MD5Util.getMD5(students.getPassword());
        students.setPassword(pwd);
//        将加密后的密码与数据库作比较
        Students students1 = studentsMapper.getStudentBysIdAndPassword(students);
        if (students1 == null){
            return "错误";
        }
        return "正确";
    }

    @Override
    public String updateStudentByPassword(Students students) {
        //        将传进来的密码加密
        String pwd = MD5Util.getMD5(students.getPassword());
        students.setPassword(pwd);
        int i = studentsMapper.updateStudentByPassword(students);
        if (i == 0){
            return "修改失败";
        }
        return "修改成功";
    }

    @Override
    public List<Course> insertChooseCourse(int sId, List<PickCourse> pickCourses, Course course) {
        if (pickCourses != null) {
            for (PickCourse pickCours : pickCourses) {
                studentsMapper.insertChooseCourse(sId, pickCours.getcId());
            }
            return studentsMapper.getCourseByStudentsId(sId, course.getcTime(), course.getSemester());
        }
        return null;
    }
}
