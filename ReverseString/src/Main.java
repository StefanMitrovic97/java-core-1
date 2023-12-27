public class Main {
    public static void main(String[] args) {
        //Using for loop to reverse string.
        String input = "I'm going to go to school today morning.";
        char[] resultarray = input.toCharArray();
        System.out.print("First way: \n");
        for (int i = resultarray.length-1; i >= 0 ; i--) {
            System.out.print(resultarray[i]);
        }
        //Using while loop to reverse string.
        String input1 = "I'm going to go to school today morning.";
        int strLength = input1.length();
        System.out.println("\nSecond way: ");
        while(strLength>0){
            System.out.print(input1.charAt(strLength-1));
            strLength--;
        }
        //Using StringBuilder to reverse string.
        StringBuilder input2 = new StringBuilder("I'm going to go to school today morning.");
        input2.reverse();
        System.out.println("\nThird way: ");
        System.out.println(input2);
        
    }
}