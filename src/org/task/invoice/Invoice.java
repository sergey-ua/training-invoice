package org.task.invoice;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by tityenok on 4/22/15.
 */
public class Invoice
{
  private Long id;
  private BigDecimal amount;
  protected List<Refund> refunds;

  public Invoice()
  {

  }

  public Invoice(Long id, BigDecimal amount)
  {

    this.id = id;
    this.amount = amount;
  }
  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public BigDecimal getAmount()
  {
    return amount;
  }

  public void setAmount(BigDecimal amount)
  {
    this.amount = amount;
  }

  public List<Refund> getRefunds()
  {
    return refunds;
  }

  public void setRefunds(List<Refund> refunds)
  {
    this.refunds = refunds;
  }
}
