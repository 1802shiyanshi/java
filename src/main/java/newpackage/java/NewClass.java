/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.java;
import java.util.*;
/**
 *
 * @author uwtsd-student
 */
public class NewClass {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String money = a.nextLine();
        String pound = "pound", euros = "euros", dollars = "dollars";
        double p, e , d;
//        p = a.nextDouble();
//        e = a.nextDouble();
//        d = a.nextDouble();
        if(money.equals(pound)){
            p = a.nextDouble();
            d = p / 1.25;
            e = p / 1.15;
//            System.out.println(p);
            System.out.println(e);
            System.out.println(d);
        }
        else if(money.equals(euros)){
            e = a.nextDouble();
            d = e / 1.10;
            p = e * 1.25;
            System.out.println(d);
            System.out.println(p);
        }
        else{
            money.equals(dollars);
            d = a.nextDouble();
            
            p = d * 1.25;
            e = d *1.15;
            System.out.println(p);
            System.out.println(e);
             
        }
    
    
    
    }
    
}
