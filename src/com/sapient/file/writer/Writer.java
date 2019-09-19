package com.sapient.file.writer;

import java.io.IOException;

public interface Writer<T> {
	
	public void write(T rows) throws IOException;

}
