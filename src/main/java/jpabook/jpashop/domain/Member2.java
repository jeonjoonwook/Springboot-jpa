package jpabook.jpashop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member2 {

    //@ID는 primary key @GeneratedValue는 주키를 어떻게 생성할지
    @Id
    @GeneratedValue
    @Column(name = "member2_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member2")
    private List<Order> orders = new ArrayList();

}
