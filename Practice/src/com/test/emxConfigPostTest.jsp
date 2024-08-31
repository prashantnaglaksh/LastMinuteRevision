<%--  emxConfigPostTest.jsp

   Copyright (c) 1992-2016 Dassault Systemes.
   All Rights Reserved.
   This program contains proprietary and trade secret information of MatrixOne,Inc.
   Copyright notice is precautionary only
   and does not evidence any actual or intended publication of such program

   static const char RCSID[] = $Id: emxConfigPostTest.jsp.rca 1.7 Wed Oct 22 16:02:39 2008 przemek Experimental przemek $
   
--%>
<%@ page import="com.matrixone.apps.domain.DomainObject" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.matrixone.apps.domain.util.MapList" %>

<html>
<%@include file = "../emxUICommonAppInclude.inc"%>
<%@ include file = "../common/enoviaCSRFTokenValidation.inc"%>
<%@include file = "../documentcentral/emxLibraryCentralUtils.inc"%>

<%
try{
    String objectId          = emxGetParameter(request, "objectId");
    String parentOId         = emxGetParameter(request, "parentOID");
    String mode              = emxGetParameter(request, "mode");
    String sUrl              = "";
    System.out.println("objectId in JSP ::" + objectId);
    System.out.println("parentOId in JSP ::" + parentOId);
    System.out.println("mode in JSP ::" + mode);
    
/*     DomainObject JdocM = new DomainObject(JObjId);

	Map<Object, Object> attrMAp = new HashMap<>();
	attrMAp.put(J_ATTRIBUTE_DATA_TO_SYNC, newJsonComponentList.toJSONString());
	attrMAp.put(J_ATTRIBUTE_ACTION, J_ULPOAD_MATERIAL);
	attrMAp.put(J_ATTRIBUTE_MATERIAL, J_ATTRIBUTE_MATERIAL_VALUE);
	
	JdocM.setAttributeValues(lContext, attrMAp); */
    
}catch(Exception err){
	err.printStackTrace();
}
%>

</html>

