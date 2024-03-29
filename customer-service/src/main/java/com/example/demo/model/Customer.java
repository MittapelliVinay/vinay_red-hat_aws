package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Customer {
    @Id
    
    private Integer Id;
    
    private String firstName;
   
    private String lastName;
   
    private String email;
}