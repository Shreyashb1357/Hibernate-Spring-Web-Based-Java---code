<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Custom CSS for animation -->
    <style>
        body {
            background: linear-gradient(to right, #6a11cb, #2575fc);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: 'Arial', sans-serif;
        }

        .login-card {
            background-color: #fff;
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.3);
            animation: fadeIn 1s ease-in-out;
        }

        h1 {
            color: #2575fc;
            text-align: center;
            margin-bottom: 30px;
            animation: slideIn 1s ease-in-out;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        @keyframes slideIn {
            from { opacity: 0; transform: translateX(-50px); }
            to { opacity: 1; transform: translateX(0); }
        }

        .btn-custom {
            background-color: #2575fc;
            color: white;
            width: 100%;
            font-weight: bold;
        }

        .btn-custom:hover {
            background-color: #6a11cb;
        }
    </style>
</head>

<body>
    <div class="login-card col-md-4">
        <h1>Please Sign In</h1>
        <form action="validate" method="post">
            <div class="mb-3">
                <label for="uid" class="form-label">User Name</label>
                <input type="text" class="form-control" id="uid" name="uid" placeholder="Enter username" required>
            </div>

            <div class="mb-3">
                <label for="pwd" class="form-label">Password</label>
                <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Enter password" required>
            </div>

            <button type="submit" class="btn btn-custom mt-3">Sign In</button>
        </form>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>
   
 
<!--
<!DOCTYPE html>
<html>

<body>
	<h1 style="color: blue">
		Please Sign-In
	</h1>
		<form action="validate" method="post">
			<pre>
				UserName : <input type="text" name="uid"> 
				
				Password : <input type="password" name="pwd">
				
							<input type="submit" value="Sign-In">
			</pre>
		</form>
</body>
</html> -->