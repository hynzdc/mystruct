package com.hyn.mystruct.dto;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author hyn
 * @version 1.0.0
 * @description
 * @date 2023/2/22
 */
@Data
public class StudentDto {
    private Long userId;
    private String userName;
    private String idNumber;
    private LocalDate dateOfBirth;
}
