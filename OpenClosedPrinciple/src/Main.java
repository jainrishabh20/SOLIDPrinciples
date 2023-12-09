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

class Invoice{
    private int quantity;
    private Marker marker;

    public Invoice(int quantity, Marker marker){
        this.quantity=quantity;
        this.marker=marker;
    }

    public int getPrice(){
        return marker.price*quantity;
    }

}

class InvoiceDao{
    private Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveToDB(){
        //
    }

    public void saveToFile(String fileName){  //Added one more functionality but this is not good as (OCP)
        //
    }
}
////////////////This is Open/Closed Principle///////////////////////////


interface InvoicDao{
    public void save(Invoice invoice);
}

class InvoiceDaoDB implements InvoicDao{

    @Override
    public void save(Invoice invoice) {
        //Save to DB
    }
}

class InvoiceDaoFile implements InvoicDao{

    @Override
    public void save(Invoice invoice) {
        //Save to File
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}