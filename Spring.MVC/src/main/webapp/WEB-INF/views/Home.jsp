<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Home Page</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(to right, #ff7e5f, #feb47b);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: 'Arial', sans-serif;
        }

        .home-card {
            background-color: #fff;
            padding: 50px;
            border-radius: 15px;
            text-align: center;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            animation: fadeIn 1s ease-in-out;
        }

        h1 {
            color: #ff5733;
            font-size: 2.5rem;
            margin-bottom: 20px;
            animation: slideIn 1s ease-in-out;
        }

        p {
            font-size: 1.2rem;
            color: #555;
        }

        .btn-home {
            margin-top: 30px;
            background-color: #ff5733;
            color: white;
            font-weight: bold;
            padding: 10px 20px;
        }

        .btn-home:hover {
            background-color: #c70039;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        @keyframes slideIn {
            from { opacity: 0; transform: translateX(-50px); }
            to { opacity: 1; transform: translateX(0); }
        }
    </style>
</head>

<body>
    <div class="home-card">
        <h1>Spring MVC Welcomes You!</h1>
        <p>Explore the application and enjoy a smooth user experience.</p>
        <a href="Login" class="btn btn-home">Go to Login</a>
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
	Spring MVC Welcome you
	</h1>
</body>
</html>

 -->