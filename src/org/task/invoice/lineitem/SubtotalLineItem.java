package org.task.invoice.lineitem;

/**
 * Subtotal item is used for markup only. It indicates that all discounts below will be applied to subtotaling
 * amount. It does not add any new value.
 * Created by tityenok on 4/22/15.
 */
public class SubtotalLineItem extends LineItem
{
  @Override
  protected LineType defineLineType()
  {
    return LineType.SUBTOTAL;
  }

}
