/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;
import edu.unb.fga.dadosabertos.Camara;
import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import edu.unb.fga.dadosabertos.Partido;
import ep2.EP2;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import javax.xml.bind.JAXBException;
import models.TabelaDeputados;
import views.JanelaPrincipal;
/**
 *
 * @author lucas
 */
public class Buscar {
    
        public Buscar() throws JAXBException, IOException{
            Camara camara = new Camara();
            camara.obterDados();
            List<Deputado> deputados;
            deputados = camara.getDeputados();
       
                Deputado deputado = null;
       
          //  for (int i=0; i<1; i++) {
                deputado = deputados.get(0);
                deputado.getNome();
                deputado.getIdeCadastro();
                deputado.getMatricula();
                deputado.getCondicao();
                deputado.getNomeParlamentar();
                deputado.getUrlFoto();
                deputado.getSexo();
                deputado.getUf();
                deputado.getPartido();
                deputado.getGabinete();
                deputado.getAnexo();
                deputado.getFone();
                deputado.getEmail();
                deputado.getComissoes();
                deputado.obterDetalhes();
                Detalhes detalhes = deputado.getDetalhes();
                detalhes.getNumLegislatura();
                detalhes.getSituacaoNaLegislaturaAtual();
                detalhes.getUfRepresentacaoAtual();
                detalhes.getDataNascimento();
                detalhes.getDataFalecimento();
                Partido partido = detalhes.getPartido();
                partido.getIdPartido();
                partido.getSigla();
                partido.getNome();
                
                TabelaDeputados teste = new TabelaDeputados();
                System.out.println("Cheguei em 1");
                teste.setValueAt(deputado.getNome(), 0, 0);
                System.out.println(deputado.getNome());
                
                teste.setValueAt(deputado.getPartido(), 0, 1);
                System.out.println(deputado.getPartido());
                
                teste.setValueAt(deputado.getUf(), 0, 2);
                System.out.println(deputado.getUf());
                
                teste.setValueAt(deputado.getEmail(), 0, 3);
                System.out.println(deputado.getEmail());
                
                teste.setValueAt(deputado.getFone(), 0, 4);
                System.out.println(deputado.getFone());
                
                teste.setValueAt(deputado.getCondicao(), 0, 5); 
                System.out.println(deputado.getCondicao());
                
                java.awt.EventQueue.invokeLater(() -> {
                     new JanelaPrincipal().setVisible(true);
              });
               System.out.println("Cheguei em 2");
              
          //  }
        }

}
