/**
 * 
 */
function customMessage(pCustom, pTimes) {
    for (var i = 0; i<pTimes; i++){
        console.log(i,pCustom);
        //console.log(pCustom, i);
    }
}
var vCustom="Next Message-->";
var vTimes=2;
customMessage(vCustom,vTimes);
