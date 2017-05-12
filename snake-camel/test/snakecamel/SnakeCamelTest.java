package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {
	// snakeToCamelcase
	@Test
	public void snakeToCamelcaseでengをCamelcaseにして取得する() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected = "Snake";
	String actual = scu.snakeToCamelcase("snake");
	assertThat(actual, is(expected));
	}
	@Test
	public void snakeToCamelcaseでeng_aveをCamelcaseにして取得する() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected = "SnakeCamel";
	String actual = scu.snakeToCamelcase("snake_camel");
	assertThat(actual, is(expected));
	}
	@Test
	public void snakeToCamelcaseでsnake_camel_testをCamelcaseにして取得する() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected = "SnakeCamelTest";
	String actual = scu.snakeToCamelcase("snake_camel_test");
	assertThat(actual, is(expected));
	}
	@Test
	public void snakeToCamelcaseでsnake__camel___testをCamelcaseにして取得する() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected = "SnakeCamelTest";
	String actual = scu.snakeToCamelcase("snake__camel___test");
	assertThat(actual, is(expected));
	}
	@Test
	public void snakeToCamelcaseで_snake_camel__をCamelcaseにして取得する() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected = "SnakeCamel";
	String actual = scu.snakeToCamelcase("_snake_camel__");
	assertThat(actual, is(expected));
	}
	
	// CameltoSnakecase
	@Test
	public void camelToSnakecaseでengをSnakecaseにして取得する() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected = "sna";
	String actual = scu.camelToSnakecase("Sna");
	assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでEngAveをSnakecaseにして取得する() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected = "snake_camel";
	String actual = scu.camelToSnakecase("SnakeCamel");
	assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでEngAveTestをSnakecaseにして取得する() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected = "snake_camel_test";
	String actual = scu.camelToSnakecase("SnakeCamelTest");
	assertThat(actual, is(expected));
	}
	
	// capitalize
	@Test
	public void capitalizeに空文字を与える() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "";
		String actual = scu.capitalize("");
		assertThat(actual, is(expected));
	}
	@Test
	public void capitalizeでxを大文字にして取得する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "X";
		String actual = scu.capitalize("x");
		assertThat(actual, is(expected));
	}
	@Test
	public void capitalizeでhelloをcapitalizeして取得する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Hello";
		String actual = scu.capitalize("hello");
		assertThat(actual, is(expected));
	}

	// uncapitalize
	@Test
	public void uncapitalizeに空文字を与える() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "";
		String actual = scu.uncapitalize("");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeでXを小文字にして取得する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "x";
		String actual = scu.uncapitalize("X");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeでHelloをunpitalizeして取得する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "hello";
		String actual = scu.uncapitalize("Hello");
		assertThat(actual, is(expected));
	}
	
}