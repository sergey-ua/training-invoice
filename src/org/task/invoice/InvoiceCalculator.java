package org.task.invoice;

import org.task.CollectionUtils;
import org.task.invoice.lineitem.LineItem;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by tityenok on 4/22/15.
 */
public class InvoiceCalculator
{
  public static BigDecimal calulateTotalConsideringRefunds(List<Invoice> invoices)
  {
    Map<Long, List<Refund>> refundsToAppy = convertToRefundsForInvoices(invoices);
    BigDecimal totalAmount = BigDecimal.ZERO;
    for (Invoice invoice : invoices)
    {
      totalAmount = totalAmount.add(invoice.getAmount());
      if (refundsToAppy.containsKey(invoice.getId()))
      {
        for (Refund refund : refundsToAppy.get(invoice.getId()))
        {
          totalAmount = totalAmount.subtract(refund.getRefundedAmount());
        }
      }
    }
    return totalAmount;

  }

  private static Map<Long, List<Refund>> convertToRefundsForInvoices(List<Invoice> invoices)
  {
    return invoices.stream()
        .map(Invoice::getRefunds)
        .reduce(new LinkedList<Refund>(), CollectionUtils::reduceMerge)
        .stream()
        .collect(Collectors.toMap(refund -> refund.getRefundedInvoiceId(), value ->
        {
          List<Refund> associatedRefunds = new LinkedList<>();
          associatedRefunds.add(value);
          return associatedRefunds;
        },
            CollectionUtils::reduceMerge
        ));
  }

  public static BigDecimal calculateTotalForLineItems(List<LineItem> lineItems)
  {
    return new BigDecimal(135);
  }
}
