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



dev outline:

step 0: get github setup so that i can work on this on my laptop and desktop
step 1: draw grid 
step 2: initialize a set of 64 stations
step 3: render stations on grid
step 3.5: render moved stations
step 4: figure out some affinity thing
step 5: implement affinity thing
step 6: after 1 iteration of moving stations to raise affinity score render objects
step 7: change from rendering after every iteration to rendering twice per second (total num iterations still unknown)
step 8: implement mutation (swapping/modifying sattion spots)
step 9: implement occasionally exhanging parts of solution with others (main concurrent problem)

note: 
    all of these steps need to be further broken down into sub-steps
    the overall steps are subject to change and be broken up into smaller steps or the order chnaged


step 0:
    create repo with the 
    
step 1&2:
    a- create a javafx scene that just displays an empty App
    b- render a 10x10 grid with x and y axis labled

step 3:
    a- define the object of the station:
        stationID
        stationColor
        stationShape
        stationLocation
    b- initialize 64 stations with all fields rendomly generated besides groupId
    c- functions needed for stations:
        moveStation - change stationLocation
        adjustColor - changes stationColor
        changeShape - changes stationShape
    d- render stations on grid

step 3.5:
    a- implement a function that randomly moves a random subset of size random(8-16) of the stations by a 1 cell in a random direction
    b- implement a funtion that refreshes the grid to display the new locations of stations
    c- implement a loop that moves the sations then displays then repeats
    d- MAYBE implement that the loop of moving the stations runs at the same time as the refreshGrid funtion(which updates 2 per second)
        note: if fast debug change from 2 per second to 30 per second

step 4:
    uhhhhhh figure out affinity thing. how do i determine if this layout is better than the last layout? i dont even want to think about mutation/exchanging parts yet
        does station object need more variables for affinity?
        I probably need a global varibale for affinity but not sure (if so i want higher = better)
