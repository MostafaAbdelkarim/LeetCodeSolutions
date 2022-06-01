# Write your MySQL query statement below
Select score,
       DENSE_RANK() OVER(ORDER BY Score DESC) `Rank`
From Scores

# W/O window functions
#SELECT s.score, u.rank
#FROM Scores s
#LEFT JOIN(
#    SELECT score, ROW_NUMBER() OVER (ORDER BY score DESC) AS `rank`
#    FROM (SELECT DISTINCT score FROM Scores ORDER BY score DESC) d
#) u
#ON s.score=u.score
#ORDER BY score DESC;