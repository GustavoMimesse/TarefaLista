public class Caracteristicas implements Comparable<Caracteristicas> {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    private String genero;

    public Caracteristicas(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Caracteristicas: (" +
                "Nome : " + nome + '\'' +
                ", Genero: '" + genero + '\'' +
                ')';
    }

    @Override
    public int compareTo(Caracteristicas o) {
        int i = this.nome.compareTo(nome);
        return i;
    }
}

