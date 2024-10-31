# Hangman Game Project

**Version:** 1.0

## Project Overview

This Hangman game is a Java-based desktop application that implements the classic word-guessing game. The project consists of three main classes: `GameWindow`, `Menu`, and `Hangman`.

## Key Features:

- Graphical User Interface (GUI) using Java Swing
- Random word selection from a predefined list
- Interactive keyboard for letter selection
- Visual feedback for correct and incorrect guesses
- Game restart option

## Important Methods

### 1. `startGame()` in `GameWindow` class:

Initializes the game by selecting a random word and setting up the GUI components.

### 2. `actionPerformed()` in `GameWindow` class:

Handles user input, updates the game state, and checks for win/lose conditions.

### 3. `addComponent()` in `Menu` class:

Sets up the main menu GUI with play, instructions, and exit options.

## Code Explanation

The project is structured into three main classes:

### 1. `GameWindow` class:

- Extends `JFrame` and implements `ActionListener`
- Manages the main game logic and GUI
- Handles letter guessing and word display

### 2. `Menu` class:

- Extends `JFrame` and implements `ActionListener`
- Creates the initial menu interface
- Provides options to start the game, view instructions, or exit

### 3. `Hangman` class:

- Contains the main method to launch the application
- Initializes the `Menu` class to start the program

## Key Points

- The game uses a predefined list of country names as words to guess
- Random word selection ensures variety in gameplay
- The GUI is built using Java Swing components for cross-platform compatibility
- The project demonstrates the use of event handling in Java
- Object-oriented principles are applied in the design of the classes

This Hangman game project serves as an excellent example of how to create a simple yet engaging game using Java, showcasing GUI development, event handling, and basic game logic implementation.

