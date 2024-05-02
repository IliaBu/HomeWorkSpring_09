package ru.gb_spring.tasks.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Сущность "Задача"
 * @id - идентификатор
 * @description - описание
 * @status - статус
 * @createdDate - дата создания
 */
@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String status;
    private LocalDateTime createdate;

    public Task() {
    }

}
