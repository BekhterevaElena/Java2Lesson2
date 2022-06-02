public class MyArrayDataException extends Throwable {
    private String error = "";
    MyArrayDataException(String error){
        this.error = error;
    }
    public String getError(){
        return this.error;
    }
}
