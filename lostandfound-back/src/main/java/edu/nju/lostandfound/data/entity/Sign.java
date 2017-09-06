package edu.nju.lostandfound.data.entity;

import edu.nju.lostandfound.data.enmu.SignStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 9:03
 */

@Entity
@Table(name = "sign")
@Data
public class Sign {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String tags;

    private String title;

    private String lostAddress;

    private Date lostDateBef;

    private Date lostDateEnd;

    private String description;

    private SignStatus signStatus;


    @JoinColumn(name = "user_id", referencedColumnName = "id" )
    @ManyToOne
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="sign")
    private List<Material> materials;
}
