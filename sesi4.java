package pbosesi4;

public class ParameterNomor {

    private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(2);
        display(2, 15);
    }
}