package com.byxm.SpringBootByxm.modules.account.controller;

import com.byxm.SpringBootByxm.modules.account.entity.Course;
import com.byxm.SpringBootByxm.modules.account.entity.PickCourse;
import com.byxm.SpringBootByxm.modules.account.entity.Students;
import com.byxm.SpringBootByxm.modules.account.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    /*
        127.0.0.1/api/course/1------------post
        {"cTime":"2020-2021","semester":"第一学期"}
        通过学生ID、指定年度和学期获取选课结果
     */
    @PostMapping("/course/{studentsId}")
    public List<Course> getCourseByStudentsId(@PathVariable int studentsId, @RequestBody Course course){
        return studentsService.getCourseByStudentsId(studentsId, course);
    }

    /*
        127.0.0.1/api/pickCourse/1------------post

        学生进行选课，返回本学期选课结果
     */
    @PostMapping("/pickCourse/{sId}")
    public List<Course> insertChooseCourse(@PathVariable int sId,
                                           @RequestBody List<PickCourse> pickCourses,
                                           @RequestBody Course course){
        return studentsService.insertChooseCourse(sId, pickCourses, course);
    }

    /*
        127.0.0.1/api/courses-------------post
        {"cTime":"2020-2021","semester":"第一学期"}
        获取所有可选课程
     */
    @PostMapping(value = "/courses")
    public List<Course> getCourses(@RequestBody Course course){
        return studentsService.getCourses(course);
    }

    /*
        127.0.0.1/api/student/1-------------get
        获取当前用户的学籍资料
     */
    @GetMapping("/student/{sId}")
    public Students getStudentBysId(@PathVariable int sId){
        return studentsService.getStudentBysId(sId);
    }

    /*
        127.0.0.1/api/student-------------post
        {"account_number":"9527","password":"123456"}
        原密码查询
     */
    @PostMapping("/student")
    public String getStudentBysIdAndPassword(@RequestBody Students students){
        return studentsService.getStudentBysIdAndPassword(students);
    }

    /*
        127.0.0.1/api/student-------------put
        {"account_number":"9527","password":"123456"}
        修改密码
     */
    @PutMapping("/student")
    public String updateStudentByPassword(@RequestBody Students students){
        return studentsService.updateStudentByPassword(students);
    }
}
