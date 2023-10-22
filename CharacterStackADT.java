package dscodes.basicds;

public interface CharacterStackADT {
    void push (char item);

    char  pop();

    char  peek();

    boolean isEmpty();

    int size();
}
