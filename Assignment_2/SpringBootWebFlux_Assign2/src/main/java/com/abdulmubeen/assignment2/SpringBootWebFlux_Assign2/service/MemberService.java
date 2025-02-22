package com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.model.Member;
import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.repository.MemberRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    // Get all members
    public Flux<Member> getAll() {
        return memberRepository.findAll().switchIfEmpty(Flux.empty());
    }

    // Get member by ID
    public Mono<Member> getById(final String id) {
        return memberRepository.findById(id);
    }

    // Save or update a member
    public Mono<Member> saveMember(Member member) {
        return memberRepository.save(member);
    }

    // Delete a member by ID
    public Mono<Void> deleteMemberById(final String id) {
        return memberRepository.deleteById(id);
    }

}
