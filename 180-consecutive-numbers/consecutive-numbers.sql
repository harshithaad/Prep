/*SELECT DISTINCT num AS ConsecutiveNums
FROM (
    SELECT id, num, 
    LAG(num, 1) OVER  (ORDER BY id DESC) AS prev1,
    LAG(num, 2) OVER (ORDER BY id DESC) AS prev2
    FROM Logs
) AS temp
WHERE num = prev1 AND num = prev2;
*/

SELECT DISTINCT L1.num AS ConsecutiveNums
FROM Logs L1
JOIN Logs L2
ON L1.id = L2.id + 1
JOIN Logs L3 
ON L2.id = L3.id + 1
WHERE L1.num = L2.num AND L2.num = L3.num;