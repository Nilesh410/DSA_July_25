class Solution:
    def calPoint(self,operation:list[str])->int:
        stack=[]

        for op in operation:
            if op=="+":
                stack.append(stack[-1]+stack[-2])
            elif op=="D":
                stack.append(stack[-1]*2)
            elif op=="C":
                stack.pop()
            else:
                stack.append(int(op))
        return sum(stack)

sol=Solution()
operations = ["5", "-2", "4", "C", "D", "9", "+", "+"]
result=sol.calPoint(operations)
print(f"sum of points={result}")