<!DOCTYPE html>
<html>
<head>
<title></title>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script type="text/javascript" href="js.js"></script>
</head>
<body>





<div class="container">
<div class="row">
<div class="col-sm-12 col-lg-12">
<h1 class="h1">Send an Email</h1>
</div>
</div>
</div>

<div class="container">
<div class="row">
<div class="col-md-10">
<div class="well well-sm">
<form id="FormEnvioCorreo" method="POST" action="ControllerServlet">
<div class="row">
<div class="col-md-8">

<div class="form-group">
<label for="email">
    To:</label>
<div class="input-group">
    <span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span>
    </span>
    <input type="email" id="email" name="email" class="form-control" placeholder="Email" required="required" value="">
</div><br>

<div class="form-group">
    <label for="subject">
        Subject:</label>
    <input type="text" id="subject" name="subject" class="form-control" placeholder="Subject" required="required" value="">
</div>
<div class="form-group">
    <label for="name">
        Attach File:</label>

    <input type="file" id="fileselect" name="documents" class="form-control"  style="  width: 310px;">
</div>

</div>

</div>
<div class="col-md-4">
<div class="form-group">
<label for="name">
    Message</label>
<textarea name="message" id="message" class="form-control" rows="9" cols="25" required="required" placeholder="Message"></textarea>
</div>
</div>
<div class="col-md-12">


<div class="control-group">
<label class="control-label" for="button1id"></label>
<div class="controls">
    <button type="submit" id="button1id" name="button1id" class="btn btn-success">Send</button>
    <button id="button2id" name="button2id" class="btn btn-danger">Clear</button>
</div>
</div>

</div>
</div>
</form>
</div>
</div>
<div class="col-md-4">
</div>
</div>
</div>







</body>
</html>
