package org.task.invoice.lineitem;

import java.math.BigDecimal;

/**
 *
 * Created by tityenok on 4/22/15.
 */
public abstract class LineItem
{
  public static enum LineType {REGULAR, DISCOUNT, SUBTOTAL}

  private BigDecimal amount;
  private LineType lineType;

  public LineItem()
  {
    lineType = defineLineType();
  }

  public BigDecimal getAmount()
  {
    return amount;
  }

  public void setAmount(BigDecimal amount)
  {
    this.amount = amount;
  }

  public LineType getLineType()
  {
    return lineType;
  }

  protected abstract LineType defineLineType();
}
