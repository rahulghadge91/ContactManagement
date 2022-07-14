package com.deloitte.contactmanagement.service;


import com.deloitte.contactmanagement.entity.User;
import com.deloitte.contactmanagement.entity.UserDataDTO;
import com.deloitte.contactmanagement.repository.UserRepository;
import com.deloitte.contactmanagement.security.JWTAuthenticationFilter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Autowired
//    private ModelMapper modelMapper;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public String signUp(UserDataDTO userDto) {
        User user = modelMapper().map(userDto, User.class);
        user.setPassword(encoder.encode(userDto.getPassword()));
        //user.setPassword(userDto.getPassword());
        // After sing up save user detail in users db
        user = userRepository.save(user);
        return JWTAuthenticationFilter.generateToken(user.getEmail());
    }
}
