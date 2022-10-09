<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form</title>


 <script src="https://kit.fontawesome.com/496a1af3db.js" crossorigin="anonymous"></script> <!-- icon link-->

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
<script>
function onSubmit() {
	alert("incorrect password and email");
	}
</script>
</head>
<body >

	<div class="main">
		<!-- Sing in  Form -->
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
				<!-- Sing in  Form  image-->
					<div class="signin-image">
						<figure>
							<img src="images/signin-image.jpg" alt="sing up image">
						</figure>
						<a href="registration.jsp" class="signup-image-link">Create an
							account</a>
							<a href="forget.jsp" class="signup-image-link">forget password</a>
					</div>
<!-- Sing in  Form fields -->
					<div class="signin-form">
					<div id="display"></div>
						<h2 class="form-title">Sign in</h2>
						<form method="post" action="loginservlet" class="register-form"
							id="login-form">
							<div class="form-group">
								<label for="email"><i class="fa fa-envelope" aria-hidden="true"></i></label> <input
									type="email" name="email" id="email"
									placeholder="Your email" />
							</div>
							<div class="form-group">
								<label for="password"><i class="fa fa-lock" aria-hidden="true"></i></label> <input
									type="password" name="password" id="password"
									placeholder="Password" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="remember-me" id="remember-me"
									class="agree-term" /> <label for="remember-me"
									class="label-agree-term"><span><span></span></span>Remember
									me</label>
							</div>
							<!-- Sing in  Form  button-->
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Log in" onclick="savedata()" />
							</div>
						</form>
						<!-- Sing in  Form icons -->
						<div class="social-login">
							<span class="social-label">Or login with</span>
							<ul class="socials">
								<li><a href="#"><i class="fa fa-facebook" aria-hidden="true" ></i></a></li>
								<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
								<li><a href="#"><i class="fa fa-google" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</section>
</div>


	
</body>

</html>