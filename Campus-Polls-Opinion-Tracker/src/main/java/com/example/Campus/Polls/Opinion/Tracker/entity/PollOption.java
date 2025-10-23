package com.example.Campus.Polls.Opinion.Tracker.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class PollOption {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long optionId;
private String optionText;
@ManyToOne
@JoinColumn(name="poll_id")
private Poll poll; 
}
