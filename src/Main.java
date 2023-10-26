import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tip;
        double mesafeUcreti = 0.10;
        int mesafe;
        int yas;
        double indirim;
        double ucret;
        double indirimliUcret;
        double gidisDonusIndirimi = 0.20;
        double toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas=input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        tip=input.nextInt();

        switch (tip){
            case 1:
                if(mesafe > 0){
                    if (yas > 0 && yas < 12) {
                        ucret = mesafe * mesafeUcreti;
                        indirim = ucret * 0.5;
                        indirimliUcret = ucret - indirim;
                        System.out.print("Toplam tutar " + indirimliUcret + "TL");
                    }else if (yas >= 12 && yas <= 24) {
                        ucret = mesafe * mesafeUcreti;
                        indirim = ucret * 0.1;
                        indirimliUcret = ucret - indirim;
                        System.out.print("Toplam tutar " + indirimliUcret + "TL");
                    }else if (yas > 24 && yas < 65) {
                        ucret = mesafe * mesafeUcreti;
                        indirim = ucret * 1;
                        indirimliUcret = ucret - indirim;
                        System.out.print("Toplam tutar " + indirimliUcret + "TL");
                    }else if (yas > 65) {
                        ucret = mesafe * mesafeUcreti;
                        indirim = ucret * 0.7;
                        indirimliUcret = ucret - indirim;
                        System.out.print("Toplam tutar " + indirimliUcret + "TL");
                    }else{
                        System.out.print("Hatalı veri girdiniz!");
                    }
                }else{
                    System.out.print("Hatalı veri girdiniz!");
                }
            break;

            case 2 :
                if(mesafe > 0) {
                    if (yas > 0 && yas < 12) {
                        ucret = mesafe * mesafeUcreti;
                        indirim = ucret * 0.5;
                        indirimliUcret = ucret - indirim;
                        indirimliUcret -= indirimliUcret * gidisDonusIndirimi;
                        toplamTutar = indirimliUcret * 2;
                        System.out.print("Toplam tutar " + toplamTutar + "TL");
                    } else if (yas >= 12 && yas <= 24) {
                        ucret = mesafe * mesafeUcreti;
                        indirim = ucret * 0.1;
                        indirimliUcret = ucret - indirim;
                        indirimliUcret -= indirimliUcret * gidisDonusIndirimi;
                        toplamTutar = indirimliUcret * 2;
                        System.out.print("Toplam tutar " + toplamTutar + "TL");
                    } else if (yas > 24 && yas < 65) {
                        ucret = mesafe * mesafeUcreti;
                        indirim = ucret * 1;
                        indirimliUcret = ucret - indirim;
                        indirimliUcret -= indirimliUcret * gidisDonusIndirimi;
                        toplamTutar = indirimliUcret * 2;
                        System.out.print("Toplam tutar " + toplamTutar + "TL");
                    } else if (yas > 65) {
                        ucret = mesafe * mesafeUcreti;
                        indirim = ucret * 0.7;
                        indirimliUcret = ucret - indirim;
                        indirimliUcret -= indirimliUcret * gidisDonusIndirimi;
                        toplamTutar = indirimliUcret * 2;
                        System.out.print("Toplam tutar " + toplamTutar + "TL");
                    }else {
                        System.out.print("Hatalı veri girdiniz!");
                    }
                }else {
                    System.out.print("Hatalı veri girdiniz!");
                }
            break;
            default:
                System.out.print("Hatalı veri girdiniz!");
                break;
}
}
}
