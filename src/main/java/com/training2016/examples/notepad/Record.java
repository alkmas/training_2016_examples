package com.training2016.examples.notepad;

import java.util.Date;

/**
 * Класс Запись
 * @author alex
 *
 */
public class Record {
	private String item;
	private Date created;
	private Date modified;
	
	/**
	 * Конструктор
	 * @param item
	 * строка записываемая в новый объект
	 */
	public Record(String item) {
		this.item = item;
		this.created = new Date();
		this.modified = new Date();
	}

	public String getItem() {
		return item;
	}

	/**
	 * 
	 * @param item
	 * заменяет строку в объекте
	 */
	public void setItem(String item) {
		this.item = item;
		this.modified = new Date();
	}

	@Override
	public String toString() {
		return item + ": [created=" + created + ", modified=" + modified + "]";
	}
	
	
}
