# Data-for-social-good

Introduction
MLB Historical Success Analysis
The MLB Historical Success Analysis program uses historical baseball data to compare the success of different Major League Baseball franchises. The program analyzes team wins, losses, World Series championships, and winning percentages to help users understand which franchises have been the most successful throughout baseball history.
Using Java, object-oriented programming, arrays, loops, and conditional statements, the program organizes and analyzes baseball statistics. It identifies the franchise with the most World Series championships, finds the team with the highest winning percentage, and displays information about MLB franchises.
The purpose of this project is to make historical baseball statistics easier to understand and compare.

User Story
As a baseball fan,
I want to compare the historical performance of MLB franchises using wins, losses, World Series championships, and winning percentages,
so that I can understand which teams have been the most successful throughout baseball history.

Dataset
Dataset: Lahman Baseball Database
The Lahman Baseball Database contains historical baseball statistics dating back to 1871. This project uses historical team and franchise information to compare the success of different MLB teams.
Columns Used
name (String): The name of the MLB franchise.
W (int): The total number of wins.
L (int): The total number of losses.
titles (int): The number of World Series championships won by a franchise.
percentage (double): The team’s winning percentage.
Dataset Files
Teams.txt: Contains historical team statistics, including wins and losses.
TeamsFranchises.txt: Contains franchise identification and names.
SeriesPost.txt: Contains postseason series information used to identify championships.
Why This Dataset?
This dataset was chosen because it provides historical baseball information that allows users to compare franchises across different seasons. It helps turn raw statistics into useful information about the history of Major League Baseball.

UML Diagram
The UML diagram shows the main classes used in the project, their attributes, constructors, methods, and relationships.
Upload the UML diagram image to the GitHub repository and insert it below.

Object-Oriented Programming
The project uses Java classes to organize the baseball data and its analysis.
Franchise: Represents an MLB franchise and stores its name, wins, losses, World Series titles, and winning percentage.
UserStory: Organizes the information needed to analyze and compare the franchises.
DataRunner: Runs the program, creates objects, calls methods, and displays the results.
The program uses private instance variables, constructors, and methods to organize the data.
Constructors
The project uses two types of constructors:
No-argument constructor: Creates an object using default values.
Parameterized constructor: Creates an object using specific franchise information, such as its name, wins, losses, and championships.

One-Dimensional Arrays
The program uses multiple one-dimensional arrays to store and organize baseball statistics.
Array
Data Type
Purpose
franchiseNames
String[]
Stores franchise names
wins
int[]
Stores total wins
losses
int[]
Stores total losses
titles
int[]
Stores World Series championships
percentages
double[]
Stores winning percentages

The arrays keep the information organized so that each franchise’s statistics can be compared using matching indexes.

Methods and Algorithms
The program uses methods, loops, and conditional statements to analyze the dataset.
getMostWorldSeriesTitles(): Finds the franchise with the most World Series championships.
getBestWinningPercentage(): Finds the franchise with the highest winning percentage.
getAllFranchises(): Displays information about all MLB franchises.
toString(): Returns general information about the dataset, including the number of franchises stored.
The program uses loops to go through the arrays and if statements to compare statistics and identify the best-performing franchises.

Code Documentation
Comments are included throughout the program to explain the purpose of important methods and code segments.
Preconditions
The arrays contain valid data.
Corresponding franchise statistics are stored at matching indexes.
The arrays contain information for the franchises being analyzed.
Postconditions
The methods return or display the requested information.
The original dataset remains unchanged during the analysis.
The program identifies the franchises with the highest championship count and winning percentage.

Project Purpose
The purpose of the MLB Historical Success Analysis program is to help baseball fans understand and compare the historical success of different MLB franchises. By organizing baseball statistics into arrays and using algorithms to analyze the data, the program turns raw information into useful results that users can easily understand.
