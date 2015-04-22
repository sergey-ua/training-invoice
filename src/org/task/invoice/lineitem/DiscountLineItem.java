package org.task.invoice.lineitem;

/**
 * Instances of this class add discounts to total. Logic of calculating discount must consider discountType.
 * If it is set to ABSOLUTE then value which is in discount amount shuld be applied.
 * If it is PERCENT, then amount will contain percent amount of discount where value of 0.01 means 1% of discount.
 * Created by tityenok on 4/22/15.
 */
public class DiscountLineItem extends LineItem
{
  public static enum DISCOUNT_TYPE {ABSOLUTE, PERCENT};

  @Override
  protected LineType defineLineType()
  {
    return LineType.DISCOUNT;
  }

  private DISCOUNT_TYPE discountType;

  public DISCOUNT_TYPE getDiscountType()
  {
    return discountType;
  }

  public void setDiscountType(DISCOUNT_TYPE discountType)
  {
    this.discountType = discountType;
  }
}
