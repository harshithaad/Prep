# Write your MySQL query statement below
/*
SELECT A.name as Customers
From Customers A
LEFT JOIN Orders B
ON A.id = B.CustomerId
WHERE B.customerId IS NULL;
*/
SELECT A.name as Customers
From Customers A
WHERE NOT EXISTS(
    SELECT 1
    FROM Orders B
    WHERE A.id = B.customerId
);