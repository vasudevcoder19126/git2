import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
    	System.out.print("i am best");
        Scanner scr= new Scanner(System.in);
        int n=scr.nextInt();
        int sp=1;
        int st=n/2;
        for(int i=1;i<=n;i++){
            int j=1;
            while(j<=st){
                System.out.print("* ");
                j++;
            }
            j=1;
            while(j<=sp){
                System.out.print("  ");
                j++;
            }
            j=1;
            while(j<=st){
                System.out.print("* ");
                j++;
            }
            if (i<=n/2){
                st--;
                sp+=2;
            }
            else {
                st++;
                sp-=2;
            }
            System.out.println();
        }


    }
}