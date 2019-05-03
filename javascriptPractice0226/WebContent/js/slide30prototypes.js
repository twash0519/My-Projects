/**
 * 
 
var obj= {}
obj
console.log("I am here");

*/

/********object.create()******* */
//var obj=Object.create({x:1, y:2});
var obj = {x:1, y:2};
console.log(obj["x"]);

console.log(obj.y);
console.log(obj.toString());

// //delete obj.x;
// console.log(obj.x);
// //delete obj.y;
// console.log(obj.y);

    for (var i in obj){
    console.log("this is the key:" + i)
    console.log("this is the value:" + obj[i])

}
console.log("**********************");
var colors={cathy:"purple", nilda:"grey", meg:"blue"};
    for (var i in colors){
    //console.log("this is the key:" + i)
    //console.log("this is the value:" + colors[i])
    console.log(i +": " + colors[i]);

}
console.log("**********Array.join()************");
    var a = [1,2,3,4,5,6,7,8,9,10];
    var x = a.join();
    console.log("array.join result = "  + x);


    x=a.join(" ");
    console.log("array.join result (\" \") = "  + x);

    x=a.join("");
    console.log("array.join result (\"\")= "  + x);

    var b =new Array(10);
    console.log(b.join('-'));

console.log("**********string.split()************");
    var s = "d u t r w";
    var arr = s.split(" ");
    console.log(arr);

    var s = "d,u,t,r,w";
    var arr = s.split(",");
    console.log(arr);

    var s = "dutrw";
    var arr = s.split("");
    console.log(arr);

    var s = "dutrw";
    var arr = s.split("123");
    console.log(arr);

    //read line by line
    transactionString = "debit, 100, February 26";
    var transaction = transactionString.split(",");
    console.log("Array transaction : " + transaction);
    console.log(transaction);

    
console.log("**********reverse()************");
    var a = [1,2,3,4,5,6,7,8,9,10];
    a.reverse();
    console.log(a);

console.log("**********sort()************");
    var b = [3,111,4,200,50];
    console.log(b);
    b.sort();
    console.log(b);
    b.sort(function(a,b) {return a-b});
    console.log(b);

     b.sort(function(a,b) {return b-a});
    console.log(b);

console.log("**********slice()************");
    var c= [1,2,3,4,5,6,7,8,9,10];
    var d = c.slice(5,9);
    console.log(d);

console.log("**********splice()************");  
    var e= [1,2,3,4,5,6,7,8,9,10];
    var f = e.slice(4);
    console.log(f);
    
    console.log(f.splice(1,2));
    console.log(f.splice(1,1));

console.log("**********for each a()************"); 
    var array1 = ['a', 'b', 'c'];
    array1.forEach(
            function(element) {
                console.log(element);


            }

    )
console.log("**********for each b()************"); 

  var data = [1,2,3,4,5,6,7,8,9,10];
  var sum=0;
  data.forEach(function(value) {sum+=value }

    );      console.log(data);
            console.log(sum);
console.log("**********for each c()************");   

     data.forEach(function(v, i, a) {a[i]=v +1}

    );
            console.log(data);

console.log("**********Array.Map()************"); 
       var m = [1,2,3,4,5,6,7,8,9,10];
       var g = m.map(function(x){return x*x;});
       console.log(m);
       console.log(g);
        
       var prices = [1,2,3,4,5,6,7,8,9,10];
       var newPrices=prices.map(function(x){return x*1.1;});
       console.log(prices);
       console.log(newPrices);

console.log("**********Array.Filter()************"); 

       var prices = [1,2,3,4,5,6,7,8,9,10];
       var lowestPrices=prices.filter(function(x){return x<3;});
       console.log(prices);
       console.log(lowestPrices);

       var prices = [1,2,3,4,5,6,7,8,9,10];
       var lPrices=prices.filter(function(x){return ((x<3) || (x >7));});
       console.log(prices);
       console.log(lPrices);

        h=[5,4,3,2,1];
        smallvalues=h.filter(function(x) {return x<3});
        everyother = h.filter(function(x,i) {return i%2==0});

        console.log("**********Constructors************"); 
        