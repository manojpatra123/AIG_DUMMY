/**
 * 
 */
package com.mk.spring.Transaction;

/**
 * 
 *
 * @author mpatra
 */

public interface IUserDao {
	public int insertUser(User user);
	public void deleteUser(int uid);
	public void selectUser(int uid);
	public int updateUser(User user) throws Exception;

}
