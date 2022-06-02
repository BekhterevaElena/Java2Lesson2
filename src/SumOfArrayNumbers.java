public class SumOfArrayNumbers {
    private int sum=0;

    public int convertToInt(String[][] strArray) throws MyArrayDataException {

        for (int i=0; i<strArray.length; i++) {
           for (int g=0; g<strArray[i].length; g++) {
               try {
                   int currentNumber = Integer.parseInt(strArray[i][g]);
                    this.sum += currentNumber;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(" "+i+" "+g);
                }
            }
        }
        return this.sum;
    }

    public boolean correctLength(String[][] strArray) throws MyArraySizeException {
        if (strArray.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i=0; i<strArray.length; i++) {
            if (strArray[i].length !=4 ) {
                throw new MyArraySizeException();
            }

        }
        return true;
    }

}
