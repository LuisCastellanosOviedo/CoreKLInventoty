package com.inventory.LogicComponent.users;

import com.inventory.entity.Person;
import com.inventory.repository.User.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by luis on 6/13/2017.
 */
@Component
public class UserComponent {

    private IUserRepository userRepository;

    @Autowired
    public UserComponent(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Person findById(Long id){
        return userRepository.findOne(id);
    }

}
