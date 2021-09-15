<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
          <s:form action="reg">
          <s:textfield name="name"  label="name" />
            <s:textfield name="email"  label="email " />
              <s:textfield name="address"  label="address " />
            <s:submit value="Register" />
            </s:form>
