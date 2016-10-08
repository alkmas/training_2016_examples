package com.training2016.examples.notepad;

import java.util.Date;

/**
 * ����� ������
 * @author alex
 *
 */
public class Record {
	private String item;
	private Date created;
	private Date modified;
	
	/**
	 * �����������
	 * @param item
	 * ������ ������������ � ����� ������
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
	 * �������� ������ � �������
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
