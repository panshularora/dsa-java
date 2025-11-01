package string;

public class test2 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        //set character at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert
        sb.insert(0, 't');
        System.out.println(sb);

        //delete
        sb.delete(0, 1);
        System.out.println(sb);

        //append
        sb.append(" Stark");
        System.out.println(sb);



        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
