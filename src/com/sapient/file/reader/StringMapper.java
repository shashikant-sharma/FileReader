package com.sapient.file.reader;

import java.util.Arrays;
import java.util.List;

public class StringMapper implements RowMapper<List<String>>{

	@Override
	public List<String> map(String[] row) {
		return Arrays.asList(row);
	}

}
