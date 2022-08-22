package powerv8;


public class Carro extends fabriCada {
    
    public float getResult(){
        float preco2;
        anoCon = anoAtual  - ano;
        preco2 = preco;
        total = (float) (preco *(anoCon * 0.07));
        total = total - preco2;
        total = Math.abs(total);
        return total;
    }
}
