package com.mod.user.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mod.user.model.User;





@Repository
public interface UserDao extends JpaRepository<User, Integer>
{

	List<User> findByemail(String email);

	
	User findByid(int userId);
	@Transactional
	@Modifying
@Query("update User m set m.active=true where m.id=:id")
public void blockByid(@Param("id")int id);
	@Transactional
	@Modifying
@Query("update User m set m.active=false where m.id=:id")
	public void unblockByid(@Param("id")int id);

}
