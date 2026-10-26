# wile doing self join. imagine the rows seperately in your head harshi
SELECT B.name
FROM Employee A #employee
JOIN Employee B #manager
ON A.managerId = B.id #managerId tells you who you're looking for. id identifies the person you're looking for.
GROUP BY A.managerId
HAVING COUNT(*) >= 5;