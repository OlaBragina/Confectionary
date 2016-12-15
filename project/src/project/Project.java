/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность, которая будет маппитьсяв БД
 * 
 * @author a.pleshkanev
 */
    @Entity
    @Table(name="Product")
    public class Project implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="Шифр")
        private String shipher;

        @Column(name="Название продукции")
        private String name_product;
        
        @Column(name="Вид продукции")
        private String view_product;
        
        @Column(name="Количество")
        private int size;
        
        @Column(name="Срок_годности")
        private int srokGodn;
        
        @Column(name="Цена")
        private int price;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public String getShipher() {
        return shipher;
    }

    public String getName_product() {
        return name_product;
    }

    public String getView_product() {
        return view_product;
    }

    public int getSize() {
        return size;
    }

    public int getSrokGodn() {
        return srokGodn;
    }

    public int getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setShipher(String shipher) {
        this.shipher = shipher;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public void setView_product(String view_product) {
        this.view_product = view_product;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSrokGodn(int srokGodn) {
        this.srokGodn = srokGodn;
    }

    public void setPrice(int price) {
        this.price = price;
    }
        
        
        
        @Override
        public String toString() {
            return String.format("(%d, %d)", this.shipher, this.name_product , this.view_product , this.size);
        }
    }

