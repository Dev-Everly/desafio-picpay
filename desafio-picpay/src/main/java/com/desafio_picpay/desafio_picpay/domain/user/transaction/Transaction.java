package com.desafio_picpay.desafio_picpay.domain.user.transaction;

import com.desafio_picpay.desafio_picpay.domain.users.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name="transactions")
@Table(name="transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private BigDecimal amount; //quantia

    @ManyToOne //relacao de muitos para 1
    @JoinColumn(name="sender_id")
    private User sender; //remetente

    @ManyToOne
    @JoinColumn(name="receiver_id")
    private User receiver; //receptor

    private LocalDateTime timestamp; //data hora

}
