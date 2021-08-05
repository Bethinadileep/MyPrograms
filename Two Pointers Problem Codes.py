#Two Pointers Problem Codes
#Two Pointer Problem
#question1
def sum_of_twopairs(arr,target):
  i=0
  j=len(arr)-1
  while(i<j):
    sum_ofpairs=arr[i]+arr[j]
    if sum_ofpairs==target:
      return True
    elif sum_ofpairs < target:
      i+=1
    else:
      j-=1
  return False
arr=[2,3,5,8,9,10,11]
target=200
print(sum_of_twopairs(arr,target))

#Two Pointer Aproach
#Merge Two Sorted Arrays
#Question 2
def merge_twosorted(A,B):
  c=[]
  a,b=0,0
  while a<len(A) and b<len(B):
    if A[a]<B[b]:a
      c.append(A[a])
      a+=1
    else:
      c.append(B[b])
      b+=1
  if a<len(A):
   c.extend(A[a:])
  if b<len(B):
    c.extend(B[b:])
  return c


A=[2,5,6,9,10,15,18]
B=[1,4,5,8,12]
print(merge_twosorted(A,B))
