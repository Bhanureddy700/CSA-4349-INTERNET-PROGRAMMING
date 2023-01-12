<html>
<head>
<script>
function validateemail() {
var x = document.myForm.email.value;
var atposition = x.indexOf("@");
var dotposition = x.lastIndexOf(".");
if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length || atposition>-2) {
alert("please enter a valid email address \natposition:"+atposition+"\ndotposition:"+dotposition);
return false;
}
else{
alert("validated successfully");
return false;
}
}
</script>
</head>
<body>
<form name="myForm" method="post" action ="validatedisplay.html;" onsubmit="return validateemail();">
Enter a valid Email: <input type="text" name="email">
<input type="submit" value="validate">

</form>
</body>
</html>