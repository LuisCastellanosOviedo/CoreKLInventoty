package com.inventory.repository.User;

import com.inventory.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by luis on 6/13/2017.
 */
public interface IUserRepository extends JpaRepository<Person,Long> {
}