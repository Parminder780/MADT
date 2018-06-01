



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author macstudent
 */
public class Student {
    int id;
    String name;
    double marks;
    
    public void setValues(int stuid,String stuname,double stumarks)
            
    {
        this.id=stuid;
        this.name=stuname;
        this.marks=stumarks;
    }
    public void display()
    {
        System.out.format("%d %s %f",id,name,marks);
        
    }
}
