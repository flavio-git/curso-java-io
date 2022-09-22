package com.flavio.javaio.test;

import com.flavio.javaio.model.Aluno;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoLeitura {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream file = new ObjectInputStream(new FileInputStream("public/serializacao.bin"));
        String name = (String) file.readObject();
        System.out.println(name);
        file.close();

        ObjectInputStream alunoFile = new ObjectInputStream(new FileInputStream("public/serializacao-aluno.bin"));
        Aluno aluno1 = (Aluno) alunoFile.readObject();
        System.out.println(aluno1);
        alunoFile.close();

    }
}
