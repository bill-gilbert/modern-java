package modernjavainaction.chap03;

import modernjavainaction.chap13.Letter;

import java.util.function.Function;

public class FunctionEditing {
    public static void main(String[] args) {
        Function<String, String> addHeader = Letter::addHeader;
    }
}
