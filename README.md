# mungdaum
멍다움 사이트

view테이블 case에 대해서 원하는 방식으로 넣어주세요!
1) 회원 프로필                 (*) 전체
member테이블 ( * )
강아지 프로필 테이블 ( * )
2) 회원이 쓴 글 보기 테이블
member 테이블 ( 회원 아이디 , 이름 )
자유게시판( * )
리뷰( * )

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
    
8) 쿠폰 이벤트 배너 관리 테이블
쿠폰 ( 쿠폰 번호 , 쿠폰 할인 정보 , 기간 )
이벤트 ( 내용 , 제목 , 조회수 ,기간 )
admin ( 작성자 )

이건 나중에 가능하면 
찜목록 테이블(*)
추천 상품 


