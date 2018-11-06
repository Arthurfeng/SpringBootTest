package com.arthur.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table
public class Person {
    @Id
    @Column(name = "id_")
    private Integer id;
    @Column(name = "name_")
    private String name;
    @Column(name= "age_")
    private Integer age;
    @Column(name = "sex_")
    private Integer sex;
    //男生為0，女生為1
    @Column(name = "address_")
    private String address;


}
