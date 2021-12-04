# SE-LAB Calculator

### DIRECTORY

1. `Main` : 메인 메소드 실행 클래스
2. `Input` : 콘솔로 부터 입력받은 `String` 을 `split()`으로 쪼개어 `return` 하는 클래스
3. `Calculator` : Input 으로 부터 얻은 `String` 을 통해 계산기의 계산을 구현하는 클래스
4. Operators
    1. Operators : `frontNumber` 와 `behindNumber`를 이용한 `calculate()` 메소드가 정의되어 있는 인터페이스
    2. Plus : 주어진 `frontNumber` 와 `behindNumber` 을 **더하는** `Operaters` 구현 클래스
    3. Minus : 주어진 `frontNumber` 와 `behindNumber` 을 **빼는** `Operaters` 구현 클래스
    4. Divide : 주어진 `frontNumber` 와 `behindNumber` 을 **나누는** `Operaters` 구현 클래스
    5. Multiple : 주어진 `frontNumber` 와 `behindNumber` 을 **곱하는** `Operaters` 구현 클래스
    6. Progress : 매개변수로 `Operators` 를 받아 Operators.calculate()를 리턴하여 클래스의 다형성을 구현한 클래스

### 코멘트

* 구현하고 보니 결국엔 queue 나 stack을 이용해서 구현하는게 코드상 유리하지 않았나(구현한 코드 길이/ 복잡도) 생각이 듭니다.
* 다중 클래스로 코드를 구현한건 이번이 처음입니다!

[//]: # (### 요구사항)

[//]: # ()
[//]: # (> 추가적인 기능 구현 환영! 물론, 필수적인 구현은 무조건~)

[//]: # ()
[//]: # (1. 덧셈, 뺄셈, 나눗셈, 곱셈이 가능한 계산기를 구현합니다.)

[//]: # (2. 입력은 `30 + 20 / 2 * 4` 순으로 받으며, 연산자 우선순위 없이 앞에서 부터 계산을 진행합니다.)

[//]: # (3. 출력은 `100`으로 나옵니다.)

[//]: # ()
