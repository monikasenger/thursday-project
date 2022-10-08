<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>forget password</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
<script>
function change() {
	alert("successfully  change password");
	}
</script>
</head>
<body>
<div class="main">

		<!-- Sing in  Form -->
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="forget-image">
						<figure class="frg-image">
							<img src="images/6.jpg" alt="sign in image" >
						</figure>
						<a href="login.jsp" class="signup-image-link">Back to login</a>
							</div>

					<div class="signin-form">
						<h2 class="form-title">Forget password?</h2>
						<form method="post" action="forgetservlet" class="register-form"
							id="login-form">
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="username"
									placeholder="Your email" />
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="password" id="password"
									placeholder="new password" />
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="n_password" id="password"
									placeholder=" confirm Password" />
							</div>
							
							<div class="form-group form-button">
								<input type="submit" name="forget" id="forget"
									class="form-submit" value="change password" onclick="change()"/>
							</div>
						</form>
						
					</div>
				</div>
			</div>
		</section>

	</div>

	
</body>
</html>