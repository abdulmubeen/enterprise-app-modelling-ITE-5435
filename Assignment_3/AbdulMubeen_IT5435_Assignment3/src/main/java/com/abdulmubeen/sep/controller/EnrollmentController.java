package com.abdulmubeen.sep.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abdulmubeen.sep.model.Enrollment;
import com.abdulmubeen.sep.model.Program;
import com.abdulmubeen.sep.service.EnrollmentService;
import com.abdulmubeen.sep.service.PaymentService;
import com.abdulmubeen.sep.service.ProgramService;
import com.abdulmubeen.sep.service.StudentService;


@Controller
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private ProgramService programService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/payment")
    public String payment(@RequestParam int studentId, @RequestParam String programCode, Model model) {
        model.addAttribute("studentId", studentId);
        model.addAttribute("programCode", programCode);
        return "payment";
    }

    @PostMapping("/confirm")
    public String confirmPayment(
            @RequestParam int studentId,
            @RequestParam String programCode,
            @RequestParam String cardNumber,
            @RequestParam String cardHolder,
            @RequestParam String expiryDate,
            @RequestParam String cvv,
            Model model) {

        Program program = programService.findProgramByCode(programCode);
        boolean paymentSuccess = paymentService.processPayment(cardNumber, cardHolder, expiryDate, cvv, program.getFee());

        if (paymentSuccess) {
            Enrollment enrollment = new Enrollment();
            enrollment.setStudent(studentService.findStudentById(studentId));
            enrollment.setProgram(program);
            enrollment.setStartDate(new Date());
            enrollment.setAmountPaid(program.getFee());
            enrollment.setStatus("Enrolled");

            enrollmentService.createEnrollment(enrollment);

            model.addAttribute("studentId", studentId);
            model.addAttribute("programName", program.getProgramName());
            return "confirmation";
        } else {
            return "redirect:/payment?error";
        }
    }
}