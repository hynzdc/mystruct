package com.hyn.mystruct;

import com.hyn.mystruct.convert.impl.StudentConvertUtil;
import com.hyn.mystruct.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class MystructApplicationTests {

    @Test
    void contextLoads() {
        Student student = new Student();
        student.setId(1L);
        student.setName("hynzdc");
        student.setIdCard("22222");
        student.setBirthday(LocalDate.now());
        System.out.println(StudentConvertUtil.INSTANCE.studentConvert(student));
    }

}
