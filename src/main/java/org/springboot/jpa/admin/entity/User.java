package org.springboot.jpa.admin.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/716:03
 */
@Entity
public class User {
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator = "idGenerator")
    private String id;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
