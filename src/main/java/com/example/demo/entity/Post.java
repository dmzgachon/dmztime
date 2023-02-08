package com.example.demo.entity;

import javax.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String writer;
    @Column()
    private int view_cnt;
    @Column()
    private Boolean noticeYn;
    @Column()
    private Boolean deleteYn;
    @Column()
    private LocalDateTime created_date;
    @Column()
    private LocalDateTime modified_date;


  }



