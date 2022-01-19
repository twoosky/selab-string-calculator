# SE-LAB Calculator

### 1. 요구사항
> 추가적인 기능 구현 환영! 물론, 필수적인 구현은 무조건~
1. 덧셈, 뺄셈, 나눗셈, 곱셈이 가능한 계산기를 구현합니다.
2. 입력은 `30 + 20 / 2 * 4` 순으로 받으며, 연산자 우선순위 없이 앞에서 부터 계산을 진행합니다.=
3. 출력은 `100`으로 나옵니다.

### 2. 구현 소개
1. 역할 소개
  * controller
    *CalculatorController : 계산하기위한 데이터 타입 변환과 수가 2개일 때 3개이상인지 계산기를 선택
    
  * domian
    - Calculator : 계산 (식을 계산하는 메서드)의 역할
    - Number : Number만 리턴을위한 역할
    - Numbers : Number객체들을 리스트로 만들어 전체 관리를하는 역할
    - Operator : Operator 리스트를 생성하고 관리하는 역할
  
  * view
    - InputView : 식을 입력받고 List<String>의 형태로 반환하는 역할
    - OutView : 결과를 출력하는 역할
 
  * model
    - Operator : enum을 이용한 계산기 모델
    - IndexNumber : 상수들을 모은 모델
    
  * CalculatorApplication.java : 실행

으로 구성되어 있다.

### 3. MVC 실행 순서
```
InputView(view)- > CalculatorController(Controller) -> operator(Model) -> CalculatorController(Controller) -> OutView(view)
```
 
 ### 4. 변경사항 
[ ]1. 생성자를 메서도로 만들어기
[ ]2. 도메인 구분
[ ]3. 클래스(명사) 메서드(동사)
[ ]4. 유틸 요소가 아니면  static을 사용하지 안 하기
[ ]5. 버퍼리더 사용
[ ]6. stream-> List로 만들기
[ ]7. 큐를 사용
[ ]8. 구글 컨벤션 적용
