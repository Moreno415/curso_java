import java.util.Scanner;
public class whilej {
    public static void main(String [] args){
    boolean lop = true ;
    Scanner carlitos = new Scanner(System.in);
    
    while(lop){
        System.out.println("Another one bites the dust");
        System.out.println("Another one bites the dust");
        System.out.println("1.Another one bites the dust  o  2.and Another one gone and Another one");
        switch(carlitos.nextInt()){
            case 1:
                System.out.println("Another one bites the dust");
            case 2:
                System.out.println("Another one bites the dust");
                lop = false;
                System.out.println(lop);

        }

    }   
    }
}