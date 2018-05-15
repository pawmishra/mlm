<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>MLM</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="images/favicon.ico"/>

    <!-- CSS
    ================================================== -->       
    <!-- Bootstrap css file-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Font awesome css file-->
    <link href="css/font-awesome.min.css" rel="stylesheet">       
    <!-- Default Theme css file -->
    <link id="switcher" href="css/themes/default-theme.css" rel="stylesheet">    
    <!-- Slick slider css file -->
    <link href="css/slick.css" rel="stylesheet"> 
    <!-- Photo Swipe Image Gallery -->     
    <link rel='stylesheet prefetch' href='css/photoswipe.css'>
    <link rel='stylesheet prefetch' href='css/default-skin.css'>    

    <!-- Main structure css file -->
    <link href="style.css" rel="stylesheet">
   
    <!-- Google fonts -->
    <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>  
    <link href='http://fonts.googleapis.com/css?family=Habibi' rel='stylesheet' type='text/css'>   
    <link href='http://fonts.googleapis.com/css?family=Cinzel+Decorative:900' rel='stylesheet' type='text/css'>
</head>
<body>    
    <!-- BEGAIN PRELOADER -->
    <div id="preloader">
      <div id="status">&nbsp;</div>
    </div>
    <!-- END PRELOADER -->

    <!-- SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#"><i class="fa fa-heartbeat"></i></a>
    <!-- END SCROLL TOP BUTTON -->

    <!--=========== BEGIN HEADER SECTION ================-->
    <%@include file="header.jsp" %>
    <!--=========== END HEADER SECTION ================-->        
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2>Gallery</h2>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="#">Home</a></li>                  
                  <li class="active">Gallery</li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>      
    </section>    
    <!--=========== BEGIN GALLERY SECTION ================-->
    <section id="gallery">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="gallery-area">
              <!-- Start First Image Album  -->
              <div class="my-simple-gallery">
                <div class="section-heading">
                  <h2>Legal Document</h2>
                  <div class="line"></div>
                </div>
                <div class="row">
                  <figure itemprop="associatedMedia" class="col-lg-3 col-md-3 col-sm-4 col-xs-12">
                    <a class="gallery-iteam" href="images/gallery/gallery-large-1.jpg" itemprop="contentUrl" data-size="1024x1024">
                      <img src="images/gallery/gallery-small-1.jpg" itemprop="thumbnail" alt="Image description" />
                       
                    </a>                    
                    <figcaption itemprop="caption description">Image caption  1</figcaption>         
                  </figure>
                  
                  <figure itemprop="associatedMedia" class="col-lg-3 col-md-3 col-sm-4 col-xs-12">
                    <a class="gallery-iteam" href="images/gallery/gallery-large-2.jpg" itemprop="contentUrl" data-size="1024x1024">
                      <img src="images/gallery/gallery-small-2.jpg" itemprop="thumbnail" alt="Image description" />
                      
                    </a>
                    <figcaption itemprop="caption description">Image caption 2</figcaption>
                  </figure> 
                 
                  <figure itemprop="associatedMedia" class="col-lg-3 col-md-3 col-sm-4 col-xs-12">
                    <a class="gallery-iteam" href="images/gallery/gallery-large-3.jpg" itemprop="contentUrl" data-size="1024x683">
                      <img src="images/gallery/gallery-small-3.jpg" itemprop="thumbnail" alt="Image description" />
                      
                    </a>
                    <figcaption itemprop="caption description">Image caption 3</figcaption>
                  </figure>

                  <figure itemprop="associatedMedia" class="col-lg-3 col-md-3 col-sm-4 col-xs-12">
                    <a class="gallery-iteam" href="images/gallery/gallery-large-4.jpg" itemprop="contentUrl" data-size="1024x768">
                      <img src="images/gallery/gallery-small-4.jpg" itemprop="thumbnail" alt="Image description" />
                      
                  </a>
                    <figcaption itemprop="caption description">Image caption 4</figcaption>
                  </figure> 
                  <figure itemprop="associatedMedia" class="col-lg-3 col-md-3 col-sm-4 col-xs-12">
                    <a class="gallery-iteam" href="images/gallery/gallery-large-5.jpg" itemprop="contentUrl" data-size="1024x1024">
                      <img src="images/gallery/gallery-small-5.jpg" itemprop="thumbnail" alt="Image description" />
                      
                    </a>                    
                    <figcaption itemprop="caption description">Image caption  5</figcaption>         
                  </figure>
                  
                  <figure itemprop="associatedMedia" class="col-lg-3 col-md-3 col-sm-4 col-xs-12">
                    <a class="gallery-iteam" href="images/gallery/gallery-large-4.jpg" itemprop="contentUrl" data-size="1024x1024">
                      <img src="images/gallery/gallery-small-4.jpg" itemprop="thumbnail" alt="Image description" />
                      
                    </a>
                    <figcaption itemprop="caption description">Image caption 6</figcaption>
                  </figure> 
                 
                  <figure itemprop="associatedMedia" class="col-lg-3 col-md-3 col-sm-4 col-xs-12">
                    <a class="gallery-iteam" href="images/gallery/gallery-large-2.jpg" itemprop="contentUrl" data-size="1024x683">
                      <img src="images/gallery/gallery-small-2.jpg" itemprop="thumbnail" alt="Image description" />
                     
                    </a>
                    <figcaption itemprop="caption description">Image caption 7</figcaption>
                  </figure>

                  <figure itemprop="associatedMedia" class="col-lg-3 col-md-3 col-sm-4 col-xs-12">
                    <a class="gallery-iteam" href="images/gallery/gallery-large-1.jpg" itemprop="contentUrl" data-size="1024x768">
                      <img src="images/gallery/gallery-small-1.jpg" itemprop="thumbnail" alt="Image description" />
                    
                  </a>
                    <figcaption itemprop="caption description">Image caption 8</figcaption>
                  </figure>                 
                </div>
              </div>
              <!-- End First Image Album  -->

            
              <!-- This Section only for Lightbox view -->
              <!-- Root element of PhotoSwipe. Must have class pswp. -->
              <div class="pswp" tabindex="-1" role="dialog" aria-hidden="true">

                <!-- Background of PhotoSwipe. 
                     It's a separate element, as animating opacity is faster than rgba(). -->
                <div class="pswp__bg"></div>

                <!-- Slides wrapper with overflow:hidden. -->
                <div class="pswp__scroll-wrap">

                  <!-- Container that holds slides. PhotoSwipe keeps only 3 slides in DOM to save memory. -->
                  <!-- don't modify these 3 pswp__item elements, data is added later on. -->
                  <div class="pswp__container">
                      <div class="pswp__item"></div>
                      <div class="pswp__item"></div>
                      <div class="pswp__item"></div>
                  </div>

                  <!-- Default (PhotoSwipeUI_Default) interface on top of sliding area. Can be changed. -->
                  <div class="pswp__ui pswp__ui--hidden">
                    <div class="pswp__top-bar">

                        <!--  Controls are self-explanatory. Order can be changed. -->

                        <div class="pswp__counter"></div>

                        <button class="pswp__button pswp__button--close" title="Close (Esc)"></button>

                        <button class="pswp__button pswp__button--share" title="Share"></button>

                        <button class="pswp__button pswp__button--fs" title="Toggle fullscreen"></button>

                        <button class="pswp__button pswp__button--zoom" title="Zoom in/out"></button>

                        <!-- Preloader demo http://codepen.io/dimsemenov/pen/yyBWoR -->
                        <!-- element will get class pswp__preloader--active when preloader is running -->
                        <div class="pswp__preloader">
                            <div class="pswp__preloader__icn">
                              <div class="pswp__preloader__cut">
                                <div class="pswp__preloader__donut"></div>
                              </div>
                            </div>
                        </div>
                    </div>

                    <div class="pswp__share-modal pswp__share-modal--hidden pswp__single-tap">
                        <div class="pswp__share-tooltip"></div> 
                    </div>

                    <button class="pswp__button pswp__button--arrow--left" title="Previous (arrow left)">
                    </button>

                    <button class="pswp__button pswp__button--arrow--right" title="Next (arrow right)">
                    </button>

                    <div class="pswp__caption">
                        <div class="pswp__caption__center"></div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== END GALLERY SECTION ================-->

    <!--=========== Start Footer SECTION ================-->
    <%@include file="footer.jsp" %>
    <!--=========== End Footer SECTION ================-->

    <!-- jQuery Library  -->
    <script src="js/jquery.js"></script>   
    <!-- Bootstrap default js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- slick slider -->
    <script src="js/slick.min.js"></script>    
    <script type="text/javascript" src="js/modernizr.custom.79639.js"></script>      
    <!-- counter -->
    <script src="js/waypoints.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <!-- Doctors hover effect -->
    <script src="js/snap.svg-min.js"></script>
    <script src="js/hovers.js"></script>
    <!-- Photo Swipe Gallery Slider -->
    <script src='js/photoswipe.min.js'></script>
    <script src='js/photoswipe-ui-default.min.js'></script>    
    <script src="js/photoswipe-gallery.js"></script>

    <!-- Custom JS -->
    <script src="js/custom.js"></script>
     
  </body>
</html>