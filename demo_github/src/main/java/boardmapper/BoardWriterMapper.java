package boardmapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BoardWriterMapper {
	BoardWriterDTO getBoardWriterInfo(int seq);
	MemberBoardDTO getMemberAndBoardInfo(String id);
}
