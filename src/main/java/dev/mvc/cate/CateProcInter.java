package dev.mvc.cate;

import java.util.List;

public interface CateProcInter {

  /**
   * ���
   * <insert id="create" parameterType="CateVO">
   * @param cateVO
   * @return ��ϵ� ����
   */
  public int create (CateVO cateVO);
  
  /**
   * ���
   * <xmp>
   * <select id="list_cateno_asc" resultType="CateVO">
   * </xmp> 
   * @return ���ڵ� ���
   */
  public List<CateVO> list_cateno_asc();
  
  /**
   * ī�װ� �׷캰 ��ȣ
   * @param categrpno 
   * @param categrpno ī�װ� �׷��ȣ
   * @return
   */
  public List<CateVO> list_by_categrpno(int categrpno);
  
  /**
   * ��ȸ
   * <xmp>
   *   <select id="read" resultType="CateVO" parameterType="int">
   * </xmp>  
   * @param cateno
   * @return
   */
  public CateVO read(int cateno);
  
  /**
   * ���� ó��
   * <xmp>
   *   <update id="update" parameterType="CateVO"> 
   * </xmp>
   * @param cateVO
   * @return ó���� ���ڵ� ����
   */
  public int update(CateVO cateVO);
  
  /**
   * ���� ó��
   * <xmp>
   *   <delete id="delete" parameterType="int">
   * </xmp> 
   * @param cateno
   * @return ó���� ���ڵ� ����
   */
  public int delete(int cateno);
  
  /**
   * ���
   * <xmp>
   * <select id="list_seqno_asc" resultType="CateVO">
   * </xmp> 
   * @return
   */
  public List<CateVO> list_seqno_asc();
  
  /**
   * ��� ���� ����
   * <xmp>
   * <update id="update_seqno_up" parameterType="int">
   * </xmp>
   * @param categrpno
   * @return ó���� ���ڵ� ����
   */
  public int update_seqno_up(int cateno);
  
  /**
   * ��� ���� ����
   * <xmp>
   * <update id="update_seqno_down" parameterType="int">
   * </xmp>
   * @param categrpno
   * @return ó���� ���ڵ� ����
   */
  public int update_seqno_down(int cateno);
  
  /**
   * ��� ���
   * <!-- ����, id: update_visible, �Է�: CateVO, ����: int -->
   * @param categrpno
   * @return
   */
  public int update_visible(CateVO cateVO);
  
  /**
   *  ���� VO ��� join
   * @return
   */
  public List<Categrp_Cate_join> list_join(); 
  
  /**
   * <xmp>
   *  ���� VO ��� join
   *  <select id="list_join_by_categrpno" resultType="Categrp_Cate_join"> 
   * </xmp>
   * @return
   */
  public List<Categrp_Cate_join> list_join_by_categrpno(int categrpno);  
  
  /**
   * �� �� ����
   * @param cateno
   * @return
   */
  public int increaseCnt (int cateno);
  
  /**
   * �� �� ����
   * @param cateno
   * @return
   */
  public int decreaseCnt (int cateno);
}
