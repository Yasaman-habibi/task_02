<html>
   <head>
      <title>Using GET and POST Method to Read Form Data</title>
   </head>
   
   <body>
      <center>
      <h1>Using POST Method to Read Form Data</h1>
      <h4>http://127.0.0.1:8080/registerform</h4>
	  
      <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("FirstName")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("LastName")%>
         </p></li>
		 <li><p><b>Date:</b>
		     <%= request.getParameter("Date")%>
		 </p></li>
      </ul>

   </body>
</html>