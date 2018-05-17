<%@ include file="../../jsp/app_components/header.jsp"%>
<%@ include file="../../jsp/index.jsp"%>


<div class="wrapper">
    <div class="col-md-12" id="main-wrapper">
        <div class="col-md-12 input-group mb-3">
            <table class="table table-striped table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Vehicle Make</th>
                        <th>Vehicle Model</th>
                        <th>Year</th>
                        <th>License Plate</th>
                        <th>VIN</th>
                        <th>Color</th>
                        <th>Edit</th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="vehicle" items="${vehicleList}">
                            <tr>
                                <td>${vehicle.id}</td>
                                <td>${vehicle.vehicleModel.vehicleMake.vehicleMakeName}</td>
                                <td>${vehicle.vehicleModel.vehicleModelName}</td>
                                <td>${vehicle.year}</td>
                                <td>${vehicle.licensePlate}</td>
                                <td>${vehicle.vin}</td>
                                <td>${vehicle.color}</td>
                                <td><a href="/vehicle/edit/${vehicle.id}">Edit</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
            </table>
        </div>
    </div>
</div>

<%@ include file="../../jsp/app_components/footer.jsp"%>