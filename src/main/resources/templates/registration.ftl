<#import "parts/common.ftl" as c>
<#import "parts/loginform.ftl" as l>
<@c.page>
<h1>Registration Page</h1>
<@l.loginform "/registration" "user" />

<a href="/all">See all users in system db</a>

</@c.page>