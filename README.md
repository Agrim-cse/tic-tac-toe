# 🎮 Tic-Tac-Toe Game in Java

A *simple console-based Tic-Tac-Toe game* developed in Java for two players. Players take turns placing their symbol (*X* or *O) on a 3×3 board. The first player to align three of their symbols **vertically, **horizontally, or **diagonally* wins. If the board fills without a winner, the game ends in a *draw*.

---

## 📋 Description

This project demonstrates fundamental concepts of programming with Java, such as 2D arrays, control structures, user input handling, and basic game logic.

---

## 🧩 Game Components

| Component        | Description |
|------------------|-------------|
| char b[][]     | 2D character array representing the 3x3 board |
| board()        | Initializes the board with empty spaces |
| printBoard()   | Displays the current board state with formatting |
| player(int k)  | Returns 'X' for odd turns and 'O' for even turns |
| checkwin()     | Checks rows, columns, and diagonals for a win |
| checkdraw()    | Determines if the board is full without a winner |
| main()         | Controls the game loop, user input, win/draw logic, and replay option |

---

## 🕹 How to Play

1. Run the program.
2. Enter the row and column numbers (1 to 3) to place your symbol.
3. Players take alternate turns.
4. The game ends when:
   - A player wins (3 in a row), or
   - All cells are filled (draw).
5. After the result, you'll be asked if you want to play again.

---

## 💡 My Learnings

Through this project, I learned the following key concepts:

- ✅ *2D Arrays* – Representing grids using arrays.
- ✅ *Control Structures* – Using if, else, for, and while loops effectively.
- ✅ *Functions/Methods* – Writing clean, modular, and reusable code.
- ✅ *User Input* – Using Scanner to take dynamic input from users.
- ✅ *Error Handling* – Validating user input and managing invalid moves.
- ✅ *Game Loops* – Implementing continuous play and replay functionality.
- ✅ *Debugging Skills* – Fixing issues like scanner leaks and invalid indexes.
- ✅ *Logical Thinking* – Creating win/draw logic and handling alternating turns.

---

## ⚙ Requirements

- Java JDK 17 (or later)
- IDE or text editor (e.g., VS Code)
- Terminal/Command Prompt

Make sure Java is installed and javac is properly configured in your system path.

---

## 🚀 Run the Program

```bash
javac TicTacToe.java
java TicTacToe
