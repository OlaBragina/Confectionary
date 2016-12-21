/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.tab;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Ольга
 */
 @Entity
 @Table(name="Customers")
public class Customers implements Serializable {

        private static final long serialVersionUID = 1L;

           @Id @GeneratedValue
           private long id;

           @Column(name="Код")
           private String code;

           @Column(name="Организация")
           private String organization;
        
           @Column(name="Представитель")
           private String agent;
        
           @Column(name="Дата")
           private String date;
        
           @Column(name="Адрес")
           private String address;
        
         public static long getSerialVersionUID() {
         return serialVersionUID;
         }
         
         public long getId() {
         return id;
         }

    public String getCode() {
        return code;
    }

    public String getOrganization() {
        return organization;
    }

    public String getAgent() {
        return agent;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }
  
        
     
        @Override
        public String toString() {
            return String.format("(%d, %d)", this.code, this.organization, this.agent, this.date,this.address);
        }
    }

