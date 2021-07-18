def smallestDifference(arrayOne, arrayTwo):
    # Write your code here.
	# brute force:
	# double for loop:
	# for each i in arrayone
	# O(n^2) time, O(1) space
	
	best = [float('inf'), -float('inf')]
	for i in arrayOne:
		for j in arrayTwo:
			if abs(i - j) < abs(best[0] - best[1]):
				best = [i, j]
    return best

