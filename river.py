def riverSizes(matrix):
    # Write your code here.

    # create an array of tuples that are previously traversed
    # in a for loop i, j, start iterating in row major order
    # if encoutered 1, call helper function, which takes in matrix and array parameter, that returns the size of the river
    # continue iterating row major order until you encounter the next 1 that is not in the array
    # done
    visited = [] # of tuples
    result = []

    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if matrix[i][j] == 1 and (i, j) not in visited:
                number = findSize(matrix, visited, i, j, 0)
                if number != 0:
                    result.append(number)

    return result


def findSize(matrix, seen, i, j, size) -> int:
    if i >= len(matrix) or i < 0 or j >= len(matrix[0]) or j < 0 or (i, j) in seen:
        return 0

    elif matrix[i][j] == 0:
        return 0

    elif (i, j) not in seen and matrix[i][j] == 1:
        seen.append((i, j))
        # top, bottom, left, right
        size = 1 + findSize(matrix, seen, i - 1, j, size) + findSize(matrix, seen, i + 1, j, size) + findSize(matrix, seen, i, j - 1, size) + findSize(matrix, seen, i, j + 1, size)
    
    return size



