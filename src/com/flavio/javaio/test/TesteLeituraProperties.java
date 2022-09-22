package com.flavio.javaio.test;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Properties;

public class TesteLeituraProperties {
    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        props.load(new FileReader("conf.properties"));

        String login = props.getProperty("login");
        String senha = props.getProperty("senha");
        String endereco = props.getProperty("endereco");

        System.out.printf("login: %s | senha: %s | endereco: %s", login, senha, endereco);

        Charset charset = Charset.defaultCharset();
        System.out.printf(charset.displayName());
    }
}
