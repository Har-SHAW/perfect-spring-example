package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mentorId;
    private String mentorName;
    @Column(name = "projects_mentored")
    private Integer numberOfProjectsMentored;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mentor other = (Mentor) obj;
        if (this.getMentorId() == null)
        {
            if (other.getMentorId() != null)
            {
                return false;
            }
        }
        else if (!this.getMentorId().equals(other.getMentorId()))
            return false;
        return true;
    }
}
