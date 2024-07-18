<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>차트그리기</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<style>
	#main{
		border : 3px solid black;
		width : 70%;
		height : 550px;
		margin : 20px auto;
	}
</style>
<script>
$(function(){
	$("#btn").on("click", function(){
		
		$.ajax({
			url : "/chart_data",
			type : "post",
			data : {"data" : $("#data").val()},
			dataType : "json",
			success : function(data){
				alert("성공");
				console.log("data1 : " + data);
				
				//차트 초기화
				let chartStatus = Chart.getChart("myChart");
				  if (chartStatus != undefined) {
				  	chartStatus.destroy();
				  }
				
				var x_arr = [];
                var y_arr = [];
                

                data.forEach(function(d){
					if(d.region){
                	x_arr.push(d.region);						
					}
					else{
                	x_arr.push(d.period);						
					}	
					y_arr.push(d.amt);
                	
                });
                	
                /*
				for(var i=0; i<data.length; i++){
					legion_arr.push(data[i].region);
					amt_arr.push(data[i].amt);
				}
				*/
				const ctx = document.getElementById('myChart');
				
				  new Chart(ctx, {
				    type: 'bar',
				    data: {
				      labels: x_arr,
				      datasets: [{
				        label: '지역별 대출 총합',
				        data: y_arr,
				        backgroundColor: [
				            'rgba(255, 99, 132, 0.2)',
				            'rgba(255, 159, 64, 0.2)',
				            'rgba(255, 205, 86, 0.2)',
				            'rgba(75, 192, 192, 0.2)',
				            'rgba(54, 162, 235, 0.2)',
				            'rgba(153, 102, 255, 0.2)',
				            'rgba(201, 203, 207, 0.2)'
				          ],
				          borderColor: [
				            'rgb(255, 99, 132)',
				            'rgb(255, 159, 64)',
				            'rgb(255, 205, 86)',
				            'rgb(75, 192, 192)',
				            'rgb(54, 162, 235)',
				            'rgb(153, 102, 255)',
				            'rgb(201, 203, 207)'
				          ],
				        borderWidth: 1
				      }]
				    },
				    options: {
				      scales: {
				        y: {
				          beginAtZero: true
				        }
				      }
				    }
				  });
				
			},
			error : function(){
				alert("실패");
			}
		});
		
	});
});
</script>
</head>
<body>
	<h2>차트그리기</h2>
	<label>데이터</label>
	<select name="data" id="data">
		<option value="region">지역별</option>
		<option value="period">기간별</option>
	</select>
	<button type="button" id="btn">검색</button>
	<br><br>
	<div id="main">
		<canvas id="myChart"></canvas>
	</div>
</body>
</html>