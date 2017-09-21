package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Anton
 *
 */
public class DataSetReader {

	private double[] data;
	
	public double[] readFile(String file) {
		try {
			readData(new Scanner(new File("file")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (BadDataException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return data;
	}

	private void readData(Scanner in) throws BadDataException{
		while (in.hasNext()) {
		readValue(in);
			}
	}
	
	private double readValue(Scanner in) throws BadDataException {
		double val;
		try {
			val = in.nextDouble();
		} catch (Exception e) {
			throw new BadDataException();
		}
		return val;
	}
}
