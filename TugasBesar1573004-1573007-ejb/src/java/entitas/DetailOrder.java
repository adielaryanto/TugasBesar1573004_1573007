/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitas;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author adiel
 */
@Entity
public class DetailOrder implements Serializable {

    @Id
    @GeneratedValue
    private Long idDetailOrder;

    @ManyToOne
    @JoinColumn(name = "idOrder")
    private Order1 idOrder;

    @OneToOne(cascade = CascadeType.ALL)
    private Book id;

    private int subtotal;

    private int jumlah;

    public DetailOrder() {
    }

    public Long getIdDetailOrder() {
        return idDetailOrder;
    }

    public void setIdDetailOrder(Long idDetailOrder) {
        this.idDetailOrder = idDetailOrder;
    }

    public Order1 getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Order1 idOrder) {
        this.idOrder = idOrder;
    }

    public Book getId() {
        return id;
    }

    public void setId(Book id) {
        this.id = id;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    
    
}
