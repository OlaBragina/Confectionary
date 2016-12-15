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
 *
 * @author Ольга
 */
    @Entity
    @Table(name="Workers")
     public class Workers implements Serializable  {
    
        private static final long serialVersionUID = 1L;

           @Id @GeneratedValue
           private long id;

           @Column(name="Номер")
           private String number;

           @Column(name="Отдел")
           private String branch;
        
           @Column(name="Ответственный")
           private String responsible;
        
           @Column(name="Должность")
           private String post;
        
           @Column(name="Стаж")
           private int experience;
        
         public static long getSerialVersionUID() {
         return serialVersionUID;
         }
         
         public long getId() {
         return id;
         }
  
    public String getNumber() {
        return number;
    }

    public String getBranch() {
        return branch;
    }

    public String getResponsible() {
        return responsible;
    }

    public String getPost() {
        return post;
    }

    public int getExperience() {
        return experience;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
        
     
        @Override
        public String toString() {
            return String.format("(%d, %d)", this.number, this.branch, this.responsible , this.experience);
        }
    }
