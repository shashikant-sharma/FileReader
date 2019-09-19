package com.sapient.file.writer;

public abstract class AbstractWriter<T> {
	
	protected String filePath;
	
	protected RowWriter<T> rowWriter;
	
	public AbstractWriter(String filePath,RowWriter<T> rowWriter){
		this.filePath = filePath;
		this.rowWriter = rowWriter;
	}
	

}
