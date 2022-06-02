public class Main {
    public static void main(String[] args) {

        String[][] myArray = new String[4][4];
        myArray[0][0] = "1";
        myArray[0][1] = "2";
        myArray[0][2] = "3";
        myArray[0][3] ="5";
        myArray[1][0] = "4";
        myArray[1][1] = "6";
        myArray[1][2] = "7";
        myArray[1][3] ="8";
        myArray[2][0] = "l";
        myArray[2][1] = "15";
        myArray[2][2] = "12";
        myArray[2][3] ="6";
        myArray[3][0] = "1";
        myArray[3][1] = "9";
        myArray[3][2] = "123";
        myArray[3][3] ="56";

        SumOfArrayNumbers sumOfArrayNumbers = new SumOfArrayNumbers();
        Boolean isCorrectArray = false;
        try {
            if(sumOfArrayNumbers.correctLength(myArray)) {
                isCorrectArray = true;
            }
        } catch (MyArraySizeException e)
        {
            System.out.println("array size is not correct");
        }
        if(isCorrectArray) {
            int sum=0;
            try {
                sum = sumOfArrayNumbers.convertToInt(myArray);
            } catch (MyArrayDataException e) {
                System.out.println("Sorry, you array exist not correct data in "+e.getError());
            }
            System.out.println("result"+sum);
        }
    }
}