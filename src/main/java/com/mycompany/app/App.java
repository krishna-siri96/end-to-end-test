<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Web Application</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        .container {
            width: 80%;
            max-width: 1200px;
            margin: 20px;
        }
        .header {
            text-align: center;
            margin-bottom: 20px;
        }
        .content {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 20px;
        }
        .description {
            width: 60%;
        }
        .image {
            width: 30%;
            text-align: center;
        }
        .image img {
            max-width: 100%;
            height: auto;
        }
        .login {
            width: 100%;
            text-align: center;
        }
        .login input {
            padding: 10px;
            margin: 5px;
            font-size: 16px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>Welcome to My Web Application</h1>
        </div>
        <div class="content">
            <div class="description">
                <p>This is a short description of the web application. Here, you can provide information about the purpose and features of the application to the users.</p>
            </div>
            <div class="image">
                <img src="stock-image-1.jpeg" alt="Placeholder Image">
            </div>
        </div>
        <div class="login">
            <h2>Login</h2>
            <form action="#" method="post">
                <input type="text" name="username" placeholder="Username" required>
                <input type="password" name="password" placeholder="Password" required>
                <br>
                <input type="submit" value="Login">
            </form>
        </div>
    </div>
</body>
</html>
