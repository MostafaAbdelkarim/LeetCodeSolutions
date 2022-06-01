# Write your MySQL query statement below
SELECT DISTINCT(actor_id), director_id
FROM(
        SELECT actor_id, 
            director_id , 
            COUNT(timestamp) OVER (PARTITION BY actor_id, director_id) AS number_of_times
            FROM ActorDirector) AS temp
WHERE number_of_times >= 3

#w/o window functions
#SELECT actor_id, director_id
#FROM ActorDirector
#GROUP BY 1,2
#HAVING COUNT(*) >=3