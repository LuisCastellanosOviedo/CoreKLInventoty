package com.inventory.inventory.controller.springConf.secureModule;

import com.inventory.inventory.persistence.repository.User.IUserRepository;
import com.inventory.inventory.persistence.entity.user.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by LuisCO on 19/11/2017.
 */

@Service
public class LocalUserDetailService implements UserDetailsService{

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Person person = userRepository.findOne(s);

        if(person == null){
            throw new UsernameNotFoundException("not existe");
        }

        return person;
    }
}
