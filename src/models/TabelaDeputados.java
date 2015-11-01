/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.Buscar;
import edu.unb.fga.dadosabertos.Camara;
import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import edu.unb.fga.dadosabertos.Partido;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.xml.bind.JAXBException;

/**
 *
 * @author lucas
 */
public class TabelaDeputados extends AbstractTableModel {
    
    private final String[] colunas = new String[] {
			"Nome", "Partido", "Estado", "Email", "Telefone", "Condição"};
    private Object aValue;
    private int rowIndex;
    private int columnIndex;
  
    @Override
    public int getRowCount() {
        Camara camara = new Camara();
        try {
            camara.obterDados();
        } catch (JAXBException | IOException ex) {
            Logger.getLogger(TabelaDeputados.class.getName()).log(Level.SEVERE, null, ex);
        }
            List<Deputado> deputados;
            deputados = camara.getDeputados();
            
         
        return deputados.size();
    }

    @Override
    public int getColumnCount() {
        
        return 6;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
            return String.class;
        }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {  
      Camara camara = new Camara();
        try {
            camara.obterDados();
        } catch (JAXBException | IOException ex) {
            Logger.getLogger(TabelaDeputados.class.getName()).log(Level.SEVERE, null, ex);
        }
            List<Deputado> deputados;
            deputados = camara.getDeputados();
       Deputado deputado = deputados.get(rowIndex);  
      switch (columnIndex) {  
      case 0:   
            return deputado.getNome();  
      case 1:   
            return deputado.getPartido();  
      case 2:
            return deputado.getUf();
      case 3: 
            return deputado.getEmail();
      case 4: 
            return deputado.getFone();
      case 5: 
            return deputado.getCondicao();
      default:   
         return null;  
      }  
        
   }      
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){    
         return true;    
     }    
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    
        this.aValue = aValue; 
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        
    }
  
    
    @Override
    public String getColumnName(int x) {
		
		return colunas[x];
    }

}
