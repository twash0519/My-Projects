/**
 * 
 */

var height=6;


  for(var i=0; i<height; i++){
      var star ="";
        

      for (var j=0; j<height; j++)
      { 
       if(star[i] == "*"){
            star+=" "; 
        } else {
        star+="*";
        }
      
    }

      console.log(star);
   }
