package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.model.BoardDAO;
import mvc.model.BoardDTO;

/**
 * Servlet implementation class BoardController
 */
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final int LIST_COUNT = 5;
	BoardDAO dao = BoardDAO.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoardController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		전체 경로 /WebMarket/BoardListAction.do
		String requestURI = request.getRequestURI();

//		프로젝트 이름 /WebMarket
		String contextPath = request.getContextPath();

//		전체 경로에서 /BoardListAction.do 읽어오기
		String command = requestURI.substring(contextPath.length());

		if (command.equals("/BoardListAction.do")) {
			requestBoardList(request);
			RequestDispatcher rd = request.getRequestDispatcher("./board/list.jsp");
			rd.forward(request, response);
		}
	}// doPost

//	등록된 글 목록 가져오기
	private void requestBoardList(HttpServletRequest request) {
		List<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		int pageNum = 1;
		int limit = LIST_COUNT;
		if (request.getParameter("pageNum") != null)
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		String items = request.getParameter("items");
		String text = request.getParameter("text");
		int total_record = dao.getListCount(items, text);
		boardlist = dao.getBoardList(pageNum, limit, items, text);
		int total_page;
		if (total_record % limit == 0)
			total_page = total_record / limit;
		else
			total_page = total_record / limit + 1;
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("total_page", total_page);
		request.setAttribute("total_record", total_record);
		request.setAttribute("boardlist", boardlist);
	}

}// end class
