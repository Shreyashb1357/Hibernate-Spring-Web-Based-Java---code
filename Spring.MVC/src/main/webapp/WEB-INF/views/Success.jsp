<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Success</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(to right, #00b09b, #96c93d);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: 'Arial', sans-serif;
        }

        .success-card {
            background-color: #fff;
            padding: 50px;
            border-radius: 15px;
            text-align: center;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            animation: fadeIn 1s ease-in-out;
        }

        h1 {
            color: #28a745;
            font-size: 2.5rem;
            animation: bounce 1s ease;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        @keyframes bounce {
            0% { transform: scale(0.8); }
            50% { transform: scale(1.2); }
            100% { transform: scale(1); }
        }

        .btn-home {
            margin-top: 30px;
            background-color: #28a745;
            color: #fff;
            font-weight: bold;
            width: 150px;
        }

        .btn-home:hover {
            background-color: #218838;
        }
    </style>
</head>

<body>
    <div class="success-card">
        <h1>SUCCESSFUL</h1>
        <p class="lead">You have logged in successfully!</p>
        <a href="Login" class="btn btn-home">Go Back</a>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>




<!--  

<!DOCTYPE html>
<html>

<body>
	<h1 stye="color: blue">
		SUCCEFULL
	</h1>
</body>
</html> 
-->