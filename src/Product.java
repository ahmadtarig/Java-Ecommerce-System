
package javaapplication21;

public class Product {
    protected int productid;
    protected String name;
    protected double price;
    public Product(){
        
    }
    public Product(int id,String n,double p){
        productid = id;
        name = n;
        price = p;
        
    }
    public void setproductid(int id){
        if (id<0){
            Math.abs(id);
        }else
        productid = id;
        }
    public void setname(String n){
        name = n;
    }
    public void setprice(int p){
        if (p<0){
            Math.abs(p);
        }else
        price = p;
    }
    public int getproductid(){
        return productid;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return  price;
    }

    @Override
    public String toString() {
        return "Order Id:"+this.productid+"\tProduct name:"+this.name;
    }
    
 
            
            
    
    
    
    

   
}
