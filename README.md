#slinder

일정등록을 통해 여러명과 동시에 약속조정이 가능한 어플 

[slinder 설명 ppt 링크] (https://www.dropbox.com/s/96aqickyqdi6t39/APP_SLINDER_Team.pptx?dl=0)
## 컴퓨터 구성 / 필수 조건 안내 (Prerequisites)
Android 4.0 이상을 구동하고 있는 스마트폰  

## 설치 안내 (Installation Process)
다음 중 택 1
1. apk파일을 다운받아 설치 후 실행  
2. android 스튜디오로 해당 프로젝트 빌드 후 실행

## 사용법 (Getting Started)
1. 어플을 실행 후 google, phone number, facebook, email 중 택 1 하여 로그인
2. 홈 화면에서 날짜 선택 후 확인버튼을 눌러 일정등록화면으로 이동
3. 일정이름과 일정을 보낼 사람 등을 선택 후 서버로 정보 전송 
이외의 기능들은 위에 설명ppt 참고

## 파일 정보 및 목록 (File Manifest)
1. aircalendar
 - 현재 날짜를 기준으로 달력을 인텐트 방식을 이용해 만들어낸다
 - 스크롤로 미래의 달력까지 접근할 수 있다
 - 날짜 선택 시 UI가 바뀌며 선택한 날짜들이 데이터베이스에 저장된다
2. firebase
 - 로그인 시 유저의 정보를 받아 로그인 경험이 있는 계정은 비밀번호만 입력한 후 바로 로그인 할 수 있다
 - 잘못된 계정을 입력할 시 오류창을 띄운다
 - 일정을 확정할 시 계정정보, 일정 날짜, 공유한 그룹에 대한 데이터를 서버에 기록하고 필요시 다시 기기로 받아온다
3.Notification
 - 누군가 자신에게 휴가 일정을 송신하였을 때 활동로그에 알림을 받는다
 
## 저작권 및 사용권 정보 (Copyright / End User License)
MIT Licence

## 배포자 및 개발자의 연락처 정보 (Contact Information)
박진혁(david90907@naver.com), 이창엽(paulus0617@gmail.com)

## 알려진 버그 (Known Issues)
mainactivity에서 활동 화면으로 넘어갈 시 앱이 가끔 종료되는 현상 있음
## 문제 발생에 대한 해결책 (Troubleshooting)
추후 ver 업데이트를 통해 해결예정 
## 크레딧 (Credit)
## 업데이트 정보 (Change Log)
2019-10-25 1.0.0ver. 
