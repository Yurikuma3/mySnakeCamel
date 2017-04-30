package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

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
	}@Test
	public void snakeToCamelcaseでEngAveTestをCamelcaseにして取得する() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected = "SnakeCamelTest";
	String actual = scu.snakeToCamelcase("snake_camel_test");
	assertThat(actual, is(expected));
	}
	
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
	
}