package com.desafio_picpay.desafio_picpay.domain.user.transaction;

import com.desafio_picpay.desafio_picpay.domain.users.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name="transactions")
@Table(name="transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    // Getter
    public BigDecimal getAmount() {
        return amount;
    }

    // Setter
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
