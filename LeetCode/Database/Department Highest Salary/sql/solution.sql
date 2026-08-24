# Write your MySQL query statement below
Select d.name as Department ,
         e.name as Employee ,
         e.salary AS Salary from
          Employee e left join Department d 
          on d.id=e.departmentId where
          e.salary=(select max(salary)from employee e where e.departmentId=d.id);