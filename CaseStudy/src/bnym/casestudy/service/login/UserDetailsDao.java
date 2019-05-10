/**
 * 
 */
package bnym.casestudy.service.login;

import org.springframework.data.repository.CrudRepository;

import bnym.casestudy.entity.User;

/**
 * @author ahmshahparan
 *
 */
public interface UserDetailsDao{
	User findUserByUsername(String username);
}
