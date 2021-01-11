/**********************************/
/* Table Name: ´ñ±Û */
/**********************************/
DROP TABLE reply;

CREATE TABLE reply(
        replyno                                NUMBER(10)         NOT NULL         PRIMARY KEY,
        contentsno                           NUMBER(10)    NOT     NULL ,
        memberno                            NUMBER(6)         NOT NULL ,
        content                               VARCHAR2(1000)         NOT NULL,
        passwd                                VARCHAR2(20)         NOT NULL,
        rdate                              DATE NOT NULL,
  FOREIGN KEY (contentsno) REFERENCES contents (contentsno),
  FOREIGN KEY (memberno) REFERENCES member (memberno)
);

COMMENT ON TABLE reply is '´ñ±Û';
COMMENT ON COLUMN reply.replyno is '´ñ±Û¹øÈ£';
COMMENT ON COLUMN reply.contentsno is 'ÄÁÅÙÃ÷¹øÈ£';
COMMENT ON COLUMN reply.memberno is 'È¸¿ø ¹øÈ£';
COMMENT ON COLUMN reply.content is '³»¿ë';
COMMENT ON COLUMN reply.passwd is 'ºñ¹Ð¹øÈ£';
COMMENT ON COLUMN reply.rdate is 'µî·ÏÀÏ';

1) µî·Ï
INSERT INTO reply(replyno, contentsno, memberno, content, passwd, rdate)
VALUES((SELECT NVL(MAX(replyno), 0) + 1 as replyno FROM reply),
             1, 1, '´ñ±Û1', '1234', sysdate);
INSERT INTO reply(replyno, contentsno, memberno, content, passwd, rdate)
VALUES((SELECT NVL(MAX(replyno), 0) + 1 as replyno FROM reply),
             1, 1, '´ñ±Û2', '1234', sysdate);
INSERT INTO reply(replyno, contentsno, memberno, content, passwd, rdate)
VALUES((SELECT NVL(MAX(replyno), 0) + 1 as replyno FROM reply),
             1, 1, '´ñ±Û3', '1234', sysdate);             

commit;

2) ÀüÃ¼ ¸ñ·Ï
SELECT replyno, contentsno, memberno, content, passwd, rdate
FROM reply
ORDER BY replyno DESC;

 REPLYNO CONTENTSNO MEMBERNO CONTENT PASSWD RDATE
 ------- ---------- -------- ------- ------ ---------------------
       3          1        1 ´ñ±Û3     1234   2019-12-17 16:59:38.0
       2          1        1 ´ñ±Û2     1234   2019-12-17 16:59:37.0
       1          1        1 ´ñ±Û1     1234   2019-12-17 16:59:36.0


3) contentsno º° ¸ñ·Ï
SELECT replyno, contentsno, memberno, content, passwd, rdate
FROM reply
WHERE contentsno=1
ORDER BY replyno DESC;

 REPLYNO CONTENTSNO MEMBERNO CONTENT PASSWD RDATE
 ------- ---------- -------- ------- ------ ---------------------
       3          1        1 ´ñ±Û3     1234   2019-12-17 16:59:38.0
       2          1        1 ´ñ±Û2     1234   2019-12-17 16:59:37.0
       1          1        1 ´ñ±Û1     1234   2019-12-17 16:59:36.0
       
DELETE FROM reply
WHERE replyno=1;

10) reply + member join ¸ñ·Ï

SELECT m.id,
           r.replyno, r.contentsno, r.memberno, r.content, r.passwd, r.rdate
FROM member m,  reply r
WHERE m.memberno = r.memberno
ORDER BY r.replyno DESC;

10) reply + member join Á¶È¸

SELECT m.id,
           r.replyno, r.contentsno, r.memberno, r.content, r.passwd, r.rdate
FROM member m,  reply r
WHERE (m.memberno = r.memberno) AND r.contentsno=1
ORDER BY r.replyno DESC;
