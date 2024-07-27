
public class launchGame {

	public static void main(String[] args) {
		
		 ticTacToe t = new ticTacToe();
         humanPlayer p1 = new humanPlayer("bob",'x');
         humanPlayer p2 = new humanPlayer("tom",'0');
         
         humanPlayer cp ; 
         cp =p1;
         
         while(true) {
        	 System.out.println(cp.name+ " turn ");
             cp.makeMove();
             ticTacToe.dispBoard();
             
             
             if(ticTacToe.checkColWin() || ticTacToe.checkDiagWin() ||ticTacToe.checkRowWin()) {
            	 
            	 System.out.println(cp.name+ " Has Won ");
            	 break;
            	 
             }else {
            	 if(cp == p1) {
            		 cp =p2;
            	 }
            	 else {
            		 cp =p1;
            	 }
             }
  
         }
		 
	}
	
}