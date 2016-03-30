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
		                                //위에 req 
	 
  //1.http 요청 받음(awt 의 obj 반환 받은것과 같음)
  String type=req.getParameter("type");
 
  CommandHandler command2=null;
  
  String result=null;
  //결과를 담을 용기
  String goPage=null;
  //결과를 가지고 갈 jsp 페이지의 위치

  //2.요구기능 분석
  if(type.equals("list")){   
  //리스트의 타입인지 보고 맞다면 리스트타입에 대한 **기능 처리**
  
	/*  result="글 목록 보기 기능이 수행됨";
	  goPage="list.jsp";*/
	  //결과가 갈 페이지를 지정
	  command2 = new ListAction();
  
  }else if(type.equals("write")){
	//글쓰기를   
 /*   result="글쓰기 기능이 수행됨";
    goPage="write.jsp";*/
	command2 = new WriteAction(); 
	  
  }else if(type.equals("content")){
	  
/*	  result="본문보기 기능이 수행됨";
	  goPage="content.jsp";*/
      command2 = new ContentAction();
  }
  
 goPage=command2.process(req, resp);
  
  //5.결과를 가지고 이동할 곳
  //디스패쳐의 객체를 가지고
  RequestDispatcher dis= req.getRequestDispatcher(goPage);
  
  //마지막으로 보내기
  dis.forward(req, resp);
 
  //이게 되면 web.xml 등록!!! 등록하러 가자
 } 
}