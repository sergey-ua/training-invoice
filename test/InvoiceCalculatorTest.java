import org.junit.Assert;
import org.junit.Test;
import org.task.invoice.Invoice;
import org.task.invoice.InvoiceCalculator;
import org.task.invoice.Refund;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by tityenok on 4/22/15.
 */
public class InvoiceCalculatorTest
{
  @Test
  public void testOnDescriptionCase()
  {
    Invoice invoice1 = new Invoice(1L, new BigDecimal(100));
    Invoice invoice2 = new Invoice(2L, new BigDecimal(5));
    Invoice refundInvoice = new Invoice(3L, new BigDecimal(12));
    refundInvoice.setRefunds(new LinkedList<>());
    refundInvoice.getRefunds().add(new Refund(1L, new BigDecimal(50)));
    refundInvoice.getRefunds().add(new Refund(2L, new BigDecimal(5)));

    List<Invoice> invoices = new LinkedList<>();
    invoices.add(invoice1);
    invoices.add(invoice2);
    invoices.add(refundInvoice);
    Assert.assertTrue("Invoice total of example case should match",
        new BigDecimal(62).compareTo(InvoiceCalculator.calulateTotalConsideringRefunds(invoices)) == 0);
  }

  @Test
  public void testOnTotalRefund()
  {
    Invoice invoice1 = new Invoice(1L, new BigDecimal(100));
    Invoice refundInvoice = new Invoice(3L, new BigDecimal(0));
    refundInvoice.setRefunds(new LinkedList<>());
    refundInvoice.getRefunds().add(new Refund(1L, new BigDecimal(50)));

    Invoice refundInvoice2 = new Invoice(4L, new BigDecimal(0));
    refundInvoice2.setRefunds(new LinkedList<>());
    refundInvoice2.getRefunds().add(new Refund(1L, new BigDecimal(50)));

    List<Invoice> invoices = new LinkedList<>();
    invoices.add(invoice1);
    invoices.add(refundInvoice);
    invoices.add(refundInvoice2);

    Assert.assertTrue("Two refunds of 50.00 each should refund 100.00 Invoice",
        new BigDecimal(0).compareTo(InvoiceCalculator.calulateTotalConsideringRefunds(invoices))==0);
  }
}
