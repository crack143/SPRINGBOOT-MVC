console.log("this is Js controller of claimDetails.jsp");


alert("this is login page")

var userObj = {};

var bindObj = function loginObj() {
 userObj.email = $('#email').val();
 userObj.password = $('#password').val();

 save(userObj)

}
//'data': $.toJSON(data)

function save(o) {
 console.log(o);
 $.ajax({
  'type': 'POST',
  'url': '/api/save',
  'contentType': 'application/json',
  'data': JSON.stringify(o),
  'dataType': 'json',
  'success': function(data) {

  },
  error: function(error) {
   console.log(error)
  }
 });
}

//------------------------------------------
//Test case
var testObj = {};

var test = function loginObj() {
	testObj.name = $('#name').val();

 testSave(testObj)

}

function testSave(o) {
	 console.log(o);
	 $.ajax({
	  'type': 'POST',
	  'url': '/api/save',
	  'contentType': 'application/json',
	  'data': JSON.stringify(o),
	  'dataType': 'json',
	  'success': function(data) {
alert("data saved")
console.log(data);
document.getElementById("usrLoginDetail").reset();

	  },
	  'error': function(error) {
	   console.log(error)
	  }
	 });
	}


/*
var claimss=[];

function pageLoad(){
	$.ajax({
	    type : "GET",
	    url : "api/claims",
	    data :"",
	    success: function(data){
	    	claimss=data;
	    	console.log(claimss);
	    },
	    error:function(error){console.log(error)}
	});
	}
	


pageLoad();*/