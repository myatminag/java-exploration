package com.jdc.demo.app;

import com.jdc.demo.app.exceptions.DataAccessException;

public class DataAccessClass {

	public String[] search(String str) throws DataAccessException {

		if (str == null || str.isBlank()) {
			throw new DataAccessException("Parameter must be required!");
		}

		return new String[] { "It is Ok!" };
	}
}
