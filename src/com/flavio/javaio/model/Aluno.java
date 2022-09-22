package com.flavio.javaio.model;

import java.io.Serializable;

public class Aluno implements Serializable {

    private static int serialVersionUID = 1;
    private String nome;
    private int matricula;
    private double notaFinal;
    private boolean aprovado = false;

    public Aluno(String nome, int matricula, double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
        if (this.notaFinal >= 6){
            aprovado = true;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", notaFinal=" + notaFinal +
                ", aprovado=" + aprovado +
                '}';
    }
}
