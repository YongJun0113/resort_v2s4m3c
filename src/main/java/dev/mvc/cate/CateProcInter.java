package dev.mvc.cate;

import java.util.List;

public interface CateProcInter {

  /**
   * 등록
   * <insert id="create" parameterType="CateVO">
   * @param cateVO
   * @return 등록된 갯수
   */
  public int create (CateVO cateVO);
  
  /**
   * 목록
   * <xmp>
   * <select id="list_cateno_asc" resultType="CateVO">
   * </xmp> 
   * @return 레코드 목록
   */
  public List<CateVO> list_cateno_asc();
  
  /**
   * 카테고리 그룹별 번호
   * @param categrpno 
   * @param categrpno 카테고리 그룹번호
   * @return
   */
  public List<CateVO> list_by_categrpno(int categrpno);
  
  /**
   * 조회
   * <xmp>
   *   <select id="read" resultType="CateVO" parameterType="int">
   * </xmp>  
   * @param cateno
   * @return
   */
  public CateVO read(int cateno);
  
  /**
   * 수정 처리
   * <xmp>
   *   <update id="update" parameterType="CateVO"> 
   * </xmp>
   * @param cateVO
   * @return 처리된 레코드 갯수
   */
  public int update(CateVO cateVO);
  
  /**
   * 삭제 처리
   * <xmp>
   *   <delete id="delete" parameterType="int">
   * </xmp> 
   * @param cateno
   * @return 처리된 레코드 갯수
   */
  public int delete(int cateno);
  
  /**
   * 목록
   * <xmp>
   * <select id="list_seqno_asc" resultType="CateVO">
   * </xmp> 
   * @return
   */
  public List<CateVO> list_seqno_asc();
  
  /**
   * 출력 순서 상향
   * <xmp>
   * <update id="update_seqno_up" parameterType="int">
   * </xmp>
   * @param categrpno
   * @return 처리된 레코드 갯수
   */
  public int update_seqno_up(int cateno);
  
  /**
   * 출력 순서 하향
   * <xmp>
   * <update id="update_seqno_down" parameterType="int">
   * </xmp>
   * @param categrpno
   * @return 처리된 레코드 갯수
   */
  public int update_seqno_down(int cateno);
  
  /**
   * 출력 모드
   * <!-- 수정, id: update_visible, 입력: CateVO, 리턴: int -->
   * @param categrpno
   * @return
   */
  public int update_visible(CateVO cateVO);
  
  /**
   *  통합 VO 기반 join
   * @return
   */
  public List<Categrp_Cate_join> list_join(); 
  
  /**
   * <xmp>
   *  통합 VO 기반 join
   *  <select id="list_join_by_categrpno" resultType="Categrp_Cate_join"> 
   * </xmp>
   * @return
   */
  public List<Categrp_Cate_join> list_join_by_categrpno(int categrpno);  
  
  /**
   * 글 수 증가
   * @param cateno
   * @return
   */
  public int increaseCnt (int cateno);
  
  /**
   * 글 수 감소
   * @param cateno
   * @return
   */
  public int decreaseCnt (int cateno);
}
