public class Customer {
    public String name;
    public String customerId;

    public Customer(String name, String customerId){
        this.name = name;
        this.customerId = customerId;
    }

    public String toString() {
        String result = "Customer Name: " + this.name + "/n" + "Customer ID: " + this.customerId;
        return result;
    }
}
