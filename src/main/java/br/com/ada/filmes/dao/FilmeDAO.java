package br.com.ada.filmes.dao;

import br.com.ada.filmes.model.Filme;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class FilmeDAO {

    private static List<Filme> filmes = new ArrayList<>();

    private static int proxId;

    public void adicionar(Filme filme){
        filme.setId(proxId++);
        filmes.add(filme);
    }

    public void atualizar(Filme filme){
        for (int i = 0; i < filmes.size(); i++) {
            Filme f = filmes.get(i);
            if (f.getId() == filme.getId()) {
                filmes.set(i, filme);
                break;
            }
        }
    }

    public void remover(int id){
        filmes.removeIf(filme -> filme.getId()==id);
    }

    public Filme buscaPorId(int id){
        return filmes.stream().filter(filme -> filme.getId()==id).findAny().orElse(null);
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void darLike(int id){
        filmes.stream().filter(filme -> filme.getId()==id).findFirst().orElse(null).setLike();
    }

    public void darDislike(int id){
        filmes.stream().filter(filme -> filme.getId()==id).findFirst().orElse(null).setDislike();
    }
}
