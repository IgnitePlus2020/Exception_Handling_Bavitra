import java.util.ArrayList;
import java.util.Scanner;
public class SwiggyZipCode {
  static   ArrayList<Integer> list = new ArrayList<>();
    public static void main(String args[]) {
        list.add(123);
        list.add(456);
        list.add(789);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the zipcode");
        int zipcode = sc.nextInt();
        try {
            checkCode(zipcode);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Thank you");
        }
    }


    public static void checkCode(int zipcode) throws InvalideCodeException{
        for(int i =0;i< list.size();i++) {
            if (zipcode == list.get(i)) {
                throw new InvalideCodeException("Non-deliverable zipcode");
            }
            }

        System.out.println("The code "+zipcode+" is deliverable");


    }
}

class InvalideCodeException extends Exception {
    InvalideCodeException(String s) {
        super(s);
    }
}