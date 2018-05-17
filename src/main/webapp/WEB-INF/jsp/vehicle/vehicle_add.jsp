<%@ include file="../../jsp/app_components/header.jsp"%>
<%@ include file="../../jsp/index.jsp"%>


<div class="wrapper">
    <div class="col-sm-10" id="wrapper">
        <div class="col-sm-8">
            <form:form modelAttribute="vehicleVO" cssClass="form-horizontal" action="/vehicle/add" method="post">
                <fieldset>
                    <legend>Add Vehicle</legend>
                    <div class="form-group">
                        <label for="inputNewVehicleMake" class="col-lg-2 control-label">Make</label>
                        <div class="col-lg-4">
                            <form:input path="newVehicleMake" type="text" cssClass="form-control" id="inputNewVehicleMake" placeholder="Toyota, Ford, etc."></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputNewVehicleModel" class="col-lg-2 control-label">Model</label>
                        <div class="col-lg-4">
                            <form:input path="newVehicleModel" type="text" cssClass="form-control" id="inputNewVehicleModel" placeholder="Camry, Prius, etc."></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputNewVehicleYear" class="col-lg-2 control-label">Year</label>
                        <div class="col-lg-4">
                            <form:input path="year" type="text" cssClass="form-control" id="inputNewVehicleYear"></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputNewVehicleLicensePlate" class="col-lg-2 control-label">License Plate</label>
                        <div class="col-lg-4">
                            <form:input path="licensePlate" type="text" cssClass="form-control" id="inputNewVehicleLicensePlate"></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputNewVehicleVIN" class="col-lg-2 control-label">VIN</label>
                        <div class="col-lg-4">
                            <form:input path="vin" type="text" cssClass="form-control" id="inputNewVehicleVIN"></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputNewVehicleColor" class="col-lg-2 control-label">Color</label>
                        <div class="col-lg-4">
                            <form:input path="color" type="text" cssClass="form-control" id="inputNewVehicleColor"></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-lg-10 col-lg-offset-2">
                            <form:button type="reset" value="cancel" class="btn btn-default">Cancel</form:button>
                            <form:button type="submit" value="save" class="btn btn-primary">Save</form:button>
                        </div>
                    </div>
                </fieldset>
            </form:form>
        </div>
    </div>
</div>








<%@ include file="../../jsp/app_components/footer.jsp"%>