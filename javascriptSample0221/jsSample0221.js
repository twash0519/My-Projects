/**
 * This is my first javascript
 */
//This is an inline comment
 /*
console.log(4+3);
console.log(4*5);
console.log(4/2);
console.log(2==2);
console.log("2"==2);
console.log("2"=="2");

console.log(3===3);
console.log("3"===3);
console.log("3"==="3");


//&& and
console.log(3>2 && 6==6);
console.log(3>2 && 6==7);

//|| or
console.log(3>2 || 6==6);
console.log(3>2 || 6==7);
console.log(3<2 || 6!==6);

// ! NOT
console.log(!(3<2 || 6!=6));
console.log(!(3>2 && 6==6));

console.log(3>4 && 4==4);
console.log(3>4 || 4==4);
console.log(5!=5 || 4>4)&&!(2==2);
console.log((5%2>=2) && (!false || 4<0));

console.log("Hi this is a string" + " added to a second one");
console.log(2>=2 && 10%3==1)||((10<11&&2!=3) || 2==12);
*/
/*
var myNumber=6;
var myNumber=0;
console.log(myNumber);

/*will get an error
let myNumber=6;
let myNumber=0;
console.log(myNumber);
*/

/*
var myNumber=9;
console.log(10+myNumber++);
console.log(10+myNumber);
*/

/*
var myNumber=9;
console.log(myNumber);
console.log(10-myNumber++);
console.log(10-myNumber);

var myNumber=9;
console.log(myNumber);
console.log(10+(+myNumber) );
console.log(10-myNumber);

//arithmetic shortcuts

var newNumber=10;

console.log(newNumber+=5); //==> newNumber=newNumber + 5
console.log(newNumber-=5); //==> newNumber=newNumber - 5
console.log(newNumber%=3); //==> newNumber=newNumber % 3
console.log(newNumber*=5); //==> newNumber=newNumber * 5
console.log(newNumber/=5); //==> newNumber=newNumber - 5

console.log(newNumber);
console.log("this is: " + ((newNumber+=5)>10));

var myName = "Theresa"
var myFlag = "true";
var myOther = null;

console.log("this is myName: " + myName);

console.log("ths is myFlag: " + myFlag);
console.log("ths is myOther: " + myOther);

console.log("boolean -- this is ?: " + (true==myFlag));


console.log("this is myOther?  : " + (true==myFlag));
*/

/*
var myNumber = 5;
if (myNumber ==0) {

    console.log(myNumber + " is equal to 0");

} else if (myNumber >0) {
    console.log(myNumber + " is a positive number to 0");

} else if (myNumber <0) {
    console.log(myNumber + " is a negative number to 0");
}


var myNumber = "A";
if (myNumber ==0) {

    console.log(myNumber + " is equal to 0");

} else if (myNumber >0) {
    console.log(myNumber + " is a positive number to 0");

} else if (myNumber <0) {
    console.log(myNumber + " is a negative number to 0");
} else{
     console.log(myNumber + " is a not a number");
}
*/


/*ATM Menu Sample
1 deposit   Deposit = $1.00
2 balance   Account balance=$1.00
3 services  Welcome to the ATM servies
4 exit      Thank you for using our services
Enter option (1-4) : [_] 


var option = 0;
if (option ==1){
    console.log("Deposit = $1.00")

}else if (option ==2){
    console.log("Account balance=$1.00")
}else if (option ==3){
    console.log("Welcome to the ATM servies")
}else if (option ==4){
    console.log("Thank you for using our services")  

}else {
    console.log("This is an invalid option")
}

/*
//slide 22 arithmetic operators left 
//slide 22 arithmetic operators left
console.log("-----------------Operations-----------------");
var myNumber = 9;
console.log(myNumber); //9
console.log(10+myNumber++); //19
console.log(10+myNumber); //20

console.log(myNumber); //10
console.log(++myNumber); //21
console.log(10+myNumber); //20

console.log("-----------------Operations-----------------");

var myNumber = 9;
console.log(myNumber); //9
console.log(10+myNumber--); //19
console.log(10+myNumber); //18

console.log(myNumber); //8
console.log(10 + (--myNumber)); //17
console.log(10+myNumber); //17 
*/
/*
var option=1;
switch(option) {

    case 1 :
        console.log("Deposit = $1.00")
        break
    case 2:
        console.log("Account balance=$1.00")
        break
    case 3:
        console.log("Welcome to the ATM servies")
        break   
    case 4:
        console.log("Thank you for using our services")  
        break
    default:
        console.log("This is an invalid option")
        break
}

console.log(option)
/*
Starting with 10,000, how many years until we have at least 20,000, at 5% Interest?
1. start with a year value of 0 and a balance of 10,000
2. Repeat the following steps while the balance is $20,000
3. Add 1 to the year value
4. Compute the interest by multiplying the balnce value by 0.05 (5 percent interest)(will be a const, of course)
5. Add the interest to the balance
*/
/*
//start with a year value of 0 and a balance of 10,000
var year = 0;
var balance = 10000; 
var interest = 0;
var rate=0.05;

//Repeat the following steps while the balance is $20,000

while (balance < 20000) {
    // Add 1 to the year value
    year++; 
    // Compute the interest by multiplying the balnce value by 0.05 (5 percent interest)(will be a const, of course)
    interest = balance * rate;
     //   Add the interest to the balance
    balance *= (1+rate) ; //interest=balance * rate blance += interest
    
}

console.log("The investment doubled after " + year + " years.")
*/
/*
for (var index = 0; index <= 10; index++) {
    console.log(index);
}
for (var index = 0; index <= 10; ++index) {
    console.log(index);
}

for (var index = 0; index <= 10; index++) ;
{
    console.log(index);
}
*/
 

