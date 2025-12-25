<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Login Failed</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(to right, #ff416c, #ff4b2b);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: 'Arial', sans-serif;
        }

        .error-card {
            background-color: #fff;
            padding: 50px;
            border-radius: 15px;
            text-align: center;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            animation: fadeIn 1s ease-in-out;
        }

        h1 {
            color: #dc3545;
            font-size: 2.5rem;
            margin-bottom: 20px;
            animation: shake 0.5s;
            animation-iteration-count: 2;
        }

        p {
            font-size: 1.2rem;
            color: #555;
        }

        .btn-retry {
            margin-top: 30px;
            background-color: #dc3545;
            color: white;
            font-weight: bold;
            padding: 10px 20px;
        }

        .btn-retry:hover {
            background-color: #a71d2a;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        @keyframes shake {
            0% { transform: translateX(0); }
            25% { transform: translateX(-10px); }
            50% { transform: translateX(10px); }
            75% { transform: translateX(-10px); }
            100% { transform: translateX(0); }
        }
    </style>
</head>

<body>
    <div class="error-card">
        <h1>ERROR!!!</h1>
        <p>Invalid username or password. Please try again.</p> <br/>
       
        <a href="Login" class="btn btn-retry">Retry Login</a>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>








<!-- <!DOCTYPE html>
<html>

<body>
	<h1 style="color: blue">
		ERROR!!!
	</h1>
</body>
</html>
 -->