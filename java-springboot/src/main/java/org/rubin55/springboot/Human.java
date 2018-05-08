package org.rubin55.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Human {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String alias;
    private String fullName;

    protected Human() {}

    public Human(String alias, String fullName) {
        this.alias = alias;
        this.fullName = fullName;
    }

    public String getAlias() {
        return alias;
    }

    public String getFullName() {
        return fullName;
    }
}
