package br.com.ada.filmes.controller;


import br.com.ada.filmes.dao.FilmeDAO;
import br.com.ada.filmes.dao.NoticiaDAO;
import br.com.ada.filmes.model.Filme;
import br.com.ada.filmes.model.Noticia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeDAO filmeDAO;

    @Autowired
    private NoticiaDAO noticiaDAO;

    @GetMapping
    public String listar(Model model){
        List<Filme> filmes = filmeDAO.getFilmes();
        List<Noticia> noticias = noticiaDAO.buscaTodos();
        model.addAttribute("filmes", filmes);
        model.addAttribute("noticias", noticias);
        return "listar_filme";
    }

    @GetMapping("/novo")
    public String adicionar(Model model){
        model.addAttribute("filme", new Filme());
        return "novo_filme";
    }

    @PostMapping("/novo")
    public String adicionar(Filme filme){
        filmeDAO.adicionar(filme);
        return "redirect:/filmes";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Filme filme = filmeDAO.buscaPorId(id);
        model.addAttribute("filme", filme);
        return "editar_filme";
    }

    @PostMapping("/editar")
    public String atualizar(Filme filme){
        filmeDAO.atualizar(filme);
        return "redirect:/filmes";
    }

    @GetMapping("/remover/{id}")
    public String remover(@PathVariable int id){
        filmeDAO.remover(id);
        return "redirect:/filmes";
    }

    @GetMapping("/like/{id}")
    public String darLike(@PathVariable int id){
        filmeDAO.darLike(id);
        return "redirect:/filmes";
    }

    @GetMapping("/dislike/{id}")
    public String darDislike(@PathVariable int id){
        filmeDAO.darDislike(id);
        return "redirect:/filmes";
    }

}
