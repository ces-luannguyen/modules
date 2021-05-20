<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="/init.jsp" %>
<% 
			SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd");
%>
<liferay-ui:tabs names="All, Registration, Login" refresh="false" tabsValues="All, Registration, Login">
    <liferay-ui:section>
    	<%@ include file="/event/all.jsp" %>
    </liferay-ui:section>
    <liferay-ui:section>
        <%@ include file="/event/registration.jsp" %>
    </liferay-ui:section>
    <liferay-ui:section>
        <%@ include file="/event/login.jsp" %>
    </liferay-ui:section>
</liferay-ui:tabs>