package powerv8;
import javax.swing.JOptionPane;

public class TipoBD {
    String TipoVeiculo;
    Utilitarios uti = new Utilitarios();


    void getAnalise(){
        float total;
        
        if(TipoVeiculo.equals("furgao")){
            uti.fabricante = JOptionPane.showInputDialog(null,"Coloque qual a Fabricante do Furgão: ");
            uti.modelo = JOptionPane.showInputDialog(null,"Coloque qual o Modelo do Furgão: ");
            uti.ano = Float.parseFloat(JOptionPane.showInputDialog(null,"Coloque qual o Ano do Furgão: "));
            uti.preco = Float.parseFloat(JOptionPane.showInputDialog(null,"Coloque qual o Preço do Furgão: "));

            total = uti.getResult();
            int ano2 = Math.round(uti.ano);
            JOptionPane.showMessageDialog(null,"Veiculo "+uti.modelo+" da fabricante "+uti.fabricante+", valor do ano "+ano2+" era de R$:"+uti.preco+". Novo valor do ano de "+uti.anoAtual+" R$:"+total);
        }
        else if(TipoVeiculo.equals("caminhao")){
            uti.fabricante = JOptionPane.showInputDialog(null,"Coloque qual a Fabricante do Caminhão: ");
            uti.modelo = JOptionPane.showInputDialog(null,"Coloque qual o Modelo do Caminhão: ");
            uti.ano = Float.parseFloat(JOptionPane.showInputDialog(null,"Coloque qual o Ano do Caminhão: "));
            uti.preco = Float.parseFloat(JOptionPane.showInputDialog(null,"Coloque qual o Preço do Caminhão: "));

            total = uti.getResult();
            int ano2 = Math.round(uti.ano);
            JOptionPane.showMessageDialog(null,"Veiculo "+uti.modelo+" da fabricante "+uti.fabricante+", valor do ano "+ano2+" era de R$:"+uti.preco+". Novo valor do ano de "+uti.anoAtual+" R$:"+total);
        }
        else{
            JOptionPane.showMessageDialog(null,"Esse veiculo não foi encontrado na base de dados!!");
        }

    }

}
