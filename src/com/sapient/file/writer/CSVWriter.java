package com.sapient.file.writer;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter<T> extends AbstractWriter<T> implements Writer<T> {
   

	public CSVWriter(String filePath,RowWriter<T> rowWriter) {
		super(filePath, rowWriter);
	}

	@Override
	public void write(T rows) throws IOException {
		FileWriter writer = new FileWriter(filePath);
		//rowWriter.writeHeader(writer);
	    rowWriter.write(writer,rows);
		writer.flush();
		writer.close();
	}
	
	

}
