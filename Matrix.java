import java.util.Scanner;
class Method{
    int [][] mat;
    Method(){}
    Method(int [][] mat){
        this();
        this.mat=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                this.mat[i][j]=mat[i][j];
            }
        }
    }
    int det(){
        int a,b,c;
        a=mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1];
        b=mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0];
        c=mat[1][0]*mat[2][1] - mat[2][0]*mat[1][1];
        return mat[0][0]*a-mat[0][1]*b+mat[0][2]*c;
    }
    boolean isSingular(){
        return (det() == 0);
    }
    void print(int [][] mat){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
    int Minor(int [][] mat,int p,int q){
        int [][] minor=new int[2][2];
        int row=0,col=0;
        for (int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                if (i != p && j != q) {
                    minor[row][col] = mat[i][j];
                    col++;
                    if (col == (2)) {
                        row++;
                        col = 0;
                    }
                }
            }
        }
        return minor[0][0]*minor[1][1]-minor[1][0]*minor[0][1] ;
    }
    void getInv(){
        double [][] inv =new double[3][3];
        if(isSingular()){
            System.out.println("it's inverse does not exist");
        }
        else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    inv[j][i]= Math.pow(-1,i+j)*Minor(mat,i,j) / det() ;
                }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(String.format("%.2f",inv[i][j])+"  ");
                }
                System.out.print("\n");
            }
        }
    }
    int rank(){
        double [][] a=new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=mat[i][j];
            }
        }
        if(a[0][0]==0){
            if(a[1][0]!=0){
                for(int col=0;col<3;col++){
                    double temp=a[0][col];
                    a[0][col]=a[1][col];
                    a[1][col]=temp;
                }
            }
            else if(a[2][0]!=0){
                for(int col=0;col<3;col++){
                    double temp=a[0][col];
                    a[0][col]=a[2][col];
                    a[2][col]=temp;
                }
            }
        }
        if(a[1][0]!=0){
            double multi=(a[1][0])/(a[0][0]);
            for(int col=0;col<3;col++){
                a[1][col]=a[1][col]-multi*a[0][col];
            }
        }
        if(a[2][0]!=0){
            double multi1=(a[2][0])/(a[0][0]);
            for(int col=0;col<3;col++){
                a[2][col]=a[2][col]-multi1*a[0][col];
            }
        }
        if(a[2][1]!=0){
            double multi2=(a[2][1])/(a[1][1]);
            for(int col=1;col<3;col++){
                a[2][col]=a[2][col]-multi2*a[1][col];
            }
        }
        System.out.println("Row Echelon Form :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(String.format("%.2f",a[i][j])+"  ");
            }
            System.out.print("\n");
        }
        if(a[2][2]!=0)
            return 3;
        else if(a[1][1]!=0 && a[1][2]!=0)
            return 2;
        else
            return 1;
    }
}
public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] matrix=new int[3][3];
        System.out.println("Enter the elements  of 3x3 Matrix :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        Method obj=new Method(matrix);
        System.out.println("\nEntered Matrix:");
        obj.print(matrix);
        System.out.println("Determinant value of Matrix : "+obj.det());
        System.out.println("");
        if(obj.isSingular())
            System.out.println("It is Singular Matrix\n");
        else
            System.out.println("It is not Singular Matrix\n");
        System.out.println("The Rank of the matrix is : "+obj.rank());
        System.out.println();
        System.out.println("Inverse:");
        obj.getInv();
    }
}

