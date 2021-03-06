USE [Library_New]
GO
/****** Object:  Table [dbo].[Thong_Tin_User]    Script Date: 30/10/2021 10:25:35 CH ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Thong_Tin_User]') AND type in (N'U'))
DROP TABLE [dbo].[Thong_Tin_User]
GO
/****** Object:  Table [dbo].[The_Loai]    Script Date: 30/10/2021 10:25:35 CH ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[The_Loai]') AND type in (N'U'))
DROP TABLE [dbo].[The_Loai]
GO
/****** Object:  Table [dbo].[Tai_Khoan]    Script Date: 30/10/2021 10:25:35 CH ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Tai_Khoan]') AND type in (N'U'))
DROP TABLE [dbo].[Tai_Khoan]
GO
/****** Object:  Table [dbo].[Book]    Script Date: 30/10/2021 10:25:35 CH ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Book]') AND type in (N'U'))
DROP TABLE [dbo].[Book]
GO
/****** Object:  Table [dbo].[Book]    Script Date: 30/10/2021 10:25:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Book](
	[Ma_Sach] [varchar](50) NOT NULL,
	[Ten_Sach] [nvarchar](100) NOT NULL,
	[Ten_Tac_Gia] [nvarchar](50) NOT NULL,
	[Ma_The_Loai] [nvarchar](50) NOT NULL,
	[Ngay_Xuat_Ban] [varchar](50) NOT NULL,
	[Luot_Muon] [int] NOT NULL,
	[Thoi_gian_Muon] [int] NOT NULL,
	[Book_img1] [varchar](100) NOT NULL,
	[Book_img2] [varchar](100) NOT NULL,
	[Book_img3] [varchar](100) NOT NULL,
	[Book_img4] [varchar](100) NOT NULL,
 CONSTRAINT [PK_Book] PRIMARY KEY CLUSTERED 
(
	[Ma_Sach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tai_Khoan]    Script Date: 30/10/2021 10:25:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tai_Khoan](
	[maThe] [int] NOT NULL,
	[TK] [varchar](50) NOT NULL,
	[MK] [varchar](50) NOT NULL,
	[isAdmin] [int] NOT NULL,
 CONSTRAINT [PK_Tai_Khoan] PRIMARY KEY CLUSTERED 
(
	[TK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[The_Loai]    Script Date: 30/10/2021 10:25:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[The_Loai](
	[Ma_The_Loai] [varchar](50) NOT NULL,
	[Ten_Te_Loai] [nvarchar](50) NOT NULL,
	[Mo_Ta] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_The_Loai] PRIMARY KEY CLUSTERED 
(
	[Ma_The_Loai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Thong_Tin_User]    Script Date: 30/10/2021 10:25:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Thong_Tin_User](
	[TK] [varchar](50) NOT NULL,
	[HoTen] [nvarchar](100) NULL,
	[sdt] [varchar](50) NULL,
	[email] [varchar](50) NOT NULL,
	[diaChi] [nvarchar](100) NULL,
	[anhCMND] [varchar](100) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Book] ([Ma_Sach], [Ten_Sach], [Ten_Tac_Gia], [Ma_The_Loai], [Ngay_Xuat_Ban], [Luot_Muon], [Thoi_gian_Muon], [Book_img1], [Book_img2], [Book_img3], [Book_img4]) VALUES (N'1', N'Việt Nam sử lược', N'BTV Trần Trọng Kim', N'3', N'1920-05-27', 0, 14, N'bookImages/hh8.png', N'bookImages/hh9.png', N'bookImages/hh10.png', N'bookImages/VNLS.jpg')
INSERT [dbo].[Book] ([Ma_Sach], [Ten_Sach], [Ten_Tac_Gia], [Ma_The_Loai], [Ngay_Xuat_Ban], [Luot_Muon], [Thoi_gian_Muon], [Book_img1], [Book_img2], [Book_img3], [Book_img4]) VALUES (N'2', N'Đắc nhân tâm', N'Dale Carnegie', N'2', N'2000-12-09', 0, 14, N'bookImages/sach-dac-nhan-tam-dale-carnegie.jpg', N'bookImages/hh5.png', N'bookImages/hh6.png', N'bookImages/hh7.png')
INSERT [dbo].[Book] ([Ma_Sach], [Ten_Sach], [Ten_Tac_Gia], [Ma_The_Loai], [Ngay_Xuat_Ban], [Luot_Muon], [Thoi_gian_Muon], [Book_img1], [Book_img2], [Book_img3], [Book_img4]) VALUES (N'3', N'Hóa Học Đại Cương - Dành Cho Sinh Viên Không Chuyên Ngành Hóa', N'NXB Đại Học Quốc Gia Hà Nội', N'4', N'2020-06-22', 2, 14, N'bookImages/hh1.png', N'bookImages/hh2.png', N'bookImages/hh3.png', N'bookImages/hh4.png')
INSERT [dbo].[Book] ([Ma_Sach], [Ten_Sach], [Ten_Tac_Gia], [Ma_The_Loai], [Ngay_Xuat_Ban], [Luot_Muon], [Thoi_gian_Muon], [Book_img1], [Book_img2], [Book_img3], [Book_img4]) VALUES (N'4', N'Làm thuê hay Khởi nghiệp', N'Nhà Xuất Bản Dân Trí', N'2', N'2020-02-02', 0, 14, N'bookImages/lthkn.png', N'', N'', N'')
GO
INSERT [dbo].[Tai_Khoan] ([maThe], [TK], [MK], [isAdmin]) VALUES (2, N'DE150387', N'nht24052001', 1)
INSERT [dbo].[Tai_Khoan] ([maThe], [TK], [MK], [isAdmin]) VALUES (5, N'DE1503877', N'qwertyui9', 0)
INSERT [dbo].[Tai_Khoan] ([maThe], [TK], [MK], [isAdmin]) VALUES (3, N'DE150983', N'hobaocaochon12', 0)
INSERT [dbo].[Tai_Khoan] ([maThe], [TK], [MK], [isAdmin]) VALUES (4, N'huyvodich123', N'huy24052001', 0)
INSERT [dbo].[Tai_Khoan] ([maThe], [TK], [MK], [isAdmin]) VALUES (6, N'intellionn@boss.nht', N't42501002', 0)
INSERT [dbo].[Tai_Khoan] ([maThe], [TK], [MK], [isAdmin]) VALUES (7, N'newbaby', N't24052001', 0)
INSERT [dbo].[Tai_Khoan] ([maThe], [TK], [MK], [isAdmin]) VALUES (1, N'ngay24052001', N'ht24052001', 1)
GO
INSERT [dbo].[The_Loai] ([Ma_The_Loai], [Ten_Te_Loai], [Mo_Ta]) VALUES (N'1', N'Sách Kinh Dị', N'Ma quái, ....')
INSERT [dbo].[The_Loai] ([Ma_The_Loai], [Ten_Te_Loai], [Mo_Ta]) VALUES (N'2', N'Sách Khoa Học', N'Nghiên cứu khoa học')
INSERT [dbo].[The_Loai] ([Ma_The_Loai], [Ten_Te_Loai], [Mo_Ta]) VALUES (N'3', N'Sách Lịch Sử', N'Lịch sử thế giới, Việt Nam, ....')
INSERT [dbo].[The_Loai] ([Ma_The_Loai], [Ten_Te_Loai], [Mo_Ta]) VALUES (N'4', N'Sách giáo khoa', N'Sách sử dụng cho giáo dục')
GO
INSERT [dbo].[Thong_Tin_User] ([TK], [HoTen], [sdt], [email], [diaChi], [anhCMND]) VALUES (N'ngay24052001', N'Nguyễn Huỳnh Thắng', N'0386993897', N'thangnhde150387@fpt.edu.vn', N'Phước Hiệp, Bình Định', N'images/nguoidung.jpg')
INSERT [dbo].[Thong_Tin_User] ([TK], [HoTen], [sdt], [email], [diaChi], [anhCMND]) VALUES (N'DE150387', N'Trần Thành Chum', N'0123456789', N'thang24052001nguyen@gmail.com', N'HCM - Sài Gòn - Bình Định', N'images/nguoidung.jpg')
INSERT [dbo].[Thong_Tin_User] ([TK], [HoTen], [sdt], [email], [diaChi], [anhCMND]) VALUES (N'DE150983', N'LTQ', N'0356586457', N'emkhongsai@gmail.com', N'Bình Định', N'images/nguoidung.jpg')
INSERT [dbo].[Thong_Tin_User] ([TK], [HoTen], [sdt], [email], [diaChi], [anhCMND]) VALUES (N'huyvodich123', N'Lê Văn Huy', N'032541254', N'levanhuy8a5@gmail.com', N'Phước Sơn - Tuy Phước', N'images/nguoidung.jpg')
INSERT [dbo].[Thong_Tin_User] ([TK], [HoTen], [sdt], [email], [diaChi], [anhCMND]) VALUES (N'DE1503877', N'Thắng Nguyễn', N'02051548565', N'tgdfgff@gmail.com', N'Đà Nẵng', N'images/nguoidung.jpg')
INSERT [dbo].[Thong_Tin_User] ([TK], [HoTen], [sdt], [email], [diaChi], [anhCMND]) VALUES (N'newbaby', N'newbaby', N'', N'baby24@gmail.com', N'', N'images/nguoidung.jpg')
INSERT [dbo].[Thong_Tin_User] ([TK], [HoTen], [sdt], [email], [diaChi], [anhCMND]) VALUES (N'intellionn@boss.nht', N'Ngoc Nhi', N'521542151', N'ngocnhi24@gmail.com', N'Đà Nẵng', N'images/nguoidung.jpg')
GO
