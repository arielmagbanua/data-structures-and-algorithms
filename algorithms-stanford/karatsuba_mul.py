def karatsuba_mul(x, y):
    if len(str(x))==1 or len(str(y))==1:
        return x * y
    else:
        n = max(len(str(x)), len(str(y)))
        n_half = n // 2
        
        a = x // (10**n_half)
        b = x % (10**n_half)
        c = y // (10**n_half)
        d = y % (10**n_half)
     
        
        
        ac = karatsuba_mul(a,c)
        bd = karatsuba_mul(b,d)
        ad_plus_bc = karatsuba_mul(a+b, c+d) -ac -bd
        
        product = 10**(2*n_half)*ac +10**(n_half)*(ad_plus_bc) + bd
        return product

num = karatsuba_mul(3141592653589793238462643383279502884197169399375105820974944592, 2718281828459045235360287471352662497757247093699959574966967627)
print(num)