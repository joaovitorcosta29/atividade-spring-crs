/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividade.atividadecrs.controller;

import com.atividade.atividadecrs.model.ProdutoBean;
import com.atividade.atividadecrs.service.ProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class ProdutoController {
    @Autowired
    private ProdutoService service;
    
    @GetMapping("/produto")
    public String getProduto(Model model) {
        List<ProdutoBean> lista = service.listarProdutos();
        model.addAttribute("lista", lista);
        return "produto";
        
    }
}
