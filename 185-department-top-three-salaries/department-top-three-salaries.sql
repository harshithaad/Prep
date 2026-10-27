SELECT Department, Employee, Salary
FROM (
    SELECT B.name AS Department, A.name AS Employee, A.salary AS Salary,
    DENSE_RANK() OVER (
        PARTITION BY A.departmentId
        ORDER BY A.Salary DESC
    ) AS 'RankedEnployee'
    FROM Employee A
    JOIN Department B
    ON A.departmentId = B. id
)
AS RankedEmployee
WHERE RankedEnployee <= 3;