package com.jack.transaction.service;

/**
 * Created by jack01.zhu on 2017/8/9.
 */

import java.sql.Date;
import java.util.List;

import com.jack.transaction.dao.StudentDao;
import com.jack.transaction.model.Student;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class StudentService {

    private StudentDao dao;

    private StudentSexService studentSexService;

    public void setStudentSexService(StudentSexService studentSexService) {
        this.studentSexService = studentSexService;
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    @Transactional(propagation = Propagation.REQUIRED, timeout = 1000, noRollbackFor = RuntimeException.class)
    public void doComplexLogic() {

        // select
        List<Student> list = dao.getAllStudent();
        for (Student student : list) {
            dao.deleteStudent(student.getId());
            System.out.println(student);
        }

        if(list.isEmpty()) {
            Student student = new Student();
            student.setName("hello");
            student.setScore(78);
            dao.insertStudent(student);
            System.out.println("did insert...");
        }

        studentSexService.doComplexLogic();


    }

    class CustomRuntimeException extends RuntimeException {
        public CustomRuntimeException() {
            super();
        }

        public CustomRuntimeException(String msg) {
            super(msg);
        }
    }
}

