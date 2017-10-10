package com.jack.transaction.service;

/**
 * Created by jack01.zhu on 2017/8/9.
 */

import com.jack.transaction.dao.StudentDao;
import com.jack.transaction.dao.StudentSexDao;
import com.jack.transaction.model.Student;
import com.jack.transaction.model.StudentSex;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentSexService {
    private StudentSexDao dao;

    public void setDao(StudentSexDao dao) {
        this.dao = dao;
    }

    //@Transactional(propagation = Propagation.REQUIRED, timeout = 1000, rollbackFor = Exception.class, noRollbackFor = CustomRuntimeException.class)
    public void doComplexLogic() {
            StudentSex student = new StudentSex();
            student.setName("hello");
            dao.insertStudentSex(student);
            System.out.println("did insert...");
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

