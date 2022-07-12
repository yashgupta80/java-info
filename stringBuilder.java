package info;

public class stringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("0");

        //System.out.println(sb.length());
        sb.setCharAt(2, 'o');
        System.out.println(sb);
    }
}
