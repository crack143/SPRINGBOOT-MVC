<jsp:include page="header/decorator.jsp"></jsp:include>

<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Claim Management</a>
            </div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">SignUp</a></li>
                <li><a href="/login">Login</a></li>
            </ul>
            <button class="btn btn-danger navbar-btn">Button</button>
        </div>
    </nav>

    <form name="usrLoginDetail" id="usrLoginDetail">
        <div class="row" style="margin-top: 14%">
            <div class="col-sm-4 col-sm-offset-4">
            
                <div class="form-group">
                    <label for="name">authority</label>
                    <input type="name" class="form-control" id="name" name="name" placeholder="name">
                </div>

                <button type="button" class="btn btn-primary" onClick="test()">Login</button>
            </div>
        </div>
    </form>
    <script type="text/javascript" src="/entites/login/login.js"></script>
</body>
