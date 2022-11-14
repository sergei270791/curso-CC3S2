
public class Invoice {
    private final double value;
    private final String country;
    private final CustomerType customerType;
    public Invoice(double value, String country, CustomerType customerType) {
        this.value = value;
        this.country = country;
        this.customerType = customerType;
    }
    public double calculate() {
        double ratio = 0.1;
        return value * ratio;
    }
    public void print(){
        System.out.println(country);
        System.out.println(value);
        System.out.println(customerType);

    }
}