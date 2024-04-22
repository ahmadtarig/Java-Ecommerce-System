
package javaapplication21;


public class BookProduct extends Product {
    private String author;
    private String publisher;
    public BookProduct(){
        System.out.println("");
    }
    public BookProduct(int id,String n,double p,String o,String sh){
        super(id,n,p);
        author = o;
        publisher = sh;
    }
    public void setauthor(String o){
        author = o;
    }
    public void setpublisher(String sh){
        publisher = sh;
    }
    public String getauthor(){
        return author;
    }
    public String getpublisher(){
        return publisher;
    }
    
}
