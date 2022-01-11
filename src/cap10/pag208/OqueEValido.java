package cap10.pag208;

class Foo{
    static int x;
    public void go(){
        System.out.println(x); // válido
    }
}

class Foo2{
    int x;
    public static void go(){
//        System.out.println(x); não é válido
    }
}

class Foo3{
//    final int x; não é válido

    public void go(){
//        System.out.println(x);
    }
}

class Foo4{
    static final int x = 12;

    public void go(){
        System.out.println(x); // válido
    }
}

class Foo5{
    static final int x = 12;

    public void go(final int x){
        System.out.println(x); // válido
    }
}

class Foo6{
    int x = 12;

    public static void go(final int x){
        System.out.println(x); // válido
    }
}