package com.abdulmubeen.sep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abdulmubeen.sep.model.Student;
import com.abdulmubeen.sep.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/register")
    public String registerStudent(@ModelAttribute Student student) {
        studentService.registerStudent(student);
        return "redirect:/";
    }

    @PostMapping("/login")
    public String loginStudent(@RequestParam String userName, @RequestParam String password, Model model) {
        Student student = studentService.loginStudent(userName, password);
        if (student != null) {
            return "redirect:/programs?studentId=" + student.getStudentId();
        }
        return "redirect:/";
    }

    @GetMapping("/profile")
    public String profile(@RequestParam int studentId, Model model) {
        Student student = studentService.findStudentById(studentId);
        model.addAttribute("student", student);
        return "profile";
    }

    @PostMapping("/updateProfile")
    public String updateProfile(@RequestParam int studentId, @RequestParam String address,
                                @RequestParam String city, @RequestParam String postalCode, Model model) {
        Student student = studentService.findStudentById(studentId);
        if (student != null) {
            student.setAddress(address);
            student.setCity(city);
            student.setPostalCode(postalCode);
            studentService.updateStudent(student);
        }
        return "redirect:/profile?studentId=" + studentId;
    }
}