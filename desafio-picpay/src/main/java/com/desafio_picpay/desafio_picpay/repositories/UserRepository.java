package com.desafio_picpay.desafio_picpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.desafio_picpay.desafio_picpay.domain.users.User;

import java.util.Optional;

//manipular a table User
public interface  UserRepository extends JpaRepository<User, Long> {

   Optional<User> findUserByDocument(String document) ;

    Optional<User> findUserById(Long id) ;

}
