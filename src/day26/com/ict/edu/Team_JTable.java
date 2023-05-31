package day26.com.ict.edu;

import javax.swing.table.AbstractTableModel;

public class Team_JTable extends AbstractTableModel {

	String[] name = { "ID", "Name", "Phone", "Address", "Company" };
	String[][] data = { { "100", "dada", "010-111-2225", "seoul", "cj" },
			{ "101", "dada", "010-111-2225", "seoul", "cj" }, { "102", "dada", "010-111-2225", "seoul", "cj" },
			{ "103", "dada", "010-111-2225", "seoul", "cj" }, { "104", "dada", "010-111-2225", "seoul", "cj" },
			{ "105", "dada", "010-111-2225", "seoul", "cj" }, { "106", "dada", "010-111-2225", "seoul", "cj" },
			{ "107", "dada", "010-111-2225", "seoul", "cj" }, { "108", "dada", "010-111-2225", "seoul", "cj" },
			{ "109", "dada", "010-111-2225", "seoul", "cj" }, { "110", "dada", "010-111-2225", "seoul", "cj" },
			{ "111", "dada", "010-111-2225", "seoul", "cj" }, { "112", "dada", "010-111-2225", "seoul", "cj" },
			{ "113", "dada", "010-111-2225", "seoul", "cj" }, };

	public static void main(String[] args) {
		new Team_JTable();
	}

	@Override
	public int getRowCount() {
		return data.length;
	}

	@Override
	public int getColumnCount() {
		return name.length;
	}
	
	@Override
	public String getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		data[rowIndex][columnIndex] = (String) aValue;
	}
}
