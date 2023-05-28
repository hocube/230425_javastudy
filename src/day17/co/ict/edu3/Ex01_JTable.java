package day17.co.ict.edu3;

import javax.swing.table.AbstractTableModel;

//테이블을 만들기 위해서는 AbstractTableModel 상속 받자
public class Ex01_JTable extends AbstractTableModel {

	// 1. 컬럼명(열의 대표적인 이름)를 배열로 만든다.
	String[] name = { "번호", "아이디", "패스워드", "나이", "성별" };

	String[][] data = { { "1", "aaaa", "a111", "12", "true" }, { "2", "bbbb", "b111", "15", "false" },
			{ "3", "cccc", "c111", "18", "true" }, { "4", "dddd", "d111", "10", "false" }, };

	// 행의 수 = rows = 줄
	@Override
	public int getRowCount() {
		return data.length; // 행의 수
	}

	// 열의 수 = Colum = 칸
	@Override
	public int getColumnCount() {
		return name.length; // 열의 수
	}

	// 내용 삽입
	@Override
	public String getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	// 컬럼명 붙이기
	@Override
	public String getColumnName(int column) {
		return name[column];
	}

	// 내용 수정
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex != 0) { // 첫번째꺼 수정 못하게 하기
			return true;
		} else {
			return false;
		}
	}

	// 고친내용 적용하기
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		data[rowIndex][columnIndex] = (String) aValue;
	}
}
