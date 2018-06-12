package com.motoPeople.models.jpa;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "Offres")
public class Offers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "owner", nullable = false)
    int owner;

    @Column(name = "creationDate", nullable = false)
    ZonedDateTime creationDate;

    @Column(name = "expirationDate", nullable = false)
    ZonedDateTime expirationDate;

    @Column(name = "prize", nullable = false)
    double prize;

    @Column(name = "special")
    int special;

    @Column(name = "description")
    String description;

    @Column(name = "type")
    String type;

    @Column(name = "mark")
    String mark;

    @Column(name = "model")
    String model;

    public Offers(int id, int owner, ZonedDateTime creationDate, ZonedDateTime expirationDate, double prize, int special, String description, String type, String mark, String model) {
        this.id = id;
        this.owner = owner;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
        this.prize = prize;
        this.special = special;
        this.description = description;
        this.type = type;
        this.mark = mark;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public ZonedDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ZonedDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
