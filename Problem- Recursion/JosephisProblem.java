public class JosephisProblem {
  public static void main(String[] args){
    System.out.println(josephus(5,3));
  }
   static public int josephus(int n, int k)
    {
        //Your code here
        if(n==1){
            return 1;
        }
        else{
            return (josephus(n-1,k)+k-1)%n+1;
        }
    }

}
