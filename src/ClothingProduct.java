
package javaapplication21;


public class ClothingProduct extends Product {
    private String size;
    private String fabric;
    public ClothingProduct(){
        System.out.println("");
    }
    public ClothingProduct(int id,String n,double p,String z,String f){
        super(id,n,p);
        size = z;
        fabric = f;
    }
    public void setsize(String z){
        size = z;
    }
    public void setfaabric(String f){
        fabric = f;
    }
    public String getsize(){
        return size;
    }
    public String getfabric(){
        return fabric;
    }
    
    
}
