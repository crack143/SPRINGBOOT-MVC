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

    <form name="usrLoginDetail">
        <div class="row" style="margin-top: 14%">
            <div class="col-sm-4 col-sm-offset-4">
                <div class="form-group">
                    <label for="email">Email address</label>
                    <input 	type="email" class="form-control" 
                    		id="email" name="email" 
                    		aria-describedby="emailHelp" 
                    		placeholder="Enter email">
                    <small id="emailHelp" class="form-text text-muted">We'll
					never share your email with anyone else.</small>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                </div>

                <button type="button" class="btn btn-primary" onClick="bindObj()">Login</button>
            </div>
        </div>
    </form>
    <script type="text/javascript" src="/entites/login/login.js"></script>
</body>
