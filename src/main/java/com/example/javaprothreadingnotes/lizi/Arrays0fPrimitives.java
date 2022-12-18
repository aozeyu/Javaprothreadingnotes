package com.example.javaprothreadingnotes.lizi;

public class Arrays0fPrimitives {
  public static void main(String[] args) {
    int[] a1 = {1,2,3,4,5};
    int[] a2;
    // 将a1赋值给a2
    a2 = a1;
    for (int i = 0; i< a2.length; i++) {
      // a2中数组值都加1
      a2[i] = a2[i] + 1;
    }
    for (int i =0; i< a1.length; i++) {
      //由于a2和a1 是相同数组的别名，因此通过a2所做的修改在a 1中可以看到。
      System.out.println("a1[" + i +"] = " + a1[i]);
    }
  }
}
