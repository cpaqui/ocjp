package study.java.ocjp.chapter.one;

import java.util.List;

class MainMethsSignatureWithArraySymbolAfterStringClassName {

    public static void main(String[] args) {

    }
}

class MainMethsSignatureWithArraySymbolAfterParameterName {

    public static void main(String args[]) {

    }
}

class MainMethsSignatureWithArraySymbolBetweenStringClassNameAndParameterName {

    public static void main(String [] args) {

    }
}

class MainMethsSignatureWithVarArgSymbolInFrontOfStringClassName {

    public static void main(String... args) {

    }
}

class MainMethsSignatureWithVarArgSymbolAheadOfParameterName {

    public static void main(String ...args) {

    }
}

class MainMethsSignatureWithVarArgSymbolBetweenStringClassNameAndParameterName {

    public static void main(String ... args) {

    }
}

class MainMethsSignatureWithStaticModifierBeforePublicModifier {

    static public void main(String ... args) {

    }
}

class MainMethsSignature_4 {

    //This main method is invalid, because the return type in it signature
    public static int main(String[] args) {
        return 1;
    }
}

class MainMethsSignature_5 {

    //This main method is invalid, because the extra parameter in it signature
    public static void main(String[] args, int test) {
    }
}

class MainMethsSignature_6 {

    //This main method is invalid, because the extra parameter in it signature
    public static void main(List<String> args) {
    }
}