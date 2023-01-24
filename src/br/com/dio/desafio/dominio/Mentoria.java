package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; //Quando eu criar uma mentoria e chamar o metodo calcular XP ele já vai fazer esse cálculo
    }
    private LocalDate data;


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao()+ '\'' +
                ", data=" + data +
                '}';
    }


}
