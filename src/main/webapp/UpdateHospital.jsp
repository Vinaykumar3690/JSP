<%@page import="com.jsp.Dto.Hospital"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Details</title>
  <style>
  
  .submit-button {
        background-color: green;
        color: white;
        padding: 10px 20px;
        border-radius: 5px;
        transition: all 0.5s ease;
        cursor: pointer;
      }
      .submit-button:hover {
        background-color: purple;
      }
  
  .hospital-symbol {
        width: 100px;
        height: 100px;
        background-color: blue;
        display: flex;
        justify-content: center;
        align-items: center;
        border-radius: 50%;
        transition: all 0.5s ease;
      }
      .hospital-symbol:hover {
        width: 75px;
        height: 75px;
        background-color: red;
      }
      
    .container {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      background-color: #f2f2f2;
    }

    .card {
      background-color: lightblue;
      width: 400px;
      padding: 40px;
      border-radius: 10px;
      box-shadow: 2px 2px 10px #333;
      text-align: center;
      transition: box-shadow 0.3s ease-in-out;
    }

    .card:hover {
      box-shadow: 4px 4px 20px #333;
    }

    h1 {
      font-size: 24px;
      margin-bottom: 30px;
    }

    .avatar {
      width: 120px;
      height: 120px;
      border-radius: 50%;
      overflow: hidden;
      margin: 0 auto;
      margin-bottom: 20px;
      box-shadow: 2px 2px 10px #333;
      transition: box-shadow 0.3s ease-in-out;
    }

    .avatar:hover {
      box-shadow: 4px 4px 20px #333;
    }

    img {
      width: 100%;
      height: 100%;
    }

    table {
      margin: 0 auto;
      margin-top: 20px;
      border-collapse: collapse;
      width: 80%;
      background-color: silver;
    }

    th, td {
      border: 1px solid #ccc;
      padding: 10px;
      text-align: left;
    }

    th {
      background-color: #4CAF50;
      color: #fff;
    }
  </style>
</head>
<body>

<%Hospital hospital=(Hospital)request.getAttribute("hospital"); %>
  <div class="container">
    <div class="card">
      <h1>Hospital Details</h1>
      
     <center> <div class="hospital-symbol">
      <span style="color: white; font-size: 80px;">+</span>
    
      </div>
      </center>
      <form action="update" method="post">
      <table>
      
      <tr>
          <th>id:</th>
          <td> <input type="text" placeholder="Enter your id" name="id" required="required" value="<%=hospital.getId()%>"><br><br></td>
        </tr>

        <tr>
          <th>NAME:</th>
          <td> <input type="text" placeholder="Enter your name" name="name" required="required" value="<%=hospital.getName()%>"><br><br></td>
        </tr>
        <tr>
          <th>WEBSITE:</th>
          <td>  <input type="text" placeholder="Enter your website" name="website" required="required" value="<%=hospital.getWebsite()%>"><br><br> </td>
        </tr>
        <tr>
          <th>PHONE:</th>
          <td>  <input type="text" placeholder="Enter your phone" name="phone" required="required" value="<%=hospital.getPhone()%>"><br><br></td>
        </tr>      
        
      </table>
     <br><br> <center  >  <input type="submit" value="Submit" class="submit-button" required="required"></center><br>
    </form>
    </div>
 </div>
 </body>
</html>

