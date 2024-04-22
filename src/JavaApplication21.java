
package javaapplication21;

import java.util.Scanner;


public class JavaApplication21 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to E-Commerce system");
        System.out.println("Enter your id:");
        ElectronicProduct ep = new ElectronicProduct(1,"Smart Phone",599.9,"Samsung",1);
        ClothingProduct clo = new ClothingProduct(2,"T-Shirt",19.9,"Meduim","Cotton");
        BookProduct boo = new BookProduct(3,"OOP Book",39.9,"O'Reilly","X Publications");
        int cid = sc.nextInt();
        System.out.println("Enter your name:");
        String na = sc.next();
        System.out.println("Enter your address:");
        String addre = sc.next();
        Customer cu = new Customer(cid,na,addre);
        System.out.println("How many products you want to add to your cart?");
        int np =sc.nextInt();
        int x = np;
        cart ca = new cart(cid,np);
        
        while(np>=x){
            System.out.println("Which product would you like to add?");
            System.out.println("1)Smart Phone\n2)T-Shirt\n3)OOP Book\n4)Remove product\n5)Exit");
            int choice1 = sc.nextInt();
            switch(choice1){
            case 1:
                ca.addProduct(ep);
                break;
            case 2:
                ca.addProduct(clo);
                break;
            case 3:
                ca.addProduct(boo);
                break;
            case 4:
                System.out.println("Enter the id of the product you want to remove:");
                int remove = sc.nextInt();
                ca.removeProduct(remove);
                break;
            case 5:
                np-=1;
                break;
               
        }
        
        }
        
        order o = ca.placeorder();
        
        System.out.println("You want to place order?");
        System.out.println("yes or no");
        String choice2 = sc.next();
        switch(choice2){
            case "yes":
                System.out.println("Her's your order's summry:");
                o.printOrderInfo();
                break;
            case "no":
                System.out.println("Thanks for shopping");
                break;
                
                
                
            
        }
        
        
        
        
        
        
        
        
       
            
    }

        }
