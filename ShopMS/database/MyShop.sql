USE [master]
GO

IF EXISTS (SELECT name FROM master.dbo.sysdatabases WHERE name = N'MyShop')
BEGIN
	ALTER DATABASE [MyShop] SET OFFLINE WITH ROLLBACK IMMEDIATE;
	ALTER DATABASE [MyShop] SET ONLINE;
	DROP DATABASE [MyShop];
END

CREATE DATABASE MyShop
GO

USE MyShop
GO

CREATE TABLE Categories
(
	id VARCHAR(6) PRIMARY KEY,
	[name] NVARCHAR(30),
	icon VARCHAR(50),
)

GO
INSERT INTO Categories VALUES(1,'T-Shirt','images/icon-t-shirt.png')
INSERT INTO Categories VALUES(2,'Hoodie','images/icon-hoodie.png')
INSERT INTO Categories VALUES(3,'Jacket','images/icon-jacket.png')
INSERT INTO Categories VALUES(4,'Pants','images/icon-pants.png')
GO

CREATE TABLE Products
(
	id VARCHAR(8) PRIMARY KEY,
	[name] NVARCHAR(30),
	cid VARCHAR(6) FOREIGN KEY REFERENCES Categories(id),
	[image] VARCHAR(50),
	price MONEY,
	[description] NVARCHAR(100),
	dateCreated DATE,
)
GO

INSERT INTO Products VALUES('A01', N'T-Shirt Phantom',1,'images/tee-phantom-black.jpg', 320000, N'Chất liệu đẹp, thoáng mát', '2021-03-05')
INSERT INTO Products VALUES('A02', N'Tết Sài Gòn',1,'images/tet-sg.jpg', 300000, N'Thiết kế độc đáo, vải co giãn ' ,'2021-03-05')
INSERT INTO Products VALUES('A03', N'Polo Mascot',1,'images/POLO-MASCOT_BLACK.jpg', 320000, N'Co giãn 4 chiều','2021-03-05')
INSERT INTO Products VALUES('A04' ,N'Icon Ant Blue',2,'images/hoodie-zip-icon-ant-blue_1.jpg', 400000, N'Chất liệu đẹp, thoáng mát','2021-03-05')
INSERT INTO Products VALUES('A05', N'Hoodie Character',2,'images/hoodie-characters-white.jpg', 590000, N'Thời trang','2021-03-05')
INSERT INTO Products VALUES('A06', N'Tee graffity',1,'images/TEE-GRAFFITY_tan.jpg', 320000,  N'Chất liệu đẹp, thời trang,....','2021-03-05')
INSERT INTO Products VALUES('A07', N'Jacket icon ant',3,'images/jacket-icon-ant_black.jpg', 400000, N'Chất liệu đẹp, thời trang,....','2021-03-05')
INSERT INTO Products VALUES('A08', N'Jacket Varsity ssssly',3,'images/jacket-Varsity-ssssly.jpg', 450000, N'Chất liệu đẹp, thời trang,....','2021-03-05')
INSERT INTO Products VALUES('Q01', N'Pant Logo',4,'images/Pant-logo-v2-1.jpg', 350000, N'Đẹp','2021-03-05')
INSERT INTO Products VALUES('Q02', N'Pant Sticker',4,'images/pant-sticker-tan.jpg', 350000, N'Thời trang, phong cách','2021-03-05')
GO

CREATE TABLE Size(
	pid varchar(8)  FOREIGN KEY REFERENCES Products(id),
	[name] varchar(5),
	size_quantity int,
)

GO

INSERT INTO Size VALUES('A01','M',8)
INSERT INTO Size VALUES('A01','L',12)
INSERT INTO Size VALUES('A01','XL',0)
INSERT INTO Size VALUES('A02','M',5)
INSERT INTO Size VALUES('A02','L',6)
INSERT INTO Size VALUES('A02','XL',11)
INSERT INTO Size VALUES('A03','M',5)
INSERT INTO Size VALUES('A03','L',9)
INSERT INTO Size VALUES('A03','XL',10)
INSERT INTO Size VALUES('A04','M',10)
INSERT INTO Size VALUES('A04','L',15)
INSERT INTO Size VALUES('A04','XL',20)
INSERT INTO Size VALUES('A05','M',12)
INSERT INTO Size VALUES('A05','L',21)
INSERT INTO Size VALUES('A05','XL',13)
INSERT INTO Size VALUES('A06','M',10)
INSERT INTO Size VALUES('A06','L',1)
INSERT INTO Size VALUES('A06','XL',7)
INSERT INTO Size VALUES('A07','M',4)
INSERT INTO Size VALUES('A07','L',9)
INSERT INTO Size VALUES('A07','XL',4)
INSERT INTO Size VALUES('A08','M',16)
INSERT INTO Size VALUES('A08','L',10)
INSERT INTO Size VALUES('A08','XL',6)
INSERT INTO Size VALUES('Q01','M',9)
INSERT INTO Size VALUES('Q01','L',11)
INSERT INTO Size VALUES('Q01','XL',10)
INSERT INTO Size VALUES('Q02','M',12)
INSERT INTO Size VALUES('Q02','L',10)
INSERT INTO Size VALUES('Q02','XL',14)

GO



CREATE TABLE Accounts(
	username VARCHAR(20) PRIMARY KEY,
	[password] VARCHAR(20),
	fullname NVARCHAR(30),
	[role] INT,
)
GO

INSERT INTO Accounts VALUES('minhthanh','a30fbd587840e409672e829a13f79735',N'Nguyễn Thành',2)
INSERT INTO Accounts VALUES('giangtv','202cb962ac59075b964b07152d234b70',N'Giang Triệu',2)
INSERT INTO Accounts VALUES('cuongnm','202cb962ac59075b964b07152d234b70',N'Mạnh Cường',2)
INSERT INTO Accounts VALUES('admin','202cb962ac59075b964b07152d234b70',N'Minh Thành',1)

CREATE TABLE [Orders](
	id INT IDENTITY(1,1) PRIMARY KEY,
	[date] DATE,
	usernameCustomer varchar(20) FOREIGN KEY REFERENCES Accounts(username),
	totalMoney MONEY,
)
GO

INSERT INTO Orders VALUES('2021-03-13','hoanganh',600000)
INSERT INTO Orders VALUES('2021-03-14','cuongnm',400000)
INSERT INTO Orders VALUES('2021-03-15','giangtv',320000)
GO

CREATE TABLE OrderLine(
	oid INT FOREIGN KEY REFERENCES Orders(id),
	pid VARCHAR(8) FOREIGN KEY REFERENCES Products(id),
	[size] VARCHAR(5),
	quantity INT,
	price FLOAT,
)

INSERT INTO OrderLine VALUES(1,'A02','M',1,300000)
INSERT INTO OrderLine VALUES(1,'A02','L',1,300000)
INSERT INTO OrderLine VALUES(2,'A02','M',1,300000)
INSERT INTO OrderLine VALUES(3,'A02','M',1,300000)






