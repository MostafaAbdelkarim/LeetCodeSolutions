# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM(
    SELECT salary,
    DENSE_RANK() OVER(ORDER BY salary DESC) as second_max
    FROM Employee) AS x
WHERE x.second_max = 2