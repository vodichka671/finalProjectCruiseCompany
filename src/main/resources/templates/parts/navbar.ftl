 <#include "security.ftl">
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/">Cruise Company</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/registration">Registration</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="/login">Login</a>
      </li>
     <#if isAdmin>
      <li class="nav-item">
        <a class="nav-link" href="/admin/adminpage">Admin Page</a>
      </li>
      </#if>
    </ul>
    <div class ="navbar-text">${name}</div>
    <form action = "/logout" method = "post">
   		<button class="btn btn-primary ml-2" type="submit">Sign Out</button>
   		 <input type="hidden" name="_csrf" value="${_csrf.token}"/>
   
   </form>
   
  </div>
</nav>