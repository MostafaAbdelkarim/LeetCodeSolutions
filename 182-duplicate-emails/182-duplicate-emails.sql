# Write your MySQL query statement below
SELECT Email
FROM PERSON
GROUP BY Email
HAVING COUNT(1) > 1;