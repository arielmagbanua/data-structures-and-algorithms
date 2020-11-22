# python3
import random

def max_pairwise_product(numbers):
    n = len(numbers)
    max_product = 0
    
    for first in range(n):
        for second in range(first + 1, n):
            max_product = max(max_product, numbers[first] * numbers[second])

    return max_product

def max_pairwise_product_fast(numbers):
    n = len(numbers)
    max_index1 = 0
    max_index2 = 0

    for i in range(n):
        if numbers[i] > numbers[max_index1]:
            max_index1 = i
    
    if max_index1 == 0:
        max_index2 = 1
    
    for i in range(n):
        if i != max_index1 and numbers[i] > numbers[max_index2]:
            max_index2 = i
    
    return numbers[max_index1] * numbers[max_index2]

def stress_test(numbers):
    while True:
        nums = generate_array()
 
        slow = max_pairwise_product(nums)
        fast = max_pairwise_product_fast(nums)

        if slow == fast:
            print("OK")
        else:
            print("slow {0} does not equal fast {1}", slow, fast)
            break

def generate_array():
    n = random.randint(2, 10000)
    nums = []
    while n > 0:
        nums.append(random.randint(0, 100000))
        n -= 1

    return nums

if __name__ == '__main__':
    input_n = int(input())
    input_numbers = [int(x) for x in input().split()]
    # input_numbers = input().split()
    # print(max_pairwise_product(input_numbers))
    print(max_pairwise_product_fast(input_numbers))
