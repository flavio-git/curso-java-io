package com.flavio.javaio.test;


import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        OutputStream source = new FileOutputStream("teste-escrita.txt");
        Writer writer = new OutputStreamWriter(source);
        BufferedWriter file = new BufferedWriter(writer);

        file.write("Replacing first line.");
        file.newLine();
        file.write("Java is awesome.");

        file.close();

    }
}
