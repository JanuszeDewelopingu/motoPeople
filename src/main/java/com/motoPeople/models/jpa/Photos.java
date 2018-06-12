package com.motoPeople.models.jpa;

import javax.persistence.*;

@Entity
@Table(name = "Photos")
public class Photos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int idPhotos;

    @Column(name = "idOffers", nullable = false)
    int idOffers;

    @Column(name = "bytes", nullable = false)
    byte[] bytes;

    public Photos(int idPhotos, int idOffers, byte[] bytes) {
        this.idPhotos = idPhotos;
        this.idOffers = idOffers;
        this.bytes = bytes;
    }

    public int getIdPhotos() {
        return idPhotos;
    }

    public void setIdPhotos(int idPhotos) {
        this.idPhotos = idPhotos;
    }

    public int getIdOffers() {
        return idOffers;
    }

    public void setIdOffers(int idOffers) {
        this.idOffers = idOffers;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
