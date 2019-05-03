/**
 * 
 */
/*
console.log("***************Prototypes slide 3*******************")
var Instructor = function(fName, lName, cT = []){
        this.firstName = fName;
        this.lastName = lName;
        this.classesTeaching = cT;
        this.employer = "Platform";
        this.info = function(){
        console.log(this.firstName, this.lastName,  " is employed by ",  this.employer);
        }

}
var shah = new Instructor("A H M", "Shahparan", ["Ful-Stack", "DE"]);
var kieda = new Instructor("Kieda", "Maliqi", ["Ful-Stack", "DE"]);
var bairon = new Instructor("Bairon J", "Vasquez");
console.log(shah);
console.log(kieda);
console.log(bairon);

console.log("***************Prototypes slide 3 Book*******************")

var Book = function(bTitle, bAuthor,bYear){

    this.title = bTitle;
    this.author = bAuthor;
    this.year = bYear;
    this.description = "";
    this.type = "";
    this.edition = 0;
    this.printBookObj = function(){
      //  console.log(this.title, this.author, this.year, this.description, this.type, this.edition );
  // console.log(this);
    }   
    this.printBookLn = function(){
        for(var prop in this){
            console.log(prop, "=" , this[prop]);
        }
    }
}
var jsbook = new Book ("Intro to JS for All", "O'Reilly", "2014");
jsbook.printBookLn();
 */
/*
console.log("***************Prototypes slide 3 Book*******************\n\n");

var Book = function(bTitle, bAuthor,bYear){

    this.title = bTitle;
    this.author = bAuthor;
    this.year = bYear;
    this.description = "Javascript";
    this.type = "";
    this.edition = 0;
    this.printBookLabel = function(){
      
        // console.log(
         console.log("**************************\nTitle: " + this.title),
         console.log("Author: " + this.author),
         console.log("Year: " +   this.year),
         console.log("Description: " + this.description + "\n**************************" )
  
         // console.log(this);
    }  
    
    
}
var jsbook = new Book ("Intro to JS for All", "O'Reilly", "2014");
for(var label = 1; label <=100; label++){
    console.log(label);
    jsbook.printBookLabel();
}

*/
/*
console.log("\n\n\n***************Prototypes slide 6*******************")

var simpleObj = function(c){
    this.city = c;
    }
    var live1 = new simpleObj("Brooklyn");
    var live2 = new simpleObj("Bronx");
    live2.state = "new York";
    console.log(live1);
    console.log(live2);
    //console.log(live2.prototype===live1.prototype);
    //console.log(live1.state)

    

   
/*Book {
authorFullName: 'nnn',
title: 'aaa',
yearPublication: 2018,
description: '',
printBookObj: [Function],
printlabel: [Function],
totalPages: 999 }
Book {
authorFullName: 'ddd',
title: 'bbb',
yearPublication: 2019,
description: '',
printBookObj: [Function],
printlabel: [Function] }
*/ 
/*
    


  var Book = function(bTitle, bAuthor,bYear){

    this.title = bTitle;
    this.author = bAuthor;
    this.year = bYear;
    this.description = "";
    this.type = "";
    this.edition = 0;
    this.printBookObj = function(){
      //  console.log(this.title, this.author, this.year, this.description, this.type, this.edition );
 
      console.log(this);
    }   
 Book {authorFullName: 'nnn',
title: 'aaa',
yearPublication: 2018,
description: '',
printBookObj: [Function],
printlabel: [Function],
totalPages: 999 }
Book {
authorFullName: 'ddd',
title: 'bbb',
yearPublication: 2019,
description: '',
printBookObj: [Function],
printlabel: [Function] }

*/


      
var jsbook = new Book ("Intro to JS for All", "O'Reilly", "2014");
var book1=new Book("aaa","nnn",2018);
var book2=new Book("bbb","ddd",2019);
book1.totalPages =999;
console.log(book1);
console.log(book2);




 console.log("\n\n\n***************Prototypes slide 10*******************")   
    var scope = "global"; //declare a global variable
    function checkscope() {
        var scope = "local"; //declare a local variable with the same name
        return scope; //return the local value, not the global one
    }
    var result = checkscope()
    console.log(result);

  console.log("\n\n\n***************Prototypes slide 12*******************")   
    var scope = "global"; //declare a global variable
    function checkscope() {
        var scope = "local"; //declare a local variable with the same name
        function nested()
            var scope = "nested scope";
            variables
            return scope; //return the local value, not the global one
    }
    return nested();
    var result = checkscope()
    console.log(result);   


var uniqueInteger = (function(){
    var counter = 0;
    return function() {return counter++; };
    }());
    console.log(uniqueInteger() )
    console.log(uniqueInteger())
    console.log(uniqueIntege())

*/
function counter(n) {
    return{
    get count() { return n++;},
    set count(m) {
        if (m>=n) n=m;
        else throw Error("count can only be set to a larger value");

    }
}
}
try {
var c = counter(1000);
console.log(c.count)
console.log(c.count)
c.count = 2000
console.log(c.count)
//c.count = 2000 // Error!, try it
c.count = 2001
console.log(c.count)

}catch(Error){
    control.log(Error);
}
    
