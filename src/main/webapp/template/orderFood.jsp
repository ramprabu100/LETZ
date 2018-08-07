<div class="container">
	<div class="row">
		<div class="col-sm-12" ng-init="loadingRooms=true">
			<center><div ng-if="loadingRooms"  ng-init="initialize()" id="loader" class="loader" ></div></center>
			<table ng-if="!loadingRooms" class="table animate-bottom"  id="roomList">
			<tr>
			<th>
			description
			</th>
			
			<th>
			price
			</th>
			
			<th>
			type
			</th>
			
			</tr>
				<tr  ng-repeat="table in tables"  class="animate-bottom">
					<td>
    				{{table.name}}
					</td>
					<td>
    				{{table.price}}
					</td>
					<td>
					<button id="{{table.id}}" ng-click="placeOrder(table)">order</button>
					</td>
  				</tr>
			</table>
		</div>
	</div>
</div>