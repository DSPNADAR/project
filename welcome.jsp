<html>
<style>
body {
  
    font-family: 'Lucida', Georgia, serif;
	font-size: 38px;
	font-weight: normal;
}

.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: #111;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: #818181;
    display: block;
    transition: 0.3s
}

.sidenav a:hover, .offcanvas a:focus{
    color: #f1f1f1;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>
<body>

<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="Register">Register </a> 
  <a href="login">Log In </a> 
  <a href="dsp1">Men   Watches</a>
  <a href="dsp2">Women Watches</a>
  <a href="dsp3">Kid's Watches</a>
  <a href="dsp4">Contact</a>
</div>
<p><center>Right  TIME @ the Right  PRICE</center></p>
<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; </span>

<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
</script>
 <span class="glyphicon glyphicon-shopping-cart"></span>
<img src="resources/images/display.jpg" class="img-responsive"  alt="Image"   width="1080"px  height="748"px></img src>


</body>
</html> 