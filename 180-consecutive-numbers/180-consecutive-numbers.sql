# Write your MySQL query statement below
WITH cte AS 
(SELECT num,
    LEAD(num,1) over (order by id) as first_lead,
    LEAD(num,2) over (order by id) as second_lead
FROM Logs)

SELECT DISTINCT num AS ConsecutiveNums
FROM cte
WHERE Num = first_lead AND first_lead = second_lead