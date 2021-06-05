
<html>
<style>
.logoutLblPos{

   position:fixed;
   right:10px;
   top:5px;
}
</style>
<title>Client</title>
<link rel="stylesheet" href="css/style.css" />
<body >
<form align="right" name="form1" method="post" action="index.php">
  <label class="logoutLblPos">
  <input name="submit2" type="submit" id="submit2" value="back">
  </label>
</form>

<center>
<h1 style="font-size:200%;" >CLIENT SIDE</h1>
<h2>PLEASE START SERVER IF YOU DON'T </h2>

<table border="1"  width="50%" Height="50%">
<tr>

<th width="5%">Client</th>
</tr>
<tr>
<td>
<center>
<a href="runClient.bat"   onClick="RunExe();"><img src="client2.jpg" alt="example" width="200" Height="200" ></a>


</center>
</td>

</tr>
<script>
function RunExe(){
    /*var shell = new ActiveXObject("WScript.Shell");
    var path = '"C:\xampp\htdocs\login\runClient.bat"';
    shell.run(path,1,false);*/
	WshShell = new ActiveXObject("Wscript.Shell"); //Create WScript Object
   WshShell.run("c://xampp/htdocs/login/runClient.bat");
}
</script>

</html>
