# Write your MySQL query statement below
SELECT id
FROM
(SELECT *, 
    LAG(temperature,1) OVER (ORDER BY recordDate)  as prevTemp,
    LAG(recordDate,1) OVER (ORDER BY recordDate)  as prevDate
    FROM Weather) a
WHERE temperature > prevTemp
AND DATEDIFF(recordDate, prevDate) = 1 