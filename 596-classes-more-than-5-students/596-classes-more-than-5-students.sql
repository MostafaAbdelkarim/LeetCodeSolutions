# Write your MySQL query statement below
SELECT DISTINCT class
FROM(
    SELECT *,
    row_number() OVER(PARTITION BY class) AS RN
    FROM Courses
) x
WHERE x.rn>=5

#Faster query not using window functions
#SELECT cLass
#FROM Courses
#GROUP BY class
#HAVING COUNT(student) >=5;