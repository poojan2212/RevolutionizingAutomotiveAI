<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<%@taglib prefix="f"  uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="branch" value="${branchList}"></c:set> 

<c:set var="sizeOfList" value="${f:length(branch)}"></c:set> 


[
	<c:forEach items="${branchList}" var = "i" varStatus="j"> 
		{
			"branchID": "${i.branchID}",
			"branchName": "${i.branchName}"
		}
		
		<c:if test="${j.count ne sizeOfList}">   
		,
		</c:if>
	</c:forEach>
]


	
