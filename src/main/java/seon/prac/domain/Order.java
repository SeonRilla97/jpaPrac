package seon.prac.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn("member_id")
    private Member member;

    @OneToMany(mappedBy = "order") //OrderItem의 order 필드가 연관관계의 주인임을 알려준다.
    private List<OrderItem> orderItems = new ArrayList<>();


    @JoinColumn(name = "delivery_id") // DB Table에 생성될 컬럼명을 의미한다.
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Delivery delivery;
}
