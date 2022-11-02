import java.util.Scanner;
public class EtkinlikOneri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int degree;
        System.out.println("Sıcaklık değerini giriniz. ");
        degree=scan.nextInt();
        if(degree<5)
        {
            System.out.println("Kayağa gidebilirsiniz.");
        }
        else if(degree>5 && degree<15)
        {
            System.out.println("Sinema uygun olabilir.");
        }
        else if(degree>15 && degree<25)
        {
            System.out.println("Piknik güzel bir fikir olabilir.");
        }
        else
        {
            System.out.println("Yüzmeye gitmek uygun olabilir.");
        }

    }
}