# Write your MySQL query statement below
SELECT event_day as day ,emp_id ,Sum(out_time-in_time)as total_time
from Employees Group BY event_day,emp_id;