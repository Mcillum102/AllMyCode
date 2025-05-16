#include <stdio.h>

int main() {
    int D, E;
    scanf("%d", &D);
    scanf("%d", &E);

    for (int i = 0; i < E; i++) {
        char op;
        int Q;
        scanf(" %c", &op); // space before %c to skip newline
        scanf("%d", &Q);

        if (op == '+') {
            D += Q;
        } else if (op == '-') {
            D -= Q;
        }
    }

    printf("%d\n", D);
}
