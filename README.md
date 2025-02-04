# 🔴 Simol Calendar Project

## 🟠 실행

### 🟢 calendar-api

1. root 프로젝트 경로에서 ./gradlew clean build
1. calendar 프로젝트 경로에서 java -jar ./build/libs/\*.jar 파일 실행

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
    C -->|아니오| E[재입력 요청]
    D --> F[리스트에 데이터 추가]
    F --> G[캘린더 출력 형식으로 데이터 변환]
    G --> H[월별 날짜에 따라 캘린더 형식으로 출력]
    E --> A
    H --> A
```

### 🟢 Sequence Diagram (시퀀스 다이어그램)

```mermaid
sequenceDiagram
    participant 사용자
    participant 시스템

    사용자->>시스템: 문자열 입력
    시스템->>시스템: 문자열 조건 확인
    alt 조건 만족
        시스템->>시스템: 캘린더 데이터 생성
        시스템->>시스템: 리스트에 데이터 추가
        시스템->>시스템: 캘린더 출력 형식으로 변환
        시스템->>사용자: 월별 날짜 캘린더 출력
    else 조건 불만족
        시스템->>사용자: 재입력 요청
    end
    사용자->>시스템: 재입력

```

### 🟢 Class Diagram

```mermaid
classDiagram
    class InputHandler {
        +String inputText
        +boolean validateInput(String input)
        +CalendarData createCalendarData(String input)
    }

    class CalendarData {
        +Date date
        +String description
        +void formatAsCalendar()
    }

    class CalendarList {
        +List~CalendarData~ calendarEntries
        +void addEntry(CalendarData entry)
        +List~CalendarData~ getEntries()
    }

    class UserInterface {
        +void requestInput()
        +void displayCalendar(List~CalendarData~ calendarEntries)
        +void requestReInput()
    }

    InputHandler --> CalendarData : "생성"
    CalendarList --> CalendarData : "저장"
    UserInterface --> InputHandler : "유효성 검사 및 입력"
    UserInterface --> CalendarList : "사용자에게 노출될 데이터"
```

### 🟢 ERD

```mermaid
erDiagram
    USER {
        string userId PK
        string username
    }

    INPUT_LOG {
        int logId PK
        string inputText
        boolean isValid
        date createdAt
        string userId FK
    }

    CALENDAR_ENTRY {
        int entryId PK
        date entryDate
        string description
        string userId FK
    }

    USER ||--o{ INPUT_LOG : "has"
    USER ||--o{ CALENDAR_ENTRY : "creates"
    INPUT_LOG ||--o{ CALENDAR_ENTRY : "generates"

```
