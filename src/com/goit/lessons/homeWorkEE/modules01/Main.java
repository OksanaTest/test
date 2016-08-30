package com.goit.lessons.homeWorkEE.modules01;

public class Main {
    public static void main(String[] args) throws Exception{
        AddMethodImplementation addMethodImplementation =
                new AddMethodImplementation();
        addMethodImplementation.addMethod("ArrayList", 10000);
        addMethodImplementation.addMethod("ArrayList", 100000);
        addMethodImplementation.addMethod("ArrayList", 1000000);
        addMethodImplementation.addMethod("LinkedList", 10000);
        addMethodImplementation.addMethod("LinkedList", 100000);
        addMethodImplementation.addMethod("LinkedList", 1000000);
        addMethodImplementation.addMethod("HashSet", 10000);
        addMethodImplementation.addMethod("HashSet", 100000);
        addMethodImplementation.addMethod("HashSet", 1000000);
        addMethodImplementation.addMethod("TreeSet", 10000);
        addMethodImplementation.addMethod("TreeSet", 100000);
        addMethodImplementation.addMethod("TreeSet", 1000000);
        ContainsMethodImplementation containsMethodImplementation =
                new ContainsMethodImplementation();
        containsMethodImplementation.containsMethod("ArrayList", 10000);
        containsMethodImplementation.containsMethod("ArrayList", 100000);
        containsMethodImplementation.containsMethod("ArrayList", 1000000);
        containsMethodImplementation.containsMethod("LinkedList", 10000);
        containsMethodImplementation.containsMethod("LinkedList", 100000);
        containsMethodImplementation.containsMethod("LinkedList", 1000000);
        containsMethodImplementation.containsMethod("HashSet", 10000);
        containsMethodImplementation.containsMethod("HashSet", 100000);
        containsMethodImplementation.containsMethod("HashSet", 1000000);
        containsMethodImplementation.containsMethod("TreeSet", 10000);
        containsMethodImplementation.containsMethod("TreeSet", 100000);
        containsMethodImplementation.containsMethod("TreeSet", 1000000);
        RemoveMethodImplementation removeMethodImplementation =
                new RemoveMethodImplementation();
        removeMethodImplementation.removeMethod("ArrayList", 10000);
        removeMethodImplementation.removeMethod("ArrayList", 100000);
        removeMethodImplementation.removeMethod("ArrayList", 1000000);
        removeMethodImplementation.removeMethod("LinkedList", 10000);
        removeMethodImplementation.removeMethod("LinkedList", 100000);
        removeMethodImplementation.removeMethod("LinkedList", 1000000);
        removeMethodImplementation.removeMethod("HashSet", 10000);
        removeMethodImplementation.removeMethod("HashSet", 100000);
        removeMethodImplementation.removeMethod("HashSet", 1000000);
        removeMethodImplementation.removeMethod("TreeSet", 10000);
        removeMethodImplementation.removeMethod("TreeSet", 100000);
        removeMethodImplementation.removeMethod("TreeSet", 1000000);
        GetMethodImplementation getMethodImplementation =
                new GetMethodImplementation();
        getMethodImplementation.getByIndexMethod("ArrayList", 10000);
        getMethodImplementation.getByIndexMethod("ArrayList", 100000);
        getMethodImplementation.getByIndexMethod("ArrayList", 1000000);
        getMethodImplementation.getByIndexMethod("LinkedList", 10000);
        getMethodImplementation.getByIndexMethod("LinkedList", 100000);
        getMethodImplementation.getByIndexMethod("LinkedList", 1000000);
    }
}
