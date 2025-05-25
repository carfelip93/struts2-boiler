<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="../common/header.jsp" />

<div class="row">
  <div class="col-md-12">
    <h1 class="mb-4">User List</h1>
    <div class="table-responsive">
      <table class="table table-striped table-hover">
        <thead>
          <tr>
            <th>Username</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          <s:iterator value="users">
            <tr>
              <td><s:property value="username" /></td>
              <td>
                <s:a
                  action="view"
                  namespace="/user"
                  cssClass="btn btn-primary btn-sm"
                >
                  <s:param
                    name="username"
                    value="username"
                  />
                  View
                </s:a>
              </td>
            </tr>
          </s:iterator>
        </tbody>
      </table>
    </div>
  </div>
</div>

<script>
  $(document).ready(function () {
    // Add hover effect to table rows
    $('table tbody tr').hover(
      function () {
        $(this).addClass('table-hover');
      },
      function () {
        $(this).removeClass('table-hover');
      }
    );
  });
</script>

<jsp:include page="../common/footer.jsp" />
