
package activity892019;

import java.util.Scanner;

public class Activity892019 {

    public static void main(String[] args) {
    
        System.out.println("*********\t\t***\t\t*\t\t*");
        System.out.println("*\t*\t     *\t     *\t       ***\t       * *");
        System.out.println("*\t*\t   *\t       *      *****\t      *   *");
        System.out.println("*\t*\t   *\t       *\t*\t     *\t   *");
        System.out.println("*\t*\t   *\t       *\t*\t    *\t    *");
        System.out.println("*\t*\t   *\t       *\t*\t     *\t   *");
        System.out.println("*\t*\t   *\t       *\t*\t      *\t  *");
        System.out.println("*\t*\t     *\t     *\t\t*\t       * *");
        System.out.println("*********\t\t***\t\t*\t\t*");
        
        //second question
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of pizza: ");
        int pizza,toppings;
        float costs, Tax, result;
        
        pizza = in.nextInt();
        System.out.println("Enter the number of toppings: ");
        toppings = in.nextInt();
        costs = pizza * 12.00f + (toppings * 1.50f);
        Tax = costs * 0.05f;
        result = Tax + costs;
        
        System.out.println("Cost (Incl tax): " + result);
        
        
         
        
        
                    
    }

  
}
    

