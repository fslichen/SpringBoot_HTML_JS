//At the time you save the js file, make sure it's saved as UTF-8.
alert("你好");
var data = {
	name : 'Chen'	
};
$.ajax({
	type : 'POST',
	contentType : 'application/json',
	url : '/post',// You don't need to attach http://localhost:8080.
	data : JSON.stringify(data),
	success : function(data) {
		alert('Success');
	},
	error : function(error) {
		alert('Error');
	}
});