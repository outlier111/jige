package com.byxm.SpringBootByxm.modules.account.service;

import com.byxm.SpringBootByxm.modules.account.entity.Course;
import com.byxm.SpringBootByxm.modules.account.entity.PickCourse;
import com.byxm.SpringBootByxm.modules.account.entity.Students;
import com.byxm.SpringBootByxm.utils.Result;

import java.util.List;

public interface StudentsService {

    Students getStudentsByAccountNumber(String name);

    List<Course> getCourseByStudentsId(int studentsId, Course course);

    List<Course> getCourses(Course course);

    Students getStudentBysId(int sId);

    String getStudentBysIdAndPassword(Students students);

    String updateStudentByPassword(Students students);

    List<Course> insertChooseCourse(int sId, List<PickCourse> pickCourses, Course course);
}
