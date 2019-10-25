<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 <!-- 테이블 CDN -->
 <link rel="stylesheet" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
 <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
<title>Insert title here</title>
</head>
<style>
.outer {
	width: 1500px;
}

.innerDiv {
	display: table;
	align: center;
	padding: 5px;
	width: 1200px;
	height: 700px;
	float: left;
	margin-top: 110px;
	min-width: 1200px;
	text-align:center;
}
.chartDiv{
	display:table-cell;
	float:right;
	width:500px; 
	height:400px;
	margin-left:20px;
	margin-right:20px;
}
.tableDiv{
	min-width: 1000px;
}
</style>
<body>
	<%@ include file="../admin/adminMenubar.jsp"%>
	<div class="outer">
		<div class="innerDiv">
			<div class="card chartDiv" style="width:500px; height:400px;">
				<div class="card-header bg-primary text-white">최근 판매 내역</div>
				<div class="card-body">
					<canvas id="chart1" width="400" height="400"></canvas>
				</div>
			</div>
			<div class="card chartDiv">
				<div class="card-header bg-primary text-white">전체 판매 차트</div>
				<div class="card-body"></div>
			</div>
		</div>
		<div>
			<div class="card">
				<div class="card-header bg-primary text-white">전체 판매 차트</div>
				<div class="card-body" >
					
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
	
		$(function() {

			var ctx = $('#chart1').getContext('2d');
			var myDoughnutChart = new Chart(ctx, {

				type : 'doughnut',
				data : {
					datasets : [ {
						data : [ 10, 20, 30, 20, 10 ],
						backgroundColor : [

						'rgba(190, 190, 190, 1)',

						'rgba(241, 196, 15, 1)',

						'rgba(244, 7, 7, 1)',

						'rgba(52, 152, 219, 1)',

						'rgba(46, 204, 113, 1)'

						],

					} ],

					labels : [ '미지정', '다음주 이후', '이번주 까지', '완료', '기한 만료' ]
				},

				options : {
					maintainAspectRatio : false,
					cutoutPercentage : 50,
					legend : {
						display : true,
						position : 'left',
						labels : {
							fontSize : 12,
							fontFamily : 'sans-serif',
							fontColor : '#000000',
							fontStyle : 'bold'
						}
					}
				}
			});

		});
	</script>
</body>
</html>