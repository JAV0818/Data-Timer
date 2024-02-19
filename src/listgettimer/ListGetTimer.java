/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listgettimer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author julianvazquez
 */
public class ListGetTimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        The main method creates an ArrayList of Integer 
        and a LinkedList of Integer and populates each of those Lists with 1000 random integers from 1 through 10,000.
         */

        ArrayList<Integer> arrInt = new ArrayList<>();
        LinkedList<Integer> linkedListInt = new LinkedList<>();

        /*
        The main method uses System.nanotime() to capture and store in separate long variables the system time at the 
        beginning and end of two different loops.
         */
        Random rand = new Random();
        for (int i = 0; i < 10001; i++) {
            int randomNumber = rand.nextInt(10000) + 1;
            arrInt.add(randomNumber);
        }

        for (int i = 0; i < 10001; i++) {
            int randomNumber = rand.nextInt(10000) + 1;
            linkedListInt.add(randomNumber);
        }

        /*
        The main method uses System.nanotime() to capture and store in separate 
        long variables the system time at the beginning and end of two different loops.
         */
        long arrayListTimeStart = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrInt.get(1000);
        }
        long arrayListTimeEnd = System.nanoTime();

        System.out.println("avg time for array list is ");
        System.out.println((arrayListTimeEnd - arrayListTimeStart) / 1000);

        long linkedListTimeStart = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedListInt.get(1000);
        }
        long linkedListTimeEnd = System.nanoTime();

        System.out.println("avg time for linked list is ");
        System.out.println((linkedListTimeEnd - linkedListTimeStart) / 1000);
    }

}
