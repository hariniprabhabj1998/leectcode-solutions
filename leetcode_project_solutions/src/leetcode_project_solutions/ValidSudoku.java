package leetcode_project_solutions;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {	
		char[][] board = {    
				{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
			    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
			    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
			    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
			    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
			    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
			    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
			    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
			    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
			    };
		ValidSudoku v = new ValidSudoku();
		System.out.println(v.isValidSudoku(board));
	
	}
	    public boolean isValidSudoku(char[][] board) {
	        int N =9;
	        HashSet<Character>[] rows = new HashSet[N]; //create hashset since array it is not initialized
	        HashSet<Character>[] cols = new HashSet[N]; //Array of hashsets
	        HashSet<Character>[] boxes = new HashSet[N];

	        for(int i=0; i<N; i++){
	            rows[i]= new HashSet<>(); //initialize the hashset 
	            cols[i] = new HashSet<>();
	            boxes[i] = new HashSet<>();
	        }

	        for(int i=0;i<N; i++){
	            for (int j=0; j<N; j++){
	                char val = board[i][j];
	                
	                if(val == '.'){
	                    continue;
	                }
	                if(rows[i].contains(val)){
	                    return false;
	                }
	                rows[i].add(val);
	                
	                if(cols[j].contains(val)){
	                    return false;
	                }
	                cols[j].add(val);
	                
	                int idex = i/3*3 + j/3;
	                if(boxes[idex].contains(val)){
	                    return false;
	                }
	                boxes[idex].add(val);
	            }
	        }
	        return true;

	    }
	

}
