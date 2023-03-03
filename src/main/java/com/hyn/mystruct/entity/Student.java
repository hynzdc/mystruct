package com.hyn.mystruct.entity;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author hyn
 * @version 1.0.0
 * @description 学生实体类
 * @date 2023/2/22
 */
@Data
public class Student {
    private Long id;
    private String name;
    private String idCard;
    private LocalDate birthday;
}
