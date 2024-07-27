# Function to find and print prime numbers within a range using only for and if
def find_primes_in_range(start, end):
    for num in range(start, end + 1):
        if num > 1:  # Prime numbers are greater than 1
            is_prime = True
            for i in range(2, num):
                if num % i == 0:
                    is_prime = False
                    break
            if is_prime:
                print(num)

# Find and print prime numbers between 1 and 100
find_primes_in_range(1, 100)
