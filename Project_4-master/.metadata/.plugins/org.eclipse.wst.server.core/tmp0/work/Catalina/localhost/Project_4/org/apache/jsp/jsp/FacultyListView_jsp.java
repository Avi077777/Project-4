/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-06-25 12:37:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.raystec.Util.HTMLUtility;
import com.raystec.Model.FacultyModel;
import com.raystec.Bean.FacultyBean;
import java.util.Iterator;
import java.util.List;
import com.raystec.project4.controller.FacultyListCtl;
import com.raystec.Util.DataUtility;
import com.raystec.Util.ServletUtility;
import com.raystec.Bean.RoleBean;
import com.raystec.project4.controller.*;
import com.raystec.Bean.UserBean;

public final class FacultyListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1650650300000L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1650650300000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.raystec.project4.controller");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.raystec.Util.HTMLUtility");
    _jspx_imports_classes.add("com.raystec.Model.FacultyModel");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("com.raystec.Bean.FacultyBean");
    _jspx_imports_classes.add("com.raystec.Bean.RoleBean");
    _jspx_imports_classes.add("com.raystec.Util.DataUtility");
    _jspx_imports_classes.add("com.raystec.Util.ServletUtility");
    _jspx_imports_classes.add("com.raystec.Bean.UserBean");
    _jspx_imports_classes.add("com.raystec.project4.controller.FacultyListCtl");
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16*16\"/>\n");
      out.write("<title> Faculty List</title>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT );
      out.write("/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT );
      out.write("/js/Checkbox11.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      com.raystec.Bean.FacultyBean bean = null;
      bean = (com.raystec.Bean.FacultyBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new com.raystec.Bean.FacultyBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>jQuery UI Datepicker - Display month &amp; year menus</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("<script>\n");
      out.write("	$(function() {\n");
      out.write("		$(\"#datepicker\").datepicker({\n");
      out.write("			changeMonth : true,\n");
      out.write("			changeYear : true,\n");
      out.write("			yearRange : '1970:2002'\n");
      out.write("			//maxDate: '12/31/2020',\n");
      out.write("			//minDate: '01/01/1981',\n");
      out.write("			\n");
      out.write("		});\n");
      out.write("	});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");

	UserBean userBean = (UserBean) session.getAttribute("user");
	boolean userLoggedIn = userBean != null;
	String welcomeMsg = "Hi, ";
	if (userLoggedIn) {
		String role = (String) session.getAttribute("role");
		welcomeMsg += userBean.getFirstName() + " (" + role + ")";
	} else {
		welcomeMsg += "Guest";
	}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table width=\"100%\" border=\"0\">\n");
      out.write("	<tr>\n");
      out.write("		<td width=\"90%\"><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</a> |\n");
      out.write("			");

			if (userLoggedIn) {
		
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</b></a>\n");
      out.write("\n");
      out.write("			");

				} else {
			
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</b></a> ");

 	}
 
      out.write("</td>\n");
      out.write("		<td rowspan=\"2\">\n");
      out.write("\n");
      out.write("			<center>\n");
      out.write("				<h1 align=\"right\">\n");
      out.write("					<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/rays.jpg\" width=\"318\"\n");
      out.write("						height=\"75\">\n");
      out.write("				</h1>\n");
      out.write("			</center>\n");
      out.write("		</td>\n");
      out.write("\n");
      out.write("	</tr>\n");
      out.write("\n");
      out.write("	<tr>\n");
      out.write("		<td>\n");
      out.write("			<h3>");
      out.print(welcomeMsg);
      out.write("</h3>\n");
      out.write("		</td>\n");
      out.write("	</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("	");

		if (userLoggedIn) {
	
      out.write("\n");
      out.write("\n");
      out.write("	<tr>\n");
      out.write("		<td colspan=\"2\"> <a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</b></a>\n");
      out.write("		 |<a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get\n");
      out.write("				Marksheet</b>\n");
      out.write("		</a> | <a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet Merit\n");
      out.write("				List</b> </a>|\n");
      out.write("		 ");

 	if (userBean.getRoleId() == RoleBean.ADMIN) {
 
      out.write("| <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</b></a> |<a\n");
      out.write("			href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">Add Course</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a>| <a\n");
      out.write("			href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">Add Faculty</b></a>| <a\n");
      out.write("			href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\n");
      out.write("			href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\"  target=\"blank\">Java Doc</b></a> | \n");
      out.write("			");

				}
			
      out.write("\n");
      out.write("			");

            if  (userBean.getRoleId() == RoleBean.STUDENT) {
        
      out.write(" \n");
      out.write("       \n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\">Subject List</b></a> |       \n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\n");
      out.write("       ");

     		}
 		
      out.write("\n");
      out.write("		\n");
      out.write(" 		");

 		if (userBean.getRoleId()  == RoleBean.KIOSK) {
        
      out.write(" \n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \n");
      out.write("       ");

     		}
 		
      out.write("\n");
      out.write(" 		\n");
      out.write(" 		 ");

            if  (userBean.getRoleId()  == RoleBean.COLLEGE) {
           
          
      out.write(" \n");
      out.write("       \n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \n");
      out.write("       ");

     		}
 		
      out.write("\n");
      out.write("			</td>\n");
      out.write("\n");
      out.write("	</tr>\n");
      out.write("	");

		}
	
      out.write("\n");
      out.write("</table>\n");
      out.write("<hr>\n");
      out.write("</html>");
      out.write('\n');
      out.write(' ');
      out.write(' ');
List flist= (List) request.getAttribute("FList"); 
      out.write("\n");
      out.write("<center>\n");
      out.write("<form action=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\" method=\"post\">\n");
      out.write("	\n");
      out.write("	<div align=\"center\">\n");
      out.write("			<h1>Faculty List</h1>\n");
      out.write("			<h3><font style=\"color: green\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font> </h3>\n");
      out.write("			<h3><font style=\"color: red\">");
      out.print(ServletUtility.getErrorMessage(request) );
      out.write("</font> </h3>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	");

	int pageNo = ServletUtility.getPageNo(request);
	int pageSize = ServletUtility.getPageSize(request);
	
	int index=(pageNo-1)*pageSize+1;
	List list = ServletUtility.getList(request);
	Iterator<FacultyBean> it = list.iterator();
	
		if(list.size() !=0){
	
      out.write("\n");
      out.write("	\n");
      out.write("	<table width =\"100%\" align=\"center\">\n");
      out.write("		<tr><th></th>\n");
      out.write("		<td align=\"center\">\n");
      out.write("		<label>First Name :</label>\n");
      out.write("		  ");
      out.print(HTMLUtility.getList("firstname", String.valueOf(bean.getId()), flist) );
      out.write("\n");
      out.write("		<label>Last Name :</label>\n");
      out.write("		<input type=\"text\" name=\"lastname\" placeholder=\"Enter Last Name\" value=");
      out.print(ServletUtility.getParameter("lastname", request) );
      out.write(">		\n");
      out.write("		<label>Login_ID</label>\n");
      out.write("		<input type=\"text\" name=\"login\" placeholder=\"Enter Login_id\" value=");
      out.print(ServletUtility.getParameter("login", request) );
      out.write(">				\n");
      out.write("		&nbsp;\n");
      out.write("		<input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_SEARCH);
      out.write("\">\n");
      out.write("		&nbsp;\n");
      out.write("		<input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_RESET );
      out.write("\">\n");
      out.write("		</td></tr>\n");
      out.write("	</table>\n");
      out.write("	<br>	\n");
      out.write("	<table border=\"1\" width=\"100%\" align=\"center\" cellpadding=8px cellspacing=\".2\">\n");
      out.write("		<tr>\n");
      out.write("		\n");
      out.write("			<th ><input type=\"checkbox\" id=\"select_all\" name =\"Select\">Select All.</th>\n");
      out.write("			\n");
      out.write("			<th>S.No.</th>\n");
      out.write("			<th>First Name.</th>\n");
      out.write("			<th>Last Name.</th>\n");
      out.write("			<th>Login_id.</th>\n");
      out.write("			<th>Qualification.</th>\n");
      out.write("			<th>Mobile No.</th>\n");
      out.write("			<th>Date of Joining.</th>\n");
      out.write("			<th>College Name.</th>\n");
      out.write("			<th>Subject Name.</th>\n");
      out.write("			<th>Edit</th>\n");
      out.write("		</tr>\n");
      out.write("		\n");
      out.write("		");

		while(it.hasNext()){
	 	bean =it.next();	
		
      out.write("\n");
      out.write("		\n");
      out.write("	<tr>\n");
      out.write("		<td><input type = \"checkbox\" class=\"checkbox\" name=\"ids\" value=\"");
      out.print(bean.getId() );
      out.write("\"></td>\n");
      out.write("		<td>");
      out.print(index++);
      out.write("</td>\n");
      out.write("		<td>");
      out.print(bean.getFirst_Name() );
      out.write("</td>\n");
      out.write("		<td>");
      out.print(bean.getLast_Name() );
      out.write("</td>\n");
      out.write("		<td>");
      out.print(bean.getEmail_id() );
      out.write("</td>\n");
      out.write("		<td>");
      out.print(bean.getQualification() );
      out.write("</td>\n");
      out.write("		<td>");
      out.print(bean.getMobile_No() );
      out.write("</td>\n");
      out.write("		<td>");
      out.print(bean.getDOJ());
      out.write("</td>\n");
      out.write("		<td>");
      out.print(bean.getCollege_Name() );
      out.write("</td>\n");
      out.write("		<td>");
      out.print(bean.getSubject_Name() );
      out.write("</td>\n");
      out.write("		<td><a href=\"FacultyCtl?id=");
      out.print(bean.getId());
      out.write("\">Edit </a></td>\n");
      out.write("	");
      out.write("\n");
      out.write("	</tr>\n");
      out.write("		");
 
		}
		
      out.write("\n");
      out.write("	</table>\n");
      out.write("\n");
      out.write("	<table width = \"100%\">\n");
      out.write("		<tr><th></th>\n");
      out.write("		");
 if(pageNo == 1){ 
      out.write("\n");
      out.write("		<td align=\"left\" ><input type=\"submit\" name=\"operation\" disabled=\"disabled\" value=\"");
      out.print(FacultyListCtl.OP_PREVIOUS );
      out.write("\"></td>\n");
      out.write("		 ");
}else{ 
      out.write("\n");
      out.write("		 <td align=\"left\" ><input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_PREVIOUS );
      out.write("\"></td>\n");
      out.write("		 ");
} 
      out.write("\n");
      out.write("			<td><input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_DELETE);
      out.write("\"></td>\n");
      out.write("			<td><input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_NEW);
      out.write("\"></td>	\n");
      out.write("			\n");
      out.write("			");

				FacultyModel model = new FacultyModel();
	
			
      out.write("		\n");
      out.write("		");
 if(list.size() < pageSize || model.nextPK() - 1 == bean.getId()) { 
      out.write("		\n");
      out.write("		<td align=\"right\"><input type=\"submit\" name=\"operation\" disabled=\"disabled\" value=\"");
      out.print(FacultyListCtl.OP_NEXT );
      out.write("\"></td>\n");
      out.write("		");
}else{ 
      out.write("\n");
      out.write("				<td align=\"right\"><input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_NEXT );
      out.write("\"></td>\n");
      out.write("		");
} 
      out.write("\n");
      out.write("		</tr>\n");
      out.write("	</table>\n");
      out.write("	\n");
      out.write("			");
}if(list.size() == 0){ 
      out.write("\n");
      out.write("            		<td align=\"center\"><input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_BACK);
      out.write("\"></td>	\n");
      out.write("            		");
 } 
      out.write("\n");
      out.write("            		\n");
      out.write("	\n");
      out.write("		<input type=\"hidden\" name=\"operation\" value=\"");
      out.print(pageNo );
      out.write("\">\n");
      out.write("		<input type=\"hidden\" name=\"operation\" value=\"");
      out.print(pageSize);
      out.write("\">\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>	\n");
      out.write("   <br>\n");
      out.write("        <br>\n");
      out.write("          <br>\n");
      out.write("        <br>\n");
      out.write("          <br>\n");
      out.write("        <br>\n");
      out.write("          <br>\n");
      out.write("        <br>\n");
      out.write("          <br>\n");
      out.write("        <br>\n");
      out.write("         <br>\n");
      out.write("        <br>\n");
      out.write("          <br>\n");
      out.write("        <br>\n");
      out.write("          <br>\n");
      out.write("        <br>\n");
      out.write("          <br>\n");
      out.write("        <br>\n");
      out.write("          <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style >\n");
      out.write(".footer{\n");
      out.write("position: fixed;\n");
      out.write("  left: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  background-color: White;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  }</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class = \"footer\">\n");
      out.write("<HR>\n");
      out.write("<H2>&copy; Copyrights RAYS Technologies</H2>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
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
}