/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep2;

import controllers.Busca;
import edu.unb.fga.dadosabertos.Camara;
import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import edu.unb.fga.dadosabertos.Partido;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBException;
import models.TabelaDeputados;
import views.JanelaPrincipal;


/**
 *
 * @author lucas
 */
public class EP2 {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws JAXBException, IOException {
      
      double inicio = System.currentTimeMillis();
      JanelaPrincipal.main(args);
      double fim = System.currentTimeMillis();
      double tempo = (fim-inicio)/1000;
      System.out.println("Tempo gasto: " + tempo + "segundos");
    
    
      //Busca teste = new Busca();
     // teste.buscarPartidos();
    }
        
}
