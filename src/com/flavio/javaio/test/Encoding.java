package com.flavio.javaio.test;

public class Encoding {

    public static void printBytes(byte[] a){
        System.out.print("CodePoints:\t");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    public static void printInfos(String value){
        int codePoint = value.codePointAt(0);
        byte [] bytes = value.getBytes();
        if (value.length() == 1){
            System.out.printf("Value: %s | CodePoint: %s | Bytes: %s %n", value, codePoint, bytes.length);
        } else {
            System.out.printf("Value: %s | Bytes: %s %n", value, bytes.length);
            printBytes(bytes);
        }
    }

    public static void main(String[] args) {

        String value = "F";
        printInfos(value);


    }
}
