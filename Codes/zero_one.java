// if i is even print 0 else 1
/*
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 
 */
class zero_one{
    public static void main(String args[]){
        int n=4;

        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j <= i ; j++){
                if(j % 2 == 0){
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