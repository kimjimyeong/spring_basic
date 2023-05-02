package hello.core.singleton;

public class SingletonService {
    // static로 선언해서 객체가 하나만 생성된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    //생성자를 private로 선언해서 외부에서 new로 객체 생성을 못하게 막는다.
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
