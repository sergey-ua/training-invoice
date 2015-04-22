package org.task;


import java.util.List;

/**
 * Created by tityenok on 4/22/15.
 */
public interface CollectionUtils
{
  public static <T> List<T> reduceMerge(List<T> listA, List<T> listB){
    if (listB!=null){
      listA.addAll(listB);
    }
    return listA;
  }
}
