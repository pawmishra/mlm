$(document).ready(function(){
				$('#first_name').keydown(function (e) {
			          if (e.shiftKey || e.ctrlKey || e.altKey) {
			              e.preventDefault();
			          } else {
			              var key = e.keyCode;
			              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
			                  e.preventDefault();
			              }
			             
			          }
			    });
});

$(document).ready(function(){
	$('#last_name').keydown(function (e) {
          if (e.shiftKey || e.ctrlKey || e.altKey) {
              e.preventDefault();
          } else {
              var key = e.keyCode;
              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
                  e.preventDefault();
              }
          }
    });
});
$(document).ready(function(){
	$('#bankname').keydown(function (e) {
          if (e.shiftKey || e.ctrlKey || e.altKey) {
              e.preventDefault();
          } else {
              var key = e.keyCode;
              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
                  e.preventDefault();
              }
          }
    });
});

$(document).ready(function(){
	$('#mobilenumber').keydown(function (e) {
		 if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#alert").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
    });
});

$(document).ready(function(){
	$('#alternatemobilenumber').keydown(function (e) {
		 if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#alert").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
    });
});

$(document).ready(function(){
	$('#accountno').keydown(function (e) {
		 if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#alert").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
    });
});


function AllowIFSC() {
    var ifsc = document.getElementById("ifsc").value;
    var reg = /[A-Z|a-z]{4}[0][a-zA-Z0-9]{6}$/;

    if (ifsc.match(reg)) {
        return true;
    }
    else {
        alert("You Entered Wrong IFSC Code \n\n ------ or------ \n\n IFSC code should be count 11 \n\n-> Starting 4 should be only alphabets[A-Z] \n\n-> Remaining 7 should be accepting only alphanumeric");
        
        return false;
    }

}



$(document).ready(function(){
	$('#pincode').keydown(function (e) {
		 if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#alert").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
    });
});

$(document).ready(function(){
	$('#aadhar_no').keydown(function (e) {
		 if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#alert").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
    });
});

function ValidatePAN(Obj) {    
    if (Obj.value != "") {
        ObjVal = Obj.value;
        var panPat = /^([a-zA-Z]{5})(\d{4})([a-zA-Z]{1})$/;
        if (ObjVal.search(panPat) == -1) {
            alert("Invalid Pan No");
           
            return false;
        }
    }
} 

$(document).ready(function(){
	$('#Street').keydown(function (e) {
          if (e.shiftKey || e.ctrlKey || e.altKey) {
              e.preventDefault();
          } else {
              var key = e.keyCode;
              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
                  e.preventDefault();
              }
             
          }
    });
});

$(document).ready(function(){
	$('#city').keydown(function (e) {
          if (e.shiftKey || e.ctrlKey || e.altKey) {
              e.preventDefault();
          } else {
              var key = e.keyCode;
              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
                  e.preventDefault();
              }
          }
    });
});

$(document).ready(function(){
	$('#country').keydown(function (e) {
          if (e.shiftKey || e.ctrlKey || e.altKey) {
              e.preventDefault();
          } else {
              var key = e.keyCode;
              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
                  e.preventDefault();
              }
          }
    });
});

var _URL = window.URL || window.webkitURL;

$("#profile").change(function(e) {
var file, img;


if ((file = this.files[0])) {
    img = new Image();
    
    img.onload = function() {
        var width_image = this.width;
        var height_image = this.height;
        if(width_image > 100 || height_image > 100)
        {
          alert("Please upload a valid image of height and width 100 pixels");

        }      	

        

    };
    img.onerror = function() {
        alert( "not a valid file: " + file.type);
    };
    img.src = _URL.createObjectURL(file);
}
});

$("#cancelledcheque").change(function(e) {
	var file, img;


	if ((file = this.files[0])) {
	    img = new Image();
	    
	    img.onload = function() {
	        var width_image = this.width;
	        var height_image = this.height;
	        if(width_image > 200 || height_image > 200)
	        {
	          alert("Please upload a valid image of height and width 200 pixels");

	        }      	

	        

	    };
	    img.onerror = function() {
	        alert( "not a valid file: " + file.type);
	    };
	    img.src = _URL.createObjectURL(file);
	}
	});
$("#aadharfront").change(function(e) {
	var file, img;


	if ((file = this.files[0])) {
	    img = new Image();
	    
	    img.onload = function() {
	        var width_image = this.width;
	        var height_image = this.height;
	        if(width_image > 200 || height_image > 200)
	        {
	          alert("Please upload a valid image of height and width 200 pixels");

	        }      	

	        

	    };
	    img.onerror = function() {
	        alert( "not a valid file: " + file.type);
	    };
	    img.src = _URL.createObjectURL(file);
	}
	});

$("#aadharback").change(function(e) {
	var file, img;


	if ((file = this.files[0])) {
	    img = new Image();
	    
	    img.onload = function() {
	        var width_image = this.width;
	        var height_image = this.height;
	        if(width_image > 200 || height_image > 200)
	        {
	          alert("Please upload a valid image of height and width 200 pixels");

	        }      	

	        

	    };
	    img.onerror = function() {
	        alert( "not a valid file: " + file.type);
	    };
	    img.src = _URL.createObjectURL(file);
	}
	});
$("#uploadpan").change(function(e) {
	var file, img;


	if ((file = this.files[0])) {
	    img = new Image();
	    
	    img.onload = function() {
	        var width_image = this.width;
	        var height_image = this.height;
	        if(width_image > 200 || height_image > 200)
	        {
	          alert("Please upload a valid image of height and width 200 pixels");

	        }      	

	        

	    };
	    img.onerror = function() {
	        alert( "not a valid file: " + file.type);
	    };
	    img.src = _URL.createObjectURL(file);
	}
	});


$(document).ready(function(){
	$('#accountholdername').keydown(function (e) {
          if (e.shiftKey || e.ctrlKey || e.altKey) {
              e.preventDefault();
          } else {
              var key = e.keyCode;
              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
                  e.preventDefault();
              }
          }
    });
});

$(document).ready(function(){
	$('#nomineename').keydown(function (e) {
          if (e.shiftKey || e.ctrlKey || e.altKey) {
              e.preventDefault();
          } else {
              var key = e.keyCode;
              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
                  e.preventDefault();
              }
          }
    });
});

$(document).ready(function(){
	$('#relation').keydown(function (e) {
          if (e.shiftKey || e.ctrlKey || e.altKey) {
              e.preventDefault();
          } else {
              var key = e.keyCode;
              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
                  e.preventDefault();
              }
          }
    });
});

$(document).ready(function(){
	$('#organizationname').keydown(function (e) {
          if (e.shiftKey || e.ctrlKey || e.altKey) {
              e.preventDefault();
          } else {
              var key = e.keyCode;
              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
                  e.preventDefault();
              }
          }
    });
});

$(document).ready(function(){
	$('#withdrawamount').keydown(function (e) {
		 if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#alert").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
    });
});

$(document).ready(function(){
	$('#registration_amount').keydown(function (e) {
		 if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#alert").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
    });
});

$(document).ready(function(){
	$('#perpageamount').keydown(function (e) {
		 if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#alert").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
    });
});

$(document).ready(function(){
	$('#noofpages').keydown(function (e) {
		 if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#alert").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
    });
});