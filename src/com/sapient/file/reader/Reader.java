package com.sapient.file.reader;
import java.io.IOException;
import java.util.List;

public interface Reader<T> {
   
	public List<T> read() throws IOException;
}
