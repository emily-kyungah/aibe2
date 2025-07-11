package com.example.myShop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="t_orderitem")
@Getter @Setter
public class OrderItem extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name="order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;
    private int orderPrice;
    private int count;

//    private LocalDateTime regTime;
//    private LocalDateTime updateTime;

}
