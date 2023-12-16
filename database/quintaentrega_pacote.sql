-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quintaentrega
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pacote`
--

DROP TABLE IF EXISTS `pacote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pacote` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `destino` text,
  `descricao` text,
  `dataPartida` text,
  `dataRetorno` text,
  `nomeHotel` text,
  `valor` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacote`
--

LOCK TABLES `pacote` WRITE;
/*!40000 ALTER TABLE `pacote` DISABLE KEYS */;
INSERT INTO `pacote` VALUES (1,'Porto de Galinhas','Localizada em Ipojuca, no estado de Pernambuco, Porto de Galinhas é famosa por suas belas praias e piscinas naturais de águas cristalinas','2024-03-25','2024-04-01','Porto Palace',3500),(2,'Fortaleza','Com o poder de agradar pessoas de todas as idades, a capital cearense mistura muitas coisas de que o brasileiro gosta: belezas naturais, cultura, música, diversão e uma culinária de tirar o chapéu','2024-03-30','2024-04-06','Mareiro',3900),(3,'Salvador','Descubra a rica cultura de Salvador, desfrutando de 7 dias de estadia. Conheça praias como a Praia do Farol da Barra e a Praia do Flamengo','2024-03-27','2024-04-03','Salva Luz',3800),(4,'Amazonas','O verde da Amazônia, o escuro Rio Negro, o barrento Rio Solimões, a culinária exótica, a arquitetura diversificada e um povo muito acolhedor. Em uma só visita você irá se apaixonar pela capital do Amazonas','2024-03-30','2024-04-06','Rio Amazonas',3600),(5,'Manaus','Conhecida como a Paris dos Trópicos, devido à sua intensa modernização durante o Ciclo da Borracha, período de grande crescimento econômico e social no Brasil, Manaus fica bem no meio da Floresta Amazônica','2024-04-01','2024-04-08','Mana Mana',3100),(6,'Alter do Chão','Alter do Chão é a principal base para os turistas que pretendem conhecer as belezas do Rio Tapajós e Rio Arapiuns. Isso porque os passeios de lancha e barco para as praias saem quase todos de lá','2024-04-02','2024-04-09','Alter do Céu',2300),(7,'Curitiba','A cidade de Curitiba, capital do estado do Paraná, é conhecida pelo cuidado com o planejamento urbano, belas áreas verdes e um transporte público de qualidade','2024-03-30','2024-04-07','Ópera de Arame',2500),(8,'Gramado','Gramado é a principal cidade da Serra Gaúcha e sem dúvidas é um dos melhores destinos turísticos do país. Romântica, charmosa, cheia de cultura, belas paisagens, atrações e ótima culinária','2024-04-01','2024-04-08','Hotel Gramado',2500),(9,'Florianópolis','Florianópolis, também conhecida como Ilha da Magia, é um destino vibrante e repleto de oportunidades para negócios e lazer no sul do Brasil','2024-04-02','2024-04-09','Hotel da Magia',2600);
/*!40000 ALTER TABLE `pacote` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-15 21:01:39
