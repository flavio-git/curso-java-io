package com.flavio.javaio.test;

import java.io.*;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {

        // Escrevendo arquivos com a classe FileWriter

        FileWriter file = new FileWriter("public/teste-escrita2.txt");

        file.write("This is a test.");
        file.write(System.lineSeparator()); // o mesmo resultado de '\n' só que ele ver qual o sistema operacional
        file.write("Class 3.1");

        file.close();

    }
}
