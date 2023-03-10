package br.com.ada.filmes.dao;

import br.com.ada.filmes.model.Noticia;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class NoticiaDAO {

    private static List<Noticia> noticias = new ArrayList();

    private static int proxID;

    public void adicionar(Noticia noticia){
        noticia.setId(proxID++);
        noticias.add(noticia);
    }

    public void remover(int id){
        noticias.removeIf(news -> news.getId()==id);
    }

    public Noticia buscarPorID(int id){
        return noticias.stream().filter(news -> news.getId() == id).findAny().orElse(null);
    }

    public List<Noticia> buscaTodos() {
        return noticias;
    }

    public void atualizar(Noticia noticia){
        for (int i = 0; i < noticias.size(); i++) {
            Noticia n = noticias.get(i);
            if(n.getId() == noticia.getId()){
                noticias.set(i, noticia);
                break;
            }
        }
    }
}
