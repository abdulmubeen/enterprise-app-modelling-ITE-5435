package com.abdulmubeen.sep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abdulmubeen.sep.model.Program;
import com.abdulmubeen.sep.service.ProgramService;

@Controller
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @GetMapping("/programs")
    public String programs(@RequestParam int studentId, Model model) {
        List<Program> programs = programService.getAllPrograms();
        model.addAttribute("programs", programs);
        model.addAttribute("studentId", studentId);
        return "programs";
    }

    @PostMapping("/enroll")
    public String enrollProgram(@RequestParam int studentId, @RequestParam String programCode, Model model) {
        model.addAttribute("studentId", studentId);
        model.addAttribute("programCode", programCode);
        System.out.println(programCode + " " + studentId);
        return "redirect:/payment?studentId=" + studentId + "&programCode=" + programCode;
    }
}