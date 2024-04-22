
package javaapplication21;


public class cart {
     int customerid;
    private int nproducts;
    private Product[] products;
    
    public cart(int id,int np){
        customerid = id;
        nproducts = np;
        products = new Product[np];
              
    }
   
    public void setcustomerid(int id){
        if(id<0){
            Math.abs(id);
        }
        customerid = id;
        
    }
    public int getcustomerid(){
        return customerid;
    }
    
    public void setnproducts(int np){
        if(np<0){
            Math.abs(np);
        }
        nproducts = np;
    }
    public int getnproducts(){
        return nproducts;
    }
    public void setProduct(Product[] products){
        this.products = products;
    }
    public Product[] product(){
        return products;
    }
    public void addProduct(Product product){
         
         for (int i = 0; i < nproducts; i++) {
             if (products[i]==null) {
                 products[i] = product;
                  
                  break;
             }
             
            
        }

    }
    public void removeProduct(int id){
         
         for (int i = 0; i < nproducts; i++){
              if (products[i] == null) continue;
              if (products[i].getproductid() == id){
                products[i] = null;
                return;
            }
              
    }


             
         }
    public double calculatePrice(){
        double totalprice = 0;
        for (int i = 0; i < nproducts; i++) {
             if (products[i] == null) continue;
              totalprice+=products[i].getprice();            
        }
        return totalprice;
       
    }
    public order placeorder(){
        return new order(customerid, calculatePrice(), products);

    }
    }
    
    
    
    
    
    

