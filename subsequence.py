

def isValidSubsequence(array, sequence):
    # Write your code here.
    # index to keep track where in array you've scanned (1)
    # for loop of sequence
    # update index (1) until you reach a match, keep the updated index, move on to next
    # index in sequence
    idArr = 0 # index in array
    idSeq = 0 # index in sequence
    while idArr < len(array) and idSeq < len(sequence):
        if array[idArr] == sequence[idSeq]:
            idSeq+=1
        idArr+=1
    
    return idSeq == len(sequence)



array =  [5, 1, 22, 25, 6, -1, 8, 10]
sequence = [5, 1, 22, 22, 6, -1, 8, 10]

print(isValidSubsequence(array, sequence))