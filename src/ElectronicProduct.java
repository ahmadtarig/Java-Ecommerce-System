
package javaapplication21;


public class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;
    
    public ElectronicProduct(){
        System.out.println("");
        
    }
    public ElectronicProduct(int id,String n,double p,String b,int w ){
        super(id,n,p);
        brand = b;
        warrantyPeriod = w;
    }
    public void setbrand(String b){
        brand = b;
    }
    public void setwarrantyPeriod(int w){
        if(w<0){
            Math.abs(w);
        }
        warrantyPeriod = w;
    }
    public String getbrand(){
        return brand;
    }
    public int getwarrantyPeriod(){
        return warrantyPeriod;
    }
    
    
        
    
}
