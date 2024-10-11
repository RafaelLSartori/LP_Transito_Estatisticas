
package linguagemprogramacao;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) throws IOException{
        Metodos m = new Metodos();
        
        Transito transito[] = new Transito[10];
        
        for (int i = 0; i < 10; i++){
            transito[i] = new Transito();
        }
        
        int opc = 0;
        
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro \n2 - Consulta qtd acid\n3 - Consulta estatistica\n4 - Acid > media 10 cid\n9 - FIM"));
            switch(opc){
                case 1: transito = m.FCADRASTRAESTATISTICA(transito);
                    break;
                case 2: m.PQTDACIDENTES(transito);
                    break;
                case 3: m.PMAIORMENOR(transito);
                    break;
                case 4: m.PACIMA(transito);
                    break;
                case 5: transito = m.GRAVA(transito);    
                case 9: JOptionPane.showMessageDialog(null, "FIM");
                default: JOptionPane.showMessageDialog(null, "INVÁLIDO");
            }
        }
    }
    
}
