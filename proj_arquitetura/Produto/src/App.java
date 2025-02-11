public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto(30.00, "Caderno");
        Produto p2 = new Produto(5.00, "Caneta");
        Produto p3 = new Produto(6.00, "Lapiseira");

        Venda venda = new Venda();
        venda.adicionarItem(new Itemvenda(p1, 2));
        
        venda.adicionarItem(new Itemvenda(p2, 3));

        venda.adicionarItem(new Itemvenda(p3, 2));

        System.out.println("O total de vendas foi " + venda.getTotal());
                


    }
}
