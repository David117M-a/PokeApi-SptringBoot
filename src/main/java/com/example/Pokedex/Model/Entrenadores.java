package com.example.Pokedex.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Entrenadores {
    @Id
    private String _id;
    private String username;
    private String fullname;
    @Indexed(unique = true)
    private String email;
    private String userPass;

    public Entrenadores(String username, String fullname, String email, String userPass) {
        this.username = username;
        this.fullname = fullname;
        this.email = email;
        this.userPass = userPass;
    }
}
