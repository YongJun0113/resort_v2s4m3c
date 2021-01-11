package dev.mvc.contents;

import java.util.HashMap;
import java.util.List;

public interface ContentsDAOInter {
  /**
   * 등록
   * <insert id="create" parameterType="ContentsVO">
   * @param contentsVO
   * @return 등록 갯수
   */
  public int create (ContentsVO contentsVO);
    
  /**
   * 모든 카테고리의 목록
   * <select id="list_all" resultType="ContentsVO">
   * @return
   */
  public List<ContentsVO> list_all();
  
  /**
   * 특정 카테고리의 등록된 목록
   * <select id="list_all" resultType="ContentsVO">
   * @return
   */
  public List<ContentsVO> list_by_cateno(int cateno);
  
  /**
   * 조회
   * @param contentsno
   * @return
   */
  public ContentsVO read(int contentsno);
  
  /**
   * 수정용 조회
   * @param contentsno
   * @return
   */
  public ContentsVO read_update(int contentsno);
  
  /**
   * 수정
   * @param contentsVO
   * @return
   */
  public int update(ContentsVO contentsVO);
  
  /**
   * 패스워드 검사
   * @param hashMap
   * @return
   */
  public int passwd_check(HashMap<String, Object> hashMap);
  
  /**
   * 삭제 처리
   * @param contentsno
   * @return 처리된 레코드 갯수
   */
  public int delete(int contentsno);
  
  /**
   * 이미지 변경 
   * @param contentsVO
   * @return
   */
  public int update_img(ContentsVO contentsVO);
  
  /**
   * 
   * @param contentsVO
   * @return
   */
  public int total_count();
  
  /**
   * Map 등록, 변경, 삭제
   * @param hashMap
   * @return
   */
  public int map(HashMap<String, Object> hashMap);
  
  /**
   * Map 조회
   * @param contentsno
   * @return
   */
  public ContentsVO map_read(int contentsno);  
  
  /**
   * Youtube
   * @param hashMap
   * @return
   */
  public int youtube(HashMap<String, Object> hashMap);
  
  /**
   * mp3 등록, 변겅, 삭제
   * @param hashMap
   * @return
   */
  public int mp3(HashMap<String, Object> hashMap);
  
  /**
   * mp4 등록, 변겅, 삭제
   * @param hashMap
   * @return
   */
  public int mp4(HashMap<String, Object> hashMap);
  
  /**
   * 카테고리별 검색 목록
   * @param hashMap
   * @return
   */
  public List<ContentsVO> list_by_cateno_search(HashMap<String, Object> hashMap);

  /**
   * 카테고리별 검색 레코드 갯수
   * @param hashMap
   * @return
   */
  public int search_count(HashMap<String, Object> hashMap);
  
  /**
   * 검색 + 페이징 목록
   * <select id="list_by_cateno_search_paging" resultType="ContentsVO" parameterType="HashMap">
   * @param map
   * @return
   */
  public List<ContentsVO> list_by_cateno_search_paging(HashMap<String, Object> map);
  
  /**
   * 답변 순서 증가
   * @param map
   * @return
   */
  public int increaseAnsnum(HashMap<String, Object> map);
   
  /**
   * 답변
   * @param contentsVO
   * @return
   */
  public int reply(ContentsVO contentsVO);
  
  /**
   * 검색 + 페이징 목록 + Member join
   * @param map
   * @return
   */
  public List<Contents_MemberVO> list_by_cateno_search_paging_join(HashMap<String, Object> map);
  
  /**
   * 글 수 증가
   * @param 
   * @return
   */ 
  public int increaseReplycnt(int contentsno);
 
  /**
   * 글 수 감소
   * @param 
   * @return
   */   
  public int decreaseReplycnt(int contentsno);
  
}
