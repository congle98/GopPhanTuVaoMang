import java.util.Scanner;


public class demo {
    static void menu(Scanner scanner, int arr1[],int arr2[]){
        while (true){
            System.out.println("chọn menu \n 1.Thêm mảng 1 \n 2.Thêm mảng 2 \n 3.Hiển thị mảng 1 \n 4.Hiển thị mảng 2" +
                    " \n 5.Hiển thị mảng gộp \n 6.Thoát");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    addArr1(scanner,arr1);
                    break;
                case 2:
                    addArr2(scanner,arr2);
                    break;
                case 3:
                    getArr1(arr1);
                    break;
                case 4:
                    getArr2(arr2);
                    break;
                case 5:
                    getArr3(arr3(arr1,arr2));
                    break;
                case 6:
                    System.exit(0);

            }
        }
    }
    static void addArr1(Scanner scanner,int arr1[]){
        System.out.println("Phần tử muốn thêm là:");
        int x = scanner.nextInt();
        int i;
        do {
            System.out.println("Vào vị trí thứ:");
            i = scanner.nextInt();
            if((i<0) || (i>arr1.length-1)){
                System.out.println("i phải nằm trong khoảng từ 0 đến"+arr1.length);
            }
        }while ((i<0) || (i>arr1.length-1));
        arr1[i]=x;
        System.out.println("đã thêm "+x+" vào vị trí thứ "+i);

    }
    static void addArr2(Scanner scanner,int arr2[]){
        System.out.println("Phần tử muốn thêm là:");
        int x = scanner.nextInt();
        int i;
        do {
            System.out.println("Vào vị trí thứ:");
            i = scanner.nextInt();
            if((i<0) || (i>arr2.length-1)){
                System.out.println("i phải nằm trong khoảng từ 0 đến"+arr2.length);
            }
        }while ((i<0) || (i>arr2.length-1));
        arr2[i]=x;
        System.out.println("đã thêm "+x+" vào vị trí thứ "+i);

    }
    static void getArr1(int arr1[]){
        for(int i=0; i<arr1.length;i++){
            System.out.println("Vị trí thứ "+i+" là "+arr1[i]);
        }
    }
    static void getArr2(int arr2[]){
        for(int i=0; i<arr2.length;i++){
            System.out.println("Vị trí thứ "+i+" là "+arr2[i]);
        }
    }
    static int[] arr3(int arr1[],int arr2[]){
        int lengthArr = arr1.length+arr2.length;
        int[] arr3 = new int[lengthArr];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
        }
        return arr3;
    }
    static void getArr3(int arr3[]){
        for(int i=0; i<arr3.length;i++){
            System.out.println("Vị trí thứ "+i+" là "+arr3[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr3;
        int n1;
        do {
            System.out.println("Mời nhập số lượng phần tử trong mảng 1: ");
            n1 = scanner.nextInt();
            if(n1<1){
                System.out.println("số lượng phải lớn hơn 1");
            }
        }while (n1<1);
        int arr1[] =new int[n1];
        int n2;
        do {
            System.out.println("Mời nhập số lượng phần tử trong mảng 2: ");
            n2 = scanner.nextInt();
            if(n2<1){
                System.out.println("số lượng phải lớn hơn 1");
            }
        }while (n2<1);
        int arr2[] =new int[n2];
        menu(scanner,arr1,arr2);

    }
}
