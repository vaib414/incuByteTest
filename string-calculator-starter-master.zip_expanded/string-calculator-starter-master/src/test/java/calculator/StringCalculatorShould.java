package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	StringCalculator stringCalculator = new StringCalculator();

	@Test
	void empty_string_should_return_0() {

		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() {

		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
		assertEquals(3, stringCalculator.add("3"));
	}

	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
		assertEquals(3 + 6, stringCalculator.add("3,6"));
	}
	 @Test
	    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
	        assertEquals(3+6+15+18+46+33, stringCalculator.add("3,6,15,18,46,33"));
   }
	 @Test
	 public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
	     assertEquals(3+6+15, stringCalculator.add("3,6n15"));
	 }
	 @Test
	 public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
	     assertEquals(3+6+15, stringCalculator.add("//;n3;6;15"));
	 }

	 @Test
	 public final void whenNegativeNumbersAreUsedThenExceptionIsThrown() {
	     RuntimeException exception = null;
	     try {
	         stringCalculator.add("3,-6,15,-18,46,33");
	     } catch (RuntimeException e) {
	         exception = e;
	     }
	     assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
	 }
	 @Test
	 public final void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
	     assertEquals(3+1000+6, stringCalculator.add("3,1000,1001,6,1234"));
	 }
}