package com.abdulmubeen.sep.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Programs")
public class Program {

    @Id
    @Column(name = "programCode")
    private String programCode;

    @NotBlank(message = "Program name is required")
    private String programName;

    @NotNull(message = "Duration is required")
    private int duration;

    @NotNull(message = "Fee is required")
    private double fee;

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}