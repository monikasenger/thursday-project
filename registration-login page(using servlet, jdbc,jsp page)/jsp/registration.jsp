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
	alert("successfully added");
	}
</script>
</head>
    <body>
    <!-- Sing up  Form -->
       <section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
					
						<h2 class="form-title">Sign up</h2>
					<!-- Sing up  Form fields -->
						<form method="post" action="registrationservlet" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="name"><i class="fa fa-user" aria-hidden="true"></i></label> <input
									type="text" name="name" id="name" placeholder="Your Name" />
							</div>
							<div class="form-group">
								<label for="email"><i class="fa fa-envelope" aria-hidden="true"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email" />
							</div>
							<div class="form-group">
								<label for="pass"><i class="fa fa-lock" aria-hidden="true"></i></label> <input
									type="password" name="password" id="pass" placeholder="Password" />
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="fa fa-lock" aria-hidden="true"></i></label>
								<input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password" />
							</div>
							<div class="form-group">
								<label for="contact"><i class="fa fa-mobile" aria-hidden="true"></i></label>
								<input type="text" name="contact" id="contact"
									placeholder="Contact no" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a href="#" class="term-service">Terms
										of service</a></label>
							</div>
							<!-- Sing up  Form  button-->
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" onclick="onSubmit()"/>
							</div>
						</form>
					</div>
					<!-- Sing up  Form  image-->
					<div class="signup-image">
						<figure>
							<img src="images/signup-image.jpg" alt="sing up image">
						</figure>
						<a href="login.jsp" class="signup-image-link">I am already
							member</a>
							<!-- Sing up  Form icons -->
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