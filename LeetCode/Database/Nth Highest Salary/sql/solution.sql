CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN set N=N-1;
  RETURN (
    SELECT(SELECT DISTINCT salary from Employee order by salary DESC limit 1 offset N)
  );
END