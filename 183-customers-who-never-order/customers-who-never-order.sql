# Write your MySQL query statement below
SELECT A.name as Customers
From Customers A
LEFT JOIN Orders B
ON A.id = B.CustomerId
WHERE B.customerId IS NULL;