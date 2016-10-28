function updateYear() {
  var d = new Date();
  var n = d.getFullYear();

  var s = document.getElementById("year");
  s.innerHTML = n;
}

function validate(evt){
	
	//var r = confirm("is everything ok");
	
	var password = docoument.findElementById("password");
	if (password.value == "" || password.value == "password"){
		alert("invalid password");
		return false;
	}
	else {
		return true;
	}
	
	
}

function changeImage(i) {
	//alert(i);
	var bigImage = document.getElementById("bigImage");
	bigImage.src ="images/" + i + ".jpg";
	
	var bigImageLink = document.getElementById("bigImageLink");
	bigImageLink.href="selectMonth.jsp?month=" + i;
	
}
//timeout and after that call a javascript function

var currentImage = 1;
var animationRunning = true;

function startTimer(){
	
	//alert("startTimer() called");
	
	setTimeout(onTimeout, 2000);
}

function onTimeout() {
	//alert("5 seconds are up");
	if (animationRunning){
		currentImage = currentImage + 1;
		if (currentImage > 12) {
			currentImage = 1;
		}
		changeImage(currentImage);
		}
	setTimeout(onTimeout, 2000);
}

function callXhr() {
	var xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("resultDiv").innerHTML = this.responseText;
		}
		
	};
	
	xhr.open("GET", "dowork.jsp", true); // true or false for whether it is asynchronous or not
	
	xhr.send();
	
}