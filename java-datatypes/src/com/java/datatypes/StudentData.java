package com.java.datatypes;

import java.util.Scanner;

public class StudentData {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Roll no :");
        byte rollNo = sc.nextByte();
        System.out.println(" marks");
        short marks = sc.nextShort();
        System.out.println("roll no" + rollNo);
        System.out.println("marks  " + marks);
    }
}
