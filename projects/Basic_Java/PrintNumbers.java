/**
 * Created by sonamsinha on 9/13/16.
 */
public class PrintNumbers {
    public static void main(String args[]) {
        int i;
        int arrNum[] = new int[10];
        for (i = 0; i < 10; i++) {
            //System.out.print(i + " ");
            //System.out.println();
            arrNum[i] = i;
            System.out.print("Number at index [" + i + "] is " + i);
            System.out.println();
        }
        // BUBBLE SORT
        for (int j = 0; j < arrNum.length; j++) { //Iteration loop
            int tempValue;
            for (int k = 0; k < arrNum.length-1; k++) { // Swap loop
                if (arrNum[k] < arrNum[k + 1]) {    // Use > for Ascending order
                    tempValue = arrNum[k+1];
                    //System.out.println("tempValue = "+ tempValue);
                    arrNum[k+1] = arrNum[k];
                    //System.out.println("arrNum[j] = "+ arrNum[k]);
                    arrNum[k] = tempValue;
                    //System.out.println("arrNum[k+1] = "+ arrNum[k+1]);
                }
            }

        }

        for (int l = 0; l < arrNum.length; l++) {
            System.out.println("Number at index [" + l + "] after sorting in descending order is " + arrNum[l]);
        }

    // COPYING ARRAY
        int num[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int exchangeNum[] = new int[num.length];
        for (int j = 0; j < num.length; j++) {
            exchangeNum[j] = num[j];
        }

        for (int k = 0; k < num.length; k++) {
            System.out.println(" "+"Num array " + " " + num[k]);
            System.out.println(" "+"ExchangeNum array " + " " + exchangeNum[k]);
        }
    }
}


