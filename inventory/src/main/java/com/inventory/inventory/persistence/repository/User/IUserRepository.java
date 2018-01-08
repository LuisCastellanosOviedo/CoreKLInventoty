package com.inventory.inventory.persistence.repository.User;

import com.inventory.inventory.persistence.entity.user.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by luis on 6/13/2017.
 */
public interface IUserRepository extends JpaRepository<Person,String> {

    List<Person> isAuthenticated(@Param("userName2") String userName,@Param("passwd2") String passws);
}
