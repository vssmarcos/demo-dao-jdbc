package application;

import java.util.Date;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {
        Department o =  new Department(1,"books");
        System.out.println(o);
        
        Seller s = new Seller(21,"bob","bob@gmail.com", new Date(),3000.0,o);
        System.out.println(s);

    }
    
}
