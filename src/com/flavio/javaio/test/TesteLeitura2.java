package com.flavio.javaio.test;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {

        // Lendo arquivos com a classe Scanner
        Scanner file = new Scanner(new File("public/contas.csv"));

        // le as linhas do arquivo csv
//        while (file.hasNextLine()){
//            System.out.println(file.nextLine());
//        }

        // lendo e separando os elementos utilizando mais uma instância da classe Scanner
        while (file.hasNextLine()){
            String line = file.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useLocale(Locale.US); // informa para a JVM que o padrão de valores utilizados são do US
            lineScanner.useDelimiter(",");

            String value1 = lineScanner.next();
            int value2 = lineScanner.nextInt();
            int value3 = lineScanner.nextInt();
            String value4 = lineScanner.next();
            double value5 = lineScanner.nextDouble();

            String formatedLine = String.format(
                    new Locale("pt", "BR"),
                    "%s - %04d - %04d - %20s - %08.2f",
                    value1, value2, value3, value4, value5);

            System.out.println(formatedLine);

            //System.out.printf("%s %s %s %s %s \n", value1, value2, value3, value4, value5);

        }

        // le e separa os elementos do csv
//        while (file.hasNextLine()){
//            String [] line = file.nextLine().split(",");
//            for (int i = 0; i < line.length; i++) {
//                System.out.print(line[i] + " ");
//            }
//            System.out.println();
//        }

        file.close();

    }

}

/*
utilizamos o useLocale para informar para a JVM que iremos utilizar o padrão de dados do US
caso não utilizarmos esse método a JVM irá verificar qual é o padrão utilizado no Sistema
Operacional. Assim se o OS estiver em português em double irá dar uma exception.
 */