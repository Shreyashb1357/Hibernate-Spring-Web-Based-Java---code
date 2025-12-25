<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Person Entry Page</title>
    <style>
        /* Body styling with a gradient background */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(120deg, #89f7fe, #66a6ff);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            animation: fadeIn 2s ease-in;
        }

        /* Fade-in animation */
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        /* Container styling */
        .form-container {
            background: rgba(255, 255, 255, 0.95);
            padding: 40px 80px;
            border-radius: 15px;
            box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        h1 {
            color: #1e3c72;
            margin-bottom: 20px;
            animation: slideDown 1s ease-out;
        }

        @keyframes slideDown {
            from { transform: translateY(-20px); opacity: 0; }
            to { transform: translateY(0); opacity: 1; }
        }

        /* Input fields styling */
        input[type="text"] {
            width: 80%;
            padding: 10px;
            margin: 10px 0 20px 0;
            border-radius: 8px;
            border: 2px solid #66a6ff;
            transition: 0.3s;
        }

        input[type="text"]:focus {
            border-color: #1e3c72;
            box-shadow: 0 0 8px #66a6ff;
            outline: none;
        }

        /* Submit button styling */
        input[type="submit"] {
            background: #1e3c72;
            color: white;
            padding: 12px 25px;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 16px;
            transition: 0.3s;
        }

        input[type="submit"]:hover {
            background: #66a6ff;
            transform: scale(1.05);
        }

        pre {
            text-align: left;
        }
    </style>
</head>

<body>
    <div class="form-container">
        <h1>Person Entry Page</h1>
        <h1>Enter Details:</h1>
        <form action="bmi" method="post">
            <pre>
Name        : <input type="text" name="name"> 

Height (cm) : <input type="text" name="height">

Weight (kg) : <input type="text" name="weight">

             <input type="submit" value="GET BMI">
            </pre>
        </form>
    </div>
</body>

</html>








<!-- 
<!DOCTYPE html>
<html>

<body>
	<h1 style="color: blue">
		Person Entry Page.
	</h1>
	<h1 style="color: blue">
		Enter Details :
	</h1>
		<form action="bmi" method="post">
			<pre>
				Name        : <input type="text" name="name"> 
				
				Height (cm) : <input type="text" name="height">
				
				Weight (cm) : <input type="text" name="weight">
				
							<input type="submit" value="GET BMI">
			</pre>
		</form>
</body>
</html>

-->