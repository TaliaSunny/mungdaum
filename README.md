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
<<product_member>>
create view product_member as
select m.Company as 회사, m.MPhone as 전번, m.Sector as 업종, m.MId as 아이디, p.*
from member m , product p;

4) 공지사항 테이블
Admin 테이블( 관리자 아이디 )
공지사항 ( * )
<<admin_notice>>
create view admin_notice as
select ad.AId 관리자아이디 , n.*
from admin ad , notice n
where ad.AId = n.AId;

5) 문의사항 테이블 (= > 고객 센터 ) 
Admin테이블( 관리자 아이디, 이름 ) => 문의 사항은 메일로 보내겠다~! 테이블 속성 추가 싫다.....
문의사항 ( 번호, 문의글 히트수 , 이름 , 카테고리, 내용 , 제목 , 첨부파일 , 등록일 )
member ( id )

 <<QNA_ADMIN>>
create  view QNA_ADMIN as
select q.QId 문의번호, q.QCategory 문의카테고리, q.QTitle 문의제목, q.QContent  문의내용,
q.QFile 첨부파일, q.QRdate 등록일, q.QHit 문의글히트수 ,m.MId 문의고객명 , ad.AId 담당관리자아이디, ad.AName 관리자이름
from admin ad , qna q, member m
where m.MId = q.MId
AND ad.AId = q.AId;

7) 주문
주문 테이블 ( 주문일 , 주문번호 )
member ( 회원 아이디 )

<<ordertable>>

create view ordertable as
select o.ORdate 주문일, o.ONo 주문번호, m.MId 회원아이디, p.PName 상품명 , ca.CQty 물품구매수량
from product p, orders o , member m ,cart ca
where ca.PNo = p.PNo AND ca.MId = m.MId;

건의 사항? 상품이 같다면? count 하는 기능 추가 할 수 있다면 추후에 해보는거 어떨까요?

8) 쿠폰 이벤트 배너 관리 테이블 - 이벤트 페이지에 쿠폰이 있는지 어느 이벤트에 쿠폰이 있는지 확인한다.
쿠폰 ( 쿠폰 번호 , 쿠폰 할인 정보 , 기간 )
이벤트 ( 내용 , 제목 , 조회수 ,기간 )
admin ( 작성자 )
상품 ( 이벤트 적용 상품들.. 상품명 )
이건 나중에 가능하면 
찜목록 테이블(*)
추천 상품

<<coupon_event>>

create view coupon_event as
select c.CNo 쿠폰번호 , e.EContent 이벤트내용,
e.EStartdate 이벤트시작일 , e.EEnddate 이벤트종료일,
c.CDiscount 할인률 , c.CStartDate 쿠폰적용시작일, c.CEnddate 쿠폰적용마감일,
p.PName 이벤트적용상품들
from coupon c, event e, product p
where c.ENo = e.ENo AND p.PNo = e.PNo;
   
참고 부분 ) 저희가 논의하면서 나눈 내용으로는 이벤트 관리자를 분할하여 나누려고 했습니다.
하지만 이벤트 테이블과 admin사이의 관계 설정을 하지 않았기 때문에 이 부분은 삭제 되었습니다.
추후에 개인 프로젝트 하실때 이부분을 유념하셔서 작성하시면 도움이 되실겁니다.


