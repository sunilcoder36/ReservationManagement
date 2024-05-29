<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>TABLE RESERVATION</title>

    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style type="text/css">
        body {
            font-family: "Nunito", sans-serif;
            line-height: 1.6;
            background-color: #e6ded1;
            overflow-x: hidden;
            font-size: 16px;
            color: #333;
        }
    </style>


</head>
<body>

<div id="wrapper" class="container">

    <div id="page-wrapper">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header" align="center">TABLE RESERVATION</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 col-sm-5">
                    <div class="panel panel-primary">
                        <!-- <div class="panel-heading"> INFORMATION</div> -->
                        <div class="panel-body">
                            <form action="bookTable" method="post">
                                <div class="form-group">
                                    <label>First Name</label> <input type="text" name="fname"
                                                                     placeholder=" Please Enter Your  First Name"
                                                                     class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Last Name</label> <input type="text" name="lname"
                                                                    placeholder=" Please Enter Your Last Name"
                                                                    class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Email</label> <input type="text" name="email"
                                                                placeholder=" Please Enter Your Email " class="form-control"
                                                                required>
                                </div>


                                <div class="form-group">
                                    <label>Phone Number</label> <input name="phone" type="text"
                                                                       placeholder=" Please Enter Your Phone Number"
                                                                       class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Tables Available</label> <select name="table"
                                                                         class="form-control" required>
                                    <option value="selected"></option>
                                    <option value="Table for 2">Table for 2</option>
                                    <option value="Table for 3">Table for 3</option>
                                    <option value="4">Table for 4</option>
                                    <option value="Table for 5">Table for 5</option>
                                    <option value="Table for 6">Table for 6</option>
                                </select>
                                </div>


                                <div class="form-group">
                                    <label>Time</label> <input name="tme" type="time"
                                                               class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>Date</label> <input name="dte" type="date"
                                                               class="form-control">
                                </div>
                                <input type="submit" name="submit" class="btn btn-primary"
                                       value="Reserve">
                            </form>


                        </div>

                    </div>
                </div>


            </div>
        </div>
    </div>
</div>



<script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</body>
</html>