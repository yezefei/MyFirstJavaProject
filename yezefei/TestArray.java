import java.sql.Array;
import java.util.Arrays;

import com.sun.crypto.provider.SslMacCore.SslMacMD5;

public class TestArray {
  public static void main(String[] args) {
    double[] myList = { 1.9, 2.9, 3.4, 3.5 };
    // 打印所有数组元素
    for (int i = 0; i < myList.length; i++) {
      System.out.println(myList[i] + " ");
    }
    // 计算所有元素的总和
    double total = 0;
    for (int i = 0; i < myList.length; i++) {
      total += myList[i];
    }
    System.out.println("Total is " + total);
    // 查找最大元素
    double max = myList[0];
    for (int i = 1; i < myList.length; i++) {
      if (myList[i] > max)
        max = myList[i];
    }
    System.out.println("Max is " + max); //复杂度O(n))
    // new
    int mid = myList.length / 2;

    double[] myLeftList = Arrays.copyOfRange(myList, 0, mid);
    double[] myRightList = Arrays.copyOfRange(myList, mid, myList.length);

    System.out.println(Arrays.toString(myLeftList));
    System.out.println(Arrays.toString(myRightList));

  }
}