/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividade.atividadecrs.service;

import com.atividade.atividadecrs.model.ProdutoBean;
import com.atividade.atividadecrs.repository.ProdutoDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service
public class ProdutoService {
    @Autowired
    private ProdutoDAO repository;
    
    public List<ProdutoBean> listarProdutos(){
        return repository.listarProdutos();
    }    
}
