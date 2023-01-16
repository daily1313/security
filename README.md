### Spring Boot Security, JWT Server

### Skills
- Java17
- Spring Boot 3.0.1
- Gradle
- Spring Data JPA
- Spring Security
- Spring Web
- Validation
- Lombok
- H2

### Git Convention
- feat : 기능 추가
- fix : 버그 수정
- refactor : 리팩토링, 코드 수정
- style : formatting, 세미콜론 추가
- chore : 라이브러리 설치, 빌드 작업 업데이트
- docs : 주석 추가 삭제

### 프로젝트 설명
- Spring Boot를 이용하여 JWT 인증과 인가를 구현하고 예외사항에 대해서도 고려
- 발급받은 토큰(Json Web Token)을 기반으로 회원가입, 로그인, 권한, 회원조회에 대한 다양한 로직 수행
- Postman을 이용해 개발한 API 검증
- Security 설정파일 생성(SecurityConfig, PrincipalDetail..)
- 인증은 Request를 보낸 User가 누구인지, 올바은 유저인지 확인하는 과정
  - 만약 User를 찾지 못하면, 404(Not Found) Error 처리
  - 만약 중복된 User가 발견되면, 409(Conflict) Error 처리
- 인가는 Request가 수행하고자 하는 행동이 허가된 행동인지 확인하는 과정
  - 만약 권한이 없는 유저이면, 403(Forbidden) Error 처리
  - 만약 유효한 인증 자격 증명이 없는 유저이면, 401(Unauthorized) Error 처리
  
