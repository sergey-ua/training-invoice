package org.task.invoice.lineitem;

/**
 * Regular line item which represents position in Invoice.
 * Created by tityenok on 4/22/15.
 */
public class RegularLineItem extends LineItem
{
  @Override
  public LineType getLineType()
  {
    return super.getLineType();
  }

  @Override
  protected LineType defineLineType()
  {
    return LineType.REGULAR;
  }

  private String itemName;

  public String getItemName()
  {
    return itemName;
  }

  public void setItemName(String itemName)
  {
    this.itemName = itemName;
  }
}
