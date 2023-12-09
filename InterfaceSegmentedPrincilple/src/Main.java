interface RestaurantEmployee{
    void washDishes();
    void serveCustomers();
    void cookFood();
}

class Waiter implements RestaurantEmployee{

    @Override
    public void washDishes() {
        // Not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Please serve the Customers");
    }

    @Override
    public void cookFood() {
        // Not my job
    }
}

 /////////////////////Segment the Interfaces into small small interface so that unnecessary function should not be wasted
interface WaiterInterface{
    void serveCustomers();
    void takeOrders();
}

class Waiter1 implements WaiterInterface{

    @Override
    public void serveCustomers() {
        System.out.println("Please serve to teh Coustomers");
    }

    @Override
    public void takeOrders() {
        System.out.println("Please take the orders from the Customers");
    }
}

interface ChefInterface{
    void cookFood();
    void makeMenu();
}

class Chef implements ChefInterface{

    @Override
    public void cookFood() {
        System.out.println("Cook for The Customers");
    }

    @Override
    public void makeMenu() {
        System.out.println("Please make the special Menu");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
