package com.example.model;

import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String number;
    private String email;
}
