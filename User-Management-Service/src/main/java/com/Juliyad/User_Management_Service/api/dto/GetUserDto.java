package com.Juliyad.User_Management_Service.api.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserDto {

    @Column(name = "user_id")
    private Long userId;
    private String name;
    private String role;
}
