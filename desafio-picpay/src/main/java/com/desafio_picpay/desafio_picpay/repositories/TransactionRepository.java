package com.desafio_picpay.desafio_picpay.repositories;

import com.desafio_picpay.desafio_picpay.domain.user.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository <Transaction, Long> {


}
