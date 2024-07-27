package com.ecommerce.wallet_service.user;

// import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User registerUser(User user){
        return repository.save(user);
    }

    // public Optional<User> findUserByUsername(String username) {
    //     return repository.findByUsername(username);
    // }

}
