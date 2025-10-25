package com.tradenext.backend.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "trades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String symbol;
    private Double entryPrice;
    private Double exitPrice;
    private Double positionSize;
    private String direction; // LONG or SHORT
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    @OneToOne(mappedBy = "trade", cascade = CascadeType.ALL)
    private Journal journal;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}