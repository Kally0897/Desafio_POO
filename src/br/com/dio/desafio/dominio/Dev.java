package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //quero que de acordo que o dev vá se increvendo nos cursos, sej acolocado na msm ordem
    private Set<Conteudo> conteudosConcluidos =  new LinkedHashSet<>();

    //Foi esco lhido elemento Set pois ele só eprmite elementos únicos, no exemplo, o dev não consegue se inscrever no mesmo curso duas vezes, então não faz sentido permitir issso no moemnto da inclusão

    public void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudosInscritos.addAll(getConteudosInscritos());
        bootcamp.getDevsInscritos().add(this);
        //To pegando o meu Set de conteúdos inscritos e vou adicionando dentro dele,
        //todos os conteudos do bootcamp
    }
    public void progredir(){
        //Para eu progredir eu preciso que os conteúdos inscritos vá para conteúdos concluídos
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }
    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
        //Peguei o stram API, pegquei cada conteúdo dentro desse meu set de conteúdos concluídos,
        //peguei o XP de  cada conteudo e somei
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //Como estamos trabalhando com o LinkedHashSet, precisam os implementar os Equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && conteudosInscritos.equals(dev.conteudosInscritos) && conteudosConcluidos.equals(dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
