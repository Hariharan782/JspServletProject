<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
<h2>Registration Form</h2>
<Br />
<Form action="processRegistration" method="post">
User Name <input type="Text" name="uname">
<Br />
 Password <Input type="password"  name="pwd" />
 <Br />
 City <Input type="Text" name="city" />
 <Br/>
 Code <Input type="Text" name="code" />
 <Br />
 <Input type="Submit" value="Process" />
 <Input type="ReSet" />
</Form>

</body>
</html>