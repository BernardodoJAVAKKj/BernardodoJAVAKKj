package Cript.com.example.CripChat.Entitys;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "User")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", unique = true, nullable = false)
    @PrimaryKeyJoinColumn
    private UUID id;


    @Column(name = "Name")
    private String name;

    @Column(name = "Email", unique = true, nullable = false)
    private String email;

    private String password;

    private boolean online;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
