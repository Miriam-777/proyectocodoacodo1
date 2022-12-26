Date: 14/12/2022
Time: 21:48
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form method="post"  action="<%=request.getContextPath()%>/CreateController">
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">id_persona</label>
        <input name="id_persona"  type="number" class="form-control" id="exampleFormControlInput1" placeholder="id_persona" maxlength="50">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">nombre</label>
        <input name="nombre" type="text" class="form-control" id="exampleFormControlTextarea1">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">apellido</label>
        <input name="apellido" type="text" class="form-control" id="exampleFormControlTextarea1">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">edad</label>
        <input name="edad" type="number" class="form-control" id="exampleFormControlTextarea1" maxlength="7">
    </div>
    <button class="btn btn-primary">
        Dar de alta
    </button>

</form>
</body>
</html>