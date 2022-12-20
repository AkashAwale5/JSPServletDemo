<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<h3 style="margin-top: 10px;" class="center-align">Register
							here !!</h3>
						<div class="form center-align">
							<form action="./Register" method="post">
								<input type="text" name="user_name"
									placeholder="Enter user name"> <input type="password"
									name="user_password" placeholder="Enter user password">
								<input type="email" name="user_email"
									placeholder="Enter user email">

									<div class="file-field input-field">
										<div class="btn">
											<span>File</span> <input type="file" name="image">
										</div>
										<div class="file-path-wrapper">
											<input class="file-path validate" type="text">
										</div>
									</div>
								


								<button type="submit" class="btn red">Submit</button>

							</form>

						</div>
						<!--  	<div class="loader center-align" style="margin-top: 10px;" display="not">
							<div class="preloader-wrapper big active">
								<div class="spinner-layer spinner-blue-only">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>
							</div>
							<h5>please wait..</h5>
						</div> -->


					</div>

				</div>

			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.6.2.min.js"
		integrity="sha256-2krYZKh//PcchRtd+H+VyyQoZ/e3EcrkxhM8ycwASPA="
		crossorigin="anonymous"></script>

	<script>
		$(document).ready(function() {
			console.log("document is ready,,")
		})
	</script>

</body>
</html>