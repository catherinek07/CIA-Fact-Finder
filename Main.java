/* ***********************************************************************
* Catherine Kim
* Assignment 2 - CIA Fact Finder
* Computer Science 30 IB Block 10
* 2020-10-30

* Citations for covid.txt: https://www.worldometers.info/coronavirus/countries-where-coronavirus-has-spread/ as of Oct. 26
* This program is my own work - CK   */

package com.company;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
   //arrays, booleans & integers for displaying top countries in each list, and counters are declared for infant mortality, GDP, population, birth rates, unemployment rates, world ranking, and covid rates! Included are their list positions, country names, and rates.
   public int infantCount, gdpCount, popCount, birthCount, ueCount, rankingCount, covidCount;
   private static boolean infantList, gdpList, popList, birthList, ueList, covidList;
   public static int[] infantPos = new int[225];
   public static String[] countryNameInfant = new String[225];
   public static String[] mortalityRate = new String[225];
   public static int[] gdpPos = new int[230];
   public static String[] countryNameGdp = new String[230];
   public static String[] gdpRate = new String[230];
   public static int[] popPos = new int[237];
   public static String[] countryNamePop = new String[237];
   public static String[] popRate = new String[237];
   public static int[] birthPos = new int[226];
   public static String[] countryNameBirth = new String[226];
   public static String[] birthRate = new String[226];
   public static int[] uePos = new int[217];
   public static String[] countryNameUe = new String[217];
   public static String[] ueRate = new String[217];
   public static int[] rankingPos = new int[25];
   public static String[] countryNameRanking = new String[25];
   public static int[] covidPos = new int[25];
   public static String[] countryNameCovid = new String[25];
   public static String[] covidRate = new String[25];


   //This method is for uploading the text file of the infant mortality list as positions, country names, and rates. This repeats for all six categories!
   public void infantMortality() {
       try {
           String filename = "infant_mortality.txt";
           Scanner infile = new Scanner(new FileInputStream(filename));
           while (infile.hasNext()) {
               infantPos[infantCount] = infile.nextInt();
               countryNameInfant[infantCount] = infile.next();
               mortalityRate[infantCount] = infile.next();
               infantCount += 1;
           }
           infile.close();
       } catch (IOException ex) {
           infantCount = -1;
           ex.printStackTrace();
       }
   }
   //This method displays the top x (infantIndex) countries in the designated category! Repeats for all categories except for world ranking.
   public void infantList(int infantIndex) {
       {
           for (int i = 0; i < infantIndex; i++) {
               System.out.println(infantPos[i] + "    " + countryNameInfant[i] + "    " + mortalityRate[i]);
           }
       }
   }

   //This method returns the rates of each method above. Like above, this is repeated six times for each category! Without this, the rate turns into gibberish.
   public String getRInfant(int result) {
       return mortalityRate[result];
   }
   //The next three methods are the exact same as above but it is for GDP rates
   public void gdp() {
       try {
           String filename = "gdp.txt";
           Scanner infile = new Scanner(new FileInputStream(filename));
           while (infile.hasNext()) {
               gdpPos[gdpCount] = infile.nextInt();
               countryNameGdp[gdpCount] = infile.next();
               gdpRate[gdpCount] = infile.next();
               gdpCount += 1;
           }
           infile.close();
       } catch (IOException ex) {
           gdpCount = -1;
           ex.printStackTrace();
       }
   }

   public void gdpList(int gdpIndex) {
       {
           for (int i = 0; i < gdpIndex; i++) {
               System.out.println(gdpPos[i] + "    " + countryNameGdp[i] + "    " + gdpRate[i]);
           }
       }
   }

   public String getRGdp(int result) {
       return gdpRate[result];
   }

   //The next three methods are the exact same as above but for population rates
   public void population() {
       try {
           String filename = "population.txt";
           Scanner infile = new Scanner(new FileInputStream(filename));
           while (infile.hasNext()) {
               popPos[popCount] = infile.nextInt();
               countryNamePop[popCount] = infile.next();
               popRate[popCount] = infile.next();
               popCount += 1;
           }
           infile.close();
       } catch (IOException ex) {
           popCount = -1;
           ex.printStackTrace();
       }
   }

   public void popList(int popIndex) {
       {
           for (int i = 0; i < popIndex; i++) {
               System.out.println(popPos[i] + "    " + countryNamePop[i] + "    " + popRate[i]);
           }
       }
   }

   public String getRPop(int result) {
       return popRate[result];
   }

   //The next three methods are the exact same as above but for birth rates
   public void birthRate() {
       try {
           String filename = "birth_rate.txt";
           Scanner infile = new Scanner(new FileInputStream(filename));
           while (infile.hasNext()) {
               birthPos[birthCount] = infile.nextInt();
               countryNameBirth[birthCount] = infile.next();
               birthRate[birthCount] = infile.next();
               birthCount += 1;
           }
           infile.close();
       } catch (IOException ex) {
           birthCount = -1;
           ex.printStackTrace();
       }
   }

   public void birthList(int birthIndex) {
       {
           for (int i = 0; i < birthIndex; i++) {
               System.out.println(birthPos[i] + "    " + countryNameBirth[i] + "    " + birthRate[i]);
           }
       }
   }

   public String getRBirth(int result) {
       return birthRate[result];
   }

   //The next three methods are the exact same as above but for unemployment rates
   public void unemploymentRate() {
       try {
           String filename = "unemployment_rate.txt";
           Scanner infile = new Scanner(new FileInputStream(filename));
           while (infile.hasNext()) {
               uePos[ueCount] = infile.nextInt();
               countryNameUe[ueCount] = infile.next();
               ueRate[ueCount] = infile.next();
               ueCount += 1;
           }
           infile.close();
       } catch (IOException ex) {
           ueCount = -1;
           ex.printStackTrace();
       }
   }

   public void ueList(int ueIndex) {
       {
           for (int i = 0; i < ueIndex; i++) {
               System.out.println(uePos[i] + "    " + countryNameUe[i] + "    " + ueRate[i]);
           }
       }
   }

   public String getRUe(int result) {
       return ueRate[result];
   }

   //This method states that the entered country is either part of the top 25 countries of the world or not.
   public void ranking() {
       try {
           String filename = "ranking.txt";
           Scanner infile = new Scanner(new FileInputStream(filename));
           while (infile.hasNext()) {
               rankingPos[rankingCount] = infile.nextInt();
               countryNameRanking[rankingCount] = infile.next();
               rankingCount += 1;
           }
           infile.close();
       } catch (IOException ex) {
           rankingCount = -1;
           ex.printStackTrace();
       }
   }
   //there is no ranking rate here because the ranking out of 25 top countries of the world doesn't have a separate rate!

   //The next three methods are the exact same as above but for covid rates around the world.
   public void covidRanking() {
       try {
           String filename = "covid.txt";
           Scanner infile = new Scanner(new FileInputStream(filename));
           while (infile.hasNext()) {
               covidPos[covidCount] = infile.nextInt();
               countryNameCovid[covidCount] = infile.next();
               covidRate[covidCount] = infile.next();
               covidCount += 1;
           }
           infile.close();
       } catch (IOException ex) {
           covidCount = -1;
           ex.printStackTrace();
       }
   }

   public void covidList(int covidIndex) {
       {
           for (int i = 0; i < covidIndex; i++) {
               System.out.println(covidPos[i] + "    " + countryNameCovid[i] + "    " + covidRate[i]);
           }
       }
   }

   public String getRCovid(int result) {
       return covidRate[result];
   }

 /*
 This is a method for finding where the country is in the list via linear (sequential) search.
 I chose a linear search because while it may not be the fastest, I thought using a linear search with strings would be more efficient than a binary search.
 The list positions are also all in order by rate, so using a bubble sort to resort the list alphabetically would be inefficient.
  */

   public static int linearSearch(String[] countryName, int[] listPos, String target) {
       int found = -1;
       int ind = 0;

       while (ind < countryName.length) {
           if (target.equals(countryName[ind])) {
               found = ind;
               ind = listPos[ind];
           } else {
               ++ind;
           }
       }
       return found;
   }


   public static void main(String[] args) {
       Main cia = new Main();
       //the scanner is set for input
       Scanner input = new Scanner(System.in);
       //target is used to find the desired country and the rate returns the rate of that selected country.
       String target, rate;
       //result and ranking are made to ensure that the country typed in exists in the arrays.
       int result, ranking;
       //methods are called from the CIA fact finder: the textfiles are uploaded and arrays are set!
       cia.infantMortality();
       cia.unemploymentRate();
       cia.gdp();
       cia.birthRate();
       cia.population();
       cia.ranking();
       cia.covidRanking();
       System.out.println("Hello and welcome to Catherine's CIA Fact Finder! My name is AcaCIA and I will be your assistant for today! What is your name?");
       String name = input.nextLine();
       System.out.println("Nice to meet you, " + name + " :)!");
       do {
           System.out.println(name + ", guess a country that is in the top 25 most powerful countries in the world and then learn a cool fact about it!");
           System.out.println("*NOTE*: " + name + ", Capitalization & spelling matter! Uses dashes instead of spaces! NO SPACES! United-States, United-Kingdom, United-Arab-Emirates, 'Korea,South', Netherlands, are some countries you may misspell. ");
           target = input.next();
           //linear search for world ranking declared
           linearSearch(countryNameRanking, rankingPos, target);
           ranking = cia.linearSearch(countryNameRanking, rankingPos, target);
           //the user is told whether or not their guess was correct, but either way, they get a chance to compare their choice of country with the existing lists!
           if (ranking >= 0) {
               System.out.println("Phenomenal guess, " + name + "! " + target + " is at number " + (ranking + 1) + " of the top 25 countries of the world.");
               System.out.println("Press '1' (or any number greater) to find facts about the country or '0' to quit. (" + name + ", I would personally advise you to continue.)");
           } else {
               System.out.print("Nice try, but " + target + " is not one of the top 25 most powerful countries in the world :(. Would you like to look at that country's statistics anyway?");
               System.out.println(" Yes (> 1) or No (0)?");
           }
           //error-handling conventions with a try-catch
           int stats = 0;
           boolean error = true;
           while (error) {
               if (input.hasNextInt())
                   stats= input.nextInt();
               else {
                   System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                   input.next();
                   continue;
               }
               error = false;
           }
           //if the user wants to look at statistics, catching errors
           int choice = 0;
           if (stats > 0) {
               System.out.println("Which fact would you like to know? Birth Rate (1) or Infant Mortality Rate (2) or GDP Rate (3) or Unemployment Rate (4) or Population Rate (5) or Covid Rate (6)?");
               boolean error1 = true;
               while (error1) {
                   if (input.hasNextInt())
                       choice = input.nextInt();
                   else {
                       System.out.println("Hey, that's not a number, " + name + ". Try again. Enter a number from 1-6.");
                       input.next();
                       continue;
                   }
                   error1 = false;
               }
               while (choice <= 0 || choice > 6) {
                   System.out.println("Hey, " + name + "! Enter a valid number >:(.");
                   choice = 0;
                   boolean errorOut = true;
                   while (errorOut) {
                       if (input.hasNextInt())
                           choice = input.nextInt();
                       else {
                           System.out.println("Hey, that's not a number, " + name + ". Try again. Enter a number from 1-6.");
                           input.next();
                           continue;
                       }
                       errorOut = false;
                   }
               }
               if (choice == 1) {
                   //linear search for birth rate declared
                   linearSearch(countryNameBirth, birthPos, target);
                   result = cia.linearSearch(countryNameBirth, birthPos, target);
                   if (result >= 0) {
                       rate = cia.getRBirth(result);
                       System.out.println(target + " is at number " + (result + 1) + " on the list with a rate of " + rate + ".");
                   } else {
                       System.out.println("Sorry, " + target + " is not in the list.");
                   }
                   //looks at top x countries in this category, limited to the number of entries in this list
                   System.out.println(name + ", would you like to look some top countries of this category? Yes (> 1) or No (0)?");
                   int list = 0;
                   boolean errorList = true;
                   while (errorList) {
                       if (input.hasNextInt())
                           list = input.nextInt();
                       else {
                           System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                           input.next();
                           continue;
                       }
                       errorList = false;
                   }
                   if (list >= 1) {
                       System.out.println("Great choice, " + name + "! I would've picked that one too.");
                       birthList = true;
                       System.out.println("Choose how many countries you would like to see, less than or equal to 226.");
                       int birthIndex = 0;
                       boolean errorIndex = true;
                       while (errorIndex) {
                           if (input.hasNextInt())
                               birthIndex = input.nextInt();
                           else {
                               System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                               input.next();
                               continue;
                           }
                           errorIndex = false;
                       }
                       while (birthIndex > 226 || birthIndex <= 0) {
                           System.out.println("Hey, " + name + "! Enter a valid number >:(.");
                           birthIndex = 0;
                           boolean errorOut = true;
                           while (errorOut) {
                               if (input.hasNextInt())
                                   birthIndex = input.nextInt();
                               else {
                                   System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                                   input.next();
                                   continue;
                               }
                               errorOut = false;
                           }
                       }
                       cia.birthList(birthIndex);
                       System.out.println("Press 0 to quit or any other key to continue, " + name + "!");
                   } else if (list == 0) {
                       System.out.println("Alright...goodbye, " + name + "! Hope to see you again!");
                       break;
                   } else {
                       System.out.println("Oh...okay then, " + name + ", move right along... Press '0' to quit or any other key to continue.");
                   }
               } else if (choice == 2) {
                   System.out.println("Ooooh, a fine choice indeed, " + name + "! That's a good one.");
                   //linear search for infant mortality declared
                   linearSearch(countryNameInfant, infantPos, target);
                   result = cia.linearSearch(countryNameInfant, infantPos, target);
                   if (result >= 0) {
                       rate = cia.getRInfant(result);
                       System.out.println(target + " is at number " + (result + 1) + " on the list with a rate of " + rate + ".");
                   } else {
                       System.out.println("Sorry, " + target + " is not in the list.");
                   }
                   //looks at top x countries in this category, limited to the number of entries in this list
                   System.out.println("Would you like to look at some top countries of this category? Yes (> 1) or No (0)?");
                   int list = 0;
                   boolean errorList = true;
                   while (errorList) {
                       if (input.hasNextInt())
                           list = input.nextInt();
                       else {
                           System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                           input.next();
                           continue;
                       }
                       errorList = false;
                   }
                   if (list >= 1) {
                       infantList = true;
                       System.out.println("Choose how many countries you would like to see, less than or equal to 225.");
                       int infantIndex = 0;
                       boolean errorIndex = true;
                       while (errorIndex) {
                           if (input.hasNextInt())
                               infantIndex = input.nextInt();
                           else {
                               System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                               input.next();
                               continue;
                           }
                           errorIndex = false;
                       }
                       while (infantIndex > 225 || infantIndex <= 0) {
                           System.out.println("Hey, " + name + "! Enter a valid number >:(.");
                           infantIndex = 0;
                           boolean errorOut = true;
                           while (errorOut) {
                               if (input.hasNextInt())
                                   infantIndex = input.nextInt();
                               else {
                                   System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                                   input.next();
                                   continue;
                               }
                               errorOut = false;
                           }
                       }
                       cia.infantList(infantIndex);
                       System.out.println("Press 0 to quit or any other key to continue, " + name + "!");
                   } else if (list == 0) {
                       System.out.println("Alright...goodbye, " + name + "! Hope to see you again!");
                       break;
                   } else {
                       System.out.println("Oh...okay then, " + name + ", move right along... Press '0' to quit or any other key to continue.");
                   }
               } else if (choice == 3) {
                   System.out.println("Pretty sweet decision, " + name + "! Get those dollars $$$.");
                   //linear search for GDP declared
                   linearSearch(countryNameGdp, gdpPos, target);
                   result = cia.linearSearch(countryNameGdp, gdpPos, target);
                   if (result >= 0) {
                       rate = cia.getRGdp(result);
                       System.out.println(target + " is at number " + (result + 1) + " on the list with a rate of " + rate + ".");
                   } else {
                       System.out.println("Sorry, " + target + " is not in the list.");
                   }
                   //looks at top x countries in this category, limited to the number of entries in this list
                   System.out.println("Would you like to look at some top countries of this category? Yes (> 1) or No (0)?");
                   int list = 0;
                   boolean errorList = true;
                   while (errorList) {
                       if (input.hasNextInt())
                           list = input.nextInt();
                       else {
                           System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                           input.next();
                           continue;
                       }
                       errorList = false;
                   }
                   if (list >= 1) {
                       gdpList = true;
                       System.out.println("Choose how many countries you would like to see, less than or equal to 230.");
                       int gdpIndex = 0;
                       boolean errorIndex = true;
                       while (errorIndex) {
                           if (input.hasNextInt())
                               gdpIndex = input.nextInt();
                           else {
                               System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                               input.next();
                               continue;
                           }
                           errorIndex = false;
                       }
                       while (gdpIndex > 230 || gdpIndex <= 0) {
                           System.out.println("Hey, " + name + "! Enter a valid number >:(.");
                           gdpIndex = 0;
                           boolean errorOut = true;
                           while (errorOut) {
                               if (input.hasNextInt())
                                   gdpIndex = input.nextInt();
                               else {
                                   System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                                   input.next();
                                   continue;
                               }
                               errorOut = false;
                           }
                       }
                       cia.gdpList(gdpIndex);
                       System.out.println("Press 0 to quit or any other key to continue, " + name + "!");
                   } else if (list == 0) {
                       System.out.println("Alright...goodbye, " + name + "! Hope to see you again!");
                       break;
                   } else {
                       System.out.println("Oh...okay then, " + name + ", move right along... Press '0' to quit or any other key to continue.");
                   }
               } else if (choice == 4) {
                   System.out.println("I like your decision, " + name + "! Luckily, I am employed- thanks to you using this fact finder!.");
                   //linear search for unemployment rate declared
                   linearSearch(countryNameUe, uePos, target);
                   result = cia.linearSearch(countryNameUe, uePos, target);
                   if (result >= 0) {
                       rate = cia.getRUe(result);
                       System.out.println(target + " is at number " + (result + 1) + " on the list with a rate of " + rate + ".");
                   } else {
                       System.out.println("Sorry, " + target + " is not in the list.");
                   }
                   //looks at top x countries in this category, limited to the number of entries in this list
                   System.out.println("Would you like to look at some top countries of this category? Yes (> 1) or No (0)?");
                   int list = 0;
                   boolean errorList = true;
                   while (errorList) {
                       if (input.hasNextInt())
                           list = input.nextInt();
                       else {
                           System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                           input.next();
                           continue;
                       }
                       errorList = false;
                   }
                   if (list >= 1) {
                       ueList = true;
                       System.out.println("Choose how many countries you would like to see, less than or equal to 217.");
                       int ueIndex = 0;
                       boolean errorIndex = true;
                       while (errorIndex) {
                           if (input.hasNextInt())
                               ueIndex = input.nextInt();
                           else {
                               System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                               input.next();
                               continue;
                           }
                           errorIndex = false;
                       }
                       while (ueIndex > 217 || ueIndex <= 0) {
                           System.out.println("Hey, " + name + "! Enter a valid number >:(.");
                           ueIndex = 0;
                           boolean errorOut = true;
                           while (errorOut) {
                               if (input.hasNextInt())
                                   ueIndex = input.nextInt();
                               else {
                                   System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                                   input.next();
                                   continue;
                               }
                               errorOut = false;
                           }
                       }
                       cia.ueList(ueIndex);
                       System.out.println("Press 0 to quit or any other key to continue, " + name + "!");
                   } else if (list == 0) {
                       System.out.println("Alright...goodbye, " + name + "! Hope to see you again!");
                       break;
                   } else {
                       System.out.println("Oh...okay then, " + name + ", move right along... Press '0' to quit or any other key to continue.");
                   }
               } else if (choice == 5) {
                   System.out.println("A wise decision, " + name + "! People are quite important.");
                   //linear search for population rate declared
                   linearSearch(countryNamePop, popPos, target);
                   result = cia.linearSearch(countryNamePop, popPos, target);
                   if (result >= 0) {
                       rate = cia.getRPop(result);
                       System.out.println(target + " is at number " + (result + 1) + " on the list with a rate of " + rate + ".");
                   } else {
                       System.out.println("Sorry, " + target + " is not in the list.");
                   }
                   //looks at top x countries in this category, limited to the number of entries in this list
                   System.out.println("Would you like to look at some top countries of this category? Yes (> 1) or No (0)?");
                   int list = 0;
                   boolean errorList = true;
                   while (errorList) {
                       if (input.hasNextInt())
                           list = input.nextInt();
                       else {
                           System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                           input.next();
                           continue;
                       }
                       errorList = false;
                   }
                   if (list >= 1) {
                       popList = true;
                       System.out.println("Choose how many countries you would like to see, less than or equal to 237.");
                       int popIndex = 0;
                       boolean errorIndex = true;
                       while (errorIndex) {
                           if (input.hasNextInt())
                               popIndex = input.nextInt();
                           else {
                               System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                               input.next();
                               continue;
                           }
                           errorIndex = false;
                       }
                       while (popIndex > 237 || popIndex <= 0) {
                           System.out.println("Hey, " + name + "! Enter a valid number >:(.");
                           popIndex = 0;
                           boolean errorOut = true;
                           while (errorOut) {
                               if (input.hasNextInt())
                                   popIndex = input.nextInt();
                               else {
                                   System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                                   input.next();
                                   continue;
                               }
                               errorOut = false;
                           }
                       }
                       cia.popList(popIndex);
                       System.out.println("Press 0 to quit or any other key to continue, " + name + "!");
                   } else if (list == 0) {
                       System.out.println("Alright...goodbye, " + name + "! Hope to see you again!");
                       break;
                   } else {
                       System.out.println("Oh...okay then, " + name + ", move right along... Press '0' to quit or any other key to continue.");
                   }
               } else if (choice == 6) {
                   System.out.println("AYYYY, " + name + "! This one is my favourite- truly relevant today!");
                   //linear search for covid rate declared
                   linearSearch(countryNameCovid, covidPos, target);
                   result = cia.linearSearch(countryNameCovid, covidPos, target);
                   if (result >= 0) {
                       rate = cia.getRCovid(result);
                       System.out.println(target + " is at number " + (result + 1) + " on the list with a rate of " + rate + ".");
                   } else {
                       System.out.println("Sorry, " + target + " is not in the list.");
                   }
                   //looks at top x countries in this category, limited to the number of entries in this list
                   System.out.println("Would you like to look at some top countries of this category? Yes (> 1) or No (0)?");
                   int list = 0;
                   boolean errorList = true;
                   while (errorList) {
                       if (input.hasNextInt())
                           list = input.nextInt();
                       else {
                           System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                           input.next();
                           continue;
                       }
                       errorList = false;
                   }
                   if (list >= 1) {
                       covidList = true;
                       System.out.println("Choose how many countries you would like to see, less than or equal to 25.");
                       int covidIndex = 0;
                       boolean errorIndex = true;
                       while (errorIndex) {
                           if (input.hasNextInt())
                               covidIndex = input.nextInt();
                           else {
                               System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                               input.next();
                               continue;
                           }
                           errorIndex = false;
                       }
                       while (covidIndex > 25 || covidIndex <= 0) {
                           System.out.println("Hey, " + name + "! Enter a valid number >:(.");
                           covidIndex = 0;
                           boolean errorOut = true;
                           while (errorOut) {
                               if (input.hasNextInt())
                                   covidIndex = input.nextInt();
                               else {
                                   System.out.println("Hey, that's not a number, " + name + ". Try again. Yes (>1) or No (0)?");
                                   input.next();
                                   continue;
                               }
                               errorOut = false;
                           }
                       }
                       cia.covidList(covidIndex);
                       System.out.println("Press 0 to quit or any other key to continue, " + name + "!");
                   } else if (list == 0) {
                       System.out.println("Alright...");
                       break;
                   } else {
                       System.out.println("Oh...okay then, " + name + ", move right along... Press '0' to quit or any other key to continue.");
                   }
               } else {
                   System.out.print("Hey... " + name + ", that's an invalid number and you know it!");
               }
           }else {
               System.out.println("Alright...");
               break;
           }
       }while (!(input.next().equals("0")));
       System.out.println("Goodbye, " + name + "! Hope to see you again!");
       input.close();
   }
}





