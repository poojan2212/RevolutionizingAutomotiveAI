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
                                    <li><a href=""><i class="glyphicon glyphicon-home"></i></a></li>
                                    <li><a href="">Forms</a></li>
                                    <li>Form Validation</li>
                                </ul>
                                <h4>Form Validation</h4>
                            </div>
                        </div><!-- media -->
                    </div><!-- pageheader -->
                    
                    <div class="contentpanel">
                        
                        <div class="row">
                            <div class="col-md-6">
                                <form id="basicForm" action="form-validation.html">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <div class="panel-btns">
                                            <a href="" class="panel-minimize tooltips" data-toggle="tooltip" title="Minimize Panel"><i class="fa fa-minus"></i></a>
                                            <a href="" class="panel-close tooltips" data-toggle="tooltip" title="Close Panel"><i class="fa fa-times"></i></a>
                                        </div><!-- panel-btns -->
                                        <h4 class="panel-title">Basic Form Validation</h4>
                                        <p>Please provide your name, email address (won't be published) and a comment.</p>
                                    </div><!-- panel-heading -->
                                    <div class="panel-body">
                                        <div class="row">
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Name <span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <input type="text" name="name" class="form-control" placeholder="Type your name..." required />
                                                </div>
                                            </div><!-- form-group -->
                                          
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Email <span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <input type="email" name="email" class="form-control" placeholder="Type your email..." required />
                                                </div>
                                            </div><!-- form-group -->
                                          
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">URL</label>
                                                <div class="col-sm-9">
                                                    <input type="url" name="url" class="form-control" />
                                                </div>
                                            </div><!-- form-group -->
                                            
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Comment <span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <textarea rows="5" class="form-control" placeholder="Type your comment..." required></textarea>
                                                </div>
                                            </div><!-- form-group -->
                                        </div><!-- row -->
                                    </div><!-- panel-body -->
                                    <div class="panel-footer">
                                      <div class="row">
                                        <div class="col-sm-9 col-sm-offset-3">
                                            <button class="btn btn-primary mr5">Submit</button>
                                            <button type="reset" class="btn btn-dark">Reset</button>
                                        </div>
                                      </div>
                                    </div><!-- panel-footer -->  
                                </div><!-- panel -->
                                </form>
                                
                            </div><!-- col-md-6 -->
        
                            <div class="col-md-6">
                                <form id="basicForm2" action="form-validation.html">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <div class="panel-btns">
                                            <a href="" class="panel-minimize tooltips" data-toggle="tooltip" title="Minimize Panel"><i class="fa fa-minus"></i></a>
                                            <a href="" class="panel-close tooltips" data-toggle="tooltip" title="Close Panel"><i class="fa fa-times"></i></a>
                                        </div><!-- panel-btns -->
                                        <h4 class="panel-title">Error Message In One Container</h4>
                                        <p>Please provide your name, email address (won't be published) and a comment.</p>
                                    </div><!-- panel-heading -->
                                    <div class="panel-body">
                                        <div class="errorForm"></div>
                                        <div class="row">
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Name <span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <input type="text" name="name" class="form-control" title="Your name is required!" placeholder="Type your name..." required />
                                                </div>
                                            </div><!-- form-group -->
                                        
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Email <span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <input type="email" name="email" class="form-control" title="Your email address is required!" placeholder="Type your email..." required />
                                                </div>
                                            </div><!-- form-group -->
                                        
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">URL</label>
                                                <div class="col-sm-9">
                                                    <input type="url" name="url" title="Please enter a valid url!" class="form-control" />
                                                </div>
                                            </div><!-- form-group -->
                                            
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Comment <span class="asterisk">*</span></label>
                                                <div class="col-sm-9">
                                                    <textarea rows="5" class="form-control" name="comment" title="Please type a comment at least 6 characters long!" placeholder="Type your comment..." required></textarea>
                                                </div>
                                            </div><!-- form-group -->
                                        </div><!-- row -->
                                    </div><!-- panel-body -->
                                    <div class="panel-footer">
                                        <div class="row">
                                            <div class="col-sm-9 col-sm-offset-3">
                                                <button class="btn btn-primary mr5">Submit</button>
                                                <button type="reset" class="btn btn-dark">Reset</button>
                                            </div>
                                        </div>
                                    </div><!-- panel-footer -->
                                </div><!-- panel -->
                                </form>
                        
                            </div><!-- col-md-6 -->        
                        </div><!--row -->
      
                        <div class="row">
                            <div class="col-md-6">
                                <form id="basicForm3" action="form-validation.html">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <div class="panel-btns">
                                            <a href="" class="panel-minimize tooltips" data-toggle="tooltip" title="Minimize Panel"><i class="fa fa-minus"></i></a>
                                            <a href="" class="panel-close tooltips" data-toggle="tooltip" title="Close Panel"><i class="fa fa-times"></i></a>
                                        </div><!-- panel-btns -->
                                        <h4 class="panel-title">With Checkboxes and Radio Buttons</h4>
                                        <p>Validating a form with a radio and checkbox buttons.</p>
                                    </div><!-- panel-heading -->
                                    <div class="panel-body">  
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">Gender <span class="asterisk">*</span></label>
                                            <div class="col-sm-9">
                                                <div class="rdio rdio-primary">
                                                    <input type="radio" id="male" value="m" name="gender" required />
                                                    <label for="male">Male</label>
                                                </div><!-- rdio -->
                                                <div class="rdio rdio-primary">
                                                    <input type="radio" value="f" id="female" name="gender">
                                                    <label for="female">Female</label>
                                                </div><!-- rdio -->
                                                <label id="genderError" class="error"></label>
                                            </div>
                                        </div><!-- form-group -->
                    
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">Interest <span class="asterisk">*</span></label>
                                            <div class="col-sm-9">
                                                <div class="ckbox ckbox-primary">
                                                    <input type="checkbox" id="int_website" value="m" name="int[]" required />
                                                    <label for="int_website">Website</label>
                                                </div><!-- rdio -->
                                                
                                                <div class="ckbox ckbox-primary">
                                                    <input type="checkbox" value="f" id="int_software" name="int[]" />
                                                    <label for="int_software">Software</label>
                                                </div><!-- rdio -->
                                            
                                                <div class="ckbox ckbox-primary">
                                                    <input type="checkbox" value="f" id="int_mobile" name="int[]" />
                                                    <label for="int_mobile">Mobile</label>
                                                </div><!-- rdio -->
                                                <label id="intError" class="error"></label>
                                            </div>
                                        </div><!-- form-group --> 
                                    </div><!-- panel-body -->
                                    <div class="panel-footer">
                                        <div class="row">
                                            <div class="col-sm-9 col-sm-offset-3">
                                                <button class="btn btn-primary mr5">Submit</button>
                                                <button type="reset" class="btn btn-dark">Reset</button>
                                            </div>
                                        </div>
                                    </div><!-- panel-footer -->
                                </div><!-- panel -->
                                </form>
                                
                            </div><!-- col-md-6 -->
            
                            <div class="col-md-6">
                                <form id="basicForm4" action="form-validation.html">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <div class="panel-btns">
                                            <a href="" class="panel-minimize tooltips" data-toggle="tooltip" title="Minimize Panel"><i class="fa fa-minus"></i></a>
                                            <a href="" class="panel-close tooltips" data-toggle="tooltip" title="Close Panel"><i class="fa fa-times"></i></a>
                                        </div><!-- panel-btns -->
                                        <h4 class="panel-title">Validation With Select Boxes</h4>
                                        <p>Validating a form using select boxes with single or multiple selection.</p>
                                    </div><!-- panel-heading -->
                                    <div class="panel-body">  
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">Fruits</label>
                                            <div class="col-sm-9">
                                                <select id="fruits" data-placeholder="Choose One" class="width100p" required>
                                                    <option value="">Choose One</option>
                                                    <option value="apple">Apple</option>
                                                    <option value="orange">Orange</option>
                                                    <option value="grapes">Grapes</option>
                                                    <option value="strawberry">Strawberry</option>
                                                </select>
                                                <label class="error" for="fruits"></label>
                                            </div>
                                        </div><!-- form-group -->
                                    </div><!-- panel-body -->
                                  
                                    <div class="panel-footer">
                                        <div class="row">
                                            <div class="col-sm-9 col-sm-offset-3">
                                                <button type="submit" class="btn btn-primary mr5">Submit</button>
                                                <button type="reset" class="btn btn-dark">Reset</button>
                                            </div>
                                        </div>
                                    </div><!-- panel-footer -->
                                </div><!-- panel -->
                                </form>
                            </div><!-- col-md-6 -->
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
