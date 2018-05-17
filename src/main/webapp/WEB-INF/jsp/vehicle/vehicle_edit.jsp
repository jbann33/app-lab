<%@ include file="../../jsp/app_components/header.jsp"%>
<%@ include file="../../jsp/index.jsp"%>


<div class="wrapper">
    <div class="col-md-12" id="main-wrapper">
        <div class="col-md-12 input-group mb-3">
        <c:set var="vehicle" value="${vehicle}"/>
        <form:form modelAttribute="vehicle" action="/vehicle/update/" method="post">
            <form:hidden path="Id"/>
            <form:hidden path="version"/>

                <div class="row">
                    <div class="form-group">
                        <div>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Vehicle Make</th>
                                        <th>Vehicle Model</th>
                                        <th>Year</th>
                                        <th>License Plate</th>
                                        <th>VIN</th>
                                        <th>Color</th>
                                        <th>Update</th>
                                        <th>Delete</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td><form:input path="vehicleModel.vehicleMake.vehicleMakeName" cssClass="form-control" /></td>
                                        <td><form:input path="vehicleModel.vehicleModelName" cssClass="form-control" /></td>
                                        <td><form:input path="year" cssClass="form-control" /></td>
                                        <td><form:input path="licensePlate" cssClass="form-control" /></td>
                                        <td><form:input path="vin" cssClass="form-control" style="width: 220px"/></td>
                                        <td><form:input path="color" cssClass="form-control" /></td>
                                        <td><button type="submit">Update</button></td>
                                        <td><a href="/vehicle/delete/${Id}">Delete</a></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </form:form>
            </div>
    </div>
</div>


