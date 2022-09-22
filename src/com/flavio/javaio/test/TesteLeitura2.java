package com.flavio.javaio.test;

import java.io.File;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {

        // Lendo arquivos com a classe Scanner
        Scanner file = new Scanner(new File("public/contas.csv"));

        while (file.hasNextLine()){
            System.out.println(file.nextLine());
        }

        file.close();

    }

}
