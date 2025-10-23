package com.example.Campus.Polls.Opinion.Tracker.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
@Entity
@Data

public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long userId;
  private String name;
  @Column(unique=true)
  private String email;
  private LocalDateTime joinDate=LocalDateTime.now();
}
