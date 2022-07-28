package com.bootcampexcercise.module7;

public class TryCatchFinallyActivity {
    public static void main(String[] args) {
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        obj.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //TODO: use try
        try {
        for (int i = 0; i <= 10; i++) {
            System.out.println(arr[i]);}
        } catch (IndexOutOfBoundsException IndexOutOfBoundsException) {
                System.out.println("Indexes are out of boundaries" + IndexOutOfBoundsException);}
        finally {
                System.out.println("This should get printed even if there is an exception");

            }
            }
        }
        //TODO: create catch for try and use IndexOutOfBoundsException

        //TODO: In catch create custom System.out.println message


        //TODO: Use method that this message gets printed out whether or not error has occurred
        //System.out.println("This should get printed even if there is an exception");


