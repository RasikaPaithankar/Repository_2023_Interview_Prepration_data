
console.log("Entered into JS ", fn); 

var fn = "";
var ls = "";
var gr = "";
var an = 0;
var consumerArray = [];
var Consumers = "";
var selectedGr = "";
var isValidationDone = false;

function Consumer(firstName, lastName, gender, aadharNumber){
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.aadharNumber = aadharNumber;
}


function addConsumerData(){
	fn = document.getElementById('firstName');	
	console.log("first name is ", fn.value); 
	ln = document.getElementById('lastName');
	console.log("last name is ", ln.value);
	gr = document.getElementsByName('gender');
	
	selectedGr = checkSelectedGender(gr);
	console.log("selected gender is ", selectedGr.value);
	
	an = document.getElementById("aadharNumber");
	console.log("aadhar Number is " , an.value);
	isValidationDone = checkValidation();
	if(isValidationDone){
		Consumers = new Consumer(fn.value, ln.value, selectedGr.value, an.value);
		addConsumerToArray(Consumers);
		console.log("done");
	}

}


function checkSelectedGender(){
	console.log("size of gender is ", gr.length);
	
	for(i = 0; i< gr.length; i++){
		if(gr[i].checked){
			return gr[i];
		}
	}
}


function addConsumerToArray(Consumers){
	var lengthOfArray = consumerArray.length;
	if(consumerArray.length > 0){
		var ln = consumerArray.filter(consumer => consumer.aadharNumber === Consumers.aadharNumber);
			if(ln.length === 0){
				consumerArray.push(Consumers);
				clearDt();
			}else{
				alert("Already added aadhar Number, Please enter another aadhar number.");
				clearDt();
			}
	}else{
		consumerArray.push(Consumers);
		clearDt();
		console.log("added 1st new entry to array");
	}
	
	console.log("consumerArray is ", consumerArray);
}

function clearDt(){
	document.getElementById('firstName').value='';
	document.getElementById('lastName').value='';
	document.getElementsByName('gender').value = '';
	document.getElementById('aadharNumber').value='';
}


function checkValidation(){
	if(fn.value == ""){
		alert("First Name should not be empty.");
		return false;
	}
	
	if(ln.value == ""){
		alert("Last Name should not be empty.");
		return false;
	}
	
	if(selectedGr.value == ""){
		alert("Gender should not be empty.");
		return false;
	}
	
	if(an.value == ""){
		alert("Aadhar number should not be empty.");
		return false;
	}
	return true;
}