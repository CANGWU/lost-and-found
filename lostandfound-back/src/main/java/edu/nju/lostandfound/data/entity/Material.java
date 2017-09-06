package edu.nju.lostandfound.data.entity;

import edu.nju.lostandfound.data.enmu.MaterialType;
import lombok.Data;

import javax.persistence.*;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 9:19
 */


@Entity
@Table(name = "material")
@Data
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private MaterialType materialType;
    private String url;


    @JoinTable(name = "sign_material", joinColumns = @JoinColumn(name = "material_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "sign_id", referencedColumnName = "id", nullable = false))
    @ManyToOne
    private Sign sign;
}
