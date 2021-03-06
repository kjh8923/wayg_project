<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>   
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta id="_csrf" name="_csrf" content="${_csrf.token}" />
<meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://kit.fontawesome.com/b4e02812b5.js" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stylesheet" type="text/css" href="../css/includes/header.css" />
<link rel="stylesheet" type="text/css" href="../css/includes/footer.css" />
<link rel="stylesheet" type="text/css" href="../css/post/addPost.css" />
<title>List</title>
</head>

<script>
var dateCount = '<c:out value="${planMstDto.dateCount}" />';

var planDt = new Array();

<c:forEach items="${planDtDtos}" var="item">

	<c:choose>
		<c:when test="${empty item.placeName}">
			var placeName = "Place";
		</c:when>
		
		<c:otherwise>
			var placeName = "${item.placeName}";
		</c:otherwise>
	</c:choose>

	<c:choose>
		<c:when test="${empty item.startTime}">
			var startTime = "- - : - -";
		</c:when>
		
		<c:otherwise>
			var startTime = "${item.startTime}";
		</c:otherwise>
	</c:choose>
	
	<c:choose>
		<c:when test="${empty item.endTime}">
			var endTime = "- - : - -";
		</c:when>
		
		<c:otherwise>
			var endTime = "${item.endTime}";
		</c:otherwise>
	</c:choose>


	var dto = {
			planDtNum : '${item.planDtNum}',
			planDay : '${item.planDay}',
			placeName : placeName,
			startTime : startTime,
			endTime : endTime,
			theme : '${item.theme}'
	}
	
	planDt.push(dto);
</c:forEach>
</script>

<body class="bg-light">

<%@ include file="../includes/header.jsp" %>
 <br/><br/>
 <section class="container mb-5">
 
 	<div class="posting-box row mx-0">
 		<div class="col-4">
			<div class="detail-days row mx-0 d-flex" data-count="">
				<%-- 3-1- ?????? ????????? planDay --%>
				<h4 id="plan-day" class="display-4 col-9 font-italic">DAY 1</h4>

				<%-- 3-2- ?????? planDay ?????? ?????? --%>
				<button type="button" class="btn btn-outline-default text-dark col-1" id="prev-btn" data-index="0">
					<i class="fa-solid fa-angle-left"></i>
				</button>
				
				<%-- 3-3- ?????? planDay ?????? ?????? --%>
				<button type="button" class="btn btn-outline-default text-dark col-1" id="next-btn" data-index="2">
					<i class="fa-solid fa-angle-right"></i>
				</button>
			</div>
			
			<%-- 4- ?????? ?????? ?????? ?????? --%>
			<div class="plan-details mt-1">
				<%-- 4-2- ?????? ????????? ?????? ??????, ??????/?????? ????????? ?????? --%>
				<div id="details1" class="px-0">
					<c:forEach begin="1" end="10" var="i">
						<div class="list-group-item planDt${i} row flex-wrap d-flex mx-0 px-1 pt-2">
							<h4 class="placeName col-10 font-italic"></h4>
							<button type="button" class="btn btn-sm btn-success col-1 px-0 py-0 addLocBtn">+</button>
							<h6 class="font-italic col-6 startTime"></h6>
							<h6 class="font-italic col-6 endTime"></h6>
						</div>
					</c:forEach>
				</div>
			</div>
 		</div>
 		
		<form id="addForm" action="modifyExcute.do?postNo=${postDto.postNo}&${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data" class="col-8">
			<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>
			<input type="hidden" name="email" value="${user}"/>
			<input type="hidden" name="planNum" value="${planMstDto.planNum}" />		
			<div class="planDt">
				<c:forEach items="${postDto.postDt}" var="postDt1">
					<input type="hidden" name="planDtNum" data-group="${postDt1.planDtNum }" value="${postDt1.planDtNum }"/>
					<input type="hidden" name="placeName" data-group="${postDt1.planDtNum }" value="${postDt1.location }"/>
				</c:forEach>			
			</div>
			
			
			
			<div class="list-group-item py-1 mb-1">
				<input type="hidden" name="delDtNum" value="" />
				<h4 class="px-0">Location</h4>
				<p id="notice">?????? 10?????? ????????? ????????? ??? ????????????.</p>
				<div class="locations-box"></div>
			</div>
			
			<div class="list-group-item mb-1 row d-flex mx-0 px-0">
				<div class="col-10">
					<h4>Image</h4>
					<p id="notice">?????? 10???, ?????? ?????? 20MB??? ????????? ??? ????????????.</p>
				</div>
				
				<div class="col-2 text-center mt-1">
					<button type="button" class="btn btn-xl btn-primary addImgBtn">
						<i class="fa-brands fa-instagram"></i>
					</button>
					<div class="input-group" style="display: none">
						<div class="custom-file">
							<input name="img" type="file" class="img custom-file-input" placeholder="img" id="inputGroupFile01" multiple="multiple">
							<label class="custom-file-label" for="inputGroupFile01">Choose file</label>
						</div>
					</div>
				</div>
				
				
				<hr />
				
				<!-- ???????????? ????????? ?????? -->
				<p class="font-italic col-12 ml-1 mb-1">before</p>
				<div class="beforeImg col-12 mb-2" style="display: flex; flex-wrap: nowrap;"></div>
				
				<p class="font-italic col-12 ml-1 mb-1">added</p>
				<div class="imgView col-12" style="display: flex; flex-wrap: nowrap;"></div>
				<!-- ????????? ????????? ?????? -->
				<input name="addImg" type="file" class="addImg" multiple="multiple" style="display: none;">
				<input name="images" type="hidden" class=" form-control images" value="${postDto.images}">
    			<input name="deleteImg" type="hidden" class=" form-control deleteImg" >
			</div>



			<div class="list-group-item form-group mb-1">
				<h4>Content</h4>
				<p id="notice">??????????????? ?????? 10??? ????????? ????????? ??? ????????????.&nbsp;<span class="textCount" style="font-weight: 600;">( 0/300??? )</span></p>
				<hr />
				<input name="usertag" type="text" class="title form-control" placeholder="@user">
				<textarea class="form-control content mt-2" name="content" rows="10" cols="40" placeholder="content" required>${postDto.content}</textarea>
				<input name="hashtag" type="text" class="title form-control mt-2 hashtag" placeholder="#HASHTAG" value="${postDto.hashtag}">
			</div>
			
			<div class="list-group-item button-group row mx-0 d-flex justify-content-around">
		        <input type="button" class="btn btn-sm btn-primary col-6 border-white" onclick="checkfrm()" value="??????"/>
		        <input type="button" class="btn btn-sm btn-danger col-6 border-white" data-dismiss="modal" value="????????? ??????"/>
			</div>
		</form>
	
	</div>
</section>
<%@ include file="../includes/footer.jsp" %>
<script src="../js/post/modifypost.js"></script>

</body>
</html>