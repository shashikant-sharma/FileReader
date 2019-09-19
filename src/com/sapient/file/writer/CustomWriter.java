package com.sapient.file.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.sapient.file.reader.RowData;

public class CustomWriter implements RowWriter<List<RowData>> {

	@Override
	public void write(FileWriter writer, List<RowData> rows) throws IOException {
		rows.forEach(row->{
			try {
				writer.append(String.join(",",objectToArray(row)));
				writer.append("\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
	}
	
	private String [] objectToArray(RowData data) {
		String [] string = new String[4];
		string[0] = data.getCountry();
		string[1]= data.getCity();
		string[2] = data.getGender();
		string[3] = data.getAmount();
		return string;
		
	}

	@Override
	public void writeHeader(FileWriter writer) throws IOException {
		writer.append("Country");
		writer.append(",");
		writer.append("City");
		writer.append(",");
		writer.append("Gender");
		writer.append(",");
		writer.append("Ammount");
		writer.append("\n");
		
	}

}
