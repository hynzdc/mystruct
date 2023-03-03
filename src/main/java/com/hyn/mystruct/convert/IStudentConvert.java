package com.hyn.mystruct.convert;

import com.hyn.mystruct.dto.StudentDto;
import com.hyn.mystruct.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author hyn
 * @version 1.0.0
 * @description
 * @date 2023/2/22
 */
@Mapper(implementationName = "StudentConvertUtil",implementationPackage = "com.hyn.mystruct.convert.impl")
public interface IStudentConvert {
    IStudentConvert INSTANCE = Mappers.getMapper(IStudentConvert.class);
    @Mapping(source = "id",target = "userId")
    @Mapping(source = "name",target = "userName")
    @Mapping(source = "idCard",target = "idNumber")
    @Mapping(source = "birthday",target = "dateOfBirth")
    StudentDto studentConvert(Student student);
}
