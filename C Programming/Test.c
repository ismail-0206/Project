#include <stdio.h>

int main() {
    double num1, num2;
    double sum, difference, product, quotient;

    // Input two numbers
    printf("Enter first number: ");
    scanf("%lf", &num1);
    printf("Enter second number: ");
    scanf("%lf", &num2);

    // Perform calculations
    sum = num1 + num2;
    difference = num1 - num2;
    product = num1 * num2;

    // Check for division by zero
    if (num2 != 0) {
        quotient = num1 / num2;
    } else {
        printf("Error: Division by zero is not allowed.\n");
    }

    // Display results
    printf("Summation: %.2lf\n", sum);
    printf("Subtraction: %.2lf\n", difference);
    printf("Multiplication: %.2lf\n", product);

    if (num2 != 0) {
        printf("Division: %.2lf\n", quotient);
    }

    return 0;
}
