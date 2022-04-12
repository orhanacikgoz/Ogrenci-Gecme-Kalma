import java.util.Scanner;


public class sinifgecme {
    public static void main(String[] args) {

        int mat,fiz,tur,kim,muz, ort ;

        Scanner inp=new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz: ");
        mat=inp.nextInt();
        System.out.println("Fizik Notunuzu Giriniz: ");
        fiz=inp.nextInt();
        System.out.println("Turkce Notunuzu Giriniz: ");
        tur=inp.nextInt();
        System.out.println("Kimya Notunuzu Giriniz: ");
        kim=inp.nextInt();
        System.out.println("Muzik Notunuzu Giriniz: ");
        muz=inp.nextInt();
        ort=(mat+fiz+kim+muz+tur)/5;


        if (((mat >= 0) && (mat <=100)) && ((fiz >= 0) && (fiz <=100)) && ((fiz >= 0) && (fiz <=100)) && ((kim >= 0) && (kim <=100)) && ((muz >= 0) && (muz <=100)) && ((tur >= 0) && (tur <=100))  ) {
            if (ort>=50){
                System.out.println("Tebrikler Gectiniz, Ortalamaniz: "+ ort);
            }
            else {
                System.out.println("Kaldiniz Seneye Gorusuruz, Ortalamaniz: "+ort);
            }


        }else {
            System.out.println("Not Araligi 0-100 Arasinda Olmalidir");
        }






























    }
}
