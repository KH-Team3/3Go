package yong.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import yong.command.*;
public class YongController extends HttpServlet{

 public YongController() {
		// TODO Auto-generated constructor stub
	}
	
 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		userProcess(req, resp);
	}
	
 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 userProcess(req, resp);
	}
 
 protected void userProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		                                //���� req 
	 
  //1.http ��û ����(awt �� obj ��ȯ �����Ͱ� ����)
  String type=req.getParameter("type");
 
  CommandHandler command2=null;
  
  String result=null;
  //����� ���� ���
  String goPage=null;
  //����� ������ �� jsp �������� ��ġ

  //2.�䱸��� �м�
  if(type.equals("list")){   
  //����Ʈ�� Ÿ������ ���� �´ٸ� ����ƮŸ�Կ� ���� **��� ó��**
  
	/*  result="�� ��� ���� ����� �����";
	  goPage="list.jsp";*/
	  //����� �� �������� ����
	  command2 = new ListAction();
  
  }else if(type.equals("write")){
	//�۾��⸦   
 /*   result="�۾��� ����� �����";
    goPage="write.jsp";*/
	command2 = new WriteAction(); 
	  
  }else if(type.equals("content")){
	  
/*	  result="�������� ����� �����";
	  goPage="content.jsp";*/
      command2 = new ContentAction();
  }
  
 goPage=command2.process(req, resp);
  
  //5.����� ������ �̵��� ��
  //�������� ��ü�� ������
  RequestDispatcher dis= req.getRequestDispatcher(goPage);
  
  //���������� ������
  dis.forward(req, resp);
 
  //�̰� �Ǹ� web.xml ���!!! ����Ϸ� ����
 } 
}