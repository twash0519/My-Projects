console.log("=======SLIDE 7 PROTOTYPES =====")
var simpleObj = function(c){
this.city=c;
}
var live1= new simpleObj("Brooklyn");
var live2= new simpleObj("Bronx");

simpleObj.prototype.state ="New York";//prototype applied

console.log(live1);//simpleObj { city: 'Brooklyn' }
console.log(live2);//simpleObj { city: 'Bronx' }
console.log(live2.prototype===live1.prototype);//true
console.log(live1.state);//New York
console.log(live2.state);//New York

console.log("=======SLIDE 6 PROTOTYPES =====")

var Book=function(title,authorFullName,yearPublication){
this.authorFullName=authorFullName;
this.title=title;
this.yearPublication=yearPublication;
this.description="";
this.printBookObj = function(){
//console.log(this.title,
//this.authorFullName,
//this.yearPublication,
//this.description);
console.log(this);}
this.printlabel=function(){
console.log(" Title: ",this.title);
console.log(" Author: ",this.authorFullName);
console.log(" Year: ",this.yearPublication);
console.log("Description: ",this.description);}
}
var jsBook = new Book("Intro to JS","Cathy",2019);

var book1=new Book("aaa","nnn",2018);
var book2=new Book("bbb","ddd",2019);
book1.totalPages =999;
console.log(book1);
console.log(book2);
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