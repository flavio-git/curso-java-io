package com.flavio.javaio.test;

import java.io.*;
import java.util.stream.Stream;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {
        FileInputStream source = new FileInputStream("lorem.txt");
        InputStreamReader reader = new InputStreamReader(source);
        BufferedReader file = new BufferedReader(reader);

        /*
        Stream<String> lines = file.lines(); // le as linhas do arquivo
        lines.forEach(System.out::println); // imprimi todas as linhas do arquivo no console
        */

        String line = file.readLine(); // guarda a primeira linha do arquivo

        System.out.println(line);

    }

}
