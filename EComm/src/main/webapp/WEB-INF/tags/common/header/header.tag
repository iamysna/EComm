<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ attribute name="imglink" required="false" type="java.lang.String" %>

 <div class="title">
    <div class="title-top">
      <div class="title-left">
        <div class="title-right">
          <div class="title-bottom">
            <div class="title-top-left">
              <div class="title-bottom-left">
                <div class="title-top-right">
                  <div class="title-bottom-right">
                    <h1><a href="http://all-free-download.com/free-website-templates/">MY <span>PERSONAL</span> WEBSITE</a></h1>
                    <sec:authorize ifAnyGranted="ROLE_ADMIN, ROLE_USER">
                    	<p  style="margin-left:70%;">Welcome ${author} - <a href="<c:url value="/j_spring_security_logout"/>" style="color: white;">Logout</a></p>
                    </sec:authorize>
                    <sec:authorize ifNotGranted="ROLE_ADMIN, ROLE_USER">
                    	<p  style="margin-left:80%;"><a href="reg" style="color: white;">Register</a> - <a href="${pageContext.request.contextPath}/login" style="color: white;">Login</a></p>
                  	</sec:authorize>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
<hr class="noscreen" />
