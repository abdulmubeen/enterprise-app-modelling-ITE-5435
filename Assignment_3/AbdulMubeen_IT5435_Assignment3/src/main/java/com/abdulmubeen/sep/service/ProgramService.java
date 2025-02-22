package com.abdulmubeen.sep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdulmubeen.sep.model.Program;
import com.abdulmubeen.sep.repository.ProgramRepository;

@Service
public class ProgramService {

    @Autowired
    private ProgramRepository programRepository;

    public List<Program> getAllPrograms() {
        return programRepository.findAll();
    }

    public Program findProgramByCode(String programCode) {
        return programRepository.findById(programCode).orElse(null);
    }
}