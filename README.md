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
