public class boundaryTraversal {
    public static void boundaryTraversal(int[][]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[0][i]+" ");
        }
        System.out.println();
        for(int i=1;i<a.length;i++){
            System.out.print(a[i][a[i].length-1]+" ");
        }
        System.out.println();
        for(int i=a[0].length-2;i>=0;i--){
            System.out.print(a[a.length-1][i]+" ");
        }
        System.out.println();
        for(int i=a.length-1;i>=1;i--){
            System.out.print(a[i][0]+" ");
        }
    }
    public static void main(String[] args) {
        int [][]a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        boundaryTraversal(a);
        
        

        
    }
    
}
