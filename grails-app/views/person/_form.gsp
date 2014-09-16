<%@ page import="scaffold.Person" %>



<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'nombre', 'error')} ">
    <label for="nombre">
        <g:message code="person.nombre.label" default="Nombre"/>

    </label>
    <g:textField name="nombre" value="${personInstance?.nombre}"/>
</div>

