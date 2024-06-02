Lesson01
https://www.keybr.com
https://www.typing.academy

SDET:
Software Development Engineer in Test
Test Engineer
QA Engineer
Tester
--------

Types of Applications
-mobile --> Zoom
-desk top --> adobe, excel
-web --> zoom, amazon, target

ALGORITHMS
-set of instructions with code implementations

PSEDOCODE
- Like Algorithm but without a code, just a procedure
--------
Example of PSEDOCODE
Send a text meassage to our best friend John via Discord
- get on the discord
- Click on John's profile/name/icon
- select text option
- make sure you are on the text field
- type your beatufuil message
- click/hit/tap send button


--------

Test Case

--------
Bubble sort - For small amount of data
35,5,50, 2, 88, 4, 100, 1, 300, 12
5,35,2,50,4,88,1,100,12,300
5,2,35,4,50,1,88,12,100,300
2,5,4,35,1,50,12,88,100,300
2,4,5,1,35,12,50,88,100,300
2,4,1,5,12,35,50,88,100,300
2,1,4,5,12,35,50,88,100,300
1,2,4,5,12,35,50,88,100,300

--------
Example (Bubble sort)
5,18,97,77,14,6,100,50,29,500
5,18,77,97,6,14,50,100,29,500
5,18,77,6,97,14,50,29,100,500
5,18,6,77,14,97,29,50,100,500
5,6,18,14,77,29,97,50,100,500
5,6,14,18,29,77,50,97,100,500
5,6,14,18,29,50,77,97,100,500

-------
Merge Sort
By group deviding and for Huge amount of data

Lesson02
keyboard shortcuts:

    command + c > copy
            + v > paste
            + z > un-do
            + a > select all

alt+tab > switch btwn apps
If something not working, so make screenshot

file extension:
.pdf
.txt
.png
.jpeg
.
.java

-------
Java has 2 different types of erro.

-Compile Time Error >> syntax errors, typos
-Run Time Error >>  logical mistakes

space between codes is white space
When type any mathematics impression after text will be attached to text
/*
Text ignored
*/

() Parenthesis
------------------------------
          DATA



Lesson03
{} Scope Brackets
; Semi-column

Main class (method) is the fundament

Classes are bulding blocks of project

frame is the project and structure of the project

compile error - while structure code transformate to the byte code

Re-assignment changing the value of existing variable

//Common rules / practices for variable naming
// -you can use _ and $ in naming
int money_ = 9;
int money$ = 9;
// -You can use numbers
int money1 = 9;
// -You can start with numbers

        // -You cannot use java keywords
        //  int void =7;

        // You cannot use same variable name multiple times in the same scope
        // -if you are using multiple words in the naming,
           //-start with lower case for the first word abd other words should start with uppercase (camelCase)
               //-start with Upper case for the first word abd other words should start with uppercase (PascalCase)




_____________________________________________________________________
Primitive Data Types

-8 Different  types
Whole Numbers
-byte
-short
-int
-long

    Decimal
    -float (use of f required)
    -double (use of d still need)

    -boolean (True or False)

    -char (Single character)

Lesson04
int n1 =3, n2=6, n3=3, n4=12;
short sh = 4, sh2=9, sh3, sh4=8;

/**
* -java reads / execute code from tope to bottom, from left to tight
* - it will do calculation first and assign the result to the left/variable
*/

Math operations:
+,-,*,/,% (Modulus)

Lesson05
TeamBuilding

Lesson06
Order of Operations - PEMDAS - Operator Precedence

>> - or + (from left to right)

========================

Assignment Operator

= >> giving / assigning a value to variable
+= >> addition and assigning together

a=2;
b=7;
a=a+b; >> a+=b

+=
-=
*=
/=
%=

========================

Numeric Promotion


int car = 3;

long account = 2

long result = car + account;

-------

double tomatoes = 4.5;

double result = car * tomatoes;
------

byte b1 = 9;

byte b2 =8;

byte r = b1 + b2 // compiletype error
int r = bi + b2

double can hold long,int
long can hold int, short

====================

Casting - converting one data type to another;

datatype naming = value;

int apple = 11;

long apple2= apple; // It is okay

short number = apple; // Not okay



- implicit casting >>> done by java >>> converting from smaller data type to bigger
- explicit casting >>> done by user >>> converting larger data type to smaller data type


Lesson07
SoftSkills

Lesson08
--Increment and Decrement operators ----------- Urinary operators ----
++    --
*using increment or decrement operators, your value will be increased or decreased by one;

________- PRE - Increment / Decrement_________

int studentNumber = 25;
int count = stundetNumber + 10;
++studentNumber;

int bucket = studentNumber + 10;
-POST - Increment / Decrement



_________Logical Negation ____________

Logical Negation >>> ! (Exclamation mark)
>> ! make boolean value to it's opposite

boolean bool = true;
!bool; >>>> false

//reassignment

bool = true;

bool = !true;

boolean isChair = !bool;


_________Comparison Operators ____________

== >> equal >> it will check if left side is same/NOT as right side of this operators
5==5 >> True

if same - return true, if not - return false

5==6 >> false

=============
>Greater than symbol

------------
<Less than symbol

=============
>= Greater than or equal than symbol

------------
<= Less than or equal than symbol

=============
!= >>> not equal operator

Lesson 09

AND OR Logical Comparison Operators

&&  || (pipes)

===============Scanner and String ===================


------ String -----

Library Class
String name = "Hello";
name >>> "Hello"

String name = "Techtorial";
System.out.println(name.charAt(100);    -  Run time error

Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 100 out of bounds for length 27
at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
at java.base/java.lang.String.checkIndex(String.java:4881)
at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
at java.base/java.lang.String.charAt(String.java:1582)
at String_Scanne_Practice.Practice1.main(Practice1.java:25)



-------Scanner -------

import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.println("Please enter your name");

        String valueFromConsole = scanner.nextLine();
        System.out.println(valueFromConsole + "<<<<<<<<");

Lesson 10

==========String =========

String immutable >> it will not change unless reassigned.

String name = "Water";

String name1 = new String ();

name >> water
name1 >> blank, null
** 'new' is a keyword to create a new object in java.

String name2 = new Strng ("Saturday");
name2 >> Satrurday

String name3 = new String ();

name 3 = "**B-l-u-e***";
String name3 = "Text";

String str2 = "\"abrakadabra\"";

*String has indexing
>> Index:

Saturday
01234567 <<< index start from '0'

*Concatenation  >> attaching string (some value) to another string

String str3 = "nice";

str3 = str3 + "is a adjective" + 100 + true;


==========String methods=========
// concatenation
// concat() >> method / function

str3.concat("isCorrect");
System.out.println(str3);

        str3 = str3.concat("isCorrect");
        System.out.println(str3);
        System.out.println("----------------");

        String flower = new String ("Rose");
        flower = flower.concat(" is mostly red");
        System.out.println(flower.concat("bla bla bla"));

=========Scanner===========

Scanner dataTaker = new Scanner(System.in);

String name = "Oleksandr";
System.out.println(name);
System.out.println("Please enter name");
Scanner dataTaker = new Scanner(System.in);
name = dataTaker.nextLine();// >> it will read entire line from console
System.out.println(name + "<<<<<<<");

String s2 = dataTaker.next(); // next function will read string to very first space
// New York, so will be only "New"

int currentAge = dataTaker.nextInt();

char letter1_ = scanner.nextLine().charAt(0);
System.out.println("Your first letter of the drink is >>> " + letter1_);

boolean b = scanner.nextBoolean();

public static void main(String[] args) {
Body of the main method / Scope of the main method

    }

char c = device.charAt(24);
System.out.println(c);

device = "microphone";
int indexOfH = device.indexOf('h');
System.out.println(indexOfH);
int i = device.indexOf("phone");
System.out.println(i);


Lesson10

methods of String()
- concact() Can add more new String to existing
  -Returns-
  charAt() >> based on given index, it returns a char
  lenghth() >> returns amounts of chars from string
  indexOf() >> return index of first matching char from string





// equals
System.out.println("----------Equal Method---------");

        String veggie = "cucumber";
        String fruit = "strawberry";
        System.out.println(veggie.equals(fruit));


/*
when you use .equals() method with string, it will compare string values
when you use == with or any other object comparison, it will compare
location of objects in memory
*/

System.out.println("------------Contains--------------");

//contains

boolean result5 = quote.contains(" ");
System.out.println(result5);
boolean result6 = quote.contains("do");

//toUpperCase

        quote = quote.toUpperCase();
        System.out.println(quote);

        quote = quote.toLowerCase();
        System.out.println(quote);

//startsWith() >> it will check if given string starts with given 'char/char sequence
//it returns true / false
boolean result = quote.startsWith("just");
System.out.println(result);
boolean result2 = quote.startsWith("j");
System.out.println(result2);
boolean result3 = quote.startsWith("just do it");
System.out.println(result3);

//endsWith()
boolean result4 = quote.endsWith("it");
System.out.println(result4);
System.out.println(quote.endsWith("just do it!"));




	String name1 ="sam"; // go to stack and keep here
	String name2 ="sam"; // go to stack and keep here
	
	String name3 = new String("sam"); // going to heap
	String name4 = new String("sam"); // going to heap and replace name3
	
	equals() comparing values;

//equalsIgnoreCase ();
String drink = "coffee";
System.out.println(drink.equalsIgnoreCase("CoffEE"));
String cookie = "coffEe";
System.out.println(cookie.equals(drink)); // False
System.out.println(drink.toLowerCase().equals(cookie.toLowerCase())); // True
System.out.println(cookie.equalsIgnoreCase(drink)); // True

//substring()
// it will take one or two index numbers, it will return partial string from given index

        // techtorial >> substring (indexNumber) >> substring(4) >> torial
		// return type of the substring is 'string'
		
		String school = "Techtorial";
        // cutting string from 't'
        String part1 = school.substring(4);
        System.out.println(part1);
Lesson12

String Pool

equals method is comparing values of sring objects
== >> it will compare location of object / if objects are pointing to same location in the memory.

String str5 = new String ("pinkish)






//replace() >> it will replace given char / string with new char / string
String color = "orange";
String replace = color.replace('r', 'R');
System.out.println(replace);
color = color.replace('r', 'R');
System.out.println(color);
color = color.replace('o', '$');
System.out.println(color);

       color =  color.replace("e", "**");
        System.out.println(color);
       color = color.replace("###", "----");
        System.out.println(color + "<<<<<");


//Trim() >> it will remove leading and ending spaces from string



-------------------If Statement ---------------------------

if (booleanCondition){.......coding....}

if (5>4) {"Hello THERE"}
if (5>10) {"Hello THERE"}

========Task=========
Get a number user between 1 to 5 inclusive
1-> print out >> your day is monday
.......
......
......

Lesson 13

String methods:

replace(); > replace ('h', 't'); > replace ("hi", "$$")
trim(); > remove begging and ending spaces
substring(); > sustring(4); substring(2,10) cutting of the text


==================
If Statement :
syntax >>> if (comdition){coding}

Use scanner to get first letter of a day.

when that letter is >> M >> It is Monday
........
S>> It is Saturday or Sunday
Any other letter than above>>There is no such a day!

}else{


	+++++++++++++++
	Find out if your house number is even or odd


}else if(){}

	if (T/F){CODE}
	
	String str = "Chicago";
        if(str.equalsIgnoreCase("CHICAGO"))
            System.out.println("It is a Windy City");
        else System.out.println("Come to visit Chicago");
        System.out.println("-------------");
		
		ONLY first sout after statement will be work with
		
--------------------------

NESTED IF
if(condition){
codding
if (condition{
codding
}

}

public static void main(String[] args) {
/**
* visit
* if state is IL
* >> city
* if city is >>Des Plaines >> We are here
* otherwize >> "Wrong Location"
* if state is not IL:
* >> You are in DIFFERENT STATE
*/
String state = "IL", city = "Chicago";
if(state.equalsIgnoreCase("IL")){
System.out.println("Correct");
if (city.equalsIgnoreCase("Des Plaines")){
System.out.println("We are here");
} else {
System.out.println("Wrong Location");
}
}
}
}
  
Lesson04
Today's plan:

If Statement

Ternary Operator

Switch statement

+++++++++++++++++++++++++++++++++++

Refresh

If statement
-if(conditional check){}

Else statement

can be used with if
can be used with else if()
* else statement does not take any conditional check, because it is
  attached to either if or else if statement
  if(boolean){
  } else {
  }

Else if Statement

if (booleanCond1){
} else if (condition2){

} else if (condition3){
} else{

Nested version of If/Else/Else If
* creating if statement that contains another if/else or else if statement
  if (boolean ){
  coding
  if(boolean){
  coding

}else {
coding
if(boolean){
}
}
Curcly Brackets



-------------------------------------------

Retirement

calculcate age of person based on his/her DOB

65 and up >> good >> an retire >> can retire

55-64 >>   ok > need to pay 20k

or >> you have to wait for another 30 years.

-----------------------------------------------

Ternary operator

/*
if your name is Jake, will print >> "your name is Jake"
otherwise >> "you are not Jake"
*/
String name = "Jake";
if(name.equalsIgnoreCase("Jake")){
System.out.println("Your name is Jake");
} else {
System.out.println("your name isnot Jake");
}
System.out.println("------------------------");
/// implementing above if condition with TERNARY

        String result = name.equalsIgnoreCase("JAKE") ? "your name is Jake" : "You are not Jake";
        System.out.println(result);
        System.out.println("------------------------");

        double myMoney = 10, $car = 20;

        String result2 = myMoney >= $car ? "You can Buy that car " : "Need more money";
        System.out.println("I am buying a car" + result2);
        System.out.println("------------------------");
        double result3 = myMoney >= $car ? myMoney + 1000 : myMoney - 1000;
        System.out.println(result3);

//        myMoney>= $car ? "Have enough money" : (myMoney - 1000)    - you cant store result of this ternary since
// options are returning to different data type
System.out.println(myMoney>= $car ? "Have enough money" : (myMoney - 1000)); // But you can print this
		
		
		