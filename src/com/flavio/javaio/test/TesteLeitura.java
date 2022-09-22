package com.flavio.javaio.test;

import java.io.*;
import java.util.stream.Stream;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {
        InputStream source = new FileInputStream("public/lorem.txt");
        Reader reader = new InputStreamReader(source);
        BufferedReader file = new BufferedReader(reader);

        /*
        Stream<String> lines = file.lines(); // le as linhas do arquivo
        lines.forEach(System.out::println); // imprimi todas as linhas do arquivo no console
        */

        String line = file.readLine();

        while (line != null){
            System.out.println(line);
            line = file.readLine();
        }

        file.close(); // fecha o arquivo

    }


}
