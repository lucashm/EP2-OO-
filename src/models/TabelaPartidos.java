/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.Busca;
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
import views.JanelaPrincipal;

/**
 *
 * @author lucas
 */
public  class TabelaPartidos extends AbstractTableModel {
    
    private final String[] colunas = new String[] {
			"Partido", "Sigla", "ID"};
    private Object aValue;
    private int rowIndex;
    private int columnIndex;
    private int deputadosSize;
    private final List<Deputado> lista;
    private static Detalhes detalhes;
  
    public TabelaPartidos(List<Deputado> teste) {
        lista = teste;

               
    }
    
    @Override
    public int getRowCount() {
     
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        
        return 1;
    }

   /* @Override
    public Class<?> getColumnClass(int columnIndex) {
        
            return String.class;
        }
   */ 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {  
        
        Deputado teste = lista.get(rowIndex);
      switch (columnIndex) {  
      case 0:   
            return teste.getNome();
      case 1:   
            return teste.getSigla();
      case 2:
            return teste.getIdPartido();
      
      default:   
         return null;  
      }  
        
   }      
    
  /*  @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){    
         return true;    
     }    
   
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    
        this.aValue = aValue; 
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        
    }
  */
    
    @Override
    public String getColumnName(int x) {
		
		return colunas[x];
    }

}
