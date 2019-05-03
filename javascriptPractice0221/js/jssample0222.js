/**
 * expressin is 23+3-3^
 */
var expression="2323+3-3^";
var character="";
var numbers="";
var operands="";




for(i=0; i<expression.length;i++ ){
    console.log(expression[i]);

        character=expression[i];
        if ((character=="+" )|| (character=="-" ) || (character=="^")){
            //console.log("this is an operand" )
            //concatenate the operands
            operands = operands +character + "|";
            numbers += "|";
        }else{
            numbers += character;
           // console.log("this is a number" )
        }
       
        if(numbers[numbers.length-1]!="|"){
        numbers += "|";
        }    
        console.log("Expression " + expression);
        console.log("Operands " + operands);   
        console.log("Numbers " + numbers); 
        //in order not to have a pipe at the end, you need to do an if statement to check

        var numberA = "2";
        var numberB = 3;
       // var result = numberA + numberB;
        //var result = numberB + Number(numberA); this casts the string to a number
        //var result = numberB + parseInt(numberA); this casts the string to a number

        console.log(numberA);
        console.log(numberB);
        //console.log(result);

        console.log("-------------");
        console.log(expression.charCodeAt(0)); //this tells you the ASCII code
    
    }

