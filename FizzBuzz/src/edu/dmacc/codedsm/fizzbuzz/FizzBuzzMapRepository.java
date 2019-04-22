package edu.dmacc.codedsm.fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzMapRepository implements MapRepository {

	private Map<Integer, Result> storage = new HashMap<>();
	
	public void save(Result result) {
		storage.put(1, result);
		 
	}

	@Override
	public String toString() {
		return "FizzBuzzMapRepository [storage=" + storage + "]";
	}

}
