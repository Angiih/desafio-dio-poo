package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

public class Bootecamp {
   private String nome;
   private String descricao;
   private localDate dataInicial = LocalDate.now();
   private final localDate dataFinal = dataInicial.plusDays(45);
   private set<Dev> devsInscritos = new HashSet<>();
   private set<Conteudo> conteudos = new linkedHashSet();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public localDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(localDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public localDate getDataFinal() {
        return dataFinal;
    }

    public set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootecamp bootecamp = (Bootecamp) o;
        return Objects.equals(nome, bootecamp.nome) && Objects.equals(descricao, bootecamp.descricao) && Objects.equals(dataInicial, bootecamp.dataInicial) && Objects.equals(dataFinal, bootecamp.dataFinal) && Objects.equals(devsInscritos, bootecamp.devsInscritos) && Objects.equals(conteudos, bootecamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
