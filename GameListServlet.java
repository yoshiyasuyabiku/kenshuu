<%@page import="jp.co.tafs.kenshu.game.GameSearchConditionBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page language="java" import="jp.co.tafs.kenshu.*" %>
<%@ page language="java" import="java.util.*" %>

<%/* ����<jsp:useBean ...>�̍s�́A
     GameSearchConditionBean conditionBean = request.getAttribute("conditionBean");
     ArrayList gameList = (ArrayList)request.getAttribute("gameList");
   �Ɠ����ł��B*/%>
<jsp:useBean id="conditionBean" scope="request" class="jp.co.tafs.kenshu.game.GameSearchConditionBean" />
<jsp:useBean id="gameList" scope="request" class="java.util.ArrayList" />
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>�Q�[���Ǘ��V�X�e��</title>
		<style type=text/css>
			#searchForm{
				background-color:lightblue;
			}
			tr th {
				background-color:gray;
				color:white;
				font-weight:bold;
			}
			tr td {
				background-color:white;
				color:green;
			}
			table,th,td {
				border:solid thin;
			}
			.float-left {
				float:left;
			}
			span{
				display: inline-block;
				width: 7em;
			}
			
		</style>
	</head>
	<body>
	<script>
	function kakunin(){
		ret = confirm("�����𑱍s���܂����H");
		if(ret == true){
			location.href = "http://www.yahoo.co.jp/";
		}
	}
	</script>
	
		<h1>�Q�[���Ǘ��V�X�e��</h1>
		
		<%/*
		 <form>�̒��ɁA<input>��<select>���A�f�[�^����͂��邽�߂̃R���g���[����u���܂��B
		 form��submit����ƁA �����̃R���g���[���ɓ��͂����l���A�T�[�o�[�Ƀp�����[�^�Ƃ��đ��M����܂��B
		 ���M�̕��@(method)�ɂ́Apost��get������܂��B�i���ɂ�����܂����A�悭�g���̂͂���2��ށj
		 post��form�𑗐M����ƁAServlet��doPost(request,response)���Ă΂�Aget��form�𑗐M����ƁAdoGet(request,response)���Ă΂�܂��B
		 post�́A���M�����p�����[�^�̓��e�͌����܂���Bget�́AURL�̌��Ƀp�����[�^��������`�ł������ĕ\������܂��B
		 �u���E�U��URL�\�����ŁA?������΁A����?�ȍ~���p�����[�^�ł��B
		���Ƃ��΁A
		<form method="get" action="mypage">
		<input type="text" name="hoge1" value="fuga1">
		<input type="text" name="hoge2" value="fuga2">
		<input type="hidden" name="hoge3" value="fuga3">
		</form>
		�Ƃ����t�H�[����submit����ƁA�T�u�~�b�g��́A
		 http://tafs.co.jp/app/mypage?hoge1=fuga1&hoge2=fuga2&hoge3=fuga3
		 �ƂȂ�܂��Bpost�̏ꍇ��?�ȍ~�͌����܂���B�����ĂȂ��Ă��A���M�͂���܂��B
		�u���E�U��URL���͗���URL����͂��āAEnter�L�[���������ꍇ��get�ł̌Ăяo���ł��B
		
		*/%>	
		<form id="searchForm" method="post" action="">
			<h3>��������</h3>
			<p><span>�Q�[���^�C�g��:</span><input type="text" name="gameTitle" value="<%=conditionBean.getGameTitle()  %>"></p>
			<p><span>�n�[�h�E�F�A:</span><input type="text" name="hardware" value="<%=conditionBean.getHardware()  %>">
			<input type="submit" value="�V�K">
			<input type="submit" value="����" onClick="kakunin()"></p>
		</form>
		<p><%=request.getAttribute("message")%></p>
		
		<p><%=request.getAttribute("error")%></p>
		
		<p><%=request.getAttribute("List<GameBean>.gameList")%></p>
		<hr>
		<table class="float-left">
			<caption>�Q�[���}�X�^�ꗗ</caption>
			<tr>
				<th>No</th><th>�Q�[���^�C�g��</th><th>�n�[�h�E�F�A</th>
				
			</tr>
			<%for(int i = 0 ; i < gameList.size();i++){ %> 
			<%
			/*
			  * ������gameList����AServlet�œ��ꂽGameBean���ǂ�����Ēl���Ƃ��Ă��邩���A�ۑ�1�̎R��ł��B
			  * gameList�̌^�́AList�ł��B
			  * http://docs.oracle.com/javase/jp/6/api/java/util/List.html
			  * http://docs.oracle.com/javase/jp/6/api/java/util/ArrayList.html
			  * ���̕ӂ����āA�Ȃ�Ƃ�GameBean�����o���Ă݂Ă��������B
			  *
			  */
			%>
			
				<tr>
					<td>TODO �A�Ԃŕ\��</td>
					<td>TODO �����Ƀ^�C�g����\��</td>
					<td>TODO �����Ƀn�[�h�E�F�A��\��</td>
				</tr>
			<%} %>
		</table>
		<div class="float-left" style="width:500px;margin-top:50px;margin-left:50px">
			�ۑ�P
			<ol>
			<li>html��css����g���āA��ʃf�U�C�����������悭���܂��B<br>
			�����������f�U�C�����v�����Ȃ��l�́AWeb�V�X�e���d�l�����Q�l�ɂ��Ă��������B</li>
			<li>�n�߂̉�ʕ\���ŁA�unull�v�Ƃ����������\������Ȃ��悤�ɂ��܂��B</li>
			<li>�������J�n����O�ɁA�N���C�A���g����JavaScript�ŏ����𑱍s���邩�ǂ����̊m�F���b�Z�[�W��\�����܂��B
			<br>�L�����Z�������ꍇ�͌������s������߂܂��B</li>
			<li>DB�̌��C�ۑ�ō�����Q�[���}�X�^�̏�����ʉ����̈ꗗ�ɕ\�����܂��B</li>
			</ol>

			�ۑ�Q
			<ol>
			<li>���������ɓ��͂������e�ŁASQL�̌��������𑝂₵�āA�������ʂɔ��f�����܂��B</li>
			<li>�������J�n����O��JavaScript�œ��͂��`�F�b�N���܂��B<br>
				<ul>
					<li>�Q�[���^�C�g���ɒl�����͂���Ă��Ȃ��ꍇ�ɃG���[���b�Z�[�W�\��</li>
					<li>�n�[�h�E�F�A�ɒl�����͂���Ă��Ȃ��ꍇ�ɃG���[���b�Z�[�W�\��</li>
				</ul>
			</li>
			</ol>

			�ۑ�R
			<ol>
			<li>�Q�[���}�X�^�ꗗ�̌������ʌ�������ʂɕ\�����܂��B<br>
			�������A�����́Aselect count(*) from ...���g����DB����擾���Ă��������B
			</li>
			<li>�Q�[���}�X�^�ꗗ�ɁA�L�����N�^����\����������ǉ����Ă��������B</li>
			</ol>

			�ۑ�S
			<ol>
			<li>�e�Q�[���}�X�^�ꗗ�̍ŏI��ɁA�폜�{�^����ǉ����܂��B<br>
				�폜�{�^���������ƁA�Q�[���}�X�^�̊Y�����R�[�h���폜���܂��B
				<ul>
					<li>html��ҏW���A�폜�{�^����ǉ�</li>
					<li>GameDeleteServlet�̒ǉ�<li>
					<li>web.xml��servlet��o�^</li>
					<li>�폜�{�^�����N���b�N����ƁAGameDeleteServlet�Ƀ��N�G�X�g�𑗐M����B</li>
					<li>GameDeleteServlet��DB�̃��R�[�h����������</li>
					<li>�ꗗ��ʂ��ĕ\�����A���b�Z�[�W�u{�Q�[���^�C�g��}���폜���܂����B�v��\�����܂��B<br>
					�i{�Q�[���^�C�g��}�͍폜�����Q�[���^�C�g�����j
				</ul>
			</li>
			</ol>
			
			�ۑ�T
			<ol>
			<li>�e���Ŏ��R�ɃA�����W�������Ă݂܂��傤�B</li>
			<li>Web�V�X�e���d�l�����Q�l�ɁA�V�K�o�^�E�ҏW��ʂɂ����킵�Ă݂܂��傤�B</li>
			</ol>
			
			
		</div>
	</body>
</html>