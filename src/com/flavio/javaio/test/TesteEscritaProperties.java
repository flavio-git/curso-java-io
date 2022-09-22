package com.flavio.javaio.test;

import java.io.FileWriter;
import java.util.Properties;

public class TesteEscritaProperties {

    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        props.setProperty("login", "alura");
        props.setProperty("senha", "1234");
        props.setProperty("endereco", "www.alura.com.br");

        props.store(new FileWriter("conf.properties"), "this is a properties test.");

    }
}
