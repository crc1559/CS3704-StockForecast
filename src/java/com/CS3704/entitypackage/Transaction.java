/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs3704.stockpredictor;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cody
 */
@Entity
@Table(name = "Transaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaction.findAll", query = "SELECT t FROM Transaction t"),
    @NamedQuery(name = "Transaction.findById", query = "SELECT t FROM Transaction t WHERE t.id = :id"),
    @NamedQuery(name = "Transaction.findByType", query = "SELECT t FROM Transaction t WHERE t.type = :type"),
    @NamedQuery(name = "Transaction.findByStockName", query = "SELECT t FROM Transaction t WHERE t.stockName = :stockName"),
    @NamedQuery(name = "Transaction.findByStockPrice", query = "SELECT t FROM Transaction t WHERE t.stockPrice = :stockPrice"),
    @NamedQuery(name = "Transaction.findByTimestamp", query = "SELECT t FROM Transaction t WHERE t.timestamp = :timestamp"),
    @NamedQuery(name = "Transaction.findByQuantity", query = "SELECT t FROM Transaction t WHERE t.quantity = :quantity")})
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "stock_name")
    private String stockName;
    @Basic(optional = false)
    @NotNull
    private Stock stock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock_price")
    private double stockPrice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "timestamp")
    private String timestamp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @JoinColumn(name = "email", referencedColumnName = "email")
    @ManyToOne(optional = false)
    private User email;

    public Transaction() {
    }

    public Transaction(Integer id) {
        this.id = id;
    }
    
    public Transaction(Integer id, String type, String stockName, Integer quantity)
    {
        this.id = id;
        this.type = type;
        this.stockName = stockName;
        this.quantity = quantity; 
        this.stock = getStock();
        this.timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        this.stockPrice = getLivePrice();
    }

    public Transaction(Integer id, String type, String stockName, double stockPrice, String timestamp, int quantity) {
        this.id = id;
        this.type = type;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.timestamp = timestamp;
        this.quantity = quantity;
        this.stock = getStock();
    }
    
    public Stock getStock()
    {
        return this.stock; 
    }
    
    public Stock setStock()
    {
        Stock temp = YahooFinance.get(this.stockName);
        if(temp != NULL)
        {
            return temp;
        }
        //If stock can't be found
        else
        {
            return NULL; 
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }
    
    public double getLivePrice()
    {
        return stock.getQuote().getPrice();
    }
    
    public void updateStockPrice() {
        this.stockPrice = getLivePrice();
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public User getEmail() {
        return email;
    }

    public void setEmail(User email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cs3704.stockpredictor.Transaction[ id=" + id + " ]";
    }
    
}
