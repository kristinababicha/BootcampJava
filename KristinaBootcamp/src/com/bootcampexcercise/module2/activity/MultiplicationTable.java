/**
 *
 */
package sef.module2.activity;
/**
 * @author
 *
 */
public class MultiplicationTable {
    /**
     * @param args
     */
    public static void main(String[] args) {


        for (int i = 11; i <= 20; i++) {
            System.out.println("Table of "+i + " +j");
            for (int j = 11; j <= 20; j++) {
                System.out.println(i + "*" + j + " = " +i*j);
            }
        }


    }
}




