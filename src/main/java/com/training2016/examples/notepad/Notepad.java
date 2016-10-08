package com.training2016.examples.notepad;

import java.util.Arrays;

/**
 * Класс Блокнот
 * @author alex
 * 
 */
public class Notepad {
	private int sizeArray = 5;
	private Record[] records = new Record[sizeArray];
	private int position = 0;

	/**
	 * Конструктор по умолчанию
	 */
	public Notepad() {

	}

	/**
	 * Добавить запись в последнюю свободную ячейку массива
	 * @param item
	 * добавляемая текстовая строка
	 */
	public void addRecord(String item) {
		if (position == sizeArray) {
			expandArray();
		}
		records[position++] = new Record(item);			
	}

	/**
	 * Вставить запись в позицию numRecord массива.
	 * Если позиция больше или равна позиции свободной ячейки, то вставить в конец массива
	 * @param numRecord
	 * номер позиции
	 * @param item
	 * вставляемая строка
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
	 * Заменить в ячейке с номером numRecord строку на newItem 
	 * @param numRecord
	 * номер заменяемой ячейки
	 * @param newItem
	 * новая строка
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
	 * Получить запись по номеру numRecord
	 * @param numRecord
	 * номер записи
	 * @return
	 * возвращаемая запись
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public Record getRecord(int numRecord) throws ArrayIndexOutOfBoundsException {
		if (numRecord >= position)
			throw new ArrayIndexOutOfBoundsException("The record by number " + numRecord + " doesn't exist.");
		return records[numRecord];
	}
	
	/**
	 * Увеличиваем массив в 2 раза
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
	 * Удалить запись из блокнота по номеру ячейки массива numRecord
	 * @param numRecord
	 * номер ячейки для удаления
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

		notepad.addRecord("Спроектировать и разработать классы");
		notepad.addRecord("Запись в блокноте и Блокнот");
		notepad.addRecord("(записи блокнота хранятся в массиве).");
		notepad.addRecord("Реализовать методы: Добавить запись,");
		notepad.addRecord("Удалить запись, Редактировать запись,");
		notepad.addRecord("Посмотреть все записи.");
		notepad.addRecord("Написать для данного кода javadoc-документацию.");
		System.out.println(notepad);
		
		notepad.delRecord(2);
		notepad.insertRecord(1, "Вставляем запись");
		System.out.println(notepad);
		
		try {
			notepad.getRecord(23);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
