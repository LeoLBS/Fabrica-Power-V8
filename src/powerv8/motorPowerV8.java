package powerv8;
import javax.swing.JOptionPane;

public class motorPowerV8 {

    public static void main(String[] args) {
        
        Carro car = new Carro();
        Utilitarios uti = new Utilitarios();
        //Moto moto = new Moto();
        TipoBD tipo = new TipoBD();
        int opc,ano2;
        float total;
        
        
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,"ESCOLHA ENTRE AS OPÇÕES: \n1- Carro \n2-Camionete \n3-Moto \n4-Coloque o tipo do veiculo \n0- Sair \n"));
            switch(opc){
                case 1:
                    car.fabricante = JOptionPane.showInputDialog(null,"Coloque qual a Fabricante do Carro: ");
                    car.modelo = JOptionPane.showInputDialog(null,"Coloque qual o Modelo do Carro: ");
                    car.ano = Float.parseFloat(JOptionPane.showInputDialog(null,"Coloque qual o Ano do Carro: "));
                    car.preco = Float.parseFloat(JOptionPane.showInputDialog(null,"Coloque qual o Preço do Carro: "));
                    
                    total = car.getResult();
                    ano2 = Math.round(car.ano);
                    JOptionPane.showMessageDialog(null,"Veiculo "+car.modelo+" da fabricante "+car.fabricante+", valor do ano "+ano2+" era de R$:"+car.preco+". Novo valor do ano de "+car.anoAtual+" R$:"+total);
                break;
                case 2:
                    uti.fabricante = JOptionPane.showInputDialog(null,"Coloque qual a Fabricante da Camionete: ");
                    uti.modelo = JOptionPane.showInputDialog(null,"Coloque qual o Modelo da Camionete: ");
                    uti.ano = Float.parseFloat(JOptionPane.showInputDialog(null,"Coloque qual o Ano da Camionete: "));
                    uti.preco = Float.parseFloat(JOptionPane.showInputDialog(null,"Coloque qual o Preço da Camionete: "));
                    
                    total = uti.getResult();
                    ano2 = Math.round(uti.ano);
                    JOptionPane.showMessageDialog(null,"Veiculo "+uti.modelo+" da fabricante "+uti.fabricante+", valor do ano "+ano2+" era de R$:"+uti.preco+". Novo valor do ano de "+uti.anoAtual+" R$:"+total);
                break;
                case 3:
                    uti.fabricante = JOptionPane.showInputDialog(null,"Coloque qual a Fabricante da Moto: ");
                    uti.modelo = JOptionPane.showInputDialog(null,"Coloque qual o Modelo da Moto: ");
                    uti.ano = Float.parseFloat(JOptionPane.showInputDialog(null,"Coloque qual o Ano da Moto: "));
                    uti.preco = Float.parseFloat(JOptionPane.showInputDialog(null,"Coloque qual o Preço da Moto: "));
                    
                    total = uti.getResult();
                    ano2 = Math.round(uti.ano);
                    JOptionPane.showMessageDialog(null,"Veiculo "+uti.modelo+" da fabricante "+uti.fabricante+", valor do ano "+ano2+" era de R$:"+uti.preco+". Novo valor do ano de "+uti.anoAtual+" R$:"+total);
                break;
                case 4:
                    tipo.TipoVeiculo = JOptionPane.showInputDialog(null,"Coloque o tipo de veiculo: ");
                    System.out.println("Veiculo: "+tipo.TipoVeiculo);
                    tipo.getAnalise();
                break;
                    
                default:
            }
            
    }

    
    
}