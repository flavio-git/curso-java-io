package com.flavio.javaio.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {

        // Escrevendo arquivos com a classe BufferedWriter e FileWriter

        BufferedWriter file = new BufferedWriter(new  FileWriter("public/teste-escrita3.txt"));

        file.write("This is a test with BufferedWriter and FileWriter.");
        file.newLine();
        file.write("Class 3.1");

        file.close();

    }
}
