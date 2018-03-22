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

    
}
