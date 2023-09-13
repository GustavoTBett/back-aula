package com.satc.aulaBack.model;

import javax.persistence.*;

/**
 *
 * @author gustavo.437413
 */
@MappedSuperclass
public class EntityId {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
