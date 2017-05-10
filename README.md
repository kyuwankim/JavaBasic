Java Programming_Java 환경설정, 변수, 자료형	

##JAVA
###특징
1. 객체지향
2. 캡슐화
3. 상속
4. 다형성
5. 가비지컬랙션
6. 플랫폼독립

###자바 컴파일 순서
HelloWorld.java 파일을 작성하면 HelloWorld.class(바이트코드)로 변경이 되고 

JVM이 class파일을 실행함

컴파일의 종류

1. JIT(Just In Time)

	Class 파일을 실행 시 최초 한번 기계어로 컴파일을 함 최초 한번은 속도의 저하가 발생할 수 있다

2. AOT(Ahead Of Time)

	Class 파일을 설치 시 최초 한번 기계어로 컴파일 함 속도 저하는 없지만 안드로이드처럼 설치가 명확한 구조에서만 가능함
	설치할때 컴파일을 해버리기때문에 2배정도 저장 용량을 소모함
	
Android Nougat 버전부터 JIT, AOT를 혼용으로 사용하고 있음


##변수
###Identifier
옛날에는 Variable 이라고 해서 변수라고 많이 해석되었지만 요즘에는 **Identifier**(식별자) 로 해석

> **정의**
> 
> Identifiers are the names of variables, methods, classes, packages and interfaces. Unlike literals they are not the things themselves, just ways of referring to them. In the HelloWorld program, HelloWorld, String, args, main and println are identifiers.

예를들어 

int number = 157; 일때

메모리에는 157이 올라가고 number 이라는 식별자를 통해서 값을 참조함


##조건문
###1. if
if는 **괄호(  )** 안의 값이 참일때 내용을 수행함

괄호의 내용이 참이 아닐때는 **else** 를 통해서 수행


**else if** 를 통해 비교조건을 더 추가할 수 있음

```java
		if (a > b) {
			System.out.println("a가 b보다 큽니다");
		} else if (a == b) {
			System.out.println("a와 b가 같습니다");
		} else {
			System.out.println("a가 b보다 작습니다");
		}
```


###2. Switch 
switch() 괄호 내에 조건과 case문이 맞으면 해당 case 만 실행함 

*단* break를 마지막부분에 넣지않으면 해당 case실행 후 탈출하지않고 하위 case까지 다 실행됨 



![switch예제](http://img.c4learn.com/2012/03/How-Switch-Case-works-in-Java-Programming-language.jpg)

의도적으로 연속된 동작을 해야할때는 break를 걸지 않는 경우도 있음

##반복문
###1.for
for문의 괄호 안에는 
for(초기화값 ; 종료값 ; 증감값) 으로 구성됨


```java
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(i);
		}
```

