/**
 * 
 */

var height=5;
var width=12;


  for(var i=1; i<=height; i++){
      var star ="";
         for(j=2; j<=i; j++){
            star+=" ";
        }
        for(k=width; k>=i*2; k--){
            star+="*";
        }
       /* for(j=height; j>=i; j--){
            star+="*";
        }
        */
 
        
      console.log(star);
   }
