<div class="container">
	<div class="row">
		<div class="col-sm-12" ng-init="loadingRooms=true">
			<center><div ng-if="loadingRooms"  ng-init="initialize()" id="loader" class="loader" ></div></center>
			<table ng-if="!loadingRooms" class="table animate-bottom"  id="roomList">
				<tr  ng-repeat="room in rooms"  class="animate-bottom">
					<td>
    				$scope.room.id
					</td>
					<td>
					$scope.room.
					</td>
					
  				</tr>
			</table>
		</div>
	</div>
</div>