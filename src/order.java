
package javaapplication21;
public class order{
    int customerid;
    private int orderid;
    private Product[] product;
    private double totalprice;
    
    order(int cid, double tp,Product[] products) {
        customerid = cid;
        orderid = (int) (100*Math.random());
        totalprice = tp;
        product = products;
        
       
    }
    public void printOrderInfo(){
        System.out.println("Customer Id:"+customerid);
        System.out.println("Order Id:"+orderid);
        System.out.println("Products:");
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
            
        }
        System.out.println("Total price:"+totalprice);
    }
    
}


