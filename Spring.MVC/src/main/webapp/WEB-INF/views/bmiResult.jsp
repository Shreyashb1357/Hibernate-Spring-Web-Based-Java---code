<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>BMI Result</title>
    <style>
        /* Body styling with gradient background */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #fddb92, #d1fdff);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            animation: fadeIn 2s ease-in;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: scale(0.9); }
            to { opacity: 1; transform: scale(1); }
        }

        /* Result card styling */
        .result-card {
            background: rgba(255, 255, 255, 0.95);
            padding: 50px 70px;
            border-radius: 20px;
            box-shadow: 0 15px 40px rgba(0, 0, 0, 0.2);
            text-align: center;
            animation: slideUp 3s ease-out;
        }

        @keyframes slideUp {
            from { transform: translateY(30px); opacity: 0; }
            to { transform: translateY(0); opacity: 1; }
        }

        h1 {
            margin: 15px 0;
            color: #1e3c72;
        }

        .bmi-value {
            font-size: 2.5em;
            font-weight: bold;
            color: #ff6f61;
            animation: pulse 1.5s infinite;
        }

        @keyframes pulse {
            0% { transform: scale(1); }
            50% { transform: scale(1.1); }
            100% { transform: scale(1); }
        }

        /* Button to go back */
        .back-btn {
            margin-top: 30px;
            padding: 12px 25px;
            background: purple;
            color: white;
            border: none;
            border-radius: 10px;
            cursor: pointer;
            font-size: 16px;
            transition: 0.3s;
            text-decoration: none;
        }

        .back-btn:hover {
            background: #66a6ff;
            transform: scale(1.05);
        }
    </style>
</head>

<body>
    <div class="result-card">
        <h1>Showing Result</h1>
        <h1>Name: ${personName}</h1>
        <h1>BMI: <span class="bmi-value">${personBmi}</span></h1>
        <a href="/person" class="back-btn">Back to Entry</a>
    </div>
</body>

</html>








<!-- 
<!DOCTYPE html>
<html>

<body>
	<h1>Showing Result</h1>
	<h1>Name : ${personName}</h1>
	<h1>BMI : ${personBmi}</h1>
	
</body>
</html>-->