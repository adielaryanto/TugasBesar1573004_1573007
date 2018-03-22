/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author adiel
 */
@Entity
public class Order1 implements Serializable {
    @Id
    @GeneratedValue
    private long idOrder;
    
    private float totalHarga;
    //many to one ke customer
    @ManyToOne
    
    //one to many ke detail order
    @OneToMany(mappedBy = "idOrder", cascade = CascadeType.ALL)
    private List<DetailOrder> listOd = new ArrayList<>();

//    @OneToOne (fetch = FetchType.EAGER)
//    @JoinColumn(name = "idDetailOrder")
//    private DetailOrder detailOrder;
    
    public Order1() {
    }

    public Order1(long idOrder, float totalHarga, DetailOrder detailOrder) {
        this.idOrder = idOrder;
        this.totalHarga = totalHarga;
        
    }

    

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public float getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(float totalHarga) {
        this.totalHarga = totalHarga;
    }

    public List<DetailOrder> getListOd() {
        return listOd;
    }

    public void setListOd(List<DetailOrder> listOd) {
        this.listOd = listOd;
    }

   
    
    
    
}
