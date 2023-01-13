package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
   private String título;
   private String descrição;
    private LocalDate data;

    public Mentoria() {
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "título='" + título + '\'' +
                ", descrição='" + descrição + '\'' +
                ", data=" + data +
                '}';
    }
}
