package com.hyn.mystruct.convert.impl;

import com.hyn.mystruct.convert.IStudentConvert;
import com.hyn.mystruct.dto.StudentDto;
import com.hyn.mystruct.entity.Student;
import org.springframework.util.ObjectUtils;

/**
 * @author hyn
 * @version 1.0.0
 * @description
 * @date 2023/2/22
 */
public class StudentConvertUtil implements IStudentConvert {
    @Override
    public StudentDto studentConvert(Student student) {
        if (ObjectUtils.isEmpty(student)){
            return null;
        }else {
            StudentDto studentDto = new StudentDto();
            studentDto.setUserId(student.getId());
            studentDto.setUserName(student.getName());
            studentDto.setIdNumber(student.getIdCard());
            studentDto.setDateOfBirth(student.getBirthday());
            return studentDto;
        }
    }
}
