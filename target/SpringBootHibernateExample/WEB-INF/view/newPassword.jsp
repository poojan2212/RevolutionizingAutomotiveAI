<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Revolutionizing Automotive AI</title>

        <link href="<%=request.getContextPath()%>/adminResource/css/style.default.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="<%=request.getContextPath()%>/adminResource/js/html5shiv.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/respond.min.js"></script>
        <![endif]-->
    </head>

    <body class="signin">
        
        
        <section>
            
            <div class="panel panel-signin">
                <div class="panel-body">
                    <div class="logo text-center">
                        <img src="<%=request.getContextPath()%>/adminResource/image/logo.png" alt="Chain Logo" >
                    </div>
                    <br />
                    <h4 class="text-center mb5">Revolutionizing Automotive AI</h4>
                    <p class="text-center">Login</p>
                    
                    <div class="mb30"></div>
                    
                    <form action="step2" method="post">
                    
                        <div class="input-group mb15">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <input type="text" id="otp" class="form-control" name="otp" placeholder="enter otp">
                        </div><!-- input-group -->
                        <span id="otpSpn"></span>
                        
                        <div class="input-group mb15">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                            <input type="password" id="password" class="form-control" name="password" placeholder="new password">
                        </div><!-- input-group -->
                        <span id="pwdSpn"></span>
                        
                        
                        
                        <div class="input-group mb15">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                            <input type="password" id="confirmpassword" class="form-control" name="confirmpassword" placeholder="confirm password">
                        </div><!-- input-group -->
                        <span id="con_pwdSpn"></span>
                        
                        
                        
                        <div class="clearfix input-group mb15" >
                            <div class="pull-right">
                                <button type="submit" class="btn btn-success">Set Password <i class="fa fa-angle-right ml5"></i></button>
                               
                            </div>
                        </div>
                                             
                    </form>
                    
                </div><!-- panel-body -->
                          </div><!-- panel -->
            
        </section>


        <script src="<%=request.getContextPath()%>/adminResource/js/jquery-1.11.1.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/jquery-migrate-1.2.1.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/bootstrap.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/modernizr.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/pace.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/retina.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/jquery.cookies.js"></script>

        <script src="<%=request.getContextPath()%>/adminResource/js/custom.js"></script>

<script type="text/javascript">
		
		var generatedOTP = <%=session.getAttribute("generatedOTP")%>;
		
		$("#otp").keyup(function(){
			
			
			
			if(generatedOTP == $("#otp").val()){
				$("#otpSpn").html("OTP Matched.");
				$("#otpSpn").css("color" , "green");
				$("#otpSpn").css("font-weight" , "bold");
				$("#calculate").attr("disabled" , false);
			}
			else{
				$("#otpSpn").html("Wrong OTP.");
				$("#otpSpn").css("color" , "red");
				$("#otpSpn").css("font-weight" , "bold");
				$("#calculate").attr("disabled" , true);
			}
			
		});
		
		
		$("#confirmpassword").keyup(function()
				{
					if($("#password").val() == $("#confirmpassword").val()){
						$("#con_pwdSpn").html("Password Matched.");
						$("#con_pwdSpn").css("color" , "green");
						$("#con_pwdSpn").css("font-weight" , "bold");
						$("#calculate").attr("disabled" , false);
					}
					else{
						$("#con_pwdSpn").html("Wrong Password.");
						$("#con_pwdSpn").css("color" , "red");
						$("#con_pwdSpn").css("color" , "red");
						$("#con_pwdSpn").css("font-weight" , "bold");
						$("#calculate").attr("disabled" , true);
						}
				});
		  
		
		</script>
    </body>
</html>
