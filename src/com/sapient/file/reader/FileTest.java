package com.sapient.file.reader;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sapient.file.writer.CSVWriter;
import com.sapient.file.writer.CustomWriter;
import com.sapient.file.writer.Writer;

public class FileTest {
	
	
public static void main(String[] args) throws IOException {
	Reader<RowData> reader = new CSVReader<>("/home/ubuntu/Documents/data.csv", new CustomRowMapper());
	List<RowData> data = reader.read();
	Map<String,Map<String,List<RowData>>> map = data.stream().collect(Collectors.groupingBy(RowData::groupBy,Collectors.groupingBy(RowData::getGender)));
	System.out.println(map);
	
	Writer<List<RowData>> writer = new CSVWriter<>("/home/ubuntu/Documents/data2.csv",new CustomWriter());
	
	writer.write(data);
	
}
}
