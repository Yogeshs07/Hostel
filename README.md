# hostel
Hostel Application

CREATE DATABASE hostel;

create table event
(
	EVENT_ID int auto_increment
		primary key,
	EVENT_NAME varchar(200) null,
	EVENT_DESCRIPTION varchar(2000) null,
	EVENT_DESTINATION varchar(100) null,
	EVENT_END_DATETIME datetime null,
	EVENT_START_DATETIME datetime null
);

CREATE TABLE `student` (
  `STUDENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STUDENT_NAME` varchar(200) DEFAULT NULL,
  `STUDENT_YEAR` varchar(200) DEFAULT NULL,
  `STUDENT_CONTACT_NO` varchar(200) DEFAULT NULL,
  `STUDENT_EMAIL` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`STUDENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

create table report
(
	REPORT_ID int auto_increment
		primary key,
	REPORT_TITLE varchar(200) null,
	REPORT_DESC varchar(200) null,
	REPORT_STATUS varchar(200) null,
    STUDENT_ID int null,
    REPORT_CATEGORY varchar(200) null
);
