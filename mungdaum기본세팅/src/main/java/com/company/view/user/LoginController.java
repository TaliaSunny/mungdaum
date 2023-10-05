package com.company.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.spring_annotation.user.UserDAO;
import com.company.spring_annotation.user.UserDO;

/*
 * LoginController 클래스를 POJO 클래스라 한다.
 * 
 * POJO(Plain Old Java Object)란? (= 평범하고 오래된 자바 객체 = 순수한 객체 라는 / 의미를 갖고있다.) 
 * 즉, Java로 생성하는 순수한 객체를 뜻한다. 
 * 이를 해석하면 POJO는 객체 지향적인 원리에 
 * 충실하면서 환경과 기술에 종속되지 않고, 
 * 필요에 따라 재활용될 수 있는 방식으로 설계된 오브젝트를 의미한다.
 * 쉽게 말하면 어떤 클래스로부터 '상속'도 받지 않고, 어떤 '인터페이스'로부터 구현도 받지 않은 클래스
 * 
 * 이런 이유로 IT 전문가들을 "스프링 프레임워크"는 => 'POJO 방식의 프레임워크' 이라고 함!!
 * POJO 클래스 위에 '@Controller' 어노테이션 받으면 된다.
 */

@Controller		// 어노테이션, 개체 생성을 해준다. // 우리가 앞에서 배운 Component 어노테이션을 사용해도 문제없다.
//@Component 어노테이션을 받아서 사용해도 된다. // Component 어노테이션을 범용적으로 사용하게되면 개발자가 헛갈리기 때문에 Controller 

public class LoginController { // << 어떠한 인퍼페이스도 임플리먼트, 클래스도 상속을 받지 않는 클래스를 POJO 클래스라 한다. 
	
	// 1. request.getparameter 해서 받아오는거 안해도됨 2.DO 객체만들어서 멤버변수에 때려받는 
	
	/*
	 * 스프링에서는 어떤 메소드 위메 @RequestMapping 어노테이션을 이용하여
	 * HandlerMapping 설정을 대체한다.
	 * 즉 클라이언트로부터 "/login.do" 라는 요청이 있을 때
	 * login() 메소드를 매핑하겠다는 설정이다.
	 * 그러면 login() 메소드 실행될 때 스프링 컨테이너는
	 * UserDO 객체, UserDAO 객체 HttpSession 객체를 생성해서 DI(의존성 주입) 시킨다.
	 * 위와 같은 객체를 커맨드(command) 객체라 한다.
	 */
	
	@RequestMapping("/login.do")												
	// MVC controller처럼 폼에서 넘어온 값들을 추출할 필요가 없다.
	public String login(UserDO userDO, UserDAO userDAO, HttpSession session) {	
		// login사용할때 사용하는 객체들을 다 나열한다. 스프링컨테이너가 알아서 객체를 만들어서 다 넣어준다
		
		UserDO user = userDAO.getUser(userDO);				// getUser(userDO) 만들어 주러 가자. 이미 userDO에는 폼에서 넘어온 값들이 다 저장되어 있다.
		
		if(user != null) {	// 로그인 인증 성공
			System.out.println("로그인 인증 성공!!");
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";      
		}else {
			return "login.jsp";
		}
		
		
	}
}