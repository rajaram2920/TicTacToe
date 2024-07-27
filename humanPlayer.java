	public class humanPlayer{
	String name;
	char mark;
	
	humanPlayer(String name,char mark){
		this.name = name;
		this.mark=mark;
	}
	
	void makeMove() {
		
		Scanner sc = new Scanner(System.in);
		int row; int col;
		do {
		System.out.println("Enter the row and column ");
		
		 row = sc.nextInt();
		 col = sc.nextInt();
		}while(!isValid(row,col));
		
		ticTacToe.placeMark(row, col, mark);
		
	}
	boolean isValid(int row,int col) {
		
		if(row>=0 && row <=2 && col>=0 && col<=2) {
			
			if(ticTacToe.board[row][col] ==' ') {
				return true;
			}
			
		}
		return false;
	}
}