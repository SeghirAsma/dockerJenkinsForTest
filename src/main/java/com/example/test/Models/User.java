package com.example.test.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@AllArgsConstructor
@Data
public class User {

    @Id
    private String id;

    private String firstname;
    private String lastname;
    private String email;
}
