<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="head.jsp"%>

<html>
<head>
    <style>
        table {
            width: 100%;
            border: 2px solid black;
        }

        th {
            border: 2px solid black;
        }

        tr {
            border: 1px dashed black;
        }
    </style>
</head>

<body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table>
        <thead>
            <th>First Name</th>
            <th>Last Name</th>
            <th>ID</th>
            <th>Age</th>
        </thead>
        <tbody>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.userid}</td>
                    <td>${user.calculateAge()}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <h3><a href="index.jsp" ><-- Back to Search</a></h3>
</div>

</body>
</html>
