import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double elmaKg,armutKg, domatesKg, musKg, patlicanKg, toplam,
                arFyt=2.14,
                elFyt=3.67,
                domFyt=1.11,
                muzFyt=0.95,
                patFyt=5;

        System.out.print("Armut (kg  ) : ");
        armutKg=sc.nextDouble();
        System.out.print("Elma (kg)    : ");
        elmaKg=sc.nextDouble();
        System.out.print("Domates (kg) : ");
        domatesKg=sc.nextDouble();
        System.out.print("Muz (kg)     : ");
        musKg=sc.nextDouble();
        System.out.print("Patlıcan (kg): ");
        patlicanKg=sc.nextDouble();

        toplam = armutKg*arFyt+elmaKg*elFyt+domatesKg*domFyt+musKg*muzFyt+patlicanKg*patFyt;


        System.out.println("---------------------------------------");
        System.out.println("Toplam (TL) : " + toplam);

    }
}