<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>밑줄긋는 애니메이션 효과</title>
<script type="text/javascript">
window.onload = function() {
    let horizontalunderline = document.getElementById("horizontal-underline");
    let horizontalMenus = document.querySelectorAll(".navbar_menu_ul li");

    let valticalunderline = document.getElementById("valtical-underline");
    let valticalMenus = document.querySelectorAll("nav a");

    horizontalMenus.forEach((menu) =>
        menu.addEventListener('mouseover', (e) => horizontalIndirector(e)));
    
    valticalMenus.forEach((menu) =>
        menu.addEventListener('mouseover', (e1) => valticalIndirector(e1)));

    function horizontalIndirector(e) {
        horizontalunderline.style.left = e.currentTarget.offsetLeft + "px";
        horizontalunderline.style.width = e.currentTarget.offsetWidth + "px";
        horizontalunderline.style.top = e.currentTarget.offsetTop + e.currentTarget.offsetHeight + "px";
    }

    function valticalIndirector(e1) {
        valticalunderline.style.left = e1.currentTarget.offsetLeft + "px";
        valticalunderline.style.width = e1.currentTarget.offsetWidth + "px";
        valticalunderline.style.top = e1.currentTarget.offsetTop + e1.currentTarget.offsetHeight + "px";
    }
};
</script>
</head>
<body>
</body>
</html>
