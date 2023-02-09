import sys

sys.stdin = open('a.txt', 'rt') # 테스트용 코드
input = sys.stdin.readline


# case를 입력 받고 답을 출력하는 함수
def Cal(x1, y1, r1, x2, y2, r2):
    # 원의 중심사이의 거리
    dist = ((x2 - x1)**2 + (y2 - y1)**2)**0.5

    # # 원의 중심 좌표가 같은경우 ( 반지름이 다르면 교점 0개, 같으면 무한개 )
    if dist == 0:
        return 0 if r1 != r2 else -1

    # # 중심의 좌표가 다른경우
    # 외접 -> 교점 1개
    if dist == r1 + r2: return 1
    # 내접 -> 교점 1개
    if dist == abs(r1 - r2): return 1
    # 원이 접하지 않고 멀리 떨어진 경우 -> 교점 0개
    if dist > r1 + r2: return 0
    # 원이 접하지 않으면서 안에 포함된 경우 -> 교점 0개
    if dist < abs(r1 - r2): return 0
    # 원이 만나는 경우 -> 교점 2개
    if dist < r1 + r2: return 2


# 입력 받기
T = int(input())
for _ in range(T):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())

    # 입력 받고 바로 계산해서 답을 출력
    print(Cal(x1, y1, r1, x2, y2, r2))
