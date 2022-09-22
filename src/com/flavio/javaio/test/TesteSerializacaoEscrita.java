package com.flavio.javaio.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import com.flavio.javaio.model.Aluno;

public class TesteSerializacaoEscrita {
    public static void main(String[] args) throws IOException, NotSerializableException {

        String name = "Flávio";
        ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("public/serializacao.bin"));
        object.writeObject(name);
        object.close();

        Aluno aluno1 = new Aluno("Flávio", 1020, 9.25);
        ObjectOutputStream alunoFile = new ObjectOutputStream(new FileOutputStream("public/serializacao-aluno.bin"));
        alunoFile.writeObject(aluno1);
        alunoFile.close();

    }
}
