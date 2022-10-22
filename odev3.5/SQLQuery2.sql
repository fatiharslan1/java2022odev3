--Select
Select ContactName, CompanyName from Customers

Select * from Customers where City = 'London'

--case insensitive  - büyük küçük harf önemli değil

selecT * from Products where CategoryID=1 or CategoryID=3

selEct * from Products where CategoryID=1 and UnitPrice>10

--order by = sıralamak

select * from products order by CategoryID,productname

select * from products where CategoryID=1  order by UnitPrice desc  -- ascending = artan - descending = azalan

--count = toplam sayıyı verir

select count(*) from Products

select count(*) from Products where CategoryID=1

--group by = kategorileri tekrar etmiyecek şekilde listele

select categoryID, count(*) from products group by CategoryID

select categoryID, count(*) from products group by CategoryID having count(*)<10 --where sorgusu having ile yazılır

--inner join

select * from products inner join Categories on Products.CategoryID = Categories.CategoryID

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from products inner join Categories
on Products.CategoryID = Categories.CategoryID

--DTO Data Transformation Object 

select * from products p left join  [Order Details]  od
on p.ProductID = od.ProductID inner join orders o on  o.OrderID = od.OrderID

select * from Customers c left join orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null