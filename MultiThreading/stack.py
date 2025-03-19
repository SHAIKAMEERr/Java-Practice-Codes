def createstack():
    stack=[]
    return stack
def isfull(stack):
    return len(stack)==5
def isempty(stack):
    return len(stack)==0
def push(stack):
    stack.append(i)
def pop(stack):
    return stack.pop(i)
s = createstack()
print("operations in stack")
print('1.push')
print('2.pop')
print('3.peep')
print('4.isfull')
print('5.isempty')
c=int(input("choose the operation :"))
if c==1:
    if s<=0:
        s=int(input('enter the element to push'))
        print("enter the element to push",s)
    else:
        print("stack is not empty")

