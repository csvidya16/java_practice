public class pattern9 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               /*  if((i%2==1) &&(j%2==1)){
                    System.out.print("1 ");
                }
                else if((i%2==0)&& (j%2==0)){
                    System.out.print("1 ");
                }
                else{
                System.out.print("0 ");
                }
                */

                if(i%2==j%2){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

}
