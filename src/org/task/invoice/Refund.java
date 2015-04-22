package org.task.invoice;

import java.math.BigDecimal;

/**
 * Created by tityenok on 4/22/15.
 */
public class Refund
{
  private BigDecimal refundedAmount;
  private Long refundedInvoiceId;

  public Refund(Long refundedInvoiceId, BigDecimal refundedAmount)
  {
    this.refundedInvoiceId = refundedInvoiceId;
    this.refundedAmount = refundedAmount;
  }

  public BigDecimal getRefundedAmount()
  {
    return refundedAmount;
  }

  public void setRefundedAmount(BigDecimal refundedAmount)
  {
    this.refundedAmount = refundedAmount;
  }

  public Long getRefundedInvoiceId()
  {
    return refundedInvoiceId;
  }

  public void setRefundedInvoiceId(Long refundedInvoiceId)
  {
    this.refundedInvoiceId = refundedInvoiceId;
  }
}
