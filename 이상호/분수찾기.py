
x = int(input())

line = 1

# 입력 받은 수가 몇번째 라인(line)에 있고 그 라인에서 몇번째(x)에 있는지
while x>line:
    x -= line
    line += 1

if line % 2 == 0:
    a = x
    b = line - x + 1

else:
    a = line - x + 1
    b = x

print(a,'/',b,sep='')
