Requirement:
There are N stations (N at least 48) and M (M at least N) spots to place them on two-dimensional space (of any shape you like) representing a one-floor factory. 
(There may be unoccupied spots serving as "holes".) 
The N stations come in F (at least 4) types representing their function. The different types may have different shapes, occupying multiple adjacent spots. 

Implementation:
stations: 64
spots: 100
types(function): circle, square, triangle, diamond
extra: each station will have a randomly generated color



Requirement:
There is a metric representing the benefit (affinity) of placing any two stations A and B near each other based on their Function and distance, 
with possibly different maximum values based on capacity or rate. 
The goal is to maximize total affinity. (For some examples, see ELOPE: https://sid2697.github.io/external_pages/ELOPE.html) 

Implementation:
not sure yet and not worried about it at this point



Requirement:
Each of K parallel tasks solve by (at least in part randomly) swapping or modifying station spots (possibly with holes), 
and occasionally exchanging parts of solutions with others. (This is the main concurrent coordination problem). 
Run the program on a computer with at least 32 cores (and K at least 32). (You can develop with smaller K.) 

Implementation:
not sure yet and not worried about it at this point



Requirement:
The program occasionally (for example twice per second) graphically displays solutions until converged or performs a given number of iterations. Details are up to you.

Implementation:
not sure yet, want to go for 30 fps so you can see a fluid change in the grid but might have to reduce to a way lower number (2fps) for performance. 

