/**
 * 
 */

 var numbers=[10, 15, 16, -7, 102, 345];
  var sum=0;
    for(let i=0; i<numbers.length; i++){
       
        sum += numbers[i];
      
        
    }

console.log(sum);
 var userInput = "100 + 50 - 25 + 0 + 123 - 1";
 var formula=userInput.split(" ");
            
  console.log(formula);
            
           
            var sum=0;
            
                for(var i=0; i<formula.length; i++){
                  var finalTotal=0;  
                   
                   
                    console.log("this is the index: " +formula[i]);
                      
                    
                   var total = 0;
                   var totalPlus = 0;
                   var totalMinus = 0;
                    if(formula[i] == "+"){
                      //  console.log(formula[i]);
                     // console.log("This is the first num: " + formula[i-1]);
                      //  console.log(formula[i+1]);
                        
                        totalPlus=Number((formula[i-1]))+Number((formula[i+1]));
                        console.log(totalPlus);

                    }else 
                     

                        if(formula[i] == "-"){
                      //  console.log(formula[i]);
                     // console.log(formula[i-1]);
                       // console.log(formula[i+1]);
                        
                        totalMinus=Number((formula[i-1]))- Number((formula[i+1]));
                        console.log(totalMinus);


                    }
                
                      var finalTotal=(totalPlus+totalMinus);
               
                        console.log("this is the final total is: " + finalTotal);
                }

                