package org.la.att.system.hacker.rank;

import java.util.List;
import java.util.Scanner;

public class StringCollectionMain {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final StringsCollection STRINGS_COLLECTION = new StringsCollection();
    public static void main(String[] args) {
        int threadCount = Integer.parseInt(SCANNER.nextLine());
        Thread[] threads = new Thread[threadCount];
        for(int i=0 ; i<threadCount ; i++){
            int stringCount = Integer.parseInt(SCANNER.nextLine());
            threads[i] = new Thread(new StringCollectionRunnable(STRINGS_COLLECTION, stringCount, String.valueOf(i+1)));
            threads[i].start();
        }
        for(int i=0 ; i<threadCount ; i++){
            try {
                threads[i].join();
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
        }
        List<String> stringsCollection = STRINGS_COLLECTION.getStringsCollection();
        System.out.println(stringsCollection.size());
        int nonNullStrings = 0;
        for(String string: stringsCollection){
            if(string!= null){
                nonNullStrings++;
            }
        }
        System.out.println(nonNullStrings);
    }
}
