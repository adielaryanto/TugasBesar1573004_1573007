/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitas;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.criteria.Order;

/**
 *
 * @author Developer
 */
@Entity
public class Customer {
    @Id
    private int idCustomer;
    private String nama;
    private String alamat;
    private String kota;
    private String email;
    private String telepon;
    
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "idCustomer")
    private List<Order1> listO = new ArrayList<Order1>();
    
}
