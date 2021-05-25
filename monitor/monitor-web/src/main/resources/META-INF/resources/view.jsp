<%@ page import="com.liferay.portal.kernel.model.User" %><%@
page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%@ page import="java.text.DateFormat" %><%@
page import="java.text.SimpleDateFormat" %>

<%@ page import="java.util.TimeZone" %>

<%@ page import="javax.portlet.PortletURL" %>

<%@ include file="/init.jsp" %>

<%
DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
formatter.setTimeZone(TimeZone.getTimeZone("GMT+7"));
%>

<%
PortletURL portletURL = renderResponse.createRenderURL();
String tabs = ParamUtil.getString(request, "tabs", "All");
Object ob = request.getAttribute("selectedTab");
String value ="All";

if (ob != null) {
value = (String)ob;
tabs = value;
}
%>

<liferay-ui:tabs
	names="All,Registration,Login"
	param="tabs"
	refresh="true"
	type="tabs nav-tabs-default"
	url="<%= portletURL.toString() %>"
	value="<%= tabs %>"
>
	<liferay-ui:section>
		<c:if test='<%= tabs.equalsIgnoreCase("All") %>'>
			<%@ include file="/event/all.jsp" %>
		</c:if>
	</liferay-ui:section>

	<liferay-ui:section>
		<c:if test='<%= tabs.equalsIgnoreCase("Registration") %>'>
			<%@ include file="/event/registration.jsp" %>
		</c:if>
	</liferay-ui:section>

	<liferay-ui:section>
		<c:if test='<%= tabs.equalsIgnoreCase("Login") %>'>
			<%@ include file="/event/login.jsp" %>
		</c:if>
	</liferay-ui:section>
</liferay-ui:tabs>