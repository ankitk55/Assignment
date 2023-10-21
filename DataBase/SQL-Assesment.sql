  
create table result
(id int,
 phy int,
chem int,
 math int
 );
 # Describe table....
 desc result;
 
 # Add primary key ...
 alter table result
 add primary key(id);
 
 # Add another column in Exixting table....
 alter table result
 add biology int;
 
 # Insert data into table..........
 insert into result (id,phy,chem,math,biology)
 values (5,23,24,45,Null),
 (2,45,67,45,34),
 (3,67,56,78,77),
 (4,99,67,55,67);
 
 # Getting  All Entry from the  Table .....
 select * from result;
 
 # Highest Physics Score with ID ......
 select id , phy from result
 order by phy desc
 limit 1;
 
 # Calculate Total Score of All Subjects and Sort them by ASC order on Total_Score
 select id,phy,chem,math,biology, coalesce(phy,0)+ coalesce(chem,0)+ coalesce(math,0)+coalesce(biology,0) as 'Total_Score' from result
 order by Total_Score ;
 
  # Calculate Total Score of All Subjects and Sort them by Desc order on Total_Score ......
  select id,phy,chem,math,biology, coalesce(phy,0)+ coalesce(chem,0)+ coalesce(math,0)+coalesce(biology,0) as 'Total_Score' from result
 order by Total_Score desc;
 
 # Getting the Id with Highest TotalScore.......
 select id,coalesce(phy,0)+ coalesce(chem,0)+ coalesce(math,0)+coalesce(biology,0) as 'Total_Score' from result
 order by Total_Score desc
 limit 1;
 
 # Getting 2 nd Highest Math Score ........
 select  max(math) as '2nd Highest Score of Math'  from result
 where math < (select max(math) from result);
 
 
 
 
 
 
 