/**
 * 
 */
console.log("----------------slide 19---------------------");
 var a= [23, 32, 45, 67, 22, 77, 99, 67, 98, 56, 12];
 for(let i=0; i < a.length; i++){
     console.log(a[i]);
 }
console.log("----------------slide 20--------------------");
  var a= [23, 32, 45, 67, , 77,, 67, 98, 56, 12];
 for(let i=0; i < a.length; i++){
     console.log(a[i]);
 }

console.log("----------------slide 20 a---------------------");
 var accountTransactions=[1,1,1,1,1,,1,1,1,1,1,1];
 var sum = 0;
 for (var i=0; i< accountTransactions.length; i++){
     sum=accountTransactions[i];
 }

 console.log("the total is " + sum);
 console.log("the length of a is =" + accountTransactions.length);
 console.log("the number of elements ina is =" + accountTransactions.length);



 console.log("----------------slide 21 a---------------------");
   var a= [23, 32, 45, 67, , 77,, 67, 98, 56, 12];
 for(let i=0; i < a.length; i++){
     if(!a[i]){
         continue;
     }
     console.log(a[i]);
 }
 console.log("the total is " + sum);
 console.log("the length of a is =" + a.length);
 console.log("the number of elements ina is =" + a.length);

  console.log("----------------slide 21 b---------------------");
   var a= [23, 32, 45, 67, , 77,, 67, 98, 56, 12];
 for(let i=0; i < a.length; i++){
     if(a[i]=== undefined){
         continue;
     }
     console.log(a[i]);
 }