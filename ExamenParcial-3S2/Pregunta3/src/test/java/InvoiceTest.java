import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {

    @Test
    void calculate() {
        Invoice invoice = new Invoice(2500,"NL",CustomerType.COMPANY);
        assertEquals(250,invoice.calculate());
    }

    @Test
    void taxesForCompanyAreTaxRateMultipliedByAmount() {
        double invoiceValue = 2500.0;
        double tax = 0.1;
        Invoice invoice = new InvoiceBuilder()
                .asCompany()
                .withCountry("NL")
                .withAValueOf(invoiceValue)
                .build();
        double calculatedValue = invoice.calculate();
        assertEquals(calculatedValue,invoiceValue * tax);
    }
}