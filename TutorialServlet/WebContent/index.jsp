<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ejemplo Servlet</h1>
	<!-- En action especificamos a que mapping queremos que nos redirija -->
	<form action="Mainservlet" method="get">
		<select name="dep">
			<option value="volvo">Labo quimica</option>
			<option value="ahaab">Labo DEI</option>
		</select>
		<label>Presupuesto: </label><input name="dinero" type="text">
		<label>Numero: </label><input name="nLabos" type="number">
		<input type="submit" value="Calcular">
	</form>
</body>
</html>