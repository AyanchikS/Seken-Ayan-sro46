package com.example.sro46.model;

import jakarta.persistence.*; // Для аннотаций JPA
import lombok.*; // Для автоматической генерации геттеров, сеттеров и конструкторов

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private String answer;
}

