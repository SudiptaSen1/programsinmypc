#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Bracket {
    char type;
    int position;
};

typedef struct Bracket Bracket;

int match(char open, char close) {
    if (open == '(' && close == ')') {
        return 1;
    } else if (open == '[' && close == ']') {
        return 1;
    } else if (open == '{' && close == '}') {
        return 1;
    } else {
        return 0;
    }
}

int main() {
    char text[1000];
    fgets(text, sizeof(text), stdin);
    int length = strlen(text);

    Bracket* opening_brackets_stack = (Bracket*)malloc(length * sizeof(Bracket));
    int stack_top = -1;

    for (int position = 0; position < length; ++position) {
        char next = text[position];

        if (next == '(' || next == '[' || next == '{') {
            opening_brackets_stack[++stack_top].type = next;
            opening_brackets_stack[stack_top].position = position + 1;
        }

        if (next == ')' || next == ']' || next == '}') {
            if (stack_top == -1 || !match(opening_brackets_stack[stack_top].type, next)) {
                printf("%d\n", position + 1);
                free(opening_brackets_stack);
                return 0;
            }
            stack_top--;
        }
    }

    if (stack_top == -1) {
        printf("Balanced\n");
    } else {
        printf("%d\n", opening_brackets_stack[stack_top].position);
    }

    free(opening_brackets_stack);
    return 0;
}