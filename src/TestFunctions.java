import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFunctions {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void firstTest() throws Exception {
		Movie m1 = new Movie("movie1", 1);
		Movie m2 = new Movie("movie2", 2);
		Rental r1 = new Rental(m1, 10);
		Rental r2 = new Rental(m2, 5);
		Customer c1 = new Customer("joe");
		c1.addRental(r1);
		c1.addRental(r2);
		String result = c1.statement();
		assertEquals("Rental Record for joe\n" +
				"\tTitle\t\tDays\tAmount\n" +
				"\tmovie1\t\t10\t30.0\n" +
				"\tmovie2\t\t5\t4.5\n" +
				"Amount owed is 34.5\n" +
				"You earned 3 frequent renter points", result);
	}

}
