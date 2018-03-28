package edu.hm.cs.rs.arch18.a01_kiss;

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KISSMain {

	public static void main(String[] args) {
		 final Reader reader = args.length > 0
                 ? new StringReader(args[0].replace('$', '\n')) : new InputStreamReader(System.in);
 
                /* final CSVReader csvReader = new MyReader();//r -> null;  // Weisen Sie hier Ihren CSVReader zu.

                 System.out.println(Stream.of(csvReader.read(reader))
                		 .map(Arrays::toString)
                		 .collect(Collectors.joining(",\n", "[", "]")));	*/

	}

}
