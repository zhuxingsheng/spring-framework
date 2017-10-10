package com.jack.transaction.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSexRowMapper implements RowMapper<StudentSex> {

	@Override
	public StudentSex mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentSex StudentSex = new StudentSex();
		StudentSex.setId(rs.getInt("id"));
		StudentSex.setName(rs.getString("name"));
		StudentSex.setSex(rs.getInt("sex"));
		return StudentSex;
	}

}
