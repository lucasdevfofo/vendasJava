import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Itemvenda> items;

    public Venda() {
        this.items = new ArrayList<>();

    }

    public void adicionarItem(Itemvenda item){
        items.add(item);

    }

    public double getTotal(){
        double total = 0;
        for(Itemvenda item : items){
            total += item.getTotal();
        }
        return total;
    }
    
}
