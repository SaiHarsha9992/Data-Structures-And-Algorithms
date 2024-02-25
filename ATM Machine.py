# cook your dish here
for t in range(int(input())):
    n,k=map(int,input().split())
    a=list(map(int,input().split()))
    count=0
    for i in a:
        if k>=i:
            print("1",end="")
            k-=i
        else:
            print("0",end="")
        count+=1
        if count==len(a):
            print("")