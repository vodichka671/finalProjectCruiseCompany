<#import "parts/common.ftl" as c>
<#import "parts/loginform.ftl" as l>
<@c.page>
<h1>Login Page</h1>
<@l.loginform "/login" "user" />

<a href="/registration">Registration form</a>

</@c.page>
