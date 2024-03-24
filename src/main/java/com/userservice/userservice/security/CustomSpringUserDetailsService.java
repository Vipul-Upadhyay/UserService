package com.userservice.userservice.security;

import com.userservice.userservice.models.User;
import com.userservice.userservice.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomSpringUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public CustomSpringUserDetailsService(UserRepository userRepository){
        this.userRepository  = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findByEmail(username);

        if(optionalUser.isEmpty()){
            throw new UsernameNotFoundException("User with given name not exist");
        }

        User user = optionalUser.get();
        return new CustomUserDetails(user);
    }
}
