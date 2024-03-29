USE [master]
GO

IF EXISTS (SELECT name FROM master.dbo.sysdatabases WHERE name = N'MyShop')
BEGIN
	ALTER DATABASE [MyShop] SET OFFLINE WITH ROLLBACK IMMEDIATE;
	ALTER DATABASE [MyShop] SET ONLINE;
	DROP DATABASE [MyShop];
END

CREATE DATABASE [MyShop]
GO
USE [MyShop]
GO
/****** Object:  Table [dbo].[Accounts]    Script Date: 29-Mar-21 10:25:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accounts](
	[username] [varchar](20) NOT NULL,
	[password] [varchar](100) NULL,
	[fullname] [nvarchar](30) NULL,
	[role] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 29-Mar-21 10:25:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[id] [varchar](6) NOT NULL,
	[name] [nvarchar](30) NULL,
	[icon] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderLine]    Script Date: 29-Mar-21 10:25:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderLine](
	[oid] [int] NULL,
	[pid] [varchar](8) NULL,
	[size] [varchar](5) NULL,
	[quantity] [int] NULL,
	[price] [float] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 29-Mar-21 10:25:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[date] [date] NULL,
	[usernameCustomer] [varchar](20) NULL,
	[totalMoney] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Products]    Script Date: 29-Mar-21 10:25:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products](
	[id] [varchar](8) NOT NULL,
	[name] [nvarchar](30) NULL,
	[cid] [varchar](6) NULL,
	[image] [varchar](50) NULL,
	[price] [money] NULL,
	[description] [nvarchar](100) NULL,
	[dateCreated] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Size]    Script Date: 29-Mar-21 10:25:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Size](
	[pid] [varchar](8) NULL,
	[name] [varchar](5) NULL,
	[size_quantity] [int] NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Accounts] ([username], [password], [fullname], [role]) VALUES (N'admin', N'202cb962ac59075b964b07152d234b70', N'Minh Thành', 1)
INSERT [dbo].[Accounts] ([username], [password], [fullname], [role]) VALUES (N'cuongnm', N'202cb962ac59075b964b07152d234b70', N'Mạnh Cường', 2)
INSERT [dbo].[Accounts] ([username], [password], [fullname], [role]) VALUES (N'giangtv', N'202cb962ac59075b964b07152d234b70', N'Giang Triệu', 2)
INSERT [dbo].[Accounts] ([username], [password], [fullname], [role]) VALUES (N'minhthanh', N'a30fbd587840e409672e829a13f79735', N'Nguyễn Thành', 2)
GO
INSERT [dbo].[Categories] ([id], [name], [icon]) VALUES (N'1', N'T-Shirt', N'images/icon-t-shirt.png')
INSERT [dbo].[Categories] ([id], [name], [icon]) VALUES (N'2', N'Hoodie', N'images/icon-hoodie.png')
INSERT [dbo].[Categories] ([id], [name], [icon]) VALUES (N'3', N'Jacket', N'images/icon-jacket.png')
INSERT [dbo].[Categories] ([id], [name], [icon]) VALUES (N'4', N'Pants', N'images/icon-pants.png')
GO
INSERT [dbo].[OrderLine] ([oid], [pid], [size], [quantity], [price]) VALUES (1, N'A02', N'M', 1, 300000)
INSERT [dbo].[OrderLine] ([oid], [pid], [size], [quantity], [price]) VALUES (1, N'A02', N'L', 1, 300000)
INSERT [dbo].[OrderLine] ([oid], [pid], [size], [quantity], [price]) VALUES (2, N'A01', N'XL', 1, 320000)
INSERT [dbo].[OrderLine] ([oid], [pid], [size], [quantity], [price]) VALUES (3, N'A07', N'L', 1, 400000)
INSERT [dbo].[OrderLine] ([oid], [pid], [size], [quantity], [price]) VALUES (4, N'Q01', N'L', 1, 400000)
INSERT [dbo].[OrderLine] ([oid], [pid], [size], [quantity], [price]) VALUES (5, N'A04', N'M', 1, 400000)
INSERT [dbo].[OrderLine] ([oid], [pid], [size], [quantity], [price]) VALUES (6, N'A03', N'L', 3, 320000)
INSERT [dbo].[OrderLine] ([oid], [pid], [size], [quantity], [price]) VALUES (7, N'A08', N'XL', 2, 450000)
INSERT [dbo].[OrderLine] ([oid], [pid], [size], [quantity], [price]) VALUES (8, N'A04', N'M', 1, 400000)
INSERT [dbo].[OrderLine] ([oid], [pid], [size], [quantity], [price]) VALUES (9, N'Q02', N'M', 2, 350000)
GO
SET IDENTITY_INSERT [dbo].[Orders] ON 

INSERT [dbo].[Orders] ([id], [date], [usernameCustomer], [totalMoney]) VALUES (1, CAST(N'2020-12-22' AS Date), N'cuongnm', 900000.0000)
INSERT [dbo].[Orders] ([id], [date], [usernameCustomer], [totalMoney]) VALUES (2, CAST(N'2021-01-29' AS Date), N'giangtv', 1200000.0000)
INSERT [dbo].[Orders] ([id], [date], [usernameCustomer], [totalMoney]) VALUES (3, CAST(N'2021-02-13' AS Date), N'admin', 400000.0000)
INSERT [dbo].[Orders] ([id], [date], [usernameCustomer], [totalMoney]) VALUES (4, CAST(N'2021-03-13' AS Date), N'admin', 600000.0000)
INSERT [dbo].[Orders] ([id], [date], [usernameCustomer], [totalMoney]) VALUES (5, CAST(N'2021-03-14' AS Date), N'cuongnm', 400000.0000)
INSERT [dbo].[Orders] ([id], [date], [usernameCustomer], [totalMoney]) VALUES (6, CAST(N'2021-03-15' AS Date), N'giangtv', 320000.0000)
INSERT [dbo].[Orders] ([id], [date], [usernameCustomer], [totalMoney]) VALUES (7, CAST(N'2021-03-15' AS Date), N'minhthanh', 400000.0000)
INSERT [dbo].[Orders] ([id], [date], [usernameCustomer], [totalMoney]) VALUES (8, CAST(N'2021-03-25' AS Date), N'admin', 400000.0000)
INSERT [dbo].[Orders] ([id], [date], [usernameCustomer], [totalMoney]) VALUES (9, CAST(N'2021-03-29' AS Date), N'giangtv', 700000.0000)
SET IDENTITY_INSERT [dbo].[Orders] OFF
GO
INSERT [dbo].[Products] ([id], [name], [cid], [image], [price], [description], [dateCreated]) VALUES (N'A01', N'T-Shirt Phantom', N'1', N'images/tee-phantom-black.jpg', 320000.0000, N'Chất liệu đẹp, thoáng mát', CAST(N'2021-03-05' AS Date))
INSERT [dbo].[Products] ([id], [name], [cid], [image], [price], [description], [dateCreated]) VALUES (N'A02', N'Tết Sài Gòn', N'1', N'images/tet-sg.jpg', 300000.0000, N'Thiết kế độc đáo, vải co giãn ', CAST(N'2021-03-05' AS Date))
INSERT [dbo].[Products] ([id], [name], [cid], [image], [price], [description], [dateCreated]) VALUES (N'A03', N'Polo Mascot', N'1', N'images/POLO-MASCOT_BLACK.jpg', 320000.0000, N'Co giãn 4 chiều', CAST(N'2021-03-05' AS Date))
INSERT [dbo].[Products] ([id], [name], [cid], [image], [price], [description], [dateCreated]) VALUES (N'A04', N'Icon Ant Blue', N'2', N'images/hoodie-zip-icon-ant-blue_1.jpg', 400000.0000, N'Chất liệu đẹp, thoáng mát', CAST(N'2021-03-05' AS Date))
INSERT [dbo].[Products] ([id], [name], [cid], [image], [price], [description], [dateCreated]) VALUES (N'A05', N'Hoodie Character', N'2', N'images/hoodie-characters-white.jpg', 590000.0000, N'Thời trang', CAST(N'2021-03-05' AS Date))
INSERT [dbo].[Products] ([id], [name], [cid], [image], [price], [description], [dateCreated]) VALUES (N'A06', N'Tee graffity', N'1', N'images/TEE-GRAFFITY_tan.jpg', 320000.0000, N'Chất liệu đẹp, thời trang,....', CAST(N'2021-03-05' AS Date))
INSERT [dbo].[Products] ([id], [name], [cid], [image], [price], [description], [dateCreated]) VALUES (N'A07', N'Jacket icon ant', N'3', N'images/jacket-icon-ant_black.jpg', 400000.0000, N'Chất liệu đẹp, thời trang,....', CAST(N'2021-03-05' AS Date))
INSERT [dbo].[Products] ([id], [name], [cid], [image], [price], [description], [dateCreated]) VALUES (N'A08', N'Jacket Varsity ssssly', N'3', N'images/jacket-Varsity-ssssly.jpg', 450000.0000, N'Chất liệu đẹp, thời trang,....', CAST(N'2021-03-05' AS Date))
INSERT [dbo].[Products] ([id], [name], [cid], [image], [price], [description], [dateCreated]) VALUES (N'Q01', N'Pant Logo', N'4', N'images/Pant-logo-v2-1.jpg', 350000.0000, N'Đẹp', CAST(N'2021-03-05' AS Date))
INSERT [dbo].[Products] ([id], [name], [cid], [image], [price], [description], [dateCreated]) VALUES (N'Q02', N'Pant Sticker', N'4', N'images/pant-sticker-tan.jpg', 350000.0000, N'Thời trang, phong cách', CAST(N'2021-03-05' AS Date))
GO
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A01', N'M', 8)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A01', N'L', 12)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A01', N'XL', 0)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A02', N'M', 5)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A02', N'L', 6)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A02', N'XL', 11)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A03', N'M', 5)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A03', N'L', 9)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A03', N'XL', 10)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A04', N'M', 10)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A04', N'L', 15)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A04', N'XL', 20)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A05', N'M', 12)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A05', N'L', 21)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A05', N'XL', 13)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A06', N'M', 10)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A06', N'L', 1)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A06', N'XL', 7)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A07', N'M', 4)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A07', N'L', 9)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A07', N'XL', 4)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A08', N'M', 16)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A08', N'L', 10)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'A08', N'XL', 6)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'Q01', N'M', 9)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'Q01', N'L', 11)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'Q01', N'XL', 10)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'Q02', N'M', 10)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'Q02', N'L', 10)
INSERT [dbo].[Size] ([pid], [name], [size_quantity]) VALUES (N'Q02', N'XL', 14)
GO
ALTER TABLE [dbo].[OrderLine]  WITH CHECK ADD FOREIGN KEY([oid])
REFERENCES [dbo].[Orders] ([id])
GO
ALTER TABLE [dbo].[OrderLine]  WITH CHECK ADD FOREIGN KEY([pid])
REFERENCES [dbo].[Products] ([id])
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD FOREIGN KEY([usernameCustomer])
REFERENCES [dbo].[Accounts] ([username])
GO
ALTER TABLE [dbo].[Products]  WITH CHECK ADD FOREIGN KEY([cid])
REFERENCES [dbo].[Categories] ([id])
GO
ALTER TABLE [dbo].[Size]  WITH CHECK ADD FOREIGN KEY([pid])
REFERENCES [dbo].[Products] ([id])
GO
