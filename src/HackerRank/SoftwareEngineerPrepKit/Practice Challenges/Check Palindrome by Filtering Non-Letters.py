def isAlphabeticPalindrome(code):
    newText= ''
    
    for char in code: 
        if char.isalpha():
            newText += char
            
    print(newText)


result = isAlphabeticPalindrome(code)
print(result)