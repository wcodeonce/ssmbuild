CREATE
    DATABASE `ssmbuild`;

USE
    `ssmbuild`;

-- 创建图书表
CREATE TABLE `books`
(
    `bookID`     INT(10)      NOT NULL AUTO_INCREMENT COMMENT '图书ID',
    `bookName`   VARCHAR(100) NOT NULL COMMENT '书名',
    `bookCounts` INT(11)      NOT NULL COMMENT '数量',
    `detail`     VARCHAR(200) NOT NULL COMMENT '描述',
    KEY `bookID` (`bookID`)
) ENGINE = INNODB
  DEFAULT CHARSET = `utf8`;

-- 插入数据
INSERT INTO `books`(`bookID`, `bookName`, `bookCounts`, `detail`)
VALUES (1, 'JAVA', 34, '从入门到放弃'),
       (2, 'MySQL', 23, '从删库到跑路'),
       (3, 'Linux', 33, '从进门到进牢')
