package calculator;

class StringCalculator {

    public int add(String input) {
    	 int returnValue = 0;
    	    String[] numbersArray = input.split(",|n"); // Added |n to the split regex
    	    for (String number : numbersArray) {
    	        if (!number.trim().isEmpty()) {
    	            returnValue += Integer.parseInt(number.trim());
    	        }
    	    }
    	    return returnValue;
    }

}