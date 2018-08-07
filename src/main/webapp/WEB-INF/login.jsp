<html>
<head>
  <title>Simple Login Form</title>
</head>

<style>
table{
border-style: solid;
position: absolute;
top: 40%;
left : 40%;
padding:10px;
}
</style>

<body>
    <form method="post" action="/OnlineRestaurantBooking/login/user">
            <table>
                <tr bgcolor="black">                
                    <th colspan="3"><font color="white">Enter login details</th>

                </tr>
                <tr height="20"></tr>

                <tr>
                    <td>User Name</td>
                    <td>:</td>
                    <td>
                        <input type="text" name="username"/>
                    </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td>
                        <input type="password" name="password"/>
                    </td>
                </tr>

                <tr height="10"></tr>
                <tr>
                    <td><a href="/OnlineRestaurantBooking/register">not a user? register here</a></td>
                    <td></td>
                    <td align="center"><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
        
</body>
</html>