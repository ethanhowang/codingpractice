def longestPeak(array):
    currLongest = 0
	i = 1
	
	while i < len(array) - 1:
		isPeak = array[i] > array[i - 1] and array[i] > array[i + 1]
		if not isPeak:
			i += 1
			continue
		
		rightIdx = i + 2
		while (rightIdx < len(array) and array[rightIdx] < array[rightIdx - 1]):
			rightIdx += 1
		
		leftIdx = i - 2
		while (leftIdx >= 0 and array[leftIdx] < array[leftIdx + 1]):
			leftIdx -= 1
		
		newLength = rightIdx - leftIdx - 1
		if newLength > currLongest:
			currLongest = newLength
		i = rightIdx
		
	return currLongest
		