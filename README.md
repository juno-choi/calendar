# 🔴 Simol Calendar Project

## 🟠 설계

### 🟢 요구사항

1. 특정 문자열로 입력시 자동으로 캘린더 데이터로 생성
1. 입력한 내용은 리스트로 출력
1. 캘린더처럼 월 날짜별로 출력

### 🟢 flow-chart (흐름도)

```mermaid
flowchart TD
    A[시작] --> B[사용자가 문자열 입력]
    B --> C{문자열이 특정 조건을 만족합니까?}
    C -->|예| D[캘린더 데이터 생성]
    C -->|아니오| E[입력 무시]
    D --> F[리스트에 데이터 추가]
    F --> G[캘린더 출력 형식으로 데이터 변환]
    G --> H[월별 날짜에 따라 캘린더 형식으로 출력]
    E --> A
    H --> A

```

### 🟢 시퀀스 다이어그램
