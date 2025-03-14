# 빈 라이프사이클 메서드 활용하기

> @PostConstruct와 @PreDestroy 애너테이션을 사용하여 빈의 라이프사이클을 제어하고 실행 결과 스크린샷을 제출합니다.

스프링 컨테이너 생성 -> 스프링 빈 생성 -> 의존관계 주입 -> @PostConstruct 실행 -> 로직 실행 -> @PreDestroy -> 스프링 종료