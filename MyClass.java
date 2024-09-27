import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
    int harga, jumlah;
    double diskon, total=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Program Penghitung Diskon");
    System.out.print("Harga Barang = ");
    harga=sc.nextInt(); 
    System.out.print("Jumlah Barang = ");
    jumlah=sc.nextInt();
    total=harga*jumlah;
    System.out.print("Total ="+total);
    if(total<=100000){
        System.out.println("KAMU GADAPET DISKON HUU");
    }else if(total>=100001 && total<=200000){
        System.out.println("KAMU DAPET DISKON 5% YEY");
        diskon=0.05*total;
        System.out.println("Diskon : "+diskon);
        total=total-diskon;
        System.out.println("Total : "+total);
    }else if(total>=200001 && total<=300000){
        System.out.println("KAMU DAPET DISKON 10% YEY");
        diskon=0.10*total;
        System.out.println("Diskon : "+diskon);
        total=total-diskon;
        System.out.println("Total : "+total);
    }else if(total>=300001 && total<=400000){
        System.out.println("KAMU DAPET DISKON 15% YEY");
        diskon=0.15*total;
        System.out.println("Diskon : "+diskon);
        total=total-diskon;
        System.out.println("Total : "+total);
    }else if(total>=400001 && total<=500000){
        System.out.println("KAMU DAPET DISKON 20% YEY");
        diskon=0.20*total;
        System.out.println("Diskon : "+diskon);
        total=total-diskon;
        System.out.println("Total : "+total);
    }else if(total>500000){
        System.out.println("KAMU DAPET DISKON 25% YEY");
        diskon=0.25*total;
        System.out.println("Diskon : "+diskon);
        total=total-diskon;
        System.out.println("Total : "+total);
    }
    System.out.print("Masukkan uang Pembayaran =");
    double uang=sc.nextDouble(); 
    if(uang>total){
        double kembalian=uang-total;
        System.out.println("Kembalian : "+kembalian);
    }else if(uang==total){
        System.out.println("Pas bro ngapain nunggu kembalian");
    }else{
        System.out.println("Uangmu kurang bro balik");
    }
    }
       
  }