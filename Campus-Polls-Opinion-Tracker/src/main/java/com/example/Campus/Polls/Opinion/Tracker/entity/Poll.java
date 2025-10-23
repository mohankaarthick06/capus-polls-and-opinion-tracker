package com.example.Campus.Polls.Opinion.Tracker.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Data
public class Poll {
@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long pollId;
   private String title;
   private String description;
   private LocalDateTime startDate;
   private LocalDateTime endDate;
   private LocalDateTime createdAt=LocalDateTime.now();
   private String status="ACTIVE";
   @OneToMany(mappedBy="poll",cascade=CascadeType.ALL)
   private List<PollOption> options;
}
