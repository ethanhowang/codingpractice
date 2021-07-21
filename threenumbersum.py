def threeNumberSum(array, targetSum):
    # Write your code here.
	
	# O(n^2) time
	result = []
	
	array.sort()
	for i in range(len(array) - 2):
		leftIdx = i + 1
		rightIdx = len(array) - 1
		while (leftIdx < rightIdx):
			currNum = array[i]
			leftNum = array[leftIdx]
			rightNum = array[rightIdx]
			potentialMatch = currNum + leftNum + rightNum
			if potentialMatch > targetSum:
				rightIdx -= 1
			elif potentialMatch < targetSum:
				leftIdx += 1
			else:
				toadd = [currNum, leftNum, rightNum]
				toadd.sort()
				if toadd not in result:
			   		result.append(toadd)
				rightIdx -= 1
				leftIdx += 1
			
	result.sort()
			   
	return result
