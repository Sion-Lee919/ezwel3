package annotation.springmvc.memberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("basicservice")
public class MemberBasicService implements MemberService {

	MemberBasicService(){
		System.out.println("MemberBasicService 객체 생성");
	}
	@Autowired
	MemberDAO dao;

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	@Override
	public void registerMember() {
		boolean b = dao.selectMember();
		if(!b) {
			dao.insertMember();
		}
		else {
			System.out.println("이미 존재하는 회원입니다.");
		}
	}

	@Override
	public String registerMember(MemberDTO dto) {
		boolean b = dao.selectMember(dto);
		if(!b) {
			dao.insertMember(dto);
			return "포인트없이 회원가입되셨습니다.";
		}
		else {
			return "이미 존재하는 회원입니다.";
		}
	}

}
