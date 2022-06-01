# Write your MySQL query statement below
SELECT u.user_id AS buyer_id, u.join_date, IFNULL(COUNT(o.order_id), 0) AS orders_in_2019
FROM Users u
LEFT JOIN Orders o
ON u.user_id=o.buyer_id
AND year(order_date)='2019'
GROUP BY u.user_id