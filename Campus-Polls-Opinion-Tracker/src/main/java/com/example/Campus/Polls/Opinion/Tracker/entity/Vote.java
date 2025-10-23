package com.example.Campus.Polls.Opinion.Tracker.entity;
import jakarta.persistence.*;
import  lombok.Data;
import java.time.LocalDateTime;
@Entity
@Data
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"user_id","poll_id"})})
public class Vote {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long voteId;
@ManyToOne
@JoinColumn(name="user_id")
private User user;
@ManyToOne@JoinColumn(name="poll_id")
private Poll poll;
@ManyToOne
@JoinColumn(name="option_id")
private PollOption option;
private LocalDateTime votedAt=LocalDateTime.now();
}
