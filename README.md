# JavaWork

## 1. 변수
- 자바의 변수는 다양한 타입의 값을 저장할 수 없습니다.
  - 정수 타입 변수에는 정수 값만 저장할 수 있고, 실수 타입 변수에는 실수 만 가능
  - 하나의 변수에 동시에 두 가지 값을 저장할 수 없고, 하나의 값만 저장 가능
  
  - 변수에 값이 저장되지 않으면 변수가 생성되지 않는다.
    - 선언과 생성은 다른 의미 !!!
    - 변수 선언은 저장되는 값의 종류와 이름만 언급한 것.
        - 변수에 최초로 값이 저장될 때 변수가 생성된다 => 변수 초기화
          - 이때 사용된 값을 초기값이라고 한다
    - 변수는 또 다른 변수에 대입하여 값을 복사 할 수도 있다.
      - 새로운 변수 temp 활용하여 값 교환
<br>
  1) 변수 사용 범위
  - 로컬 변수는 메소드 블록 내부에서만 사용되고 메소드 실행이 끝나면 메모리에서 자동으로 없어진다.

  2) 기본 타입
  - 변수를 선언한 후에는 타입을 변경할 수 없기 때문에 변수를 선언할  때 어떤 타입을 사용할지 충분히 고려하기

    1) 정수타입
        - byte 1byte 8bit -128~127
        - short 2byte 16bit
        - char 2byte 16bit
        - int 4byte 32bit
        - long 8byte 64bit
          - 메모리 사용 크기 정도는 알고 있기 !


```
새롭게 안 사실 : 변수 이름 작성 규칙에 첫 번쨰 글자는 문자이거나 '$',"_'이어야 한다.
- 첫 문자는 영어 소문자로 시작하도, 다른 단어가 붙을 경우 첫 문자를 대문자로 한다.
```

