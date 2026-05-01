package Cript.com.example.CripChat.Entitys;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Chatroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    @PrimaryKeyJoinColumn
    private UUID id;

    @Timestamp
    @Column(name = "CreatedAt",nullable = false)
    private LocalDateTime CreatedAt;




}
