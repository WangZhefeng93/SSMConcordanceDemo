package com.ccff.ssm.controller;

import com.ccff.ssm.pojo.Student;
import com.ccff.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component("studentController")
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService = null;

    @RequestMapping("/register.do")
    public String register(Model model, Student student){
        studentService.insertStudent(student);
        return "/welcome";
    }

}
