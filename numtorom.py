
def convert(num) -> str:
    # range is from 1 to 3999
    # create string variable to concat

    # check if greater than or equal to 1000
    # check the first digit (m) by floor dividing 1000
    # add m * 'M' to the string variable

    # check the second digit by floor dividing 100
    # if 4 or 9, add 'CD' and 'CM', otherwise if greater than 5, then 
    # do symbol D plus a certain number of Cs

    # check third digit by floor dividing 10
    # if 4 or 9, add 'XL' or 'XC', otherwise if greater than 5, then
    # do symbol L plus a certain number of Xs

    # check last digit by floor dividing 10
    # if 4 or 9, add 'IV' or 'IX', otherwise if greater than 5, then
    # do symbol V plus a certain number of Is

    result = ""

    if num >= 1000:
        m = num // 1000
        num = num % 1000
        result += 'M'*m
    
    if num >= 100:
        h = num // 100
        num = num % 100
        if h == 4:
            result += 'CD'
        elif h == 9:
            result += 'CM'
        elif h >= 5:
            result += 'D' + 'C' * (h-5)
        else:
            result += 'C' * h

    if num >= 10:
        t = num // 10
        num = num % 10
        if t == 4:
            result += 'XL'
        elif t == 9:
            result += 'XC'
        elif t >= 5:
            result += 'L' + 'X' * (t-5)
        else:
            result += 'X' * t

    if num >= 0:

        if num == 4:
            result += 'IV'
        elif num == 9:
            result += 'IX'
        elif num >= 5:
            result += 'V' + 'I' * (num - 5)
        else:
            result += 'I' * num

    return result


print(convert(1994))