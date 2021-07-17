def findClosestValueInBst(tree, target):
    # Write your code here.
	# conditions for being the closest
	currentClosest = tree.value
	while tree:
		if (target == tree.value):
			return target
		elif (target > tree.value):
			tree = tree.right
		else:
			tree = tree.left
		
		if tree and abs(currentClosest - target) > abs(target - tree.value):
			currentClosest = tree.value
		
	
    return currentClosest


# This is the class of the input tree. Do not edit.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
