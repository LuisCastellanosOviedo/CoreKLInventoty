package com.inventory.inventory.User;

import com.inventory.inventory.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by luis on 6/13/2017.
 */
public interface IUserRepository extends JpaRepository<Person,Long> {

    List<Person> isAuthenticated(@Param("userName2") String userName,@Param("passwd2") String passws);
}
