package com.desafio_picpay.desafio_picpay.services;

import com.desafio_picpay.desafio_picpay.domain.users.User;
import com.desafio_picpay.desafio_picpay.domain.users.UserType;

import com.desafio_picpay.desafio_picpay.dtos.UserDTO;
import com.desafio_picpay.desafio_picpay.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository ;

    public void ValidateTransaction (User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() == UserType.MERCHANT) {
            throw new Exception("Usuário do tipo lojista não está autorizado a realizar transações ");
        }
        if(sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Saldo Insuficiente");
        }
    }

    public User findUserById (Long id) throws Exception {
       return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    public User createUser (UserDTO data) {
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers() {
      return  this.repository.findAll();
    }




    public void saveUser(User user) {
      this.repository.save(user);
    }
}
