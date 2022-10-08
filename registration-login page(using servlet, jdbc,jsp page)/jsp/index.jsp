<html>
    <head>
        <meta  name="viewport" content="width-device-width,inital-scale=1">  
        <link href="slider.css" type="text/css" rel="stylesheet"/><!-- css file-->
        
        <script src="https://kit.fontawesome.com/496a1af3db.js" crossorigin="anonymous"></script> <!-- icon link-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.css"/> <!-- swiper link-->
       
    </head>

    <body>
        <center> <h1> WELCOME 
        <%
Object obj=request.getAttribute(" value"); 
%>
<h1> 
<%=
obj 
%>
          </h1> </center><!--slider1 heading-->
         <BR>
            <!-- div for slider one-->
        <div class="container">
            <div class="swiper">
            <div class="swiper-wrapper"> 
             <!-- image in the slider1 -->
              <div class="swiper-slide"><img src="images\1.jpg"></div>
              <div class="swiper-slide"><img src="images\2.jpg"></div>
              <div class="swiper-slide"><img src="images\3.jpg"></div>
              <div class="swiper-slide"><img src="images\4.jpg"></div>
              <div class="swiper-slide"><img src="images\5.jpg"></div>
              <div class="swiper-slide"><img src="images\6.jpg"></div>
              <div class="swiper-slide"><img src="images\7.jpg"></div>
              <div class="swiper-slide"><img src="images\8.jpg"></div>
              <div class="swiper-slide"><img src="images\9.jpg"></div>
              <div class="swiper-slide"><img src="images\10.jpg"></div>
            </div>
             </div></div> 
             <br>
             <br>

            <!-- javascript for slider1-->
            <script src="https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.js"></script>
            <script >
                const swiper = new Swiper('.swiper', {
            autoplay: {
                delay:2000,
                disableOnInteraction: false,
            },
      loop: true,
      pagination: {
        el: '.swiper-pagination',
        clickable: true,
      },
      navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
      },
    });
   
            </script>



        </body>
</html>