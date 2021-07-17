# given described matches and result, determine the team with the most points 
# and return it
HOME_TEAM_WON = 1

def tournamentWinner(competitions, results):
    # Write your code here.
	currentBestTeam = ""
	scores = {"": 0}
	
	for idx, competition in enumerate(competitions):
		homeTeam, awayTeam = competition
		
		winningTeam = homeTeam if results[idx] == HOME_TEAM_WON else awayTeam
		
		updateScores(winningTeam, 3, scores)
		
		if scores[winningTeam] > scores[currentBestTeam]:
			currentBestTeam = winningTeam
			
    return currentBestTeam


def updateScores(team, points, scores):
	if not team in scores:
		scores[team] = 0
        	
	scores[team] += 3



# other solution, with sorting in the end

def otherTournamentWinner(competitions, results):
    # Write your code here.
	# iterate through results with i in range(len(results))
	# for each result, index into corresponding competitions array and either add into 
	# existing hashtable or create a new key/value pair
	mydict = {}
	for i in range(len(results)):
		if results[i] == 0:
			winner = competitions[i][1]
			if winner in mydict:
				mydict[winner] = mydict.get(winner) + 3
			else:
				mydict[winner] = 3
		else:
			winner = competitions[i][0]
			if winner in mydict:
				mydict[winner] = mydict.get(winner) + 3
			else:
				mydict[winner] = 3
			
    return max(mydict, key= lambda x: mydict[x])


		
