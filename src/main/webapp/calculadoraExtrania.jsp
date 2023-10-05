<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="calculadoraExtrania.Calculadora"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora</title>
</head>
<body>

<%

String number = request.getParameter("num1");
String operator = request.getParameter("operator");
String valor = request.getParameter("valor");

if(request.getParameter("valor")==null){
	valor=" ";
}

if(request.getParameter("borrar")!=null){
	valor=" ";
}
if(number!=null && operator!=null && !number.isEmpty() && !operator.isEmpty()){
	valor+=operator+number;	
}

if(request.getParameter("calcular")!=null){
	valor += Calculadora.calcular(valor);
}
%>
<form action="calculadoraExtrania.jsp" method="get">
	<p>Number:
		<input type="text" name="num1">
	<select name="operator">
		<option value="+">+</option>
		<option value="-">-</option>
	</select>
	</p>

	<textarea name="valor" rows="4"><%= valor %></textarea>
	<br>
	<button type="submit" name="anadir">Añadir</button>
	<button type="submit" name="borrar">Borrar</button>
	<button type="submit" name="calcular">Calcular</button>
</form>
</body>
</html>