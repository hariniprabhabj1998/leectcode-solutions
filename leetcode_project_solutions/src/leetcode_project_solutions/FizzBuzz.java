package leetcode_project_solutions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		int n=15;
		FizzBuzz f =  new FizzBuzz();
		System.out.println(f.fizzBuzz(n));
	}
	
	
	    public List<String> fizzBuzz(int n) {
	        List<String> l = new ArrayList<>();

	        for(int i=1;i<=n;i++){
	            if(i%3 ==0 && i%5==0){
	                l.add("FizzBuzz");

	            }else if(i%3==0){
	                l.add("Fizz");
	            }
	            else if(i%5==0){
	                l.add("Buzz");
	            }
	            else{
	                l.add(Integer.toString(i));
	            }

	          
	        }
	          return l;
	    }
	

}
