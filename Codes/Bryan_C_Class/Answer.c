#include <stdio.h>

int main(void) {
    int D, E;
    scanf("%d", &D);   // Initial donuts
    scanf("%d", &E);   // Number of events

    int stock = D;
    for (int i = 0; i < E; i++) {
        char op;
        int Q;
        // Read operation symbol and quantity
        scanf(" %c", &op);
        scanf("%d", &Q);

        if (op == '+') {
            stock += Q;
        } else {
            stock -= Q;
        }
    }

    printf("%d\n", stock);
    return 0;
}
