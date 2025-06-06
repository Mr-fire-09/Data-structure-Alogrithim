public class printfunction {
    
    public static void main(String[] args) {
        printpattern(5);
        
    }
    public static void printpattern(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <=n; j++){
                System.out.print(n);

            }
            System.out.println();
        }
    }
}
