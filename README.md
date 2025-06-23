# tic-tac-toe
TIC-TAC-TOE game using JAVA.

DESCRIPTION:

This is a simple Tic Tac Toe game developed in Java that runs in the console. It is a two-player game where players take turns to place their symbol (X or O) on a 3x3 board. The first player to align three of their symbols vertically, horizontally, or diagonally wins the game. If the board is filled and no player wins, the game results in a draw.

GAME COMPONENTS               COMPONENT DESCRIPTION

 char b[][] 	        2D character array representing the 3x3 board
 board()	            Initializes the board with empty spaces
 printBoard()	        Displays the current state of the board with separators (`
 player(int k)	      Returns 'X' for odd turns and 'O' for even turns
 checkwin()	          Checks if a player has won by rows, columns, or diagonals
 checkdraw()	        Checks if the board is full without any winner (a draw)
 main()	              Controls the game loop, user input, win/draw logic, and replay option

 HOW TO PLAY?
 
i)  Run the program.
ii) Input the row and column numbers (1–3) to make your move.
iii)Player X and O take turns.
iv) If a player wins or the game draws, you're prompted to play again.

MY LEARNINGS:
I learned the following through this project:

i)   2D Arrays: How to use 2D arrays to represent grids or boards.

ii)  Control Structures: Usage of if, else, for, while loops for logic control.

iii) Functions: Breaking down code into reusable methods for clarity and modularity.

iv)  User Input: How to take input from users using the Scanner class.

v)   Error Handling: How to validate user input and prompt retry on invalid moves.

vi)   Game Loops: Implementation of a continuous game loop and replay functionality.

vii)  Code Debugging: Fixing bugs like scanner resource leak, invalid input errors, etc.

viii) Thinking Logically: Developing logic to check for a win, draw, and alternate player turns.

NOTE:Ensure JDK is installed and javac is configured in your system path to run this project.


~Agrim Gupta
 First-year CSE student @ IIITDM Kancheepuram
