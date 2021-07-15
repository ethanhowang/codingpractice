def sortedSquaredArray(array):
    # given an arbitrary list of ascending integer list, returns the sorted list
    # of the elements squared
	result = [0 for _ in array]
	smallerValue = 0
	largerValue = len(array) - 1
	
	for idx in reversed(range(len(array))):
		minValue = array[smallerValue]
		maxValue = array[largerValue]
		
		if abs(minValue) > abs(maxValue):
			result[idx] = minValue * minValue
			smallerValue += 1
		else:
			result[idx] = maxValue * maxValue
			largerValue -= 1

    return result

