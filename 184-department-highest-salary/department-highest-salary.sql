# Write your MySQL query statement below
SELECT B.name AS Department, A.name AS Employee, A.salary AS Salary
FROM Employee A
JOIN Department B
ON  A.departmentId = B.Id
WHERE A.salary = (
    SELECT MAX(salary)
    FROM Employee E
    WHERE E.departmentId = B.id
);