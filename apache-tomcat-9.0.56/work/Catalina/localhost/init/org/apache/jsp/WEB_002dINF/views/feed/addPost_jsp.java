/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-04-06 05:56:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.feed;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addPost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(10);
    _jspx_dependants.put("jar:file:/D:/project_init/apache-tomcat-9.0.56/wtpwebapps/project_init/WEB-INF/lib/jstl-1.2.jar!/META-INF/sql.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-4.2.13.RELEASE.jar", Long.valueOf(1646873798857L));
    _jspx_dependants.put("jar:file:/D:/project_init/apache-tomcat-9.0.56/wtpwebapps/project_init/WEB-INF/lib/jstl-1.2.jar!/META-INF/x.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/feed/../header.jsp", Long.valueOf(1649049305126L));
    _jspx_dependants.put("/WEB-INF/views/feed/../footer.jsp", Long.valueOf(1647391121162L));
    _jspx_dependants.put("jar:file:/D:/project_init/apache-tomcat-9.0.56/wtpwebapps/project_init/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/project_init/apache-tomcat-9.0.56/wtpwebapps/project_init/WEB-INF/lib/spring-security-taglibs-4.2.13.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1560936316000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1644909417825L));
    _jspx_dependants.put("jar:file:/D:/project_init/apache-tomcat-9.0.56/wtpwebapps/project_init/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/project_init/apache-tomcat-9.0.56/wtpwebapps/project_init/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fauthorize_0026_005faccess;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fauthorize_0026_005faccess.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write(" \n");
      out.write("   \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta id=\"_csrf\" name=\"_csrf\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("<meta id=\"_csrf_header\" name=\"_csrf_header\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.headerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://kit.fontawesome.com/b4e02812b5.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<!-- KAKAO API -->\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\n");
      out.write("<script src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=94ef81dc370b9f961476a1859364f709&libraries=services\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/header.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/search/main.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/footer.css\" />\n");
      out.write("<title>List</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-default fixed-top border-bottom pt-3 bg-white\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"navbar-header\">\r\n");
      out.write("			<a href=\"/init\" class=\"navbar-brand\">\r\n");
      out.write("				<i class=\"menu-icon fa-solid fa-house\"></i>\r\n");
      out.write("			</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div>\r\n");
      out.write("			<div class=\"input-group border rounded bg-light\">\r\n");
      out.write("		    	<div class=\"input-group-btn\">\r\n");
      out.write("		    		<button type=\"button\" class=\"btn btn-default mr-1\">filter</button>\r\n");
      out.write("		        	<button type=\"button\" class=\"btn btn-default dropdown-toggle mr-1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><span class=\"caret\"></span></button>\r\n");
      out.write("		        	<ul class=\"dropdown-menu\">\r\n");
      out.write("		          		<li>filter 1</li>\r\n");
      out.write("		          		<li>filter 2</li>\r\n");
      out.write("		          		<li>filter 3</li>\r\n");
      out.write("		        	</ul>\r\n");
      out.write("		      	</div>\r\n");
      out.write("		      	<input type=\"text\" class=\"form-control bg-light mr-1\" size=\"30\" aria-label=\"000\" placeholder=\"search...\">\r\n");
      out.write("	    		<a href=\"search\" class=\"btn btn-default mr-1\"><i class=\"fa-brands fa-sistrix\"></i></a>	      	\r\n");
      out.write("		    </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<ul class=\"nav navbar\">\r\n");
      out.write("			");
      if (_jspx_meth_s_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			");
      if (_jspx_meth_s_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			<li class=\"mr-4 notice\">\r\n");
      out.write("				<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("					<i class=\"menu-icon fa-regular fa-bell\"></i>\r\n");
      out.write("				</a>\r\n");
      out.write("	        	<ul class=\"dropdown-menu\">\r\n");
      out.write("	        		");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	        	</ul>\r\n");
      out.write("				\r\n");
      out.write("			</li>\r\n");
      out.write("			\r\n");
      out.write("			<li class=\"mr-4 msg\">\r\n");
      out.write("				<a href=\"#\">\r\n");
      out.write("					<i class=\"menu-icon fa-regular fa-comment-dots\"></i>\r\n");
      out.write("				</a>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		\r\n");
      out.write("	</div>		\r\n");
      out.write("\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("	$('#anFeed').click(function(e){\r\n");
      out.write("		e.preventDefault();\r\n");
      out.write("		$('#loginModalBtn').trigger('click');\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write(" <br/><br/>\n");
      out.write(" <section class=\"container mt-6 pt-1\" style=\"margin: 200px, 0;\">\n");
      out.write("	<form id=\"addForm\" action=\"uploadMulti?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('=');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("		<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("		<input type=\"hidden\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>		\n");
      out.write("		<div class=\"form-group\">\n");
      out.write("			<h2>CONTENT</h2>\n");
      out.write("			<textarea class=\"form-control col-sm-5 content\" name=\"content\" rows=\"10\" cols=\"20\" placeholder=\"content\" required></textarea>\n");
      out.write("		</div>\n");
      out.write("		\n");
      out.write("		<div class=\"form-group\">\n");
      out.write("			<label for=\"hashtag\">#HASHTAG</label>\n");
      out.write("			<input name=\"hashtag\" type=\"text\" class=\"title form-control\" placeholder=\"#HASHTAG\" required>\n");
      out.write("		</div>\n");
      out.write("		\n");
      out.write("		<input name=\"location\" type=\"hidden\" class=\"location\" placeholder=\"location\" required>\n");
      out.write("		<div class=\"input-group mb-3\">\n");
      out.write("			<div class=\"custom-file\">\n");
      out.write("				<input name=\"img\" type=\"file\" class=\"img custom-file-input\" placeholder=\"img\" id=\"inputGroupFile01\" multiple=\"multiple\" required>\n");
      out.write("				<label class=\"custom-file-label\" for=\"inputGroupFile01\">Choose file</label>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("		<div class=\"form-group\">\n");
      out.write("			<label for=\"email\">Address</label>\n");
      out.write("		<input type=\"text\" id=\"sample5_address\" class=\"form-control\" placeholder=\"Address\" readonly>\n");
      out.write("		</div>\n");
      out.write("		<input type=\"button\" class=\"btn btn-outline-primary  btn-block\"  onclick=\"sample5_execDaumPostcode()\" value=\"Search my location\"/><br>\n");
      out.write("		<div id=\"map\" style=\"width:300px;height:300px;margin-top:10px;display:none\"></div><br/>\n");
      out.write("        <input type=\"button\" class=\"btn btn-outline-success\" onclick=\"checkfrm()\" value=\"??????\"/><hr/>\n");
      out.write("	</form>\n");
      out.write("</section>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"bg-dark\">\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("function checkfrm() { \n");
      out.write("	if($('.location').val()==\"\"){\n");
      out.write("		alert('????????? ????????????????????? ??????');\n");
      out.write("		return false;\n");
      out.write("	}else{\n");
      out.write("	$('#addForm').submit();\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("    \n");
      out.write("var mapContainer = document.getElementById('map'), // ????????? ????????? div\n");
      out.write("mapOption = {\n");
      out.write("    center: new daum.maps.LatLng(37.537187, 127.005476), // ????????? ????????????\n");
      out.write("    level: 5 // ????????? ?????? ??????\n");
      out.write("};\n");
      out.write("\n");
      out.write("//????????? ?????? ??????\n");
      out.write("var map = new daum.maps.Map(mapContainer, mapOption);\n");
      out.write("\n");
      out.write("//??????-?????? ?????? ????????? ??????\n");
      out.write("var geocoder = new daum.maps.services.Geocoder();\n");
      out.write("	\n");
      out.write("//????????? ?????? ??????\n");
      out.write("var marker = new daum.maps.Marker({\n");
      out.write("    position: new daum.maps.LatLng(37.537187, 127.005476),\n");
      out.write("    map: map\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("function sample5_execDaumPostcode() {\n");
      out.write("new daum.Postcode({\n");
      out.write("    oncomplete: function(data) {\n");
      out.write("        var addr = data.address; // ?????? ?????? ??????\n");
      out.write("        $('.location').val(data.sido+\" \"+data.sigungu);\n");
      out.write("        // ?????? ????????? ?????? ????????? ?????????.\n");
      out.write("        document.getElementById(\"sample5_address\").value = addr;\n");
      out.write("        // ????????? ?????? ????????? ??????\n");
      out.write("        geocoder.addressSearch(data.address, function(results, status) {\n");
      out.write("            // ??????????????? ????????? ???????????????\n");
      out.write("            if (status === daum.maps.services.Status.OK) {\n");
      out.write("                var result = results[0]; //????????? ????????? ?????? ??????\n");
      out.write("                // ?????? ????????? ?????? ????????? ?????????\n");
      out.write("                var coords = new daum.maps.LatLng(result.y, result.x);\n");
      out.write("                // ????????? ????????????.\n");
      out.write("                mapContainer.style.display = \"block\";\n");
      out.write("                map.relayout();\n");
      out.write("                // ?????? ????????? ????????????.\n");
      out.write("                map.setCenter(coords);\n");
      out.write("                // ????????? ??????????????? ?????? ????????? ?????????.\n");
      out.write("                marker.setPosition(coords)\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("}).open({\n");
      out.write("	left : 500,\n");
      out.write("	top : 300	\n");
      out.write("});\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_s_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fs_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_s_005fauthorize_005f0_reused = false;
    try {
      _jspx_th_s_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fauthorize_005f0.setParent(null);
      // /WEB-INF/views/feed/../header.jsp(46,3) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fauthorize_005f0.setAccess("isAnonymous()");
      int _jspx_eval_s_005fauthorize_005f0 = _jspx_th_s_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_s_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("				<li class=\"mr-4 feed\">\r\n");
        out.write("					<a href=\"feed\" id=\"anFeed\">\r\n");
        out.write("						<i class=\"menu-icon fa-regular fa-circle-user\"></i>\r\n");
        out.write("					</a>\r\n");
        out.write("				</li>\r\n");
        out.write("			");
      }
      if (_jspx_th_s_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fauthorize_0026_005faccess.reuse(_jspx_th_s_005fauthorize_005f0);
      _jspx_th_s_005fauthorize_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fauthorize_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fauthorize_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fauthorize_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_s_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fs_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_s_005fauthorize_005f1_reused = false;
    try {
      _jspx_th_s_005fauthorize_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005fauthorize_005f1.setParent(null);
      // /WEB-INF/views/feed/../header.jsp(54,3) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fauthorize_005f1.setAccess("isAuthenticated()");
      int _jspx_eval_s_005fauthorize_005f1 = _jspx_th_s_005fauthorize_005f1.doStartTag();
      if (_jspx_eval_s_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("				<li class=\"mr-4 feed\">\r\n");
        out.write("					<a href=\"feed\" id=\"loginFeed\">\r\n");
        out.write("						<i class=\"menu-icon fa-regular fa-circle-user\"></i>\r\n");
        out.write("					</a>\r\n");
        out.write("				</li>\r\n");
        out.write("			");
      }
      if (_jspx_th_s_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fauthorize_0026_005faccess.reuse(_jspx_th_s_005fauthorize_005f1);
      _jspx_th_s_005fauthorize_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fauthorize_005f1, _jsp_getInstanceManager(), _jspx_th_s_005fauthorize_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/feed/../header.jsp(66,11) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setBegin(1);
      // /WEB-INF/views/feed/../header.jsp(66,11) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setEnd(10);
      // /WEB-INF/views/feed/../header.jsp(66,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("i");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("			          	<li class=\"list-group-item\">\r\n");
            out.write("			          		alarm");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\r\n");
            out.write("			          	</li>\r\n");
            out.write("		          	");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
