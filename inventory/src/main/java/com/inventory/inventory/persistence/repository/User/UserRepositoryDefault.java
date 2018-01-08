package com.inventory.inventory.persistence.repository.User;

import com.inventory.inventory.persistence.entity.user.Person;
import com.inventory.inventory.persistence.repository.User.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by luis on 6/13/2017.
 */
@Component
public class UserRepositoryDefault {

    private IUserRepository userRepository;

    @Autowired
    public UserRepositoryDefault(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Person> isAuthenticated(String userName, String passwd){
        return userRepository.isAuthenticated(userName, passwd);
    }

}
