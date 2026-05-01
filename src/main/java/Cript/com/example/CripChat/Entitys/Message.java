package Cript.com.example.CripChat.Entitys;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Message{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String encryptedContent;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime timestamp;

    private boolean isEncrypted;

    private String hit;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private UserDetails sender;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Chatroom chatRoom;

    private LocalDateTime sentAt = LocalDateTime.now();

    public void setId(UUID id) {this.id = id;}

    public void setEncrypted(boolean encrypted) {isEncrypted = encrypted;}

    public void setEncryptedContent(String encryptedContent) {this.encryptedContent = encryptedContent;}

    public void setHit(String hit) {this.hit = hit;}

    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp;}

    public UUID getId() {return id;}

    public String getEncryptedContent() {return encryptedContent;}


}


