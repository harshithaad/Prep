# Write your MySQL query statement below
SELECT B.product_name, A.year, A.price 
FROM Sales A
INNER JOIN product B
On A.product_id = B.product_id;
