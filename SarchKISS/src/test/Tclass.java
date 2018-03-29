package test;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

import edu.hm.cs.rs.arch18.a01_kiss.CSVReader;
import edu.hm.cs.rs.arch18.a01_kiss.Csv;
import junit.framework.Assert;

public class Tclass {

	@SuppressWarnings("deprecation")
	@Test
	public void testread() {
		final StringReader r = new StringReader("a b c,d e f\nxxx,yyy,\n");
		final Csv csvr = new Csv();
		
		try{
			final String[][] s = csvr.read(r);
			Assert.assertEquals(new String[]{"a b c","d e f"},s[0]);
		}catch(IOException e){}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testread_2() {
		final StringReader r = new StringReader("a,b\n\nc,d,e\n");
		final Csv csvr = new Csv();
		
		try{
			final String[][] s = csvr.read(r);
			Assert.assertEquals(new String[]{"a","b"},s[0]);
			Assert.assertEquals(new String[]{""},s[1]);
			Assert.assertEquals(new String[]{"c","d","e"},s[2]);
			//fail("Not yet implemented");
		}catch(IOException e){}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testread_3() {
		final StringReader r = new StringReader("ab,cd\nIch\\,gehe,ab\n");
		final Csv csvr = new Csv();
		
		try{
			final String[][] s = csvr.read(r);
			Assert.assertEquals(new String[]{"ab","cd"},s[0]);
			Assert.assertEquals(new String[]{"Ich\\,gehe","ab"},s[1]);
			//fail("Not yet implemented");
		}catch(IOException e){}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_read_throw_IllegalArgumentException(){
		StringReader r = new StringReader("abc,def\nxxx,yyy");
		Csv csvr = new Csv();
		
		try{
			final String[][] s = csvr.read(r);
			//fail("Not yet implemented");
		}catch(IOException e){}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_read_throw_IllegalArgumentException_2(){
		StringReader r = new StringReader("abc,def\nxxx,yyy\n\\\n");
		Csv csvr = new Csv();
		
		try{
			final String[][] s = csvr.read(r);
			//fail("Not yet implemented");
		}catch(IOException e){}
	}

}
