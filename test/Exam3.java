package test;

public class Exam3 {

    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리(); // 청둥오리가 만들어집니다. 청둥오리는 기본 날개를 가지고 태어납니다.

        a청둥오리.날다(); // 청둥오리가 날개로 천천히 날아갑니다.

        흰오리 a흰오리 = new 흰오리(); // 흰오리가 만들어집니다. 흰오리 불사조 날개를 가지고 태어납니다.

        a흰오리.날다(); // 흰오리가 불사조 날개로 불타오르며 날아갑니다.

        붉은오리 a붉은오리 = new 붉은오리(); // 붉은오리가 만들어집니다. 붉은오리는 로켓 날개를 가지고 태어납니다.

        a붉은오리.날다(); // 붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다

    }
}

class 오리
{
    String name;
    날개 a날개;

    void 날다()
    {
        System.out.print(name);
        a날개.사용();
    }
}

class 청둥오리 extends 오리
{
    청둥오리()
    {
        name = "청둥오리";
        a날개 = new 기본날개("기본 날개", "천천히");
        System.out.println(name + "가 만들어집니다. " + name + "는 기본 날개를 가지고 태어납니다.");
    }
}

class 흰오리 extends 오리
{
    흰오리()
    {
        name = "흰오리";
        a날개 = new 불사조날개("불사조 날개", "불타오르며");
        System.out.println(name + "가 만들어집니다. " + name + "는 불사조 날개를 가지고 태어납니다.");
    }
}

class 붉은오리 extends 오리
{
    붉은오리()
    {
        name = "붉은오리";
        a날개 = new 로켓날개("로켓 날개", "놀라운 속도로 굉음을 내며");
        System.out.println(name + "가 만들어집니다. " + name + "는 로켓 날개를 가지고 태어납니다.");
    }
}

class 날개
{
    String name;
    String type;

    void 사용()
    {
        System.out.println("가 " + name +"로 " + type + " 날아갑니다.");
    }

}

class 기본날개 extends 날개
{
    기본날개(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
}

class 불사조날개 extends 날개
{
    불사조날개(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
}

class 로켓날개 extends 날개
{
    로켓날개(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
}