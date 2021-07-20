def nodeDepths(root):
    # Write your code here.
	# breadth first search, adding one on existing distance to the current total?
	# brute force
	layer = 1
	return nodeDepthsHelper(root, layer)
    

def nodeDepthsHelper(node, layer):
	
	if node.right and node.left:
		return 2 * layer + nodeDepthsHelper(node.right, layer + 1) + nodeDepthsHelper(node.left, layer + 1)
	elif node.right:
		return layer + nodeDepthsHelper(node.right, layer + 1)
	elif node.left:
		return layer + nodeDepthsHelper(node.left, layer + 1)
	else:
		return 0
											
	


# This is the class of the input binary tree.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
