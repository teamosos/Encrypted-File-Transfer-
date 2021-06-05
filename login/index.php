<?php
session_start();
if(!isset($_SESSION["username"])){
header("Location: login.php");
exit(); }
?>

<html>
<style>
.logoutLblPos{

   position:fixed;
   right:10px;
   top:5px;
}
</style>
<title>WELCOME</title>
<link rel="stylesheet" href="css/style.css" />
<body >
<form align="right" name="form1" method="post" action="logout.php">
  <label class="logoutLblPos">
  <input name="submit2" type="submit" id="submit2" value="log out">
  </label>
</form>
<center>
<h1 style="font-size:200%;" >The Encrypted File transfer System </h1>
<h2>It's Recommended to first Start  your server </h2>

<table border="1"  width="50%" Height="50%">
<tr>
<th width="5%" >Server </th>
<th width="5%">Client</th>
</tr>
<tr>
<td>
<center>
<a href="server.php" target="_blank"><img src="server1.jpg" alt="example" width="200" Height="200" ></a>
</center>
</td>
<td>
<center>
<a href="client.php" target="_blank"><img src="client2.jpg" alt="example" width="200" Height="200" ></a>
</center>
</td>
</tr>

</html>
