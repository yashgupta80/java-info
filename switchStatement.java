package info;

public class switchStatement {
    public static void main(String[] args){
        char alpha = 'D';
        switch (alpha){
            case 'A':
                System.out.println("alpha a was A");
                break;
            case 'B':
                System.out.println("alpha was B");
                break;
            case 'C':
                System.out.println("alpha was C");
                break;
            case 'D':
                System.out.println("alpha was D");
                break;
            default:
                System.out.println("Not Found");
        }
    }
}
