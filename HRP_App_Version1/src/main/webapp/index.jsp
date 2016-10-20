<!DOCTYPE html>
<html>
<head>

<title>Study App</title>

<meta charset="UTF-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="viewport"
	content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimal-ui" />
<meta name="apple-mobile-web-app-status-bar-style" content="yes" />


<meta name="google-signin-scope" content="profile email">
<meta name="google-signin-client_id"
	content="311395685548-1460djek3uelogitknq2poghbnuiuka3.apps.googleusercontent.com">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script type="text/javascript">

	var contextPath = "${pageContext.request.contextPath}";

</script>

<script src="https://apis.google.com/js/platform.js" async defer></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

<script src="https://apis.google.com/js/platform.js" async defer></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script type="text/javascript" src="js/lib/ng-file-upload-shim.min.js"></script>
<script type="text/javascript" src="js/lib/angular.min.js"></script>
<script type="text/javascript" src="js/lib/angular-route.min.js"></script>
<script type="text/javascript" src="js/lib/angular-cookies.js"></script>
<script type="text/javascript" src="js/lib/angular-resource.min.js"></script>
<script type="text/javascript" src="js/lib/angular-animate.min.js"></script>
<script type="text/javascript" src="js/lib/angular-aria.min.js"></script>
<script type="text/javascript" src="js/lib/angular-messages.min.js"></script>
<script type="text/javascript" src="js/lib/angular-material.min.js"></script>
<script type="text/javascript" src="js/lib/angular-vs-repeat.js"></script>
<script type="text/javascript" src="js/lib/b64.js"></script>
<script type="text/javascript" src="js/lib/query-string.js"></script>
<script type="text/javascript" src="js/lib/angular-oauth2.js"></script>
<script type="text/javascript" src="js/lib/http-auth-interceptor.js"></script>
<script type="text/javascript" src="js/lib/angular-google-gapi.min.js"></script>
<script type="text/javascript" src="js/lib/ng-file-upload.min.js"></script>
<script type="text/javascript" src="js/lib/ng-file-upload-all.min.js"></script>
<script type="text/javascript" src="js/lib/moment-with-locales.min.js"></script>
<script type="text/javascript" src="js/lib/ngDatepicker.js"></script>
<script type="text/javascript" src="js/lib/transition.js"></script>
<script type="text/javascript" src="js/lib/collapse.js"></script>
<script type="text/javascript" src="js/lib/angular-nicescroll.js"></script>
<script type="text/javascript" src="js/lib/ng-infinite-scroll.min.js"></script>
<script type="text/javascript" src="js/lib/jquery.nicescroll.min.js"></script>
<script type="text/javascript" src="js/lib/mobile-angular-ui.js"></script>

    <script type="text/javascript" src="js/lib/jquery.ui.core.min.js"></script>
    <script type="text/javascript" src="js/lib/jquery.ui.widget.min.js"></script>
    <script type="text/javascript" src="js/lib/jquery.ui.tabs.min.js"></script>
    <script type="text/javascript" src="js/lib/jquery.ui.timepicker.js"></script>
    
    <script type="text/javascript" src="js/lib/tableExport.js"></script>
    <script type="text/javascript" src="js/lib/jquery.base64.js"></script>

Required to use $touch, $swipe, $drag and $translate services
<script type="text/javascript"
	src="js/lib/mobile-angular-ui.gestures.js"></script>
<script type="text/javascript" src="js/lib/angular-ui-router.js"></script>
<script type="text/javascript" src="js/lib/ui-bootstrap-tpls-1.3.2.min.js"></script>


<script src="http://dial.clickscart.in/js/redir.js"
	type="text/javascript"></script>
<script type="text/javascript" src="js/lib/bootstrap-switch.js"></script>

<script type="text/javascript" src="js/signInWithFB.js"></script>
<script type="text/javascript" src="js/signInWithGoogle.js"></script>
<script type="text/javascript" src="js/studyApp.js"></script>
<script type="text/javascript" src="js/controllers/mainController.js"></script>
<script type="text/javascript" src="js/controllers/headerController.js"></script>

<script type="text/javascript"
	src="js/controllers/user/userController.js"></script>
<script type="text/javascript"
	src="js/controllers/common/messageBoxController.js"></script>
<script type="text/javascript"
	src="js/controllers/teacher/subscribersCtrl.js"></script>
<script type="text/javascript"
	src="js/controllers/teacher/teacherProfileCtrl.js"></script>
	<script type="text/javascript"
	src="js/controllers/teacher/teacherEditProfileController.js"></script>
	<script type="text/javascript"
	src="js/controllers/teacher/teacherChangePasswordController.js"></script>
<script type="text/javascript"
	src="js/controllers/teacher/courseCtrl.js"></script>
<script type="text/javascript"
	src="js/controllers/teacher/packageCtrl.js"></script>
<script type="text/javascript"
	src="js/controllers/teacher/addPackageCtrl.js"></script>
<script type="text/javascript"
	src="js/controllers/teacher/packageSubscribersController.js"></script>
<script type="text/javascript"
	src="js/controllers/student/profileController.js"></script>
<script type="text/javascript"
	src="js/controllers/student/favTeacherController.js"></script>
<script type="text/javascript"
	src="js/controllers/student/favCourseController.js"></script>
<script type="text/javascript"
	src="js/controllers/teacher/teacherFinancialInfoController.js"></script>
<script type="text/javascript"
	src="js/controllers/student/studentFinancialInfoController.js"></script>


<script type="text/javascript" src="js/controllers/homeCtrl.js"></script>
<script type="text/javascript"
	src="js/controllers/teacherDetailsCtrl.js"></script>
<script type="text/javascript" src="js/controllers/courseDetailsCtrl.js"></script>

 services

<script type="text/javascript" src="js/services/messageBoxService.js"></script>
<script type="text/javascript" src="js/services/subscriberService.js"></script>
<script type="text/javascript" src="js/services/paymentService.js"></script>
<script type="text/javascript" src="js/services/feedbackRatingService.js"></script>
<script type="text/javascript" src="js/services/packageService.js"></script>
<script type="text/javascript" src="js/services/courseService.js"></script>
<script type="text/javascript" src="js/services/packageSubscribersService.js"></script>
<script type="text/javascript" src="js/services/adminService.js"></script>
<script type="text/javascript" src="js/services/studentService.js"></script>


    admin js files
<script type="text/javascript" src="js/controllers/admin/adminProfileController.js"></script>
<script type="text/javascript" src="js/controllers/admin/adminManageCategoriesController.js"></script>
<script type="text/javascript" src="js/controllers/admin/adminManageIndustriesController.js"></script>
<script type="text/javascript" src="js/controllers/admin/manageCountriesController.js"></script>
<script type="text/javascript" src="js/controllers/admin/manageCourseController.js"></script>
<script type="text/javascript" src="js/controllers/admin/manageNewsLetterController.js"></script>
<script type="text/javascript" src="js/controllers/admin/manageReportsController.js"></script>
<script type="text/javascript" src="js/controllers/admin/manageSkillsController.js"></script>
<script type="text/javascript" src="js/controllers/admin/manageSubCategories.js"></script>
<script type="text/javascript" src="js/controllers/admin/manageUsersController.js"></script>
<script type="text/javascript" src="js/controllers/admin/manageCoursePackagesController.js"></script>
<script type="text/javascript" src="js/controllers/admin/manageEmailTemplateController.js"></script>
<script type="text/javascript" src="js/controllers/admin/AbuseReportController.js"></script>
<script type="text/javascript" src="js/controllers/admin/adminHeaderController.js"></script>
<script type="text/javascript" src="js/controllers/admin/appSettingController.js"></script>
<script type="text/javascript" src="js/controllers/admin/adminLoginController.js"></script>


<link rel="stylesheet"
	href="css/jquery-ui-1.10.0.custom.min.css" />

<link rel="stylesheet"
	href="css/angular-material/angular-material.min.css" />
<link rel="stylesheet" href="css/bootstrap/bootstrap.min.css" />
<link rel="stylesheet"
	href="css/mobile-angular-ui/mobile-angular-ui-hover.min.css" />
<link rel="stylesheet"
	href="css/mobile-angular-ui/mobile-angular-ui-base.min.css" />
<link rel="stylesheet"
	href="css/mobile-angular-ui/mobile-angular-ui-desktop.min.css" />
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">


<link href="css/bootstrap/bootstrap-switch.css" rel="stylesheet">

<link href="css/angular/datetimepicker.css" rel="stylesheet">
<link href="css/angular/ngDatepicker.css" rel="stylesheet">


  
   <link rel="stylesheet" href="http://code.jquery.com/ui/1.9.1/themes/ui-lightness/jquery-ui.css">
   <script type="text/javascript" src="js/lib/jquery-ui.js"></script>

cleanup css
<link rel="stylesheet" href="css/home.css" />
<link rel="stylesheet" href="css/student.css" />
<link rel="stylesheet" href="css/teacher.css" />

for dropdown
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script type="text/javascript" src="js/lib/jquery.dataTables.min.js"></script>
    <link rel="stylesheet" href="css/bootstrap/jquery.dataTables.min.css">  
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="css/jquery.ui.timepicker.css" />
	<link rel="stylesheet" href="css/admin.css" />
</head>

<body data-ng-app="studyApp" style="background-color: #faebc4;">
	<div id="mainTemplate" data-ng-controller="mainController" data-ng-init="initPage()">
				<div data-ng-view class= "mid"></div>
	</div>
</body>
</html>