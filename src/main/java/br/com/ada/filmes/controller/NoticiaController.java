package br.com.ada.filmes.controller;

import br.com.ada.filmes.dao.NoticiaDAO;
import br.com.ada.filmes.model.Noticia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/noticias")
public class NoticiaController {

    @Autowired
    private NoticiaDAO noticiaDAO;

    @GetMapping("/novo")
    public String adicionar(Model model){
        model.addAttribute("noticia", new Noticia());
        return "nova_noticia";
    }

    @PostMapping("/novo")
    public String adicionar(Noticia noticia){
        noticiaDAO.adicionar(noticia);
        return "redirect:/filmes";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Noticia noticia = noticiaDAO.buscarPorID(id);
        model.addAttribute("noticia", noticia);
        return "editar_noticia";
    }

    @PostMapping("/editar")
    public String atualizar(Noticia noticia){
        noticiaDAO.atualizar(noticia);
        return "redirect:/filmes";
    }

    @GetMapping("/remover/{id}")
    public String remover(@PathVariable int id){
        noticiaDAO.remover(id);
        return "redirect:/filmes";
    }

}
