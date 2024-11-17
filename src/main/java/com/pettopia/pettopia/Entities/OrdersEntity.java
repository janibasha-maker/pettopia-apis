package com.pettopia.pettopia.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Orders")
public class OrdersEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    Integer orderId;

    @Column(name = "customer_id")
    Integer customerId;

    @Column(name = "order_date")
    LocalDateTime orderDate;

    @Column(name = "total")
    Double total;

    @Column(name = "order_status_id")
    Integer orderStatusId;
}
