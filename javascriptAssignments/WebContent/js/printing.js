/**
 * create checkerboxes
 */
/*******************Checkboxes******************** */
/*
for (var row=1;row<=6;row++) {
    var boardLine= "";
    for (var column=1;column<=11/2;column++){
       
        
        if (row%2==1){ 
            boardLine +="* "
        } else
        if (row%2==0) {
            boardLine += " *"
        }
    }
    console.log(boardLine);
}
*/
/*******************Cross******************** */

var size = 8;
rows = "";
columns = "";

var count = size;

for (rows = 1; rows <= size; rows++) {
    
    for (columns = 1; columns <= size; columns++) {
        
         if(rows==columns){
             
              process.stdout.write("*");
          } else{
              process.stdout.write(" ");
          }
          

      
        
        if (count==columns ) {
            
            process.stdout.write("*");
        } else {
            process.stdout.write(" ");
        }
     
    }
    count--;
    process.stdout.write("\n");
}

