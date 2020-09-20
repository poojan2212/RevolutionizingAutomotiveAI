<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
  		<style type="text/css">

.rating {
    float:left;
}

/* :not(:checked) is a filter, so that browsers that don’t support :checked don’t 
   follow these rules. Every browser that supports :checked also supports :not(), so
   it doesn’t make the test unnecessarily selective */
.rating:not(:checked) > input {
    position:absolute;
    top:-9999px;
    clip:rect(0,0,0,0);
}

.rating:not(:checked) > label {
    float:right;
    width:1em;
    padding:0 .1em;
    overflow:hidden;
    white-space:nowrap;
    cursor:pointer;
    font-size:200%;
    line-height:1.2;
    color:#ddd;
    text-shadow:1px 1px #bbb, 2px 2px #666, .1em .1em .2em rgba(0,0,0,.5);
}

.rating:not(:checked) > label:before {
    content: ' ';
}

.rating > input:checked ~ label {
    color: #f70;
    text-shadow:1px 1px #c60, 2px 2px #940, .1em .1em .2em rgba(0,0,0,.5);
}

.rating:not(:checked) > label:hover,
.rating:not(:checked) > label:hover ~ label {
    color: gold;
    text-shadow:1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em rgba(0,0,0,.5);
}

.rating > input:checked + label:hover,
.rating > input:checked + label:hover ~ label,
.rating > input:checked ~ label:hover,
.rating > input:checked ~ label:hover ~ label,
.rating > label:hover ~ input:checked ~ label {
    color: #ea0;
    text-shadow:1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em rgba(0,0,0,.5);
}

.rating > label:active {
    position:relative;
    top:2px;
    left:2px;
}

</style>
  		
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
                                   
                                    <li>Post Feedback</li>
                                </ul>
                                <h4>Post Feedback</h4>
                            </div>
                        </div><!-- media -->
                    </div><!-- pageheader -->
                    
                    <div class="contentpanel">
                        
                        <div class="row">
                            <div class="col-md-6">
                            	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
                                <f:form id="basicForm" action="insertFeedback.html" modelAttribute="feedbackVO" method="post" >
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <div class="panel-btns">
                                            <a href="" class="panel-minimize tooltips" data-toggle="tooltip" title="Minimize Panel"><i class="fa fa-minus"></i></a>
                                            <a href="" class="panel-close tooltips" data-toggle="tooltip" title="Close Panel"><i class="fa fa-times"></i></a>
                                        </div><!-- panel-btns -->
                                        <h4 class="panel-title">Post Feedback</h4>
                                        
                                    </div><!-- panel-heading -->
                                    <div class="panel-body">
                                        <div class="row">
                                           
                                          <div class="form-group">
                                                <label class="col-sm-3 control-label">Feedback Description <span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <f:textarea path="feedbackDescription" class="form-control" placeholder="Type your description..." required="required" />
                                                </div>
                                            </div><!-- form-group -->
                                          <div class="form-group "> 
		<div class="rating">
    <h4> <span class="flaticon-house-key"></span>Rating</h4><br/>
     <f:radiobutton id="star5" path="rating" value="5" /><label for="star5" title="Rocks!"><span class="fa fa-star checked"></span></label>
    <f:radiobutton  id="star4" path="rating" value="4" /><label for="star4" title="Pretty good"><span class="fa fa-star checked"></span></label>
    <f:radiobutton  id="star3" path="rating" value="3" /><label for="star3" title="Meh"><span class="fa fa-star checked"></span></label>
    <f:radiobutton  id="star2" path="rating" value="2" /><label for="star2" title="Kinda bad"><span class="fa fa-star checked"></span></label>
    <f:radiobutton  id="star1" path="rating" value="1" /><label for="star1" title="Sucks big time"><span class="fa fa-star checked"></span></label>
</div>
</div>
                                          
                                          
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
