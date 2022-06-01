# Write your MySQL query statement below
SELECT id,
     IFNULL(CASE WHEN MOD(id,2) <> 0 
                 THEN lead(student) over ()  
                 ELSE lag(student) over ()
            END, student) AS student
FROM seat;
