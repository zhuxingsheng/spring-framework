package com.jack.transaction.dao;

import com.jack.transaction.model.Student;
import com.jack.transaction.model.StudentRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by jack01.zhu on 2017/8/9.
 */
public class StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Student getStudentById(int id) {
        return jdbcTemplate.queryForObject(
                "select * from student where id = ?", new Object[] { id },
                new StudentRowMapper());
    }

    public List<Student> getAllStudent() {
        return jdbcTemplate.query("select * from student",
                new StudentRowMapper());
    }

    public int insertStudent(Student student) {
        return jdbcTemplate.update(
                "insert into student(name,score) values(?,?)",
                new Object[] { student.getName(),
                        student.getScore() });
    }

    public int deleteStudent(int id) {
        return jdbcTemplate.update("delete from student where id = ? ",
                new Object[] { id });
    }

    public int updateStudent(Student student) {
        return jdbcTemplate.update(
                " update student set name=?,score=? where id=? ",
                new Object[] { student.getName(),
                        student.getScore(), student.getId() });
    }


}
