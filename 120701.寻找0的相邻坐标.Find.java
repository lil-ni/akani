package pii;
//R_zero(x,y)=(column,row)=R_zero(4,1)
//R_left(x,y)=(column,row)=R_left3,1)
//R_right(x,y)=(column,row)=R_right(5,1)
//R_up(x,y)=(column,row)=R_up(4,0)
//R_down(x,y)=(column,row)=R_down(4,2)
public class Find {
    void findZero(int array2d[][]){
    	for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_zero("+column+","+row+")");
					return;
				    }
			}
    	}		
    }		
	void findZero1(int array2d1[][]){
	    for (int row1 = 0; row1 < array2d1.length; row1++) {	
			for (int column1 = 0; column1 < array2d1[0].length; column1++) {
					if (array2d1[row1][column1]==10) {
   			  	   System.out.println("R_left("+column1+","+row1+")");
   			  	   return;
					}
			}
	    }
	}
	void findZero2(int array2d2[][]){
		for (int row2 = 0; row2 < array2d2.length; row2++) {	
			for (int column2 = 0; column2 < array2d2[0].length; column2++) {
					if (array2d2[row2][column2]==12) {				
				    System.out.println("R_right("+column2+","+row2+")");
				    return;
					}
			}
		}
	}	
	 void findZero3(int array2d3[][]){
		for (int row3 = 0; row3 < array2d3.length; row3++) {	
			for (int column3 = 0; column3 < array2d3[0].length; column3++) {
					if (array2d3[row3][column3]==5) {			    
	    			System.out.println("R_up("+column3+","+row3+")");
	    			return;
					}
			}
		}
	 }	
	void findZero4(int array2d4[][]){
		for (int row4 = 0; row4 < array2d4.length; row4++) {	
			for (int column4 = 0; column4< array2d4[0].length; column4++) {
				if (array2d4[row4][column4]==11) {
				System.out.println("R_down("+column4+","+row4+")");
				return;
			}
		}
			}
		}
   }
