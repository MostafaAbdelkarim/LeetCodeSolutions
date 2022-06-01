CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      SELECT MAX(salary)
      FROM(
          SELECT salary,
          DENSE_RANK() OVER(ORDER BY salary DESC) AS nth_rank
          FROM Employee
      ) AS nth
      WHERE nth.nth_rank = N
  );
END