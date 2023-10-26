package com.taskmanager.Models;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    private String name;

    private String description;

    private Date dueDate;

    @CreatedDate
    private Date createdDate;

    boolean isCompleted;

    private UserEntity user;

    private List<Step> steps;

}
