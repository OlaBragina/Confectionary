/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.main;
import project.BD.ClassInterf;
import project.tab.Project;


/**
 *
 * @author Ольга
 */
public class MainClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       
        // TODO code application logic here
        ClassInterf dbproduct = new ClassInterf();
        Project newproduct=new Project("78","Alenka","Chocolate",87,12,660);
        dbproduct.addProject(newproduct);
        Project productqwerty=dbproduct.find(1L);
        
    }
}
