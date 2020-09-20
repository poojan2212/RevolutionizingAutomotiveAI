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
        <link href="<%=request.getContextPath()%>/adminResource/css/style.datatables.css" rel="stylesheet">
        <link href="<%=request.getContextPath()%>/adminResource/css/dataTables.responsive.css" rel="stylesheet">

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
                                <i class="fa fa-th-list"></i>
                            </div>
                            <div class="media-body">
                                <ul class="breadcrumb">
                                    <li><a href="index.html"><i class="glyphicon glyphicon-home"></i></a></li>
                                    
                                    <li>Branch Table</li>
                                </ul>
                                <h4>Branch Table</h4>
                            </div>
                        </div><!-- media -->
                    </div><!-- pageheader -->
                    
                    <div class="contentpanel">
                       
                    
                        <div class="panel panel-primary-head">
                            
                                                        
                            <table id="basicTable" class="table table-striped table-bordered responsive">
                                <thead class="">
                                    <tr>
                                        	    <th>BranchID</th>
                                                <th>BranchName</th>
                                                <th>Description</th>
                                                <th>Location</th>
                                                <th>Delete</th>
                                    			<th>Edit</th>
                                    
                                             
                                    </tr>
                                </thead>
                         
                                <tbody>
                                     <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
                                        <c:forEach items="${branchList}" var="i">
                                       
									<tr>
										 		<td>${i.branchID}</td>
                                                <td>${i.branchName}</td>
                                                <td>${i.branchDescription}</td>
                                                <td>${i.locationVO.locationName }</td>
                                                <td><a href="deleteBranch.html?id=${i.branchID}">Delete</a></td>
                                                <td><a href="editBranch.html?id=${i.branchID}">Edit</a></td>
                                             
									</tr>
									</c:forEach>
                                    
                                 </tbody>
                            </table>
                        </div><!-- panel -->
                        
                        <br />
                        
                        
                                                
                    </div><!-- contentpanel -->
                </div><!-- mainpanel -->
            </div><!-- mainwrapper -->
        </section>

        <script src="<%=request.getContextPath()%>/adminResource/js/jquery-1.11.1.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/jquery-migrate-1.2.1.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/bootstrap.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/modernizr.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/pace.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/retina.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/jquery.cookies.js"></script>
        
        <script src="<%=request.getContextPath()%>/adminResource/js/jquery.dataTables.min.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/dataTables.bootstrap.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/dataTables.responsive.js"></script>
        <script src="<%=request.getContextPath()%>/adminResource/js/select2.min.js"></script>

        <script src="<%=request.getContextPath()%>/adminResource/js/custom.js"></script>
        <script>
            jQuery(document).ready(function(){
                
                jQuery('#basicTable').DataTable({
                    responsive: true
                });
                
                var shTable = jQuery('#shTable').DataTable({
                    "fnDrawCallback": function(oSettings) {
                        jQuery('#shTable_paginate ul').addClass('pagination-active-dark');
                    },
                    responsive: true
                });
                
                // Show/Hide Columns Dropdown
                jQuery('#shCol').click(function(event){
                    event.stopPropagation();
                });
                
                jQuery('#shCol input').on('click', function() {

                    // Get the column API object
                    var column = shTable.column($(this).val());
 
                    // Toggle the visibility
                    if ($(this).is(':checked'))
                        column.visible(true);
                    else
                        column.visible(false);
                });
                
                var exRowTable = jQuery('#exRowTable').DataTable({
                    responsive: true,
                    "fnDrawCallback": function(oSettings) {
                        jQuery('#exRowTable_paginate ul').addClass('pagination-active-success');
                    },
                    "ajax": "ajax/objects.txt",
                    "columns": [
                        {
                            "class":          'details-control',
                            "orderable":      false,
                            "data":           null,
                            "defaultContent": ''
                        },
                        { "data": "name" },
                        { "data": "position" },
                        { "data": "office" },
                        { "data": "salary" }
                    ],
                    "order": [[1, 'asc']] 
                });
                
                // Add event listener for opening and closing details
                jQuery('#exRowTable tbody').on('click', 'td.details-control', function () {
                    var tr = $(this).closest('tr');
                    var row = exRowTable.row( tr );
             
                    if ( row.child.isShown() ) {
                        // This row is already open - close it
                        row.child.hide();
                        tr.removeClass('shown');
                    }
                    else {
                        // Open this row
                        row.child( format(row.data()) ).show();
                        tr.addClass('shown');
                    }
                });
               
                
                // DataTables Length to Select2
                jQuery('div.dataTables_length select').removeClass('form-control input-sm');
                jQuery('div.dataTables_length select').css({width: '60px'});
                jQuery('div.dataTables_length select').select2({
                    minimumResultsForSearch: -1
                });
    
            });
            
            function format (d) {
                // `d` is the original data object for the row
                return '<table class="table table-bordered nomargin">'+
                    '<tr>'+
                        '<td>Full name:</td>'+
                        '<td>'+d.name+'</td>'+
                    '</tr>'+
                    '<tr>'+
                        '<td>Extension number:</td>'+
                        '<td>'+d.extn+'</td>'+
                    '</tr>'+
                    '<tr>'+
                        '<td>Extra info:</td>'+
                        '<td>And any further details here (images etc)...</td>'+
                    '</tr>'+
                '</table>';
            }
        </script>

    </body>
</html>
