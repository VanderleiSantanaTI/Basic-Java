def fibo(n):
    b=1
    a=0
    for _ in range(n):
        print(a, end=" ")
        b, a = a + b,  b
        
fibo(50)