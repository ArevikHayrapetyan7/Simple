<html>
<head>
</head>
<body>
<h2>Hello World!</h2>


<form action = "/HelloForm" method = "GET">
    First Name: <input type = "text" name = "first_name">
    <br />
    Last Name: <input type = "text" name = "last_name" />
    <input type = "submit" value = "Submit" />
</form>

<form  action="/delete" method="GET">
    <button type = "Submit">Delete First Name Cookie</button>
</form>

<form method="get" action="/add">
   First Input: <input type="number" name="num1"><br>
    Second Input: <input type="number" name="num2"><br>
    <button type="submit"> button</button>
</form>
<form method="get" action="/refresh">
    First Input: <input type="number" name="num3"><br>
    Second Input: <input type="number" name="num4"><br>
    <button type="submit"> button</button>
</form>


</body>
</html>
