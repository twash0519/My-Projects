

                   // var arrayVendors= [];
                     //   for(i=0;i<=10;i++){
                     //       arrayVendors[i] = "BNY Vendor" + i;
                     //   }

                  //  console.log(arrayVendors);
                  //  console.log(arrayVendors.length);

                        $(document).ready(function(){//document.ready is when the load of the page

                     
                     //Home
                      var menuItemHome = ["Sales","Gifts"];
                      
                      
                        for (var i in menuItemHome){
                        menuItemHome[i];
                            
                        console.log(menuItemHome[i]);
                        
                        
                            $("#menuHome").append("<a href=\"#\" style=\"color:black;\">" +  menuItemHome[i] + "</a>");
                             //console.log("<a href=\"#\" style=\"color:black;\">" +  menuItemHome[i] + "</a>") ;  
                        }

                        //Products
                        var menuItemProduct = ["Soaps","Butters","Candles"];
                         for (var i in menuItemProduct){
                        menuItemProduct[i];
                            
                        console.log(menuItemProduct[i]);
                        
                        
                            $("#menuProducts").append("<a href=\"#\" style=\"color:black;\">" +  menuItemProduct[i] + "</a>");
                             //console.log("<a href=\"#\" style=\"color:black;\">" +  menuItemProduct[i] + "</a>") ;  
                        }




                    });
                
                   
                    