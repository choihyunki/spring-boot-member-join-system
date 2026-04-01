# 🚀 Spring Boot 기반 회원가입 서비스 (Member Join System)

Spring Boot와 Spring Data JPA를 활용하여 구현한 간단한 회원가입 시스템입니다.
MVC 패턴과 계층별 아키텍처(Layered Architecture)를 학습하고 구현하는 데 목적을 두었습니다.

## ✨ 핵심 기능
- **회원가입 폼 제공**: `/join` 경로를 통해 사용자 입력을 받는 화면(Thymeleaf 사용 예상) 제공.
- **회원가입 처리**: 사용자가 입력한 데이터를 DTO(`JoinRequest`)를 통해 받아 유효한 Entity(`Member`)로 변환 후 저장.
- **DB 연동**: Spring Data JPA를 활용하여 H2 또는 MySQL 등 데이터베이스에 회원 정보 영속화.
- **결과 페이지 처리**: 가입 결과에 따라 `success` 또는 `fail` 화면으로 분기 처리.

## 🛠 사용 기술 및 라이브러리
- **Framework**: Spring Boot 3.x
- **Database**: Spring Data JPA (Hibernate)
- **Library**: Lombok (Getter/Setter, Builder, RequiredArgsConstructor 활용)
- **View Engine**: Thymeleaf (HTML 템플릿)

## 📂 프로젝트 구조 (Layered Architecture)
- **Controller**: 사용자의 요청을 받고 적절한 응답을 반환 (`MemberController`)
- **Service**: 비즈니스 로직(회원 가입 로직 등)을 처리 (`MemberService`, `MemberServiceImpl`)
- **Repository**: 데이터베이스와의 직접적인 통신 담당 (`MemberRepository`)
- **Entity & DTO**: 데이터의 구조를 정의하고 요청 데이터를 캡슐화 (`Member`, `JoinRequest`)

## 💡 학습 포인트
1. **Lombok의 @Builder 활용**: Entity 생성 시 빌더 패턴을 사용하여 데이터 안정성 확보.
2. **Interface 기반 Service 설계**: 서비스 인터페이스와 구현체를 분리하여 유연한 구조 설계.
3. **DTO 분리**: 클라이언트의 요청 데이터(`JoinRequest`)와 DB 엔티티(`Member`)를 분리하여 데이터 보안성 및 유지보수성 향상.