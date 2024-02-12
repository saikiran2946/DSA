public class Transpose {
    public static void Transpose(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void printmatrix(int[][]a){
        System.out.print("transpose of the matrix: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[][]a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.print("Given matrix: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
        Transpose(a);
        printmatrix(a);
    }
    
}
