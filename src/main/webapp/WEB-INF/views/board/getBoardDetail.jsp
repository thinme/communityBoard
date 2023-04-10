<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="./resource/js/jquery-3.3.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="./resource/js/board.js"></script>
<script src="./resource/js/member.js"></script>

<!-- 부트스트랩 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="./resource/css/style.css">
<meta charset="UTF-8">
<title>boardDtail</title>
</head>
<body>
<div class="all">
<input type="hidden" id="boardIdx" name="doardIdx" value="${boardDto.seqBoard}">
<table>
	<tr>
		<th>제 목 :</th>
		<td>${boardDto.title}</td>
	</tr>
	
	<tr>
		<th>작성자 :</th>
		<td>${boardDto.id}</td>
	</tr>
	
	<tr>
		<th>내 용 :</th>
		<td>${boardDto.contents}</td>
	</tr>
	
	<tr>
		<th>제목 :</th>
		<td>${boardDto.title}</td>
	</tr>
	
</table>
<button type="button" id="upBtn">수정하기</button>
<button type="button" id="delBtn">삭제하기</button>

</div>
</body>
</html>