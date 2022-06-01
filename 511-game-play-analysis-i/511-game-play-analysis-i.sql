# Write your MySQL query statement below
SELECT player_id, first_login
FROM(
    SELECT player_id, event_date first_login,
    DENSE_RANK() OVER(PARTITION BY player_id ORDER BY event_date) AS position 
    FROM Activity) AS x
WHERE position = 1;


#SELECT player_id, MIN(event_date) first_login
#FROM Activity
#GROUP BY player_id;

