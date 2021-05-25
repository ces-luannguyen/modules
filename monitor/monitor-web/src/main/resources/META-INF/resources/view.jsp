<%@page import="java.util.TimeZone"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.util.Locale"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ include file="/init.jsp" %>
<%
DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
formatter.setTimeZone(TimeZone.getTimeZone("GMT+7"));
%>

<%
PortletURL portletURL = renderResponse.createRenderURL();
String tabs= ParamUtil.getString(request,"tabs", "All");
Object ob = request.getAttribute("selectedTab");
String value ="All";
if (ob != null) {
value = (String) ob;
tabs = value;
}
%>


<liferay-ui:tabs names="All,Registration,Login" refresh="true" param="tabs"
	url="<%=portletURL.toString()%>" value="<%=tabs%>" type="tabs nav-tabs-default">

	<liferay-ui:section>
		<c:if test='<%=tabs.equalsIgnoreCase("All")%>'>
			<%@ include file="/event/all.jsp"%>
		</c:if>
	</liferay-ui:section>
	<liferay-ui:section>
		<c:if test='<%=tabs.equalsIgnoreCase("Registration")%>'>
			<%@ include file="/event/registration.jsp"%>
		</c:if>
	</liferay-ui:section>
	<liferay-ui:section>
		<c:if test='<%=tabs.equalsIgnoreCase("Login")%>'>
			<%@ include file="/event/login.jsp"%>
		</c:if>
	</liferay-ui:section>
</liferay-ui:tabs>
