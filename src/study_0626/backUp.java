package study_0626;

import java.util.List;

import bookcase.object.Book;

public class backUp {

	
	
	protected Book findBook(List<Book> bookList, String bName) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bName.equals(bookList.get(i).getbName())) {
				book = bookList.get(i);
			} else {
				System.out.println("[!] 존재하지 않는 도서입니다.\n");
				book = null;
			}
		}
		return book;
	}

	protected boolean setFindBookCheck(Book book) {
		bookFindChk = false;
		if(book == null) {
			bookFindChk = false;
			System.out.println("[!] 해당 도서를 찾지 못하였습니다.\n");
		} else {
			bookFindChk = true;
		}
		return bookFindChk;
	}

	// 도서를 찾으면 true값 -> 대여중이면 true / 대여중이지 않으면 false
	protected boolean setCheckUsingBook() {
		if(bookFindChk){
			if(bookList.get(temp).getbUsing().equals("false")) {
				checkUsingbook = false;
			} else {
				checkUsingbook = true;
			}
		}
		return checkUsingbook;
	}
	
	
	
	
}
