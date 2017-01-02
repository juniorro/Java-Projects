<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory Management System</title>
<link rel="shortcut icon" href="img/icon.ico">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


<script type="text/javascript">
function confirmation(url){
	var response = confirm("Are you sure you want to delete?");
	if(response==true){
		document.location = url;
	}
}
</script>
</head>
<body>
	<div class="container">
		<div class="row">
		<div class="col-md-12">
		
		
		    <div class="span12">
      <div class="head">
        <div class="row-fluid">
            <div class="span12">
                <div class="span6">
                    <h1 class="muted">Inventory Management System</h1>
                </div>
            </div>
        </div>
      </div>
    </div>
    
    
		
		
<form action="controller.do" method="post" class="form-horizontal">
<fieldset>
<input type="hidden" value="${mode.actiontype}" name="actiontyp"/>

<!-- Text input-->
<c:if test="${mode.actiontype=='adding'}">
<div class="form-group">
<legend>New Product</legend>
  <label class="col-md-4 control-label" for="full_name">Product ID</label>  
  <div class="col-md-4">
  <input name="prod_id" value="${mode.produc.prod_id}" id="full_name" type="text" placeholder="" class="form-control input-md" required>
    
  </div>
</div>
</c:if>

<c:if test="${mode.actiontype=='edit'}">
<div class="form-group">
<legend>New Product</legend>
  <label class="col-md-4 control-label" for="full_name">Product ID</label>  
  <div class="col-md-4">${mode.produc.prod_id}
  <input name="prod_id" value="${mode.produc.prod_id}" id="full_name" type="hidden" placeholder="" class="form-control input-md" required>
    
  </div>
</div>
</c:if>


<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="service-request">Product Name</label>  
  <div class="col-md-4">
  <input name="prod_name" value="${mode.produc.prod_name}" id= "full_name" type="text" placeholder="" class="form-control input-md" required>    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="request-description">Product Description</label>
  <div class="col-md-4">                     
    <input name="prod_desc" value="${mode.produc.prod_desc}" class="form-control input-md" id= "full_name" required></input>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="service-request">Product Inventory</label>  
  <div class="col-md-4">
  <input name="prod_amt" value="${mode.produc.prod_amt}" id="service-request" type="text" placeholder="" class="form-control input-md" required="">    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="service-request">Product Price</label>  
  <div class="col-md-4">
  <input name="prod_price" value="${mode.produc.prod_price}" id="service-request"  type="text" placeholder="" class="form-control input-md" required="">    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="service-request"></label>  
  <div class="col-md-4">
  <button type="submit" value="Save" name="action" id="submit" class="btn btn-primary btn-sm">Save</button>
  </div>
</div>

</fieldset>
</form>
		
		
		


<legend>Product List</legend>
<h5>Search Product</h5>
 
<form class="form-horizontal"  action="controller.do" method="post">
<input type="text" id="search" name="keyword" placeholder="Product name..." value="${mode.keyword}" class=" input-sm">
   <button type="submit" value="Search" name="action" id="submit" class="btn btn-primary btn-sm">Search</button>
</form>


        <div class="table-responsive">

<table id="mytable" class="table table-bordred table-striped">
  <thead>
	    <th>Product ID</th>
	    <th>Product Name</th>
	    <th>Product Description</th>
	    <th>Product Amount</th>
	    <th>Product Price</th>
	    <th>Edit</th>
	    <th>Delete</th>
  </thead>
  <tbody>
     
  <tr>
  <c:forEach items="${mode.products}" var="p">
  
  	 <tr>
	    <td>${p.prod_id}</td>
	    <td>${p.prod_name}</td>
	    <td>${p.prod_desc}</td>
	    <td>${p.prod_amt}</td>
	    <td>${p.prod_price}</td>
	    <td><a href="controller.do?action=edit&keyword=${p.prod_id}"><button title="Edit" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-pencil"></span></button></a></td>
	    <td><a href="javascript:confirmation('controller.do?action=delete&keyword=${p.prod_id}')"><button title="Delete" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-trash"></span></button></a></td>	    
  	</tr>  
  </c:forEach>
  </tbody>
</table>

<ul class="pagination pull-right">
  <li class="disabled"><a href="#"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
  <li class="active"><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
  <li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
</ul>

</div>
</div>
</div>


</body>

</html>

