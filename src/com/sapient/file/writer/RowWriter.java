package com.sapient.file.writer;

import java.io.FileWriter;
import java.io.IOException;

public interface RowWriter<T> {
	
	public void write(FileWriter writer,T row) throws IOException;
	
	public void writeHeader(FileWriter writer) throws IOException;

}
