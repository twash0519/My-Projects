/* slide 13 Function Return
function myJoin (b){
    for(var o in b)
        console.log(o + ":" + + b[o] + "\n");
    }

    var books = {
        book_title: "Javascipt",
    }
    myJoin(books);
  */ 
 
function printprops (p){
    for(var o in p)
        console.log(o + ":" + p[o] + "\n");
    }

    var person = {
        first_name: "Luke",
        last_name: "Lance",
        age: 23
        
    };
   printprops(person);

console.log("************Hoisting**************")
 
     person = {
        first_name: "Luke",
        last_name: "Lance",
        age: 23
        
    };
   function printprops (p){
    for(var o in p)
        console.log(o + ":" + p[o] + "\n");
    }

   
  
   var person;
    printprops(person);
/*
    function myJoin(obj){
       
        for (var objProperty in obj){
            console.log(objProperty + ":" + obj[objProperty] + "\n");
        
       

        
        }
 }
  function myJoinPerson(objPerson){
       
        
    
        console.log(obj.firstName); //print the value stored
                                    //in the object obj's property firstname
        console.log(obj.lastName);
        console.log(obj.state);


 }


 var person = {
        firstName:"Luke",
        lastName:"Adams",
        state: "New York",
 }
  var book = {
        title:"Luke",
        pages:999,
        year:2000,
 }

 console.log
 */

 console.log("/**********************Callback Function************ */")
 var list = [34, 4, 56, 67, 12, 43];

 list.forEach(
     function(item, index, arr){
        console.log(item, arr[index]);
     }
     );
    
     
  
     list.forEach (
         function(item) {
             console.log(item);

         }
     );
     
 
 console.log("**********************Callback Function slide 17************ *")
         var sum_of_square = function(a,b){
             return(a * a)+ (b * b);

         }
         var result = sum_of_square(2,3);

            console.log(result);

            var  sum_of_square = {
                first:0,
                second:0,
                square:function() {
                    this.result = ((this.first * this.first)
                        + (this.second * this.second));
                        return this.result;
                }
            }
            
              sum_of_square.first = 2;
              sum_of_square.second = 3;
              var FR = sum_of_square.square();
              console.log(FR);
            
 
  console.log("**********************Callback Function slide 19************ *")
         var sum_of_square = function(a,b){
             return(a * a)+ (b * b);

         }
         var result = sum_of_square(2,3);

            console.log(result);

            var  sum_of_square = {
                first:0,
                second:0,
                square:function() {
                    this.result = ((this.first * this.first)
                        + (this.second * this.second));
                        return this.result;
                },
                 result:13
            }
           
console.log("**********************Callback Function slide 20************ *")
         
    
            var  sum_of_square = {
                first:0,
                second:0,
                square:function() {
                    this.result = ((this.first * this.first)
                        + (this.second * this.second));
                        return this.result;
                }
                 
            }        
              
            sum_of_square.first=2;
            sum_of_square.second=3;
            var FR = sum_of_square.square()
            console.log("this is FR: " + FR);
            console.log(sum_of_square)

console.log("**********************Nested Functions************ *")


         function sum_of_square1(a,b){
             function square(x) { return x*x;}
             return (square(a) + square(b));
            }
             var result = sum_of_square1(2,3);
             console.log(result);
             
 console.log("**********************Number Object************ *")
           var str="23";
            var num = Number(str);

            console.log(typeof num);
 
console.log("**********************Date Object************ *")

          var first = new Date('January 1, 2019 04:30:00');     
          var second = new Date('2019-01-01T04:30:00') ;
          console.log(first);
          console.log(first==second);
          console.log(second.getHours());


          var today = new Date();
          console.log(today);
          
          var yesterday = new Date();
          yesterday.setDate(today.getDate()-1);
          console.log(yesterday);
             
           var tomorrow = new Date();
          tomorrow.setDate(today.getDate()+1);
          console.log(tomorrow);

            
        /*  What is today's year?
          what is today's month?
          what is today's day?
            */


           console.log("year: " + today.getFullYear()) ;
           console.log("month: " + today.getMonth()) ;
           console.log("day: " + today.getDate()) ;

           //get the month name
           //

   
console.log("******************RegEx slide 32************ *")
       
            var text="Javascript"
            
            console.log(text.search(/script/i));

            newtext="I love javascript,I love javascript,I love javascript, ";
            
            
            console.log(newtext.replace(/love/gi, "hate"));

            matchText="I love javascript,I love javascript,I love javascript, ";
            matchText.match();
            var result2=matchText.match(/love/gi); //gi finds all matches of the text
            console.log(result2.length);
/**
 * 
 */