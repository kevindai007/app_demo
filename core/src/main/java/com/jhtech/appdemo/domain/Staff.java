package com.jhtech.appdemo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Staff {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * birthday
     */
    private Date birthday;

    /**
     * 员工工资
     */
    private BigDecimal salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}