class Marker{
     int price;
     String color;
     String brand;

    public Marker(int price, String color, String brand){
        this.price=price;
        this.color=color;
        this.brand=brand;
    }

}
class Invoice{  //Each class have single Responsibility and having one reason to change
    private int quantity;
    private Marker marker;

    public Invoice(int quantity, Marker marker){
        this.quantity=quantity;
        this.marker=marker;
    }

    public int getInvoicePrice(){
        return marker.price*quantity;
    }

//    public void saveToDB(){
//        //
//    }
//
//    public void printInvoice(){
//        //
//    }
}

class InvoiceDao{  //Each class have single Responsibility and having one reason to change

    private Marker marker;
    public InvoiceDao(Marker marker){
        this.marker=marker;
    }

    public void saveToDB(){
        //
    }
}

class InvoicePrint{   //Each class have single Responsibility and having one reason to change
    private Marker marker;

    public InvoicePrint(Marker marker){
        this.marker=marker;
    }

    public void printInvoice(){
        //
    }

}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Marker marker=new Marker(50, "Blue", "Tixon");
        Invoice invoice=new Invoice(5, marker);
        System.out.println(invoice.getInvoicePrice());
    }
}