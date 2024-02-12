public class mirrorMatrix {
    public static void mirrorMatrix(int[][]a){
        Transpose(a);
        int k=a.length-1;
        for(int i=0;i<k;i++,k--){
            for(int j=0;j<a[i].length;j++){
                int temp=a[i][j];
                a[i][j]=a[k][j];
                a[k][j]=temp;
            }
        }

    }
    public static void Transpose(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void  printmatrix(int[][]a){
        System.out.println("mirrormatrix: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }
    public static void main(String[] args){
        int[][]a={{1,2,3},{4,5,6,},{7,8,9,}};
        mirrorMatrix(a);
        printmatrix(a);
    }
    
}
