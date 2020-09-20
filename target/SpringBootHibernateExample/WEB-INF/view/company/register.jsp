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
            
            <div class="panel panel-signup">
                <div class="panel-body">
                    <div class="logo text-center">
                        <img src="<%=request.getContextPath()%>/adminResource/image/logo.png" alt="Chain Logo" >
                    </div>
                    <br />
                    <h4 class="text-center mb5">Create a new account</h4>
                    <p class="text-center">Please enter your credentials below</p>
                    
                    <div class="mb30"></div>
                    	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
                    <f:form action="registerCompany.html" method="post" modelAttribute="registerVO">
                     
                            <div class="col-sm-6">
                                <div class="input-group mb15">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <f:input type="text"  path="companyName" class="form-control" placeholder="Enter company name" required="required"></f:input>
                                </div><!-- input-group -->
                            </div>
                            <div class="col-sm-6">
                                <div class="input-group mb15">
                                    <span class="input-group-addon"><i class="fa fa-bank"></i></span>
                                    <f:input type="text" path="companyType" class="form-control" placeholder="Enter Company type" required="required"></f:input>
                                </div><!-- input-group -->
                            </div>
                
                        <br />
                                            <div class="col-sm-6">
                                <div class="input-group mb15">
                                    <span class="input-group-addon"><i class="fa fa-home"></i></span>
                                    <f:input type="text" path="companyAddress" class="form-control" placeholder="Enter Address" required="required"></f:input>
                                </div><!-- input-group -->
                            </div>
                           
                             <div class="col-sm-6">
                                <div class="input-group mb15">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                    <f:input type="email" path="loginVO.username" class="form-control" placeholder="Enter E-mail Address" required="required"></f:input>
                                </div><!-- input-group -->
                            </div>
                           
                            <div class="col-sm-6">
                                <div class="input-group mb15">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <f:input type="text" path="contactPerson" class="form-control" placeholder="Contact person" required="required"></f:input>
                                </div><!-- input-group -->
                            </div>
                           
                            <div class="col-sm-6">
                                <div class="input-group mb15">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-phone"></i></span>
                                    <f:input type="text" path="contactNumber" class="form-control" placeholder="Contact number" required="required"></f:input>
                                </div><!-- input-group -->
                            </div>
                           
                           <div class="col-sm-6">
                                <div class="input-group mb15">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-globe"></i></span>
                                    <f:input type="text" path="webAddress" class="form-control" placeholder="enter Web address" required="required"></f:input>
                                </div><!-- input-group -->
                            </div>
                           
                           <div class="col-sm-6">
                                <div class="input-group mb15">
                                    <span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
                                    <f:input type="text" path="gstno" class="form-control" placeholder="Enter GST Number" required="required"></f:input>
                                </div><!-- input-group -->
                            </div>                           
                           
                            <div class="col-sm-6">
                                <div class="input-group mb15">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                    <f:input type="password" path="loginVO.password" class="form-control" placeholder="Enter Password" required="required"></f:input>
                                </div><!-- input-group -->
                            </div>
                            
                         
                        <br />
                        <div class="clearfix">
                            <div class="pull-left">
                                </div>
                            <div class="pull-right">
                                <f:button type="submit" class="btn btn-success">Create New Account <i class="fa fa-angle-right ml5"></i></f:button>
                            </div>
                        </div>
                    </f:form>
                    
                </div><!-- panel-body -->
                <div class="panel-footer">
                    <a href="login.html" class="btn btn-primary btn-block">Already a Member? Sign In</a>
                </div><!-- panel-footer -->
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

    </body>
</html>
