package factorial.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Factorial test")
class FactorialTest {
	
	private Factorial factorial;

	@BeforeEach
	void setup() {
		factorial = new Factorial();
	}

	@Test
	@DisplayName("Base case")
	void testBaseCase() {
		assertThat(factorial.compute(0)).isEqualTo(1);
	}
	
	@Test
	@DisplayName("1 case")
	void testFactorialOf1() {
		assertThat(factorial.compute(1)).isEqualTo(1);
	}
	
	@Test
	@DisplayName("2 case")
	void testFactorialOf2() {
		assertThat(factorial.compute(2)).isEqualTo(2);
	}
	
	@Test
	@DisplayName("4 case")
	void testFactorialOf4() {
		assertThat(factorial.compute(4)).isEqualTo(24);
	}
	
	@Test
	@DisplayName("Negative input")
	void testNegativeInput() {
		assertThatThrownBy(()->factorial.compute(-1)).isInstanceOf(IllegalArgumentException.class).hasMessage("Negative input: -1");
	}


}
