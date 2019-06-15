<#macro loginform path entity>
<form action="${path}" method="post" name "${entity}">
     <div class="form-group"><label> User Name : <input type="text" name="username"/> </label>
     <div><label> Password: <input type="password" name="password"/> </label></div>
     <input type="hidden" name="_csrf" value="${_csrf.token}"/>
     <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
    </div>
</form>
</#macro>