public class InvoiceBuilder {
    public static void main(String[] args) {
        Invoice in =new InvoiceBuilder().withAValueOf(2800).asCompany().fromTheUS();
        in.print();
    }
    private String country;
    private CustomerType customerType;
    private double value;

    public InvoiceBuilder() {
        country = "NL";
        customerType = CustomerType.PERSON;
        value = 500;
    }


    public InvoiceBuilder withCountry(String country) {
        this.country = country;
        return this;
    }
    public InvoiceBuilder asCompany() {
        this.customerType = CustomerType.COMPANY;
        return this;
    }
    public InvoiceBuilder withAValueOf(double value) {
        this.value = value;
        return this;
    }
    public Invoice anyCompany() {
        return new Invoice(value, country, CustomerType.COMPANY);
    }
    public Invoice fromTheUS() {
        return new Invoice(value,"US", customerType);
    }
    public Invoice build() {
        return new Invoice(value, country, customerType);
    }
}
