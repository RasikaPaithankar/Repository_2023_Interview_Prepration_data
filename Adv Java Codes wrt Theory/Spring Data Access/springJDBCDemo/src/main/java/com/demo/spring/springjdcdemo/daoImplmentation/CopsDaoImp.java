package com.demo.spring.springjdcdemo.daoImplmentation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.demo.spring.springjdcdemo.dao.CopsDao;
import com.demo.spring.springjdcdemo.pojo.Cops;

public class CopsDaoImp implements CopsDao {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void getCops() {
		String query = "select * from cops";
		List<Cops> rs = jdbcTemplate.query(query, new CopsMapper());
		for (Cops cops : rs) {
			System.out.println(cops.getId() + " ----" + cops.getName());
		}

		// OR

//		SqlRowSet rs =  jdbcTemplate.queryForRowSet(query);
//		Iterator iterator = rs.iterator(); 
//		while (iterator.hasNext()) 
//		{
//			Map<String, Object> map = (Map<String, Object>) iterator.next();
//			
//			for (Map<String, Object> map1 : rs) {
//				
//				for( java.util.Map.Entry<String, Object> e1 : map1.entrySet()){
//					System.out.println(e1.getKey() + "------" + e1.getValue());
//				}
//			}
//		}
	}

	private static final class CopsMapper implements RowMapper<Cops> {

		public Cops mapRow(ResultSet rs, int rowNum) throws SQLException {
			Cops cops = new Cops();
			cops.setId(rs.getInt("id"));
			cops.setName(rs.getString("name"));
			return cops;
		}

	}

	public Integer addCops(Cops c) {
		String query = "insert into cops values ( '" + c.getId() + "','" + c.getName() + "' )";
		jdbcTemplate.update(query);
		return c.getId();
	}

	public Integer updateCops(Cops c) {
		String query = "update employee set name='" + c.getName() + "' where id='" + c.getId() + "' ";
		return jdbcTemplate.update(query);
	}

	public Integer deleteCops(Integer id) {
		String query = "delete from employee where id='" + id + "' ";
		return jdbcTemplate.update(query);
	}
}
