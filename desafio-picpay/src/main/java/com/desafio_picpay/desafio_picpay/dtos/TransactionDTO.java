package com.desafio_picpay.desafio_picpay.dtos;

import java.math.BigDecimal;

public record TransactionDTO (BigDecimal value, Long senderId, Long receiverId) {

}

