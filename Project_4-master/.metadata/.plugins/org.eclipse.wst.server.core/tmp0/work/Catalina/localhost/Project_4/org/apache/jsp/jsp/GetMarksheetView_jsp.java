/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-06-25 09:57:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.raystec.project4.controller.GetMarksheetCtl;
import com.raystec.Util.ServletUtility;
import com.raystec.Util.DataUtility;
import com.raystec.Bean.RoleBean;
import com.raystec.project4.controller.*;
import com.raystec.Bean.UserBean;

public final class GetMarksheetView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.raystec.Bean.RoleBean");
    _jspx_imports_classes.add("com.raystec.Util.ServletUtility");
    _jspx_imports_classes.add("com.raystec.Util.DataUtility");
    _jspx_imports_classes.add("com.raystec.project4.controller.GetMarksheetCtl");
    _jspx_imports_classes.add("com.raystec.Bean.UserBean");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16*16\"/>\n");
      out.write("<title> Get marksheet</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      com.raystec.Bean.MarksheetBean bean = null;
      bean = (com.raystec.Bean.MarksheetBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new com.raystec.Bean.MarksheetBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\n");
      out.write("    \n");
      out.write("   <form action=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\" method=\"post\">\n");
      out.write("    ");
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
      out.write("\n");
      out.write("\n");
      out.write("			<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\">\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div align=\"center\">\n");
      out.write("	        <h1>Get Marksheet</h1>\n");
      out.write("	\n");
      out.write("        	<h1><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font></h1>\n");
      out.write("       		<H2><font color=\"green\"> ");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font></H2> \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            <table>\n");
      out.write("           \n");
      out.write("            <br>\n");
      out.write("				<tr><th align=\"right\"> Roll No <span style=\"color:red\">*</span></th>\n");
      out.write("				<td><input type=\"text\"  name=\"rollNo\" placeholder=\"enter the roll_no.\" size=\"25\" value=\"");
      out.print(ServletUtility.getParameter("rollNo", request));
      out.write("\">\n");
      out.write("				</td><td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("rollNo", request));
      out.write("</font></td>\n");
      out.write("				</tr>                \n");
      out.write("               \n");
      out.write("                \n");
      out.write("                <tr><th style=\"padding: 3px\"></th></tr>\n");
      out.write("                \n");
      out.write("                <tr><th></th><td><input type=\"submit\" name=\"operation\" value=\"");
      out.print(GetMarksheetCtl.OP_GO);
      out.write("\">\n");
      out.write("                			&nbsp;<input type=\"submit\" name=\"operation\" value=\"");
      out.print(GetMarksheetCtl.OP_RESET);
      out.write("\">\n");
      out.write("                </td></tr>\n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                ");

                    if ( bean.getRollNo() != null  && bean.getRollNo().trim().length() > 0 ) {
                
      out.write("\n");
      out.write("			<table border=\"1\">\n");
      out.write("				<table border=\"1\" width=\"35%\">\n");
      out.write("				  <tr align=\"center\">\n");
      out.write("				  	<td><h2 style=\"padding-top: 10px\"><font color=\"red\">Rays Technologies</font><img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/rays.jpg\" width=\"100\"\n");
      out.write("						height=\"30\" align=\"right\"></h2></td>\n");
      out.write("				  </tr></table>\n");
      out.write("				  \n");
      out.write("				 <table border=\"1\" width=\"35%\">\n");
      out.write("				 	<tr>\n");
      out.write("				 		<th align=\"center\"> Name</th>\n");
      out.write("				 		<td align=\"center\"> ");
      out.print(DataUtility.getStringData(bean.getName()) );
      out.write("</td>\n");
      out.write("				 		<th align=\"center\"> Roll No</th>\n");
      out.write("				 		<td align=\"center\"> ");
      out.print(DataUtility.getStringData(bean.getRollNo()) );
      out.write(" </td>\n");
      out.write("				 						 \n");
      out.write("					</tr>\n");
      out.write("				 	<tr>\n");
      out.write("				 		<td align=\"center\"> Status</td>\n");
      out.write("				 		<th align=\"center\">Regular</th>\n");
      out.write("				 		<td align=\"center\"> Course</td>\n");
      out.write("				 		<th align=\"center\">BE</th>				 \n");
      out.write("					</tr>			\n");
      out.write("				 </table> \n");
      out.write("	");

	int phy =DataUtility.getInt(DataUtility.getStringData(bean.getPhysics()));
	int chem =DataUtility.getInt(DataUtility.getStringData(bean.getChemistry()));
	int math =DataUtility.getInt(DataUtility.getStringData(bean.getMaths()));
	int total = (phy+chem+math);
	float perc = total/3;
	
      out.write("\n");
      out.write("					  \n");
      out.write("			<table border=\"1\" width=\"35%\">\n");
      out.write("				<tr>\n");
      out.write("					<th align=\"center\" style=\"width: 25%\">Subject</th>\n");
      out.write("					<th align=\"center\" style=\"width: 25%\">Maximum Marks</th>\n");
      out.write("					<th align=\"center\" style=\"width: 25%\">Minimum Marks</th>\n");
      out.write("					<th align=\"center\" style=\"width: 25%\">Marks Obtained</th>\n");
      out.write("					<th align=\"center\" style=\"width: 25%\">Grade</th>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("				<td align=\"center\">Physics</td>\n");
      out.write("				<td align=\"center\">100</td>\n");
      out.write("				<td align=\"center\">33</td>\n");
      out.write("				<td align=\"center\">");
      out.print(phy );
      out.write("\n");
      out.write("				\n");
      out.write("				");
if(phy<33){
      out.write("\n");
      out.write("					<span style=\"color: red\">*</span>\n");
      out.write("				");
 } 
      out.write("	</td>\n");
      out.write("				\n");
      out.write("				<td align=\"center\">\n");
      out.write("				\n");
      out.write("				");

					if(phy <=100 && phy >85){ 
      out.write(" A+\n");
      out.write("				");
} else if(phy<=85 && phy > 75 ) {
      out.write("B+\n");
      out.write("				");
} else if(phy<=75 && phy > 65 ) {
      out.write("B\n");
      out.write("				");
} else if(phy<=65 && phy > 55 ){ 
      out.write("C+\n");
      out.write("				");
} else if(phy<=55 && phy >=33  ){ 
      out.write("C\n");
      out.write("				\n");
      out.write("				");
} else if(phy< 33 && phy >= 0 ) {
      out.write("<span style=\"color: red\"> Fail</span>\n");
      out.write("				");
 } 
      out.write("\n");
      out.write("				</td>\n");
      out.write("				</tr>\n");
      out.write("			\n");
      out.write("			<tr>\n");
      out.write("				<td align=\"center\">Chemistry</td>\n");
      out.write("				<td align=\"center\">100</td>\n");
      out.write("				<td align=\"center\">33</td>\n");
      out.write("				<td align=\"center\">");
      out.print(chem );
      out.write("\n");
      out.write("				\n");
      out.write("				");
if(chem<33){
      out.write("\n");
      out.write("					<span style=\"color: red\">*</span>\n");
      out.write("				");
 } 
      out.write("	</td>\n");
      out.write("				\n");
      out.write("				<td align=\"center\">\n");
      out.write("				\n");
      out.write("				");

					if(chem <=100 && chem >85){ 
      out.write(" A+\n");
      out.write("				");
} else if(chem<=85 && chem > 75 ) {
      out.write("B+\n");
      out.write("				");
} else if(chem <=75 && chem > 65 ) {
      out.write("B\n");
      out.write("				");
} else if(chem <=65 && chem > 55 ){ 
      out.write("C+\n");
      out.write("				");
} else if(chem <=55 && chem >=33  ){ 
      out.write("C\n");
      out.write("				\n");
      out.write("				");
} else if(chem < 33 && chem >= 0 ) {
      out.write("<span style=\"color: red\"> Fail</span>\n");
      out.write("				");
 } 
      out.write("\n");
      out.write("				</td>\n");
      out.write("				</tr>\n");
      out.write("					\n");
      out.write("			<tr>\n");
      out.write("				<td align=\"center\"> Maths</td>\n");
      out.write("				<td align=\"center\">100</td>\n");
      out.write("				<td align=\"center\">33</td>\n");
      out.write("				<td align=\"center\">");
      out.print(math );
      out.write("\n");
      out.write("				\n");
      out.write("				");
if(math<33){
      out.write("\n");
      out.write("					<span style=\"color: red\">*</span>\n");
      out.write("				");
 } 
      out.write("	</td>\n");
      out.write("				\n");
      out.write("				<td align=\"center\">\n");
      out.write("				\n");
      out.write("				");

					if(math <=100 && math >85){ 
      out.write(" A+\n");
      out.write("				");
} else if(math <=85 && math > 75 ) {
      out.write("B+\n");
      out.write("				");
} else if( math <=75 && math > 65 ) {
      out.write("B\n");
      out.write("				");
} else if(math <=65 && math > 55 ){ 
      out.write("C+\n");
      out.write("				");
} else if(math <=55 && math >=33  ){ 
      out.write("C\n");
      out.write("				\n");
      out.write("				");
} else if(math < 33 && math >= 0 ) {
      out.write("<span style=\"color: red\"> Fail</span>\n");
      out.write("				");
 } 
      out.write("\n");
      out.write("				</td>\n");
      out.write("				</tr>\n");
      out.write("			</table>	  \n");
      out.write("			\n");
      out.write("			<table border=\"1\" width=\"35%\">\n");
      out.write("			<tr>\n");
      out.write("				<th>Total</th>\n");
      out.write("				<th>Percentage</th>\n");
      out.write("				<th>Division</th>\n");
      out.write("				<th>Result</th>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<th>");
      out.print(total );
      out.write("\n");
      out.write("				");
 if(total<99 || phy<33|| chem<33|| 	math<33){ 
      out.write("\n");
      out.write("				<span style=\"color: red\">*</span>\n");
      out.write("				");
 } 
      out.write("\n");
      out.write("				</th>\n");
      out.write("			\n");
      out.write("				<th>");
      out.print(perc );
      out.write(" %</th>\n");
      out.write("				<th>\n");
      out.write("				");
 if(perc <100 && perc >= 60){ 
      out.write("1<sup>st</sup>\n");
      out.write("				");
} else if(perc <60 && perc >=40){ 
      out.write("2<sup>st</sup>\n");
      out.write("				");
} else if(perc <40 && perc >=0){ 
      out.write("3<sup>st</sup>\n");
      out.write("				");
} 
      out.write("\n");
      out.write("				</th>\n");
      out.write("				\n");
      out.write("				<th>\n");
      out.write("				");

				if(phy >=33 && chem>=33 && math >= 33) { 
      out.write("\n");
      out.write("				<span style=\"color: green\"> Pass</span>\n");
      out.write("				");
}else{ 
      out.write("\n");
      out.write("				<span style=\"color: red\"> Fail</span>\n");
      out.write("				");
 } 
      out.write("\n");
      out.write("				\n");
      out.write("				</th>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("			\n");
      out.write("			");
} 
      out.write("\n");
      out.write("	</table>		\n");
      out.write(" </form>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write("    </center>\n");
      out.write("    ");
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
