# Clean Architecture Sample



## Reference

https://jsonplaceholder.typicode.com/ sample api 활용

Language: Kotlin

어플 구성

메인 화면 사진 리스트 (디자인 알아서 대충)

https://jsonplaceholder.typicode.com/photos Api 사용

예) https://jsonplaceholder.typicode.com/photos?_limit=10&_page=3

column gridlayout recyclerview

상세 화면: 사진 상세뷰 (디자인 알아서 대충)

https://jsonplaceholder.typicode.com/photos/1

리스트에 내려주는 photo 모델 데이터와 동일하지만 이미 있지만 스터디 목적을 위해 상세 api 한번 더 호출하는 방식으로 구현

구현방식: 자유롭게 원하는 방식으로 구현한뒤에 같이 장단점을 이야기 해보기로