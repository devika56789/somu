package ramadevi.com;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao 
{

	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public int save(Employee emp)
	{
		String sql ="insert into tpt values("+emp.getId()+",'"+emp.getName()+"','"+emp.getCmp()+"')";
		return jdbcTemplate.update(sql);
	}

	public int update(Employee emp)
	{
		String sql = "update vikash2set name='"+emp.getName()+"',where id='"+emp.getId()+"'";
		return jdbcTemplate.update(sql);
	}
	public int delete(Employee emp)
	{
		String sql1 ="delete";
		return jdbcTemplate.update(sql1);
	}

	public int listEmployee()
	{
		String sql="select";
		return jdbcTemplate.update(sql);
	}
	}








