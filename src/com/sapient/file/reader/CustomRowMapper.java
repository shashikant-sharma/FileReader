package com.sapient.file.reader;

public class CustomRowMapper implements RowMapper<RowData> {

	@Override
	public RowData map(String[] row) {
		RowData data = new RowData();
		data.setCountry(row[0]);
		data.setCity(row[1]);
		data.setGender(row[2]);
		data.setAmount(row[3]);
		return data;
	}

}
