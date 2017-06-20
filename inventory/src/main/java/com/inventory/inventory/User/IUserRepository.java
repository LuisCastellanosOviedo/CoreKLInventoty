package com.inventory.inventory.User;

import com.inventory.inventory.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by luis on 6/13/2017.
 */
public interface IUserRepository extends JpaRepository<Person,Long> {

    List<Person> isAuthenticated(String userName, String passws);
}
