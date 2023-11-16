package com.aula_internet.DsList.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK pk = new BelongingPK();
    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game, GameList list, Integer position) {
        pk.setGame(game);
        pk.setList(list);
        this.position = position;
    }

    public BelongingPK getPk() {
        return pk;
    }

    public void setPk(BelongingPK pk) {
        this.pk = pk;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(pk, belonging.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }
}
