package com.sapient.file.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CSVReader<T> extends AbstractReader<T> implements Reader<T> {
	
	public CSVReader(final String filePath, RowMapper<T> mapper) {
		super(filePath, mapper);
	}

	@Override
	public List<T> read() throws IOException {
		List<T> records = new ArrayList<>();
		Stream<String> stream = Files.lines(Paths.get(filePath));
		stream.forEach(s->records.add(mapper.map(s.split(","))));
		stream.close();
		return records;
	}

}
