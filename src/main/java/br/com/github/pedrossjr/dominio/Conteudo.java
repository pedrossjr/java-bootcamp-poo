package br.com.github.pedrossjr.dominio;

// Uma classe é abstrata não pode ser instânciada.

public abstract class Conteudo {

    // Quando dizemos que a constante ou variável é static é que pode acessar este XP padrão fora da classe conteúdo
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();

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
