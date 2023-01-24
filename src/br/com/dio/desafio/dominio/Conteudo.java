package br.com.dio.desafio.dominio;

 public abstract class Conteudo {

   protected static final double XP_PADRAO = 10; //Todo conteúdo vai gerar uma xp padrão
    // quem vai ter acesso a essa XP padrão são as classes filhas de conteúdo, pq está protected

   private String titulo;
   private String descricao;
   public abstract double calcularXp();//por ser abstrato a classe que o engloba tbm tem que ser abstrato
    // abstract = eu não consigo criar o conteúdo


     public String getTitulo() {
         return titulo;
     }

     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }

     public String getDescricao() {
         return descricao;
     }

     public void setDescricao(String descricao) {
         this.descricao = descricao;
     }
 }
