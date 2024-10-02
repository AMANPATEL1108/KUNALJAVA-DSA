import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size of array:");
        int n=sc.nextInt();
        int[] array = new int[n];

      for(int i=0;i<n;i++){
          array[i]=sc.nextInt();
      }

//        System.out.println(AreaOfCircle(14));
//        System.out.println(AreaOfTriangle(15,14));
//        System.out.println(AreaOfReactangle(15,14));
//        System.out.println(AreaOfIsoscelesTriangle(14,15));
//        System.out.println(AreaOfParallelogram(14,15));
//        System.out.println(AreaOfRhombushow(14,13));
//        System.out.println(AreaOfEquilateralTriangle(15));
//        System.out.println(PerimeterOfCircle(14));
//        System.out.println(PerimeterOfEquilateralTriangle(15));
//        System.out.println(PerimeterOfParallelogram(14,13));
//        System.out.println(PerimeterOfRectangle(14,15));
//        System.out.println(PerimeterOfSquarehow(14));
//        System.out.println(PerimeterOfRhombus(14));
//        System.out.println(VolumeOfCone(14,15));
//        System.out.println(VolumeOfPrism(14,15));
//        System.out.println(VolumeOfcylinder(14,13));
//        System.out.println(VolumeOfSphere(15));
////        System.out.println(VolumeOfPyramid(14,16,16));
//        System.out.println(CurvedSurfaceAreaOfCylinder(14,15));
//        System.out.println(SurfaceareaofCube(14));
//        System.out.println(FibonacciSeries(8));
//        System.out.println(subtractProductAndSum(234));
//        System.out.println(Factorial(5));
//        System.out.println(SumofNumberenteraUSer(array));
//        System.out.println(FindLargestNumber(array));
//        System.out.println(addition(15,20));
    }


    static float AreaOfCircle(int n) {
        float Area = 3.14f * n * n;
        return Area;
    }

    static float AreaOfTriangle(int b, int h) {
        float Area = (b * h) / 2;
        return Area;
    }

    static float AreaOfReactangle(int w, int l) {
        float Area = w * l;
        return Area;
    }

    static float AreaOfIsoscelesTriangle(int b, int h) {
        float Area = (b * h) / 2;
        return Area;
    }

    static float AreaOfParallelogram(int b, int h) {
        float Area = b * h;
        return Area;
    }

    static float AreaOfRhombushow(int p, int q) {
        float Area = (p * q) / 2;
        return Area;
    }

    static float AreaOfEquilateralTriangle(int a) {
        float Area = (1.132f * a * a) / 4;
        return Area;
    }

    static float PerimeterOfCircle(int r) {
        float Area = 2 * 3.14f * r;
        return Area;
    }

    static float PerimeterOfEquilateralTriangle(int a) {
        float Area = 3 * a;
        return Area;
    }

    static float PerimeterOfParallelogram(int a, int b) {
        float Area = 2 * (a + b);
        return Area;
    }

    static float PerimeterOfRectangle(int l, int w) {
        float Area = 2 * (l + w);
        return Area;
    }

    static float PerimeterOfSquarehow(int a) {
        float Area = a * 4;
        return Area;
    }

    static float PerimeterOfRhombus(int a) {
        float Area = a * 4;
        return Area;
    }

    static float VolumeOfCone(int r, int h) {
        float Area = (3.14f * (r * r)) * h / 3;
        return Area;
    }

    static float VolumeOfPrism(int b, int h) {
        float Area = b * h;
        return Area;
    }

    static float VolumeOfcylinder(int r, int h) {
        float Area = (3.14f * (r * r)) * h;
        return Area;
    }

    static float VolumeOfSphere(int r) {
        float Area = (4 * 3.14f * r * r) / 2;
        return Area;
    }

    static float VolumeOfPyramid(int l, int w, int h) {
        float Area = (l * w * h) / 3;
        return Area;
    }

    static float CurvedSurfaceAreaOfCylinder(int r, int h) {
        float Area = 2 * 3.14f * r * h;
        return Area;
    }

    static float SurfaceareaofCube(int a) {
        float Area = 6 * (a * a);
        return Area;
    }

    static int FibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    static int subtractProductAndSum(int n) {
        int temp = 1;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            temp = d * temp;
            sum = sum + d;
            n /= 10;
        }
        return temp - sum;
    }

    static int Factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    static  int SumofNumberenteraUSer(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return  sum;
    }

    static  int FindLargestNumber(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }



}