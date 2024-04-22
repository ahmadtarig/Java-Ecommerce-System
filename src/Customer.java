
package javaapplication21;



public class Customer {
     int customerid;
   private  String name;
   private  String address;
    public Customer(int id,String n,String add){
        customerid = id;
        name = n;
        address = add;
    }
    public void setcustomerid(int id){
        if(id<0){
            Math.abs(id);
            this.customerid = id;
        }
    }
    public void setname(String n){
        this.name = n;
    }
    public void setaddress(String add){
        address = add;
        
    }
    public int getcustomerid(){
        return customerid;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
   
    
}
