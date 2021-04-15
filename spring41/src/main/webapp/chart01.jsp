<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawSeriesChart);

    function drawSeriesChart() {

      var data = google.visualization.arrayToDataTable([
        ['ID', 'In classroom frequency', 'With computer frequency', 'Region', 'Popularity'],
        ['진우',    80.66,          		    1.67,    		  	   'Home',  		  0.8],
        ['태준',    79.84,          		    1.36,    		 	   'Home',  		  0.63],
        ['성태',    78.6,           		    1.84,    			   'Classroom',       0.552],
        ['민수',    72.73,         		     2.78,   			   'Home',  		  0.79],
        ['찬양',    80.05,         		     2,      			   'Home',         	  0.61],
        ['광희',    72.49,          		    1.7,    			   'Home',  		  0.73],
        ['선종',    68.09,          		    1.2,    			   'Home',   		  0.31],
        ['기범',    81.55,         		     2.86,   			   'Classroom', 	  0.48]
      ]);

      var options = {
        title: '2nd Visualization Practice : online class and offine class(~2021. 3. 24.)',
        hAxis: {title: 'In classroom frequency'},
        vAxis: {title: 'With computer frequency'},
        bubble: {textStyle: {fontSize: 11}}
      };

      var chart = new google.visualization.BubbleChart(document.getElementById('series_chart_div'));
      chart.draw(data, options);
    }
    </script>
  </head>
  <body>
    <div id="series_chart_div" style="width: 1400px; height: 800px;"></div>
  </body>
</html>
