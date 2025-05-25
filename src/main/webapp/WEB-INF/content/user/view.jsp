<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="../common/header.jsp" />

<div class="row">
    <div class="col-md-8 offset-md-2">
        <div class="card">
            <div class="card-header">
                <h2 class="mb-0">User Details</h2>
            </div>
            <div class="card-body">
                <div class="mb-3">
                    <label class="form-label">Username:</label>
                    <p class="form-control-static"><s:property value="user.username" /></p>
                </div>
                <div class="mb-3">
                    <label class="form-label">Email:</label>
                    <p class="form-control-static"><s:property value="user.email" /></p>
                </div>
                <div class="mb-3">
                    <label class="form-label">Full Name:</label>
                    <p class="form-control-static"><s:property value="user.fullName" /></p>
                </div>
                <div class="mb-3">
                    <label class="form-label">Role:</label>
                    <p class="form-control-static"><s:property value="user.role" /></p>
                </div>
                <div class="mb-3">
                    <label class="form-label">Status:</label>
                    <p class="form-control-static">
                        <span class="badge bg-<s:property value="user.active ? 'success' : 'danger'"/>">
                            <s:property value="user.active ? 'Active' : 'Inactive'" />
                        </span>
                    </p>
                </div>
            </div>
            <div class="card-footer">
                <s:a action="list" namespace="/user" cssClass="btn btn-secondary">
                    Back to List
                </s:a>
            </div>
        </div>
    </div>
</div>

<script>
$(document).ready(function() {
    // Add animation to the card
    $('.card').hide().fadeIn(500);
});
</script>

<jsp:include page="../common/footer.jsp" />
