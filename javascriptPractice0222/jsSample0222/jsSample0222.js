/**
 * 
 */

   /*   var inputString= "*********###**********\n*****************\n*******######******\n**********"
  console.log(inputString);

    var counter = 0;
    for (var i=0; i<inputString.length; i ++){
        if (inputString[i] =="#"){
            counter++;
            if (inputString[i+1]=="#"){
                break;

            } 
        }

    }
    console.log("Number of times = " + counter);
    */
   /*case 2
   *********************
   *********************
   ******#######********
   *********************
   *********************
   *********************

   /*
 
var inputString= "*********###**********\n*******###**********\n*******####******\n**********"
console.log(inputString);

    var counter = 0;
    var sequenceCounter=0;
    for (var i=0; i<inputString.length; i ++){
        if (inputString[i] =="#"){
            counter++;
            if (inputString[i+1]=="*"){

                sequenceCounter++;
                console.log("Sequence # " + sequenceCounter +
                            " Number of times= " + counter);
               counter=0;

            } 
        }

    }
    console.log("Number of times = " + counter);
 */
//slide 6

 var inputString= "*********###**********\n*******#####**********\n*******######******\n**********"
console.log(inputString);

    var counter = 0;
    var sequenceCounter=0;
    for (var i=0; i<inputString.length; i ++){
        if (inputString[i] =="#"){
            counter++;
            if (inputString[i+1]=="*"){
                    if (counter < 4) {
                        console.log("Number 0")
                     } else {
                            console.log("Number = " + counter)
                            break;
                        }
                          counter=0;
                    }            

            } 
        }

