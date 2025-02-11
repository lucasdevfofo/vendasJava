public class Itemvenda{
    private Produto produto;
    private int quantidade;
   
public Itemvenda(Produto produto, int quantidade) {
    this.produto = produto;
    this.quantidade = quantidade;
    }

    public double getTotal(){
        return produto.getPreco() * quantidade;
    }

    public static void adicionarItem(Produto p1, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarItem'");
    }


}
