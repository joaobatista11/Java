
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Modelo_Tabela extends AbstractTableModel{ // extensor do próprio java
    private static final String[] colunas = {"id","carta","valor"};
    private ArrayList<Baralho_Jogador>cartas;

    public Modelo_Tabela(ArrayList<Baralho_Jogador> cartas) {
        super();
        this.cartas = cartas;
    }
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    public void adicionar_cliente(Baralho_Jogador cliente){
    this.cartas.add(cliente);
    fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return cartas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Baralho_Jogador carta = cartas.get(rowIndex); // rowIndex: linhas
        switch (columnIndex) {
            case 0:
                return carta.getId();
            case 1:
                return carta.getCarta();
            case 2:
                return carta.getValor();
            default:
                return null;
        }
    }
}