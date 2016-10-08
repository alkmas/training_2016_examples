package com.training2016.examples.notepad;

import java.util.Arrays;

/**
 * ����� �������
 * @author alex
 * 
 */
public class Notepad {
	private int sizeArray = 5;
	private Record[] records = new Record[sizeArray];
	private int position = 0;

	/**
	 * ����������� �� ���������
	 */
	public Notepad() {

	}

	/**
	 * �������� ������ � ��������� ��������� ������ �������
	 * @param item
	 * ����������� ��������� ������
	 */
	public void addRecord(String item) {
		if (position == sizeArray) {
			expandArray();
		}
		records[position++] = new Record(item);			
	}

	/**
	 * �������� ������ � ������� numRecord �������.
	 * ���� ������� ������ ��� ����� ������� ��������� ������, �� �������� � ����� �������
	 * @param numRecord
	 * ����� �������
	 * @param item
	 * ����������� ������
	 */
	public void insertRecord(int numRecord, String item) {
		if (numRecord >= position) {
			this.addRecord(item);
		}
		else {
			if (position+1 >= sizeArray) {
				expandArray();
			}
			for(int i=position; i>=numRecord; i--) {
				records[i] = records[i-1];
			}
		}
		records[numRecord] = new Record(item);
		position++;
	}

	/**
	 * �������� � ������ � ������� numRecord ������ �� newItem 
	 * @param numRecord
	 * ����� ���������� ������
	 * @param newItem
	 * ����� ������
	 */
	public void editRecord(int numRecord, String newItem) {
		if (numRecord < position) {
			records[numRecord].setItem(newItem);
		}
		else {
			System.out.println("The record number:[" + numRecord + "] doesn't exist.");
		}
	}
	
	/**
	 * �������� ������ �� ������ numRecord
	 * @param numRecord
	 * ����� ������
	 * @return
	 * ������������ ������
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public Record getRecord(int numRecord) throws ArrayIndexOutOfBoundsException {
		if (numRecord >= position)
			throw new ArrayIndexOutOfBoundsException("The record by number " + numRecord + " doesn't exist.");
		return records[numRecord];
	}
	
	/**
	 * ����������� ������ � 2 ����
	 */
	protected void expandArray() {
		sizeArray *= 2;
		Record[] newRecords = new Record[sizeArray];
		for(int i=0; i<position; i++) {
			newRecords[i] = records[i];
		}
		records = newRecords;
	}
	
	/**
	 * ������� ������ �� �������� �� ������ ������ ������� numRecord
	 * @param numRecord
	 * ����� ������ ��� ��������
	 */
	public void delRecord(int numRecord) {
		records[numRecord] = null;
	}

	@Override
	public String toString() {
		String result="";
		for(int i=0; i<position; i++) {
			result += i + ": " + ((records[i] == null)?"":records[i]) + "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		Notepad notepad = new Notepad();

		notepad.addRecord("�������������� � ����������� ������");
		notepad.addRecord("������ � �������� � �������");
		notepad.addRecord("(������ �������� �������� � �������).");
		notepad.addRecord("����������� ������: �������� ������,");
		notepad.addRecord("������� ������, ������������� ������,");
		notepad.addRecord("���������� ��� ������.");
		notepad.addRecord("�������� ��� ������� ���� javadoc-������������.");
		System.out.println(notepad);
		
		notepad.delRecord(2);
		notepad.insertRecord(1, "��������� ������");
		System.out.println(notepad);
		
		try {
			notepad.getRecord(23);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
