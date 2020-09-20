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
        <link href="<%=request.getContextPath()%>/adminResource/css/select2.css" rel="stylesheet" />

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="<%=request.getContextPath()%>/adminResource/js/html5shiv.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>
        
        <header>
           
           <jsp:include page="header.jsp"  />
        </header>
        
        <section>
            <div class="mainwrapper">
                <jsp:include page="menu.jsp"  />
                
                <div class="mainpanel">
                    <div class="pageheader">
                        <div class="media">
                            <div class="pageicon pull-left">
                                <i class="fa fa-pencil"></i>
                            </div>
                            <div class="media-body">
                                <ul class="breadcrumb">
                                    <li><a href="index.html"><i class="glyphicon glyphicon-home"></i></a></li>
                                    
                                    <li>Add Package</li>
                                </ul>
                                <h4>Add Package</h4>
                            </div>
                        </div><!-- media -->
                    </div><!-- pageheader -->
                    
                    <div class="contentpanel">
                        
                        <div class="row">
                            <div class="col-md-12">
								<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>                               
                                <f:form id="basicForm" action="addPack.html" modelAttribute="data"  method="post">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <div class="panel-btns">
                                            <a href="" class="panel-minimize tooltips" data-toggle="tooltip" title="Minimize Panel"><i class="fa fa-minus"></i></a>
                                            <a href="" class="panel-close tooltips" data-toggle="tooltip" title="Close Panel"><i class="fa fa-times"></i></a>
                                        </div><!-- panel-btns -->
                                        <h4 class="panel-title">Add Package</h4>
                                        
                                    </div><!-- panel-heading -->
                                    <div class="panel-body">
                                        <div class="row">
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Package Name <span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <f:input type="text" name="name"  path="packageName" class="form-control" placeholder="Type package name..." required="required"/>
                                                </div>
                                            </div><!-- form-group -->
                                          
                                          <div class="form-group">
                                                <label class="col-sm-3 control-label">Package Description<span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <f:textarea name="name" path="packageDescription" class="form-control" placeholder="Type package description..." required="required" />
                                                </div>
                                            </div><!-- form-group -->
                                          
                                          <div class="form-group">
                                                <label class="col-sm-3 control-label">Package Duration  <span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <f:input type="text" name="name" path="packageSurvey" class="form-control" placeholder="Type number of survey..." required="required"/>
                                                </div>
                                            </div><!-- form-group -->
                                          
                                              
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Package Amount<span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <f:input type="text" name="name" path="packagePrice" class="form-control" placeholder="Type price of survey..." required="required"/>
                                                </div>
                                            </div><!-- form-group -->
                                        </div><!-- row -->
                                    </div><!-- panel-body -->
                                    <div class="panel-footer">
                                      <div class="row">
                                        <div class="col-sm-9 col-sm-offset-3">
                                            <f:button class="btn btn-primary mr5">Submit</f:button>
                                            <f:button type="reset" class="btn btn-dark">Reset</f:button>
                                        </div>
                                      </div>
                                    </div><!-- panel-footer -->  
                                </div><!-- panel -->
                                </f:form>                      
                            </div><!-- col-md-6 -->
        
                                 
                        </div><!--row -->
      
                        <div class="row">
                            
                        </div><!-- row-->
    
                    </div><!-- contentpanel -->
                    
                </div><!-- mainpanel -->
            </div><!-- mainwrapper -->
        </section>


        <script src="<%=request.getContextPath()%>/adminResource/js/jquery-1.11.1.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/jquery-migrate-1.2.1.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/jquery-ui-1.10.3.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/bootstrap.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/modernizr.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/pace.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/retina.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/jquery.cookies.js"></script>
        
        <script src="<%=request.getContextPath()%>/adminResource/js/select2.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/jquery.validate.min.js"></script>

        <script src="<%=request.getContextPath()%>/adminResource/js/custom.js"></script>
        
        <script>
            jQuery(document).ready(function(){
              
                // Basic Form
                jQuery("#basicForm").validate({
                    highlight: function(element) {
                        jQuery(element).closest('.form-group').removeClass('has-success').addClass('has-error');
                    },
                    success: function(element) {
                        jQuery(element).closest('.form-group').removeClass('has-error');
                    }
                });
              
                // Error Message In One Container
                jQuery("#basicForm2").validate({
                    errorLabelContainer: jQuery("#basicForm2 div.errorForm")
                });
              
                // With Checkboxes and Radio Buttons
                
                jQuery('#genderError').attr('for','gender');
                jQuery('#intError').attr('for','int[]');
                
                jQuery("#basicForm3").validate({
                    highlight: function(element) {
                        jQuery(element).closest('.form-group').removeClass('has-success').addClass('has-error');
                    },
                    success: function(element) {
                        jQuery(element).closest('.form-group').removeClass('has-error');
                    }
                });
                
                jQuery("#basicForm4").validate({
                    highlight: function(element) {
                        jQuery(element).closest('.form-group').removeClass('has-success').addClass('has-error');
                    },
                    success: function(element) {
                        jQuery(element).closest('.form-group').removeClass('has-error');
                    },
                    ignore: null
                });
                
                // Validation with select boxes
                jQuery("#flowers, #fruits").select2({
                    minimumResultsForSearch: -1
                });
              
            });
        </script>

    </body>
</html>
