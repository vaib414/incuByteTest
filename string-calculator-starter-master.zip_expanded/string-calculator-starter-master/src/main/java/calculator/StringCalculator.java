package calculator;

class StringCalculator {

    public int add(String input) {
    	 int returnValue = 0;
    	    String[] numbersArray = input.split(",");
    	    if (numbersArray.length > 2) {
    	        throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
    	    }
    	    for (String number : numbersArray) {
    	        if (!number.trim().isEmpty()) { // After refactoring
    	            returnValue += Integer.parseInt(number);
    	        }
    	    }
    	    return returnValue;
    }

}