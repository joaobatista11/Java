
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Modelo_Tabela_Jogador extends AbstractTableModel{ // extensor do próprio java
     private static final String[] colunas = {"id", "carta", "valor"};
    private ArrayList<Baralho_Jogador> dados;

    public Modelo_Tabela_Jogador(ArrayList<Baralho_Jogador> cartas) {
        super();
        this.dados = cartas;         
    }

    public void setDados(ArrayList<Baralho_Jogador> novosDados) {
    this.dados.clear();
    this.dados.addAll(novosDados);
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void adicionar_carta(Baralho_Jogador carta) {
        this.dados.add(carta);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return dados == null ? 0 : dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Baralho_Jogador carta = dados.get(rowIndex);
        switch (columnIndex) {
            case 0: return carta.getId();
            case 1: return carta.getCarta();
            case 2: return carta.getValor();
            default: return null;
        }
    }
    
    
    
    
}