<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>forget password</title>


 <script src="https://kit.fontawesome.com/496a1af3db.js" crossorigin="anonymous"></script> <!-- icon link-->

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

		<!-- forget  Form -->
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
				<!-- image -->
					<div class="forget-image">
						<figure class="frg-image">
							<img src="images/for1.jpg" alt="sign in image" >
						</figure>
						<a href="login.jsp" class="signup-image-link">Back to login</a>
							</div>
<!-- forge  Form fields -->
					<div class="signin-form">
						<h2 class="form-title">Forget password?</h2>
						<form method="post" action="forgetservlet" class="register-form"
							id="login-form">
							<div class="form-group">
								<label for="email"><i class="fa fa-envelope" aria-hidden="true"></i></label> <input
									type="email" name="email" id="email"
									placeholder="Your email" />
							</div>
							<div class="form-group">
								<label for="password"><i class="fa fa-lock" aria-hidden="true"></i></label> <input
									type="password" name="password" id="password"
									placeholder="new password" />
							</div>
							<div class="form-group">
								<label for="password"><i class="fa fa-lock" aria-hidden="true"></i></label> <input
									type="password" name="n_password" id="password"
									placeholder=" confirm Password" />
							</div>
							<!-- forget  Form button-->
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
