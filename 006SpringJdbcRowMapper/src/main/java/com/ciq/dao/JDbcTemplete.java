package com.ciq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.ciq.bean.Employee;
import com.ciq.mapper.EmployeeRowMapper;

@Repository
public class JDbcTemplete implements EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into employee values(?,?,?,?)", employee.getEmpid(), employee.getCampany(),
				employee.getName(), employee.getSalary());
	}

	@Override
	public void update(Employee employee) {
		jdbcTemplate.update("update employee set company=?,name=?,salary=? where empid=?", employee.getCampany(),
				employee.getName(), employee.getSalary(), employee.getEmpid());

	}

	@Override
	public Employee getById(Integer id) {

	return (Employee) jdbcTemplate.query("select * from employee where empid="+id, new ResultSetExtractor<Employee>() {

			@Override
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				Employee employee=new Employee();
				while(rs.next())
				{
					
				
				employee.setEmpid(rs.getInt("empid"));
				employee.setCampany(rs.getString("company"));
				employee.setName(rs.getNString("name"));
				employee.setSalary(rs.getDouble("salary"));
				}
				return employee;
			}

			
			
		});

	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stu

		return jdbcTemplate.query("select * from employee", new EmployeeRowMapper());

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from employee where empid=?", new Object[] { id });

	}

	@Override
	public void multiInsert() {
		// TODO Auto-generated method stub
		
		
		jdbcTemplate.batchUpdate("insert into employee values(8,'techmahinda','ramya',98000)","insert into employee values(9,'techmahinda','ramesh',65000)","insert into employee values(10,'techmahinda','bagya',56000)");
		
	}

}
