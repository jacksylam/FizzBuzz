/**
 * Created by Jack on 2/4/2015.
 */
public class FizzBuzz {
  public static void main(String[] args) {
    for(int i =0; i< 101; i++){
      System.out.println(intToString(i));
    }
  }

  public static String intToString(int a) {
    String ret;
      if((a%5 == 0) && (a%3==0)){
      ret = "FizzBuzz";
    }
    else if(a%5==0){
      ret = "Buzz";
    }
    else if(a%3==0){
      ret = "Fizz";
    }
    else{
      ret = Integer.toString(a);
    }
    return ret;
  }
}
