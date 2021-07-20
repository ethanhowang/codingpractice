def smallestDifference(arrayOne, arrayTwo):
    # Write your code here.
	arrayOne.sort()
	arrayTwo.sort()
	idxOne = 0
	idxTwo = 0
	smallest = float("inf")
	current = float("inf")
	bestCands = []
	while idxOne < len(arrayOne) and idxTwo < len(arrayTwo):
		firstNum = arrayOne[idxOne]
		secondNum = arrayTwo[idxTwo]
		current = abs(firstNum - secondNum)
		if firstNum < secondNum:
			idxOne += 1
		elif secondNum < firstNum:
			idxTwo += 1
		else:
			return [firstNum, secondNum]
		
		if smallest > current:
			smallest = current
			bestCands = [firstNum, secondNum]

	return bestCands

