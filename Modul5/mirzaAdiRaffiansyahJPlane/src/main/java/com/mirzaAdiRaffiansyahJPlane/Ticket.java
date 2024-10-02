package com.mirzaAdiRaffiansyahJPlane;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @ManyToOne
    @JoinColumn (name = "buyer_id", nullable = false)
    private Account buyer;

    @ManyToOne
    @JoinColumn (name = "plane_id", nullable = false)
    private Plane plane;

    @Column (name = "code", nullable = false)
    private String code;

    public Ticket(Account buyer, Plane plane, String code) {
        this.buyer = buyer;
        this.plane = plane;
        this.code = code;
    }

    public Ticket() {
        this.buyer = null;
        this.plane = null;
        this.code = "";
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "Id=" + Id +
                ", buyer=" + buyer +
                ", plane=" + plane +
                ", code='" + code + '\'' +
                '}';
    }

    public long getId(){
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public Account getBuyer() {
        return buyer;
    }

    public void setBuyer(Account buyer) {
        this.buyer = buyer;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
