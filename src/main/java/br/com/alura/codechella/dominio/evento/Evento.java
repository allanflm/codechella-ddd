package br.com.alura.codechella.dominio.evento;

import br.com.alura.codechella.infra.evento.Endereco;
import br.com.alura.codechella.dominio.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Evento {
    private UUID uuid;
    private Categoria categoria;
    private String descricao;
    private LocalDateTime data;
    private Endereco endereco;
    private List<TipoIngresso> tipoIngressos;

    public Evento(Categoria categoria, LocalDateTime data, String descricao, Endereco endereco) {
        this.categoria = categoria;
        this.data = data;
        this.descricao = descricao;
        this.endereco = endereco;

        gerarIndentificadorUnico();
    }

    private void gerarIndentificadorUnico() {
        this.uuid = UUID.randomUUID();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso){
        this.tipoIngressos.add(tipoIngresso);
    }

    public void aumentarNumeroDeIngressoPorTipo(){

    }
}
