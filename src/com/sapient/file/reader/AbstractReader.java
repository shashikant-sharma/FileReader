package com.sapient.file.reader;

public abstract class AbstractReader<T> {
	
	protected String filePath;
	
	protected RowMapper<T> mapper;
	
	public AbstractReader(String filePath,RowMapper<T> mapper) {
		this.filePath = filePath;
		this.mapper = mapper;
	}

}
