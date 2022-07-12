package info;

public class parsingString {
    public static void main(String[] args){
        String string = "2054";
        System.out.println("string " + string);
        int number = Integer.parseInt(string);
        System.out.println("number " + number);
        number+=1;
        System.out.println(number);
    }
}
