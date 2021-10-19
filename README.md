# java-fundamentals

### Lab 1: 
* I Created 3 functions they took about 1 and 30 min hours.
* First function named Pluralize took about 10 min.
* Secound function named flipNHeads which took 15 min.
* Third function named (clock) took 50 min. 
* The remainder time went on prepered the work and run app.

### lab2:
* basiclibrary2 at the main - basiclibrary2/lib/src/main/java/basiclibrary2/Library.java contains the methodes :

method | description
------- | ---------
Rolling Dice | return an array containing the values of the rolls.
containsDuplicates | return true if there is duplicate  and false if there no duplicate for the element insid the array.
averageTest | returns the average of all the values in the array.
lowestAverage | return the array with the lowest average.

* The test for each method inside basiclibrary2/lib/src/test/java/basiclibrary2/LibraryTest.java 

### lab3: 
* basiclibrary2 at the main - basiclibrary2/lib/src/main/java/basiclibrary2/Library.java contains the methodes :

method | description
------- | ---------
analyzingWeather | this method accepts two dimensional array and return the numbers that never saw temperature of type string, by using HashSet and List and make test for this method.
tally | this method accepts a List of Strings representing votes and returns one string to show what got the most votes, i use Map also make test for this method

* The test for each method inside basiclibrary2/lib/src/test/java/basiclibrary2/LibraryTest.java 


### Lab 6 :inheritance
* I created class named Restaurant with an attributes, and one constructor that contain three parameters.
* I created class named Review with an attributes, and one constructor that contain three parameters.
* Inside Restaurant class I use *ArrayList* to hold the reviews for a single restaurant and declare addReview method to add reviews in the ArrayList.
* I Implemented a reasonable toString method for Restaurant and Review classes.
* I created starsAvg() method in Restaurant class to get the average for Restaurant number of stars from reviews number of stars.
#### testing
1. TestRestaurantClass method for Restaurant constructor to check is behaving reasonably also ensure that its toString method is working properly.
2. TestReviewClass method for Review constructor to check is behaving reasonably also ensure that its toString method is working properly.
3. AddReviewAndUpdateToStringTest method for testing the addReview method and the Updated toString .

### Lab 7 :inheritance day 2
* I created class called Shop have method called toString and constructor that contain name, description and price.
* I created place class that hold the review for every class and it's consist on more than one constructor .
* I created theater class have toString method and constructor that contain name.
* theater also have ArrayList to hold the movies.
* declare two methods called addMovie and deleteMovie to update on movie list.
* I made inheritance between Shop,Restaurant and theater with place class.(make place parent for other class).
* i added functionality that specify which movie saw.
* I made test for all functionality.

#### testing 
1. TestShopClass method to make sure that implementing in right way also ensure that its toString method is working properly.
2. TestShopReview method : test if i can add review and implemented correctly.
3. TestRestaurantReview check if review functionality for specific restaurant is right.
4. TestTheaterClass method  to check is behaving reasonably also ensure that its toString method is working properly.
5. TestAddAndDeleteMovie test adding and deleting method for elements in movie list.
6. TestTheaterReview  check if review functionality for specific theater is right .
7. TestTheaterReviewWithMovieSaw method to make sure that at review just for theater user can be included  movie he saw.