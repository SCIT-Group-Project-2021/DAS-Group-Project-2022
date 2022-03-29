# DAS-Group-Project-2022
You have been contracted to develop a prototype system for the Norman Manley Airport that will assist the airline 
staff in processing persons who have checked in for their flights during the covid pandemic. The information is
stored for each person are as follows:
 ID#
 Name
 Gender
 FlightNo
 Priority
There is no way of determining the number of persons who will check in daily, so your solution should implement 
an appropriate data structure that can handle this level of uncertainty. Each person has a Priority Level of either
1 or 2 that will indicate the urgency at which they are processed – with 1 being the most urgent.
Processing Requirements
1. Generate a random set of data representing customer arrivals at time t=0, t=1, and t=2. The number of 
arrivals can range from 1 to 6. (Assume single travelers for simplicity)
2. Display an appropriate heading to represent the passing of time and display the data that was generated 
by using the following format: [trn, name, gender, flight, priority]. Each data item is to be placed on a 
newline.
3. Add each person to the list in order of arrival and according to priority level. (note: persons with priority 
1 are to be placed before persons with priority 2. A new priority 1 person is to be placed behind existing 
priority 1 individuals)
4. Display the list to ensure that the order of arrival and priority levels are being maintained. 
5. Produce the following reports from the list:
 Number of level 1 males on each flight
 Number of level 1 females on each flight
 Number of level 2 males on each flight
 Number of level 2 females on each flight
6. Process the list by generating a random number between 3 and 5 that will indicate how many persons to 
remove from the list. Persons are removed from the front of the list and the state of the list is to printed at 
each interval with an appropriate message to indicate the passage of time. The program should terminate 
when the list is empty
