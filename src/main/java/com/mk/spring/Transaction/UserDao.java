/**
 * 
 */
package com.mk.spring.Transaction;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 *
 * @author mpatra
 */
@Transactional
public class UserDao implements IUserDao {
	private JdbcTemplate jdbcTemplate;
	 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	  this.jdbcTemplate = jdbcTemplate;
	}
		
	public void deleteUser(int uid) {
	  String delQuery = "delete from users where id = ?";
	  jdbcTemplate.update(delQuery, new Object[] { uid });
	 
	}
	 
	public int insertUser(User user) {
/*	  String inserQuery = "insert into users (username, password, enabled , id) values (?, ?, ?, ?) ";
	  Object[] params = new Object[] { user.getUserName(),
					user.getPassword(), user.isEnabled(), user.getId() };
	  int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.BIT,
					Types.INTEGER };
	  int number = jdbcTemplate.update(inserQuery, params, types);
*/	  return 0; //number;
	}
	 
	// override the class level transactional behaviour for select method
	@Transactional(readOnly = true)
	public void selectUser(int uid) {
    String selectQuery = "select PK_ID,PRODUCT_CD from TEST1 where PK_ID = 1156235254 ";
	List<User> users = jdbcTemplate.query(selectQuery, new UserRowMapper());
	System.out.println("USERS:" + users.get(0).getPRODUCT_CD()); 
	}
	 
	public int updateUser(User user) throws Exception {
	  throw new Exception("A checked exception");
	}

	/* (non-Javadoc)
	 * @see com.mk.spring.Transaction.IUserDao#deleteUser()
	 */
		

}