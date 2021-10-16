package calculator;

class StringCalculator {

    public int add(String input) {
    	 String delimiter = ",|n";
    	    String numbersWithoutDelimiter = input;
    	    if (input.startsWith("//")) {
    	        int delimiterIndex = input.indexOf("//") + 2;
    	        delimiter = input.substring(delimiterIndex, delimiterIndex + 1);
    	        numbersWithoutDelimiter = input.substring(input.indexOf("n") + 1);
    	    }
    	    return add(numbersWithoutDelimiter, delimiter);
    	}
    	 
    	private static int add(final String numbers, final String delimiter) {
    	    int returnValue = 0;
    	    String[] numbersArray = numbers.split(delimiter);
    	    for (String number : numbersArray) {
    	        if (!number.trim().isEmpty()) {
    	            returnValue += Integer.parseInt(number.trim());
    	        }
    	    }
    	    return returnValue;
    	}
}