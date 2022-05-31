# Write your MySQL query statement below
SELECT DISTINCT class
FROM(
    SELECT *,
    row_number() OVER(PARTITION BY class) AS RN
    FROM Courses
) x
WHERE x.rn>=5