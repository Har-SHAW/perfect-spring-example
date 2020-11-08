package com.example.demo.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MentorDto {
    @NotNull(message = "{project.mentor.absent}")
    @Max(value = 9999, message = "{mentor.mentorid.invalid}")
    @Min(value = 1000, message = "{mentor.mentorid.invalid}")
    private Integer mentorId;

    private String mentorName;

    private Integer numberOfProjectsMentored;
    public MentorDto() {
        super();
    }

    public MentorDto(Integer mentorId, String mentorName, Integer numberOfProjectsMentored) {
        super();
        this.mentorId = mentorId;
        this.mentorName = mentorName;
        this.numberOfProjectsMentored = numberOfProjectsMentored;
    }

    public Integer getMentorId() {
        return mentorId;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorId(Integer mentorId) {
        this.mentorId = mentorId;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public Integer getNumberOfProjectsMentored() {
        return numberOfProjectsMentored;
    }

    public void setNumberOfProjectsMentored(Integer numberOfProjectsMentored) {
        this.numberOfProjectsMentored = numberOfProjectsMentored;
    }
}
