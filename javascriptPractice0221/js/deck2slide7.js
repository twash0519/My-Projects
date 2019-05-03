/**
 * 
 */
/*
for(var i=0; i<1000; i++){
    if (i % 5 == 0){
        console.log(i)
       
        continue;

    }
    
    console.log("number: " + i);
} 
*/
//fibonacci

console.log("this is fibonacci");
function fib(n) {
    let arr = [0,1];
    for (let i=2; i<59; i++){
        arr.push(arr[i-2] + arr[i-1])
    }
console.log(arr[n]);
}
console.log("End this is fibonacci");

var a= [11,12,13,14,15];

a.slice(0,3);
//var arr=a.split("");
console.log(a.splice(1,2));

var data = [1,2,3];
var sum = 0;
data.forEach(function(value){
    sum+= value;
console.log(sum)});
   


    

    

var simpleObj = function(c){
    this.city = c;

}
var live1 = new simpleObj("Brooklyn");
var live2 = new simpleObj("Bronx");
simpleObj.prototype.state= "New York";
console.log(live1);
console.log(live2);
console.log(live1.state);