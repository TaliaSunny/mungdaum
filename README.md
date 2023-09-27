# mungdaum
멍다움 사이트

view테이블 case에 대해서 원하는 방식으로 넣어주세요!
1) 회원 프로필                 (*) 전체
member테이블 ( * )
강아지 프로필 테이블 ( * ) 

<<profile_member>>
CREATE VIEW profile AS
SELECT m.* , a.ANo ,a.AName, a.AType, a.AAge , a.AGenderPROFILE 
from member m, ANIMALPROFILE a
where m.MId = a.MId;

-select 문 
select * from profile;

2) 회원이 쓴 글 보기 테이블
member 테이블 ( 회원 아이디 , 이름 )
자유게시판( * )
리뷰( * )
상품( 상품명 )

<<member_review_free_product>>
create view member_review_free_product as
select f.* , m.MName ,r.RNo, r.RWriter,r.RContent,r.RRdate,r.RHit,r.PNo,p.PName
from member m, review r, freecomunity f,product p
where m.MId = r.MId and f.MId = m.MId
and r.PNo = p.PNo ;

-select 문 
select * from MEMBER_REVIEW_FREE_PRODUCT ;

3) 상품 테이블 (자사 제품 기업 제품 분리 및 실제로 판매하는지 재고는 있는지 확인해야함)
member ( 기업명 , 기업 전화번호, 업종, id )
상품 ( * )

4) 공지사항 테이블
Admin 테이블( 관리자 아이디 )
공지사항 ( * )

5) 문의사항 테이블 (= > 고객 센터 ) 
Admin테이블( 관리자 아이디, 이름 ) => 문의 사항은 메일로 보내겠다~! 테이블 속성 추가 싫다.....
문의사항 ( 번호, 문의글 히트수 , 이름 , 카테고리, 내용 , 제목 , 첨부파일 , 등록일 )
member ( id )
 
6) 주문
주문 테이블 ( 주문일 , 주문번호 )
member ( 회원 아이디 )
    
7) 쿠폰 이벤트 배너 관리 테이블 - 이벤트 페이지에 쿠폰이 있는지 어느 이벤트에 쿠폰이 있는지 확인한다.
쿠폰 ( 쿠폰 번호 , 쿠폰 할인 정보 , 기간 )
이벤트 ( 내용 , 제목 , 조회수 ,기간 )
admin ( 작성자 )
상품 ( 이벤트 적용 상품들.. 상품명 )
이건 나중에 가능하면 
찜목록 테이블(*)
추천 상품 


