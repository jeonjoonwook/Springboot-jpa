package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member2 {

    //@ID는 primary key @GeneratedValue는 주키를 어떻게 생성할지
    @Id @GeneratedValue
    private Long id;
    private String username;
}
