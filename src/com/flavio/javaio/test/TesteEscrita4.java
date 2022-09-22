package com.flavio.javaio.test;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita4 {
    public static void main(String[] args) throws IOException {

        // Escrevendo arquivos com as classes PrintStream e PrintWriter
        // Antes do Java ter as classes FileWriter era utilizada a classe PrintStream

        PrintStream file = new PrintStream("public/teste-escrita4.txt");
        PrintWriter file2 = new PrintWriter("public/teste-escrita5.txt");

        file.println("This a test with PrintStream class.");
        file.print("Class 3.2.");

        file2.println("This a test with PrintWriter class.");
        file2.print("Class 3.2.");

        file.close();
        file2.close();

    }
}
