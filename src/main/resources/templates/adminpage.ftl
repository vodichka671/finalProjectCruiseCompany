<#import "parts/common.ftl" as c>
<@c.page>

<h1>Admin </h1>

<form action="/admin/setjorney" method="POST">
<input type="hidden" name="_csrf" value="${_csrf.token}"/>
<label>Круизный лайнер</label>
  <select name="shipName">
	<#list ships as ship>
		<option value="${ship.shipName}">${ship.shipName}</option>
	</#list>
<select>
<label>Маршрут плаванья</label>
<select name="description">
	<#list routes as route>
		<option  value="${route.description}">${route.description}</option>
	</#list>
<select>
	<div>
		<button class="btn btn-primary" type="submit">Set new jorney</button>
	</div>
 </form>
    
<a href ="/all">All users</a>

<table class="table table-hover ">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Basic class tickets available</th>
      <th scope="col">Buisness class tickets available</th>
      <th scope="col">VIP class tickets available</th>
      <th scope="col">Route</th>
      <th scope="col">Ship name</th>
      
    </tr>
  </thead>
  <tbody>
  
  <#list jorneys as jorney>
		
	
    <tr>
      <th scope="row">${jorney?index+1}</th>
      <td>${jorney.passengerBasic}</td>
      <td>${jorney.passengerBuisness}</td>
      <td>${jorney.passengerVIP}</td>
      <td>${jorney.route.description}</td>
      <td>${jorney.ship.shipName}</td>
    </tr>
    </#list>
  </tbody>
</table>

</@c.page>
