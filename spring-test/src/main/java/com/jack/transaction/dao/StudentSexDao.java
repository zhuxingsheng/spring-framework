package com.jack.transaction.dao;

import com.jack.transaction.model.StudentSex;
import com.jack.transaction.model.StudentSexRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by jack01.zhu on 2017/8/9.
 */
public class StudentSexDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public StudentSex getStudentSexById(int id) {
        return jdbcTemplate.queryForObject(
                "select * from student_sex where id = ?", new Object[] { id },
                new StudentSexRowMapper());
    }

    public List<StudentSex> getAllStudentSex() {
        return jdbcTemplate.query("select * from StudentSex",
                new StudentSexRowMapper());
    }

    public int insertStudentSex(StudentSex StudentSex) {
        return jdbcTemplate.update(
                "insert into StudentSex(name,sex) values(?,?)",
                new Object[] { StudentSex.getName(),
                        StudentSex.getSex() });
    }

    public int deleteStudentSex(int id) {
        return jdbcTemplate.update("delete from student_sex where id = ? ",
                new Object[] { id });
    }

    public int updateStudentSex(StudentSex StudentSex) {
        return jdbcTemplate.update(
                " update student_sex set name=?,score=? where id=? ",
                new Object[] { StudentSex.getName(),
                        StudentSex.getSex(), StudentSex.getId() });
    }


}
