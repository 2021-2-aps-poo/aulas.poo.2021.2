package br.ufpb.dcx.aps.atividades.cestacompras;

import java.util.LinkedList;
import java.util.List;

public class CestaCompras {

    private List itens = new LinkedList();

    public void addProduto(Produto produto){
        this.itens.add(new ItemCesta(produto));
    }

    public void addProduto(Produto produto, int quant){
        this.itens.add(new ItemCesta(produto,quant));
    }




}
