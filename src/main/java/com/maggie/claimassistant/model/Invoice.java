package com.maggie.claimassistant.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue
    private UUID id;

    private String providerName;

    private Double amount;

    private LocalDate date;

    private String fileUrl;

    private String status;

    private LocalDateTime createdAt;
}