<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <link
      rel="stylesheet"
      href="${ pageContext.request.contextPath }/assets/css/style.css"
    />
    <title>Quiz - ${title}</title>
  </head>
  <body>
    <div class="welcome-container">
      <form
        action="${ pageContext.request.contextPath }/nickname"
        method="post"
      >
        <div>
          <label for="nickname">Veuillez rentrer un Pseudo</label>
          <div>
            <input
              type="text"
              name="nickname"
              id="nickname"
              placeholder="JCVM59, toto75019,..."
              value=${nickname}
            />
            <c:if test="${error != null}">
              <p style="color: red; font-size: 2rem;">${error}</p>
            </c:if>
          </div>
        </div>
        <div>
          <button type="submit">Suivant</button>
        </div>
      </form>
    </div>
  </body>
</html>
