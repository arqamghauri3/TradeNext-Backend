package com.tradenext.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String clerkUserId;   // This comes from Clerk’s JWT "sub" claim

    private String username;      // Optional – you can sync it from Clerk
    private String email;         // Optional – also sync if needed
    private String profileImage;  // Optional
    private String role = "USER"; // Future proofing (e.g., ADMIN, PREMIUM)

    private LocalDateTime createdAt = LocalDateTime.now();
}
