package br.com.dio;

import br.com.dio.model.Ramster;

public class Prim {
    public static void main(String[] args) {
        Ramster ramster = new Ramster();
        System.out.println(ramster);


        Livro Livro = new Livro("O problema dos 3 corpos",  300);

        //        int a = 9;
//        int b = 10;
//        System.out.println("Olá mundo!" + (a+b));
    }
}


class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
