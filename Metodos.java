
package linguagemprogramacao;

import java.io.*;
import javax.swing.JOptionPane;

public class Metodos {
    
    public Transito[] FCADRASTRAESTATISTICA(Transito[] transito){
        for (int i = 0; i < 10; i++){
            transito[i].cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade: "));
            transito[i].nome = JOptionPane.showInputDialog("Digite o nome da cidade: ");
            transito[i].acid = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de acidentes: "));
        }
        return transito;
    }
    
    public void PQTDACIDENTES(Transito[] transito){
        for (int i = 0; i < 10; i++){       
            if(transito[i].acid > 100 && transito[i].acid < 500){
                System.out.println("Acidentes > 100 e < 500 - " + transito[i].nome +" - Codigo da cidade : " + transito[i].cod+ " - Qtd acid: "+transito[i].acid);
            }
        }
    }
    
    public void PMAIORMENOR(Transito[] transito){
        Transito aux;
        for (int i = 0; i < 9; i++){
            for(int j = (i+1); j < 10; j++){
                if(transito[i].acid > transito[j].acid){
                    aux = transito[i];
                    transito[i] = transito[j];
                    transito[j] = aux;
                }
            }
        }
        System.out.println("A cidade com maior número de acidentes foi " +transito[9].cod+ " " +transito[9].nome+ " com: " +transito[9].acid+ " acidentes. \n A cidade com menor número de acidentes foi " +transito[0].cod+ " " +transito[0].nome+ " com: " +transito[0].acid+ " acidentes.");
    }
    
    public void PACIMA(Transito[] transito){
        double media = 0;
        for (int i = 0; i < 10; i++){
            media += transito[i].acid;
        }
        media /= 10;
        for (int i = 0; i < 10; i++){
            if (transito[i].acid > media){
                System.out.print(transito[i].nome +" - Codigo da cidade : " + transito[i].cod+ " - Qtd acid: "+transito[i].acid);
            }
        }
    }
    
    public Transito[] GRAVA(Transito[] transito)throws IOException{
        String fileName = "ArquivoEstatistica.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        
        for (int i = 0; i < 10; i++){
            gravar.write(Integer.toString(transito[i].cod));
            gravar.newLine();
            gravar.write(transito[i].nome);
            gravar.newLine();
            gravar.write(Integer.toString(transito[i].acid));
            gravar.newLine();
        }
        gravar.close();
        JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
        return transito;
    }
}
