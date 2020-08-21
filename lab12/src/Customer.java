public class Customer {


    private String name;
    private String address;
    private Pizza[] pastOrders;
    private int numPastOrders;
    private Pizza[] ongoingOrders;
    private int numOngoingOrders;
    private static final int MAX_ORDERS = 20;

    public static void main(String[] args) {
        Customer customer = new Customer("John", "111");
        customer.addPizza("Pepperoni", 15);
        customer.addPizza("Hawaiian", 12);
        System.out.println(customer.totalPrice());
    }

    public Customer(String name, String address) {
        this(name, address, new Pizza[MAX_ORDERS], 0);
    }

    public Customer(String name, String address, Pizza[] pastOrders, int numPastOrders) {
        this(name, address, new Pizza[MAX_ORDERS], 0, pastOrders, numPastOrders);
    }

    public Customer(String name, String address, Pizza[] ongoingOrders, int numOngoingOrders, Pizza[] pastOrders, int numPastOrders) {
        this.name = name;
        this.address = address;
        this.ongoingOrders = ongoingOrders;
        this.numOngoingOrders = numOngoingOrders;
        this.pastOrders = pastOrders;
        this.numPastOrders = numPastOrders;
    }
    //addPizza	boolean	String type
    //int size
    //addPizza	boolean	String type
    //addPizza	boolean	int size
    //addPizza	boolean	none
    //orderLookup	Pizza	int pastOrder
    //removePizza	void	int pizzaNumber
    //finishOrders	void	none
    //totalPrice	double	none

    public boolean addPizza(String type, int size) {
        if (numOngoingOrders < 20) {
            Pizza pizza = new Pizza(type, size);
            ongoingOrders[numOngoingOrders] = pizza;
            numOngoingOrders++;
            return true;
        }
        return false;
    }

    public boolean addPizza(String type) {
        return addPizza(type, 6);
    }

    public boolean addPizza(int size) {
        return addPizza("Cheese", size);
    }

    public boolean addPizza() {
        return addPizza("Cheese", 6);
    }

    public Pizza orderLookup(int pastOrder) {
        if (pastOrder < 0 || pastOrder > numPastOrders) {
            return null;
        }
        return pastOrders[pastOrder];
    }

    public void removePizza(int pizzaNumber) {
        if (pizzaNumber < 0 || pizzaNumber > numPastOrders) {
            return;
        }

        for (int i = pizzaNumber; i < numOngoingOrders; i++) {
            ongoingOrders[i] = ongoingOrders[i + 1];
        }
        numOngoingOrders--;

    }

    public void finishOrders() {
        // if (numOngoingOrders < numPastOrders) {
          //  pastOrders[numPastOrders] = pastOrders[numPastOrders + numOngoingOrders];
        if (numOngoingOrders + numPastOrders > MAX_ORDERS) {
            int shiftValue = (numOngoingOrders + numPastOrders) - MAX_ORDERS;
            for (int i = 0; i < MAX_ORDERS - shiftValue; i++) {
                pastOrders[i] = pastOrders[i + shiftValue];
            }
            numPastOrders = numPastOrders - shiftValue;
        }
        for (int i = 0; i < numOngoingOrders; i++) {
            pastOrders[i + numPastOrders] = ongoingOrders[i];
        }
        numPastOrders = numPastOrders + numOngoingOrders;
        numOngoingOrders = 0;

    }

    public double totalPrice() {
        double price = 0;
        for (int i = 0; i < numOngoingOrders; i++) {
            price = price + ongoingOrders[i].getPrice();
        }
        return price;
    }
}

