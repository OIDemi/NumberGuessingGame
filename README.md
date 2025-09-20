# Number Guessing Game

## Description
A simple console-based Java game where the computer picks a random number and you try to guess it. The game provides hints (too high/too low) until you guess correctly.

## Features
- Random number generation
- Input validation for non-numeric entries
- Tracks the number of attempts

## Project Structure
- `src/Main.java` — application entry point
- `src/ConsoleUI.java` — user input/output handling
- `src/GameLogic.java` — game rules and guess evaluation
- `src/RandomNumberGenerator.java` — random number generation

## How to run

### Command line
1. Compile:
   ```bash
   javac -d out src/*.java
   ```
2. Run:
   ```bash
   java -cp out Main
   ```

### IntelliJ IDEA (optional)
- Open the project in IntelliJ, ensure a JDK is set, then right-click `Main.java` and select “Run Main”.
