package com.sapient.file.reader;

public interface RowMapper<T> {
  
	public T map(String[] row);
}
