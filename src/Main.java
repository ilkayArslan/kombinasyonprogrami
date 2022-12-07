import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("kaç elemanlı kümeniz mevcuttur : ");
        int kume = input.nextInt();
        System.out.print("Kaç elemanlı alt küme istersiniz : ");
        int altkume = input.nextInt();
        if(kume<altkume) {
            System.out.println("Hatalı Giriş. küme sayısı alt küme sayısından fazla olmalıdır");
        }else{
            //kumenin faktoriyeli
            int kumefak=1 ;
            for (int i = kume;i>0;i--){
                kumefak*=i;
            }

            //alt küme hesaplanması
            int altkumefak =1;
            for (int i = altkume;i>0;i--){
                altkumefak*=i;
            }
            //fark hesaplanması
            int farkfak =1;
            for (int i = kume-altkume;i>0;i--){
                farkfak*=i;
            }
            System.out.println(kumefak/(altkumefak*farkfak));
        }


    }
}