$(function (){
// add this class when menu have sub menu
$('aside li ul').closest('li').addClass('hasSubmenu');


// leader source chart
 if($("#leadsSource").is(':visible')==true){
var chart1 = Highcharts.chart('leadsSource', {

    title: {
        text: ''
    },

    subtitle: {
        text: ''
    },

    yAxis: {
        title: {
            text: 'Number of Employees'
        }
    },
     xAxis: {
        categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
    },

    plotOptions: {
        series: {
            pointStart: 2010
        }
    },

    series: [{
        name: 'Installation',
        data: [ 57177, 69658, 97031, 119931, 137133, 154175]
    }, {
        name: 'Manufacturing',
        data: [ 29742, 29851, 32490, 30282, 38121, 40434]
    }, {
        name: 'Sales & Distribution',
        data: [ 16005, 19771, 20185, 24377, 32147, 39387]
    }, {
        name: 'Other',
        data: [ 8105, 11248, 8989, 11816, 18274, 18111]
    }]

});
 }
 // TOP PRODUCT SALES
 if($("#productSales").is(':visible')==true){
 var chart2 = Highcharts.chart('productSales', {

    title: {
        text: ''
    },

    subtitle: {
        text: ''
    },

    xAxis: {
        categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
    },

    series: [{
        type: 'column',
        colorByPoint: true,
        data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4],
        showInLegend: false
    }]

});

}



// 

$(window).resize(function() {
    if($("#productSales").is(':visible')==true){
        height1 = chart1.height
        width1 = $("#productSales").width()
        chart1.setSize(width1, height1, doAnimation = true);
    }
     if($("#leadsSource").is(':visible')==true){
              height2 = chart2.height
            width2 = $("#leadsSource").width()
            chart2.setSize(width2, height2, doAnimation = true);
        }

});
$('#toggleAsideMenu').click(function(){
	$(window).trigger('resize');
});
$('.addNewSalesOrder .panel-heading').click(function (){
    $(this).closest('.panel').toggleClass('active');
});

$.fn.select2.defaults.set( "theme", "bootstrap" );
// open/close sales order panel

$('body').on('click', '.addMore:not(.removeMore)', function (){
    var thisRow = $(this).closest('.addMoreWrp');
    var thisCopy = thisRow.clone();
    $(thisCopy).find('.addMore').replaceWith('<button class="btn btn-default  addMore removeMore" type="button"><i class="fa fa-minus" ></i></button>');
    $(thisCopy).find('.select2-container').remove();
    thisCopy.insertAfter(thisRow);
    thisRow.nextAll().find('select').select2();
});
$('body').on('click', '.removeMore', function (){
    $(this).closest('.addMoreWrp').remove();
});

});