package exercisePackage.CoreJavaPrograms;

sealed interface X extends Cloneable permits Y{

}

non-sealed interface Y extends X {

}

sealed class A extends Object implements Cloneable permits B {
}


non-sealed class B extends A{
}


class C {

}
public class SealedClassesEx {
}
