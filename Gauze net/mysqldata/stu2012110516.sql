-- MySQL dump 10.13  Distrib 5.6.12, for Win64 (x86_64)
--
-- Host: localhost    Database: stu2012110516
-- ------------------------------------------------------
-- Server version	5.6.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adminuser`
--

DROP TABLE IF EXISTS `adminuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adminuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adminusername` varchar(45) DEFAULT NULL,
  `adminuserpassword` varchar(45) DEFAULT NULL,
  `adminpower` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminuser`
--

LOCK TABLES `adminuser` WRITE;
/*!40000 ALTER TABLE `adminuser` DISABLE KEYS */;
INSERT INTO `adminuser` VALUES (1,'liangshuang','aaa',10),(2,'lijia','bbb',20);
/*!40000 ALTER TABLE `adminuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dresscategory`
--

DROP TABLE IF EXISTS `dresscategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dresscategory` (
  `id` int(11) NOT NULL,
  `dresscategory` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dresscategory`
--

LOCK TABLES `dresscategory` WRITE;
/*!40000 ALTER TABLE `dresscategory` DISABLE KEYS */;
INSERT INTO `dresscategory` VALUES (1,'韩式'),(2,'日式'),(3,'中式'),(4,'欧美');
/*!40000 ALTER TABLE `dresscategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dressdetail`
--

DROP TABLE IF EXISTS `dressdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dressdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dressName` varchar(100) DEFAULT NULL,
  `dressMaterial` varchar(100) DEFAULT NULL,
  `dressMaterialId` varchar(45) DEFAULT NULL,
  `dressStyle` varchar(100) DEFAULT NULL,
  `dressCategoryId` varchar(50) DEFAULT NULL,
  `dressPrice` decimal(6,2) DEFAULT NULL,
  `dressListPrice` decimal(6,2) DEFAULT NULL,
  `dressImage1` varchar(50) DEFAULT NULL,
  `dressImage2` varchar(50) DEFAULT NULL,
  `dressBrief` text,
  `tprice` decimal(6,2) DEFAULT NULL,
  `dressCategory` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dressdetail`
--

LOCK TABLES `dressdetail` WRITE;
/*!40000 ALTER TABLE `dressdetail` DISABLE KEYS */;
INSERT INTO `dressdetail` VALUES (1,'韩式唯美拖尾新娘婚纱','蕾丝','3','中腰','1',1800.00,2000.00,'Korean01','Korean01','拖尾婚纱有着很漂亮的设计，唯美的感觉不用言语，新娘们自有体会。韩式唯美婚纱礼服，选择它，终生难忘。',NULL,'韩式'),(2,'韩式唯美拖尾','蕾丝','3','中腰、抹胸','1',2000.00,2800.00,'Korean02','Korean02','蕾丝一直以来都是作为婚纱的主流元素，因其浪漫、性感、唯美、高贵的特质获取了众多准新娘们的宠爱。而如今的蕾丝在婚纱中的运用也是非常多变，无论是用在颈肩处、手臂处、背部还是裙摆处，都能够带给人不一样的独特美感。',NULL,'韩式'),(3,'韩式甜美公主蓬蓬绑带婚纱','雪纺','1','中腰、抹胸','1',2000.00,1800.00,'Korean03','Korean03','雪纺面料一般来说在夏季比较常见，而它的应用也不仅仅局限于婚纱中，在我们日常的穿戴中也是极具人缘。这种面料的服装能够带给人飘逸灵动的感觉，并且穿上也是非常舒适的。对于雪纺婚纱来说，飘逸朦胧的质感可以为新娘加分不少。',NULL,'韩式'),(4,'日式萝莉风格婚纱','蕾丝','3','中腰、蓬蓬裙摆','2',1200.00,1800.00,'Japan01','Japan01','蕾丝一直以来都是作为婚纱的主流元素，因其浪漫、性感、唯美、高贵的特质获取了众多准新娘们的宠爱。而如今的蕾丝在婚纱中的运用也是非常多变，无论是用在颈肩处、手臂处、背部还是裙摆处，都能够带给人不一样的独特美感。',NULL,'日式'),(5,'Kama日式婚纱','雪纺','1','中腰、华丽','2',1000.00,1700.00,'Japan02','Japan02','雪纺面料一般来说在夏季比较常见，而它的应用也不仅仅局限于婚纱中，在我们日常的穿戴中也是极具人缘。这种面料的服装能够带给人飘逸灵动的感觉，并且穿上也是非常舒适的。对于雪纺婚纱来说，飘逸朦胧的质感可以为新娘加分不少。',NULL,'日式'),(6,'中式结婚礼服','丝绸','2','收腰','3',1800.00,2000.00,'China01','China01','丝绸的华丽高雅，顺滑的触感，尽显高贵优雅',NULL,'中式'),(7,'中国风婚纱礼服','缎面','4','中腰、水钻','3',1800.00,2100.00,'China02','China02','缎面的合适剪裁，更加衬托出新娘的美丽动人',NULL,'中式'),(8,'古装婚纱礼服','真丝','5','束腰，古装','3',1000.00,1500.00,'China03','China03','淡蓝色华衣裹身，外披白色纱衣，露出线条优美的颈项和清晰可见的锁骨，裙幅褶褶如雪月光华流动轻泻于地，挽迤三尺有余，使得步态愈加雍容柔美，三千青丝用发带束起，头插蝴蝶钗，一缕青丝垂在胸前，薄施粉黛，只增颜色，双颊边若隐若现的红扉感营造出一种纯肌如花瓣般的娇嫩可爱，整个人好似随风纷飞的蝴蝶，又似清灵透彻的冰雪……',NULL,'中式'),(9,'叛逆的公主 Michelle Roth','真丝','5','紧身','4',2300.00,2800.00,'Europe01','Europe01','Michelle Roth 2014婚纱，就像是一个叛逆的公主，正在寻求自由。所以整系列婚纱显现出一种放荡不羁，个性十足的感觉！米歇尔•罗斯对于婚纱的理解显然比较个性。她的婚纱水晶光泽度极好，线条明朗，朴实的婚纱下，却隐匿着一颗叛逆的心。',NULL,'欧式'),(10,'玫瑰花拖尾婚纱','欧根纱','6','紧身，花瓣','4',2800.00,3000.00,'Europe02','Europe02','这款立体玫瑰花拖尾婚纱的婚纱，选用进口的奥地利施华洛世奇水晶，看起来更加恒久闪耀、时尚璀璨，精致的手工珠绣加水晶，绽放魅惑身姿。胸口完美的爱心设计，露出迷人的锁骨，恰到好处的勾勒出完美胸型，彰显优雅气质与品味。修身绑带设计，塑身效果一流更显腰身，玫瑰花簇拥下的长拖尾婚纱，新娘犹如从花丛里走来的精灵，甜美气质不言而喻。',NULL,'欧式'),(11,'韩式唯美大摆婚纱','蕾丝','3','中腰、大摆','1',2800.00,3000.00,'Korean04','Korean04','华丽的大摆裙摆尽显尊贵、高雅，做一个美丽的新娘',NULL,'韩式'),(12,'韩式修身婚纱','丝绸','2','紧身','1',1800.00,2100.00,'Korean05','Korean05','丝绸的华丽高雅，顺滑的触感，尽显高贵优雅',NULL,'韩式'),(13,'韩式简约婚纱','丝绸','2','简约、修身','1',2100.00,3000.00,'Korean06','Korean06','丝绸的华丽高雅，顺滑的触感，尽显高贵优雅',NULL,'韩式'),(14,'韩式裙摆婚纱','真丝','5','裙摆','1',1800.00,2100.00,'Korean07','Korean07','真丝的华丽触感，舒缓你的每一份心情，在这个特殊的日子，让你做一个快乐美丽的新娘',NULL,'韩式'),(15,'韩式大摆婚纱','蕾丝','3','大摆、简约','1',2100.00,3000.00,'Korean08','Korean08','蕾丝一直以来都是作为婚纱的主流元素，因其浪漫、性感、唯美、高贵的特质获取了众多准新娘们的宠爱。而如今的蕾丝在婚纱中的运用也是非常多变，无论是用在颈肩处、手臂处、背部还是裙摆处，都能够带给人不一样的独特美感。',NULL,'韩式'),(16,'日式俏皮风婚纱','雪纺','1','活泼、简约','2',2100.00,2800.00,'Japan03','Japan03','雪纺面料一般来说在夏季比较常见，而它的应用也不仅仅局限于婚纱中，在我们日常的穿戴中也是极具人缘。这种面料的服装能够带给人飘逸灵动的感觉，并且穿上也是非常舒适的。对于雪纺婚纱来说，飘逸朦胧的质感可以为新娘加分不少。',NULL,'日式'),(17,'日式华丽大摆婚纱','雪纺','1','大摆、拖地、大气','2',1800.00,2100.00,'Japan04','Japan04','雪纺面料一般来说在夏季比较常见，而它的应用也不仅仅局限于婚纱中，在我们日常的穿戴中也是极具人缘。这种面料的服装能够带给人飘逸灵动的感觉，并且穿上也是非常舒适的。对于雪纺婚纱来说，飘逸朦胧的质感可以为新娘加分不少。',NULL,'日式'),(18,'日式层叠婚纱','蕾丝','3','层叠、披肩','2',1800.00,2100.00,'Japan05','Japan05','蕾丝一直以来都是作为婚纱的主流元素，因其浪漫、性感、唯美、高贵的特质获取了众多准新娘们的宠爱。而如今的蕾丝在婚纱中的运用也是非常多变，无论是用在颈肩处、手臂处、背部还是裙摆处，都能够带给人不一样的独特美感。',NULL,'日式'),(19,'日式森林系婚纱','蕾丝','3','森林系、清新','2',1000.00,1800.00,'Japan06','Japan06','蕾丝一直以来都是作为婚纱的主流元素，因其浪漫、性感、唯美、高贵的特质获取了众多准新娘们的宠爱。而如今的蕾丝在婚纱中的运用也是非常多变，无论是用在颈肩处、手臂处、背部还是裙摆处，都能够带给人不一样的独特美感。',NULL,'日式'),(20,'日式复古婚纱','雪纺','1','修身','2',2100.00,2800.00,'Japan07','Japan07','雪纺面料一般来说在夏季比较常见，而它的应用也不仅仅局限于婚纱中，在我们日常的穿戴中也是极具人缘。这种面料的服装能够带给人飘逸灵动的感觉，并且穿上也是非常舒适的。对于雪纺婚纱来说，飘逸朦胧的质感可以为新娘加分不少。',NULL,'日式'),(21,'中式简约婚纱','欧根纱','6','简约、欧根纱','3',2800.00,3100.00,'China04','China04','华丽的大摆裙摆尽显尊贵、高雅，做一个美丽的新娘',NULL,'中式'),(22,'中式森林系婚纱','雪纺','1','森林系、清新','3',1200.00,1800.00,'China05','China05','雪纺面料一般来说在夏季比较常见，而它的应用也不仅仅局限于婚纱中，在我们日常的穿戴中也是极具人缘。这种面料的服装能够带给人飘逸灵动的感觉，并且穿上也是非常舒适的。对于雪纺婚纱来说，飘逸朦胧的质感可以为新娘加分不少。',NULL,'中式'),(23,'中式小清新婚纱','雪纺','1','简约、修身','3',2800.00,3100.00,'China06','China06','雪纺面料一般来说在夏季比较常见，而它的应用也不仅仅局限于婚纱中，在我们日常的穿戴中也是极具人缘。这种面料的服装能够带给人飘逸灵动的感觉，并且穿上也是非常舒适的。对于雪纺婚纱来说，飘逸朦胧的质感可以为新娘加分不少。',NULL,'中式'),(24,'中式复古婚纱','蕾丝','3','紧身，花瓣','3',1200.00,1800.00,'China07','China07','蕾丝一直以来都是作为婚纱的主流元素，因其浪漫、性感、唯美、高贵的特质获取了众多准新娘们的宠爱。而如今的蕾丝在婚纱中的运用也是非常多变，无论是用在颈肩处、手臂处、背部还是裙摆处，都能够带给人不一样的独特美感。',NULL,'中式'),(25,'中式甜美婚纱','雪纺','1','紧身，花瓣','3',1800.00,2800.00,'China08','China08','雪纺面料一般来说在夏季比较常见，而它的应用也不仅仅局限于婚纱中，在我们日常的穿戴中也是极具人缘。这种面料的服装能够带给人飘逸灵动的感觉，并且穿上也是非常舒适的。对于雪纺婚纱来说，飘逸朦胧的质感可以为新娘加分不少。',NULL,'中式'),(26,'欧美复古婚纱','真丝','5','简约、修身','4',1200.00,1800.00,'Europe03','Europe03','真丝的华丽触感，舒缓你的每一份心情，在这个特殊的日子，让你做一个快乐美丽的新娘',NULL,'欧式'),(27,'欧美中世纪复古婚纱','蕾丝','3','中世纪、复古','4',1600.00,1800.00,'Europe04','Europe04','蕾丝一直以来都是作为婚纱的主流元素，因其浪漫、性感、唯美、高贵的特质获取了众多准新娘们的宠爱。而如今的蕾丝在婚纱中的运用也是非常多变，无论是用在颈肩处、手臂处、背部还是裙摆处，都能够带给人不一样的独特美感。',NULL,'欧式'),(28,'欧美现代婚纱','蕾丝','3','简约、水钻','4',1200.00,2100.00,'Europe05','Europe05','蕾丝一直以来都是作为婚纱的主流元素，因其浪漫、性感、唯美、高贵的特质获取了众多准新娘们的宠爱。而如今的蕾丝在婚纱中的运用也是非常多变，无论是用在颈肩处、手臂处、背部还是裙摆处，都能够带给人不一样的独特美感。',NULL,'欧式'),(29,'欧美拖尾婚纱','缎面','4','长拖尾','4',2400.00,2900.00,'Europe06','Europe06','缎面的合适剪裁，更加衬托出新娘的美丽动人',NULL,'欧式');
/*!40000 ALTER TABLE `dressdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dressmaterial`
--

DROP TABLE IF EXISTS `dressmaterial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dressmaterial` (
  `id` int(11) NOT NULL DEFAULT '0',
  `dressMaterial` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dressmaterial`
--

LOCK TABLES `dressmaterial` WRITE;
/*!40000 ALTER TABLE `dressmaterial` DISABLE KEYS */;
INSERT INTO `dressmaterial` VALUES (1,'雪纺'),(2,'丝绸'),(3,'蕾丝'),(4,'缎面'),(5,'真丝'),(6,'欧根纱');
/*!40000 ALTER TABLE `dressmaterial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dressorder`
--

DROP TABLE IF EXISTS `dressorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dressorder` (
  `id` int(11) NOT NULL,
  `userid` int(11) DEFAULT NULL,
  `dressidstring` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dressorder`
--

LOCK TABLES `dressorder` WRITE;
/*!40000 ALTER TABLE `dressorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `dressorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favorite`
--

DROP TABLE IF EXISTS `favorite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `favorite` (
  `id` int(11) NOT NULL,
  `userid` int(11) DEFAULT NULL,
  `dressid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favorite`
--

LOCK TABLES `favorite` WRITE;
/*!40000 ALTER TABLE `favorite` DISABLE KEYS */;
INSERT INTO `favorite` VALUES (1,6,1),(2,6,3),(3,2,1);
/*!40000 ALTER TABLE `favorite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdetail`
--

DROP TABLE IF EXISTS `userdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `userpassword` varchar(45) DEFAULT NULL,
  `regtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdetail`
--

LOCK TABLES `userdetail` WRITE;
/*!40000 ALTER TABLE `userdetail` DISABLE KEYS */;
INSERT INTO `userdetail` VALUES (1,'yuqian','123','2013-04-24 07:50:39'),(2,'zhangsan','123','2013-04-24 07:50:39'),(3,'aaaa','aaaa','2013-12-18 13:15:04'),(4,'cccc','cccc','2013-12-18 13:19:57'),(5,'jiayu','123','2013-12-18 13:25:11'),(6,'liutt','123','2013-12-18 14:54:54'),(7,'kimi','123','2013-12-18 18:01:20');
/*!40000 ALTER TABLE `userdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `view_dress`
--

DROP TABLE IF EXISTS `view_dress`;
/*!50001 DROP VIEW IF EXISTS `view_dress`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `view_dress` (
  `id` tinyint NOT NULL,
  `dressName` tinyint NOT NULL,
  `dressMaterial` tinyint NOT NULL,
  `dressMaterialId` tinyint NOT NULL,
  `dressStyle` tinyint NOT NULL,
  `dressCategoryId` tinyint NOT NULL,
  `dressCategory` tinyint NOT NULL,
  `dressPrice` tinyint NOT NULL,
  `dressListPrice` tinyint NOT NULL,
  `dressImage1` tinyint NOT NULL,
  `dressImage2` tinyint NOT NULL,
  `dressBrief` tinyint NOT NULL,
  `tprice` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `view_favorite`
--

DROP TABLE IF EXISTS `view_favorite`;
/*!50001 DROP VIEW IF EXISTS `view_favorite`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `view_favorite` (
  `id` tinyint NOT NULL,
  `userid` tinyint NOT NULL,
  `dressid` tinyint NOT NULL,
  `username` tinyint NOT NULL,
  `dressName` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `view_dress`
--

/*!50001 DROP TABLE IF EXISTS `view_dress`*/;
/*!50001 DROP VIEW IF EXISTS `view_dress`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_dress` AS select `dressdetail`.`id` AS `id`,`dressdetail`.`dressName` AS `dressName`,`dressdetail`.`dressMaterial` AS `dressMaterial`,`dressdetail`.`dressMaterialId` AS `dressMaterialId`,`dressdetail`.`dressStyle` AS `dressStyle`,`dressdetail`.`dressCategoryId` AS `dressCategoryId`,`dressdetail`.`dressCategory` AS `dressCategory`,`dressdetail`.`dressPrice` AS `dressPrice`,`dressdetail`.`dressListPrice` AS `dressListPrice`,`dressdetail`.`dressImage1` AS `dressImage1`,`dressdetail`.`dressImage2` AS `dressImage2`,`dressdetail`.`dressBrief` AS `dressBrief`,`dressdetail`.`tprice` AS `tprice` from ((`dressdetail` left join `dresscategory` on((`dressdetail`.`dressCategoryId` = `dresscategory`.`id`))) left join `dressmaterial` on((`dressdetail`.`dressMaterialId` = `dressmaterial`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_favorite`
--

/*!50001 DROP TABLE IF EXISTS `view_favorite`*/;
/*!50001 DROP VIEW IF EXISTS `view_favorite`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_favorite` AS select `favorite`.`id` AS `id`,`favorite`.`userid` AS `userid`,`favorite`.`dressid` AS `dressid`,`userdetail`.`username` AS `username`,`dressdetail`.`dressName` AS `dressName` from ((`favorite` left join `userdetail` on((`userdetail`.`id` = `favorite`.`userid`))) left join `dressdetail` on((`dressdetail`.`id` = `favorite`.`dressid`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-12-20  0:17:58
