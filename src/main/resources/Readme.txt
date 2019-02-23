//YOUTUBE:
var elms = document.querySelectorAll("[id='thumbnail']");

for(var i = 0; i < elms.length; i++) 
  console.log(elms[i].href); 
  
  
// 91P  
var as = document.getElementsByTagName('a');
for(var i=0; i<as.length; i++){
if (as[i].href.includes('viewkey'))
	console.log(as[i].href); 
}