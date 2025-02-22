package com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.model.Member;
import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.service.MemberService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    // Get all members
    @GetMapping
    public Flux<Member> getAll() {
        System.out.println("Fetching all members");
        return memberService.getAll();
    }

    // Get member by ID
    @GetMapping("/{id}")
    public Mono<Member> getById(@PathVariable String id) {
        System.out.println("Fetching member with ID: " + id);
        System.out.println(memberService.getById(id));
        return memberService.getById(id);
    }

    // Add a new member
    @PostMapping
    public Mono<Member> addMember(@RequestBody Member member) {
        System.out.println("Adding a new member");
        return memberService.saveMember(member);
    }

    // Delete a member by ID
    @DeleteMapping("/{id}")
    public Mono<Void> deleteMember(@PathVariable String id) {
        System.out.println("Deleting member with ID: " + id);
        return memberService.deleteMemberById(id);
    }

}