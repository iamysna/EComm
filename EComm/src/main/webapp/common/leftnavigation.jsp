<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
	
	
<sec:authorize ifAnyGranted="ADMIN_ROLE">
	<jsp:include page="/common/admin/leftnavigation.jsp"></jsp:include>
</sec:authorize>

<sec:authorize ifAnyGranted="ROLE_CUSTOMER">
	<jsp:include page="/common/customer/leftnavigation.jsp"></jsp:include>
</sec:authorize>