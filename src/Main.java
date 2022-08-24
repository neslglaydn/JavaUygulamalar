import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     double tutar,kdvOran=0.18;
     Scanner input=new Scanner(System.in);
     System.out.println("ucret tutarini giriniz: " );
     tutar=input.nextDouble();
     if(tutar<1000){
         kdvOran=18.0;
     }else{
         kdvOran=0.18;
     }


     double kdvTutar=tutar*kdvOran;
     double kdvliTutar=tutar+kdvTutar;

        System.out.println(kdvliTutar);

    }
}