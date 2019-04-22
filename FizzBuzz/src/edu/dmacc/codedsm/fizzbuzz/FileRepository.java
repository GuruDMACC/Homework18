package edu.dmacc.codedsm.fizzbuzz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileRepository implements MapRepository {

	@Override
	public void save(Result result) {
		try {
            //Whatever the file path is.
            File statText = new File("C:/Files/fizzbuzz_result.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
             
             
            w.write(result.toString());
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file fizzbuzz_result.txt");
        }

	}

}
