package boardmapper;

import org.springframework.web.multipart.MultipartFile;

public class BoardWriterDTO {
	int seq, pw, viewcount;
	String title, contents, writingtime, file1;
	MultipartFile multifile1;
	MemberDTO writerdto;


	public MemberDTO getWriterdto() {
		return writerdto;
	}
	public void setWriterdto(MemberDTO writerdto) {
		this.writerdto = writerdto;
	}
	public MultipartFile getMultifile1() {
		return multifile1;
	}
	public void setMultifile1(MultipartFile multifile1) {
		this.multifile1 = multifile1;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWritingtime() {
		return writingtime;
	}
	public void setWritingtime(String writingtime) {
		this.writingtime = writingtime;
	}
	public String getFile1() {
		return file1;
	}
	public void setFile1(String file1) {
		this.file1 = file1;
	}
	@Override
	public String toString() {
		return "BoardDTO [seq=" + seq + ", pw=" + pw + ", viewcount=" + viewcount + ", title=" + title + ", contents="
				+ contents + ", writingtime=" + writingtime + ", file1=" + file1 + "]";
	}
	public BoardWriterDTO(int seq, int pw, int viewcount, String title, String contents, String writer, String writingtime,
			String file1) {
		super();
		this.seq = seq;
		this.pw = pw;
		this.viewcount = viewcount;
		this.title = title;
		this.contents = contents;

		this.writingtime = writingtime;
		this.file1 = file1;
	}
	public BoardWriterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


}
