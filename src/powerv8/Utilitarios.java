package powerv8;

public class Utilitarios extends fabriCada{
    
    public float getResult(){
        float preco2;
        anoCon = anoAtual - ano;
        preco2 = preco;
        total = (float) (preco *(anoCon * 0.05));
        total = total - preco2;
         //É utilizado o comando Math.abs(), para quando o número vier negativo ele fique positivo; ex: -1 se torna 1;
        total = Math.abs(total);
        return total;

    }
}
