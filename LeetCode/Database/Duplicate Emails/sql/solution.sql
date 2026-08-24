# Write your MySQL query statement belowSEK
SELECT email from Person group by email HAVING count(email)>1;