package kh.s13.palette.mypage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.s13.palette.member.model.vo.MemberVo;
import kh.s13.palette.product.model.service.ProductWishService;

/**
 * Servlet implementation class MypageReviewDeleteDoController
 */
@WebServlet("/mypage/wish/delete.do")
public class MypageWishDeleteDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MypageWishDeleteDoController() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 찜 삭제
		String mid = request.getParameter("mid"); 
		String pid = request.getParameter("pid"); 
		
		ProductWishService service = new ProductWishService();
		int result = service.delete(mid, pid);
		
		if (result > 0) {
			request.setAttribute("func", "wishDelete");
			request.setAttribute("msg", "찜 삭제 성공");
			request.getRequestDispatcher("./WEB-INF/view/resultAlert.jsp").forward(request, response);
		} else {
			request.setAttribute("func", "wishDelete");
			request.setAttribute("msg", "찜 삭제 실패");
			request.getRequestDispatcher("./WEB-INF/view/resultAlert.jsp").forward(request, response);
		}
	}

}
