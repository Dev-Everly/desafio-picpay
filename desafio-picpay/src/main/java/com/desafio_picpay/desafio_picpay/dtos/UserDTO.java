package com.desafio_picpay.desafio_picpay.dtos;

import com.desafio_picpay.desafio_picpay.domain.users.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password,
                      UserType userType) {
}
