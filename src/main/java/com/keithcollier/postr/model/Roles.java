package com.keithcollier.postr.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Roles(User user) {
        this.user = user;
    }
}
