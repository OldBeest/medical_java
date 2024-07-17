<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="/css/style.css">
  <link rel="stylesheet" href="/css/notice_list.css">
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=044095679ba819d027469bb24d1c80fc"></script>
</head>
<body>
<section>
	<script type="text/javascript">
	$(function(){
		$("#sBtn").on("click", function(){
			alert("클릭!")
			$.ajax({
				url : "public_data",
				type : "post",
				data : {},
				dataType : "json",
				success : function(data){
					alert('성공');
					
					let arr = data.response.body.items.item;
					
					let htmlData = "";
					
					for(let i=0; i<arr.length; i++){
						
						htmlData += '<tr>';
						htmlData += '<td><span class="table-notice">' + arr[i].galContentId + '</span></td>';
						htmlData += '<td class="table-title">' + arr[i].galTitle + '</td>';
						htmlData += '<td>' + arr[i].galPhotographyLocation +'</td>';
						htmlData += '<td>' + arr[i].galPhotographer + '</td>';
						htmlData += '<td>' + arr[i].galModifiedtime + '</td>';
						htmlData += '<td><img style="width : 20%" src=" ' + arr[i].galWebImageUrl + '"></td>';
						htmlData += '</tr>';
					}
					$("#tbody").html(htmlData);
					
				},
				error : function(){
					alert('실패');
				}
			});
		});
	});
	
	</script>
    <h1>NOTICE</h1>
    <div class="wrapper">
      <form action="/search" name="search" method="post">
        <select name="category" id="category">
          <option value="all">페이지</option>
          <option value="title">제목</option>
          <option value="content">내용</option>
        </select>

        <div class="title">
          <input type="text" name="page" id="page" size="16">
        </div>
  
        <button type="button" id="sBtn"><i class="fas fa-search"></i></button>
      </form>
    </div>
	<!-- 지도를 표시할 div -->
	<div id="mapBody">
		<div id="map" style="width:100%;height:400px;"></div>
		<script>
			var container = document.getElementById('map');
			var options = {
				center: new kakao.maps.LatLng(37.485430, 126.898244),
				level: 3
			};
	
			var map = new kakao.maps.Map(container, options);
			
			// 지도를 클릭한 위치에 표출할 마커입니다
			var marker = new kakao.maps.Marker({ 
			    // 지도 중심좌표에 마커를 생성합니다 
			    position: map.getCenter() 
			}); 
			// 지도에 마커를 표시합니다
			marker.setMap(map);

			// 지도에 클릭 이벤트를 등록합니다
			// 지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다
			kakao.maps.event.addListener(map, 'click', function(mouseEvent) {        
			    
			    // 클릭한 위도, 경도 정보를 가져옵니다 
			    var latlng = mouseEvent.latLng; 
			    
			    // 마커 위치를 클릭한 위치로 옮깁니다
			    marker.setPosition(latlng);
			    
			    var message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';
			    message += '경도는 ' + latlng.getLng() + ' 입니다';
			    
			    var resultDiv = document.getElementById('clickLatlng'); 
			    resultDiv.innerHTML = message;
			    
			});
			var positions = [
			    {
			        title: '카카오', 
			        latlng: new kakao.maps.LatLng(33.450705, 126.570677)
			    },
			    {
			        title: '생태연못', 
			        latlng: new kakao.maps.LatLng(33.450936, 126.569477)
			    },
			    {
			        title: '텃밭', 
			        latlng: new kakao.maps.LatLng(33.450879, 126.569940)
			    },
			    {
			        title: '근린공원',
			        latlng: new kakao.maps.LatLng(33.451393, 126.570738)
			    }
			];

			// 마커 이미지의 이미지 주소입니다
			var imageSrc = "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png"; 
			    
			for (var i = 0; i < positions.length; i ++) {
			    
			    // 마커 이미지의 이미지 크기 입니다
			    var imageSize = new kakao.maps.Size(24, 35); 
			    
			    // 마커 이미지를 생성합니다    
			    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); 
			    
			    // 마커를 생성합니다
			    var marker = new kakao.maps.Marker({
			        map: map, // 마커를 표시할 지도
			        position: positions[i].latlng, // 마커를 표시할 위치
			        title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
			        image : markerImage // 마커 이미지 
			    });
			}
		</script>
	<p><em>지도를 클릭해주세요!</em></p> 
	<div id="clickLatlng"></div>
	</div>
	
    <table>
      <colgroup>
        <col width="15%">
        <col width="25%">
        <col width="15%">
        <col width="15%">
        <col width="15%">
        <col width="15%">
      </colgroup>
      <!-- 제목부분 -->
      <tr>
        <th>사진번호</th>
        <th>제목</th>
        <th>위치</th>
        <th>작가</th>
        <th>촬영일</th>
        <th>미리보기</th>
      </tr>
      <!-- 내용부분 -->
      <tbody id="tbody">
      </tbody>
      
    </table>

    <ul class="page-num">
      <li class="first"></li>
      <li class="prev"></li>
      <li class="num"><div>1</div></li>
      <li class="next"></li>
      <li class="last"></li>
    </ul>

    <a href="write_view.jsp"><div class="write">쓰기</div></a>
  </section>

</body>
</html>