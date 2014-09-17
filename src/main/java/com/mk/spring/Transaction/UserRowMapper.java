package com.mk.spring.Transaction;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * 
 *
 * @author mpatra
 */

public class UserRowMapper implements RowMapper {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public Object mapRow(ResultSet result, int rowNo) throws SQLException {
		User user = new User();
		user.setPK_ID(result.getInt("PK_ID"));
		user.setPRODUCT_CD(result.getString("PRODUCT_CD"));
		return user;
	}

}
