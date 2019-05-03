/**
 * 


//print all even numbers up to 100
for  (var number=0; number<=100; number+=2){
    console.log(number);
    }



//print all odd numbers up to 99
 for  (var number=1; number<=99; number+=2){
    console.log(number);
    }
 
  //Given a prime, determine if this numbere is prime
 */
/*
  var number = 7;
  for (number=2; number<=100;number++){

      var number = 7;
      var divisor = 2;
      var result = 0;
      var prime = true;

      for(divisor=2;((divisor<number) && prime); divisor++)  {
        if(number%divisor==0){
            prime=false;
        }
    

    if(prime){
        console.log(number+ " is a prime number") 
    }else {
        console.log(number+ " is not a prime number") 
    }

  }
  

   var number = 7;
      var divisor = 2;
      var result = 0;
      var prime = true;

      while((divisor<number) && prime)  {
        if(number%divisor==0){
            prime=false;
        }
    }
 if(prime){
        console.log(number+ " is a prime number") 
    }else {
        console.log(number+ " is not a prime number") 
    }

 */



  for (number =10; number<=1000; number++) {

    if((number%4==0)&&(number%6==0)){
        console.log(number);
    }
  }
   
  

   var inte = 1;
   do
   {
       console.log("printing " + inte);
   }
   while (inte++ < 3);

   