<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="common/header.jsp" />

<div class="row">
  <div class="col-md-6 offset-md-3 text-center">
    <div
      class="alert alert-danger"
      role="alert"
    >
      <h4 class="alert-heading">An Error Occurred!</h4>
      <p>We're sorry, but something went wrong. Please try again or contact support if the problem persists.</p>
      <hr />
      <p class="mb-0">
        <s:a
          action="home"
          cssClass="btn btn-primary"
        >
          Back to Home
        </s:a>
      </p>
    </div>
  </div>
</div>

<script>
  $(document).ready(function () {
    // Add shake animation to the alert
    $('.alert').effect('shake', { times: 2, distance: 10 }, 500);
  });
</script>

<jsp:include page="common/footer.jsp" />
