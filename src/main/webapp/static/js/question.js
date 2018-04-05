/*$( document ).ready(function() {
	$('#paginatedTable').DataTable( {
        "processing": true,
        "serverSide": true,
        "pageLength": 5,
        "ajax": {
            "url": "/users/paginated",
            "data": function ( data ) {
			 //process data before sent to server.
         }},
        "columns": [
                    { "data": "id", "name" : "ID", "title" : "ID"  },
                    { "data": "name", "name" : "Name" , "title" : "Name"},
                    { "data": "salary", "name" : "Salary" , "title" : "Salary"}
                ]    
	});
	
	$('#paginatedTable').dataTable().fnSetFilteringEnterPress();
});*/

function slide1() {
	
	var v = $('#option1').text();
	
	if (v <= 25) {
		$("#a1").attr('checked', 'checked');
		alert(v + " : slide1");
	} else if (v >= 25 && v <= 50) {
		$("#a2").attr('checked', 'checked');
		alert(v + " : slide2");
	} else if (v >= 50 && v <= 75) {
		$("#a3").attr('checked', 'checked');
		alert(v + " : slide3");
	} else {
		$("#a4").attr('checked', 'checked');
		alert(v + " : slide4");
	}
}

function slide2() {
	
	var v = $('#option2').text();
	/*alert(v + " : slide");*/
	
	if (v <= 25) {
		$("#b1").attr('checked', 'checked');
	} else if (v >= 25 && v <= 50) {
		$("#b2").attr('checked', 'checked');
	} else if (v >= 50 && v <= 75) {
		$("#b3").attr('checked', 'checked');
	} else {
		$("#b4").attr('checked', 'checked');
	}
} 

function slide3() {
	
	var v = $('#option3').text();

	
	if (v <= 25) {
		$("#c1").attr('checked', 'checked');
	} else if (v >= 25 && v <= 50) {
		$("#c2").attr('checked', 'checked');
	} else if (v >= 50 && v <= 75) {
		$("#c3").attr('checked', 'checked');
	} else {
		$("#c4").attr('checked', 'checked');
	}
} 

function slide4() {
	
	var v = $('#option4').text();

	
	if (v <= 25) {
		$("#d1").attr('checked', 'checked');
	} else if (v >= 25 && v <= 50) {
		$("#d2").attr('checked', 'checked');
	} else if (v >= 50 && v <= 75) {
		$("#d3").attr('checked', 'checked');
	} else {
		$("#d4").attr('checked', 'checked');
	}
} 


function slide5() {
	
	var v = $('#option5').text();
	
	
	if (v <= 25) {
		$("#e1").attr('checked', 'checked');
	} else if (v >= 25 && v <= 50) {
		$("#e2").attr('checked', 'checked');
	} else if (v >= 50 && v <= 75) {
		$("#e3").attr('checked', 'checked');
	} else {
		$("#e4").attr('checked', 'checked');
	}
} 

function slide6() {
	
	var v = $('#option6').text();

	
	if (v <= 25) {
		$("#f1").attr('checked', 'checked');
	} else if (v >= 25 && v <= 50) {
		$("#f2").attr('checked', 'checked');
	} else if (v >= 50 && v <= 75) {
		$("#f3").attr('checked', 'checked');
	} else {
		$("#f4").attr('checked', 'checked');
	}
} 

function slide7() {
	
	var v = $('#option7').text();
	
	
	if (v <= 25) {
		$("#g1").attr('checked', 'checked');
	} else if (v >= 25 && v <= 50) {
		$("#g2").attr('checked', 'checked');
	} else if (v >= 50 && v <= 75) {
		$("#g3").attr('checked', 'checked');
	} else {
		$("#g4").attr('checked', 'checked');
	}
} 
function slide8() {
	
	var v = $('#option8').text();
	
	
	if (v <= 25) {
		$("#h1").attr('checked', 'checked');
	} else if (v >= 25 && v <= 50) {
		$("#h2").attr('checked', 'checked');
	} else if (v >= 50 && v <= 75) {
		$("#h3").attr('checked', 'checked');
	} else {
		$("#h4").attr('checked', 'checked');
	}
} 

function slide9() {
	
	var v = $('#option9').text();
	
	
	if (v <= 25) {
		$("#i1").attr('checked', 'checked');
	} else if (v >= 25 && v <= 50) {
		$("#i2").attr('checked', 'checked');
	} else if (v >= 50 && v <= 75) {
		$("#i3").attr('checked', 'checked');
	} else {
		$("#i4").attr('checked', 'checked');
	}
} 
function slide10() {
	
	var v = $('#option10').text();
	
	if (v <= 25) {
		$("#j1").attr('checked', 'checked');
	} else if (v >= 25 && v <= 50) {
		$("#j2").attr('checked', 'checked');
	} else if (v >= 50 && v <= 75) {
		$("#j3").attr('checked', 'checked');
	} else {
		$("#j4").attr('checked', 'checked');
	}
} 
