def isValidParentheses(s:str)->bool:
    stack =[]
    for c in s:
        if c in "{[(":
            stack.append(c)
        else:
            if not stack:
                return False
            else:
                peek=stack[-1]
                if (c=='}' and peek=='{') or \
                   (c==']' and peek=='[') or \
                   (c==')' and peek=='('):
                   stack.pop()
                else:
                    return False
    return not stack



s="{[()]}"
result=isValidParentheses(s)
if result:
    print("It is valid pareentheses")
else:
    print("It is not valid parentheses")