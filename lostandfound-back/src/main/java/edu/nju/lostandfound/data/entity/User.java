package edu.nju.lostandfound.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 8:44
 */

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 45)
    private String name;

    private String photoUrl;

    @Column(length = 45)
    private String password;

    @Column(length = 45)
    private String email;

    @Column(length = 20)
    private String phoneNumber;

    @Column(length = 100)
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Sign> signs;


}
