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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import models.TabelaDeputados;
import views.JanelaPrincipal;
/**
 *
 * @author lucas
 */
public class Busca{
    
        public List<Deputado> buscarDeputados(){
            
                Camara camara = new Camara();
            try {
                camara.obterDados();
            } catch (JAXBException | IOException ex) {
                Logger.getLogger(Busca.class.getName()).log(Level.SEVERE, null, ex);
            }
                List<Deputado> deputados;
                deputados = camara.getDeputados();
                Deputado deputado;
               // System.out.println(deputados.get(0));
                return deputados;
            
            
        }
        
        public List<Partido> buscarPartidos(){
            Camara camara = new Camara();
            try {
                camara.obterDados();
            } catch (JAXBException | IOException ex) {
                Logger.getLogger(Busca.class.getName()).log(Level.SEVERE, null, ex);
            }
                List<Deputado> deputados;
                deputados = camara.getDeputados();
                Deputado deputado = deputados.get(0);
            try {
                deputado.obterDetalhes();
            } catch (IOException | JAXBException ex) {
                Logger.getLogger(Busca.class.getName()).log(Level.SEVERE, null, ex);
            }
                Detalhes detalhes = deputado.getDetalhes();
                Partido partido = detalhes.getPartido();
               System.out.println(partido.getSigla());
            
            
            return null;
                
        }
  
}

//  for (int i=0; i<1; i++) {
             //   deputado = deputados.get(0);
             //   deputado.getNome();
             //   deputado.getIdeCadastro();
             //   deputado.getMatricula();
             //   deputado.getCondicao();
             //   deputado.getNomeParlamentar();
             //   deputado.getUrlFoto();
             //   deputado.getSexo();
             //   deputado.getUf();
             //   deputado.getPartido();
             //   deputado.getGabinete();
             //   deputado.getAnexo();
             //   deputado.getFone();
             //   deputado.getEmail();
             //   deputado.getComissoes();
             //   deputado.obterDetalhes();
             //   Detalhes detalhes = deputado.getDetalhes();
             //   detalhes.getNumLegislatura();
             //  detalhes.getSituacaoNaLegislaturaAtual();
             //   detalhes.getUfRepresentacaoAtual();
             //   detalhes.getDataNascimento();
             //   detalhes.getDataFalecimento();
             //   Partido partido = detalhes.getPartido();
             //   partido.getIdPartido();
             //   partido.getSigla();
             //   partido.getNome();
              //  }
