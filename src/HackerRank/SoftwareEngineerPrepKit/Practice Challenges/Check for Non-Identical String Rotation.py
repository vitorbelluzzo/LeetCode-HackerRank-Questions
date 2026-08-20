def isNonTrivialRotation(s1, s2):
    if s1 == s2: 
        print (0)
    else: 
        print (s2 in (s1 + s1))
 


result = isNonTrivialRotation(s1, s2)
print(result)
        