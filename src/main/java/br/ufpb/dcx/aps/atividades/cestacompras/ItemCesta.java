package br.ufpb.dcx.aps.atividades.cestacompras;

public class ItemCesta {

    private Produto produto;

    private int quantidade;

    public ItemCesta(Produto produto){
        this(produto,1);
    }

    public ItemCesta(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }


    public Produto getProduto(){
        return this.produto;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double valorParcial(){
        return this.produto.getPreco() * this.quantidade;
    }
}
