import sys

sys.stdin = open('a.txt', 'rt') # 테스트용 코드
input = sys.stdin.readline

# 구글링으로 찾은 소인수분해
def prime_factors(n):
    i = 2
    factors = []
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            factors.append(i)
    if n > 1:
        factors.append(n)
    return factors

# 값 입력받기
a, b = map(int, input().split())
count = 0

# 계산하기
for i in range(a, b + 1):
	length = len(prime_factors(i))
	if ((length > 1) and (len(prime_factors(length)) == 1)):
		count += 1

print(count)