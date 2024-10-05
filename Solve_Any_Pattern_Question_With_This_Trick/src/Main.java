public class Main {
    public static void main(String[] args) {

        //       Pattern1(5);
        //        Pattern2(5);
        //        Pattern3(5);
        //        Pattern4(5);
        //        Pattern5(5);
        //        Pattern28(5);
        //        Patetrn30(5);
        //        Patetrn17(5);
        Pattern31(4);
    }

    static  void Pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static  void Pattern2(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void Pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static  void Pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static  void Pattern5(int n){

        for(int i=0;i<=2 * n-1;i++){
            int total=i>n ? 2*n-i:i;
            for(int j=1;j<= total;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void Pattern28(int n){

        for(int i=0;i<2 * n-1;i++){
            int total=i>n ? 2*n-i:i;

            int Noofspaces=n-total;
                    for(int s=0;s<Noofspaces;s++){
                        System.out.print(" ");
                    }
            for(int j=0;j<total;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void Patetrn30(int n){
        for(int i=1;i<=n;i++){

            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    static  void Patetrn17(int n){
        for(int i=1;i<=2*n-1;i++){
        int c=i>n ? 2*n-i:i;
            for(int s=0;s<n-c;s++){
                System.out.print(" ");
            }

            for(int j=c;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }


    static  void Pattern31(int n){
        int originalN=n;
        n=2*n;
        for (int i = 0; i <=n; i++) {
            for(int j=0;j<=n;j++){
                int atEveryIndex=originalN-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }

}