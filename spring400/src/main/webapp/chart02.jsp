<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['line']});
      google.charts.setOnLoadCallback(drawChart);

    function drawChart() {

      var data = new google.visualization.DataTable();
      data.addColumn('number', 'Day');
      data.addColumn('number', 'Emotional Guitarist AZ Readers');
      data.addColumn('number', '수라 월드 SURA WORLD Readers');
      data.addColumn('number', 'Mood Rainbow Readers');

      data.addRows([
        [1,  8.61, 5.81, 3.66],
        [2,  8.66, 5.74, 3.79],
        [3,  8.7,  5.76, 3.91],
        [4,  8.67, 5.77, 3.88],
        [5,  8.71, 6.04, 3.97],
        [6,  8.79, 6.22, 4.01],
        [7,  8.81, 6.06, 3.99],
        [8,  9.2, 6.26, 3.96],
        [9,  9.08, 6.42, 3.92],
        [10, 8.88, 6.33, 4.01],
        [11, 8.95, 6.17, 3.9],
        [12, 8.97, 6.06, 4.0],
        [13, 9.04, 6.17, 4.03],
        [14, 9.18, 6.16, 4.04]
      ]);

      var options = {
        chart: {
          title: 'Readers of three musical channels Last Two Weeks',
          subtitle: 'in ten thousands of people'
        },
        width: 900,
        height: 500,
        axes: {
          x: {
            0: {side: 'bottom'}
          }
        }
      };

      var chart = new google.charts.Line(document.getElementById('line_bottom_x'));

      chart.draw(data, google.charts.Line.convertOptions(options));
    }
  </script>
</head>
<body>
  <div id="line_bottom_x"></div>
</body>
</html>