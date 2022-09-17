/* ==========================================       script de criação do banco de dados */
CREATE DATABASE consultoria;

/* ==========================================       aponta para o banco criado */
USE consultoria;

/* ==========================================       criação da tabela de países */
CREATE TABLE pais
(pais_id INTEGER NOT NULL auto_increment PRIMARY KEY, 
 pais_nome VARCHAR(50) NOT NULL);
 
/* ==========================================       insersão de países (inicialmente decidimos somente destinos nacionais) */ 
INSERT INTO pais (pais_nome) VALUES ('BRASIL');

/* ==========================================       seleção registros pais*/
SELECT * FROM pais ORDER BY pais_nome;

/* ==========================================       criação da tabela de UF */
CREATE TABLE estado
(estado_id INTEGER NOT NULL PRIMARY KEY, 
 estado_nome VARCHAR(50) NOT NULL,
 estado_sigla VARCHAR(2) NOT NULL,
 pais_id INTEGER NOT NULL,
 FOREIGN KEY (pais_id) REFERENCES pais (pais_id));
 
 /* ==========================================       insersão de UFs */
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (11, 1, 'Rondônia','RO');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (12, 1, 'Acre','AC');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (13, 1, 'Amazonas','AM');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (14, 1, 'Roraima','RR');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (15, 1, 'Pará','PA');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (16, 1, 'Amapá','AP');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (17, 1, 'Tocantins','TO');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (21, 1, 'Maranhão','MA');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (22, 1, 'Piauí','PI');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (23, 1, 'Ceará','CE');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (24, 1, 'Rio Grande do Norte','RN');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (25, 1, 'Paraíba','PB');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (26, 1, 'Pernambuco','PE');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (27, 1, 'Alagoas','AL');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (28, 1, 'Sergipe','SE');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (29, 1, 'Bahia','BA');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (31, 1, 'Minas Gerais','MG');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (32, 1, 'Espírito Santo','ES');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (33, 1, 'Rio de Janeiro','RJ');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (35, 1, 'São Paulo','SP');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (41, 1, 'Paraná','PR');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (42, 1, 'Santa Catarina','SC');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (43, 1, 'Rio Grande do Sul','RS');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (50, 1, 'Mato Grosso do Sul','MS');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (51, 1, 'Mato Grosso','MT');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (52, 1, 'Goiás','GO');
INSERT INTO estado (estado_id, pais_id, estado_nome, estado_sigla) VALUES (53, 1, 'Distrito Federal','DF');

/* ==========================================       seleção estados */
SELECT * FROM estado ORDER BY estado_nome;

/* ==========================================       criação da tabela de cidades */
CREATE TABLE cidade
(cidade_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
 cidade_nome VARCHAR(100) NOT NULL,
 estado_id  INTEGER NOT NULL, 
 FOREIGN KEY (estado_id) REFERENCES estado (estado_id));

/* ==========================================       insersão de cidades */
INSERT INTO cidade (estado_id, cidade_nome) VALUES (33, 'Rio de Janeiro');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (41,	'Curitiba');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (33,	'Arraial do Cabo');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (24,	'Natal');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (35,	'Campos do Jordão');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (31,	'Belo Horizonte');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (33,	'Angra dos Reis');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (23,	'Fortaleza');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (43,	'Gramado');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (26,	'Porto de Galinhas');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (26,	'Muro Alto');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (26,	'Maracaípe');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (35,	'Ribeirão Preto');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (35,	'Catanduva');
INSERT INTO cidade (estado_id, cidade_nome) VALUES (35,	'Ourinhos');

/* ==========================================       consulta cidade - uf */
SELECT estado_sigla, cidade_id, cidade_nome  
 FROM cidade c
 INNER JOIN estado e
    ON c.estado_id = e.estado_id
ORDER BY estado_sigla, cidade_nome;    

/* ==========================================       criação da tabela de clientes */
CREATE TABLE cliente
(cliente_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
 cliente_nome VARCHAR(100) NULL NOT NULL,
 cliente_data_nascimento DATE NOT NULL,
 cliente_cpf VARCHAR(14) NOT NULL UNIQUE,
 cliente_rg VARCHAR(15)  NOT NULL,
 cliente_endereco VARCHAR(100) NULL, 
 cliente_numero VARCHAR(10) NULL,
 cliente_complemento VARCHAR(50) NULL,
 cliente_bairro VARCHAR(50) NULL,
 cliente_cep VARCHAR(9) NULL,
 cliente_email VARCHAR(50) NOT NULL,
 cliente_telefone VARCHAR(14) NULL, 
 cidade_id INTEGER NOT NULL,
 FOREIGN KEY (cidade_id) REFERENCES cidade (cidade_id));

/* ==========================================       inserção de clientes */ 
INSERT INTO cliente (cliente_nome, cliente_data_nascimento, cliente_cpf, cliente_rg, cliente_endereco, cliente_numero, cliente_complemento, cliente_bairro, cliente_cep, cidade_id, cliente_email, cliente_telefone) 
VALUES
("Daniela Cabrera", "1978-03-21", "522.556.555-16", "2536252414", "Av. Miguel Calil", 122, "", "Jardim Paraíso", "15810-085", 14, "daniela@gmail.com", "(17)44411-6558");

INSERT INTO cliente (cliente_nome, cliente_data_nascimento, cliente_cpf, cliente_rg, cliente_endereco, cliente_numero, cliente_complemento, cliente_bairro, cliente_cep, cidade_id, cliente_email, cliente_telefone) 
VALUES
("Juliana Trench", "1998-12-25", "111.222.333-44", "84512069", "Rua Amazonas", 135, "", "Parque dos Ipês", "15810-085", 14, "juliana@gmail.com", "(17)98989-6958");

INSERT INTO cliente (cliente_nome, cliente_data_nascimento, cliente_cpf, cliente_rg, cliente_endereco, cliente_numero, cliente_complemento, cliente_bairro, cliente_cep, cidade_id, cliente_email, cliente_telefone) 
VALUES
("Eliza Pimentel Pereira", "1999-09-29", "111.111.111-11", "4815265948", "Av. José Nelson Machado", 528, "", "Vila Sotto", "15810-085", 14, "eliza@gmail.com", "(81)98555-5869");

INSERT INTO cliente (cliente_nome, cliente_data_nascimento, cliente_cpf, cliente_rg, cliente_endereco, cliente_numero, cliente_complemento, cliente_bairro, cliente_cep, cidade_id, cliente_email, cliente_telefone) 
VALUES
("Raquel Santos da Silva", "1998-07-04", "999.888.777-66", "415263748", "Praça Nove Julho", 633, "", "Agudo Romão", "25365-005", 1, "raquel@gmail.com", "(31)98999-4321");

INSERT INTO cliente (cliente_nome, cliente_data_nascimento, cliente_cpf, cliente_rg, cliente_endereco, cliente_numero, cliente_complemento, cliente_bairro, cliente_cep, cidade_id, cliente_email, cliente_telefone) 
VALUES
("Barbara Rafaela Capatto Cortez", "1999-01-15", "555.666.777-88", "874521365", "Av. Holambra", 101, "", "Cidade Jardiom", "45855-444", 15, "barbara@gmail.com", "(16)98847-1234");

INSERT INTO cliente (cliente_nome, cliente_data_nascimento, cliente_cpf, cliente_rg, cliente_endereco, cliente_numero, cliente_complemento, cliente_bairro, cliente_cep, cidade_id, cliente_email, cliente_telefone) 
VALUES
("Carolina Zampieri Rodrigues", "2000-04-05", "585.585.585-85", "9555847", "Rua Sergipe", 167, "Apto. 11", "Centro", "05458-144", 13, "carol@gmail.com", "(11)98888-8547");

/* ==========================================       seleção de clientes por cidade */
SELECT c.cliente_nome, cc.cidade_nome
FROM cliente c INNER JOIN cidade cc
  ON c.cidade_id = cc.cidade_id
ORDER BY c.cliente_nome, cc.cidade_nome;

/* ==========================================       criação dos tipos de hospedagem */
CREATE TABLE hospedagem_tipo
(hospedagem_tipo_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
 hospedagem_tipo_nome VARCHAR(50) NOT NULL UNIQUE);

/* ==========================================       inserção de tipos de hospedagem */
INSERT INTO hospedagem_tipo (hospedagem_tipo_nome) VALUES ("Hotel");
INSERT INTO hospedagem_tipo (hospedagem_tipo_nome) VALUES ("Pousada");
INSERT INTO hospedagem_tipo (hospedagem_tipo_nome) VALUES ("Hostel");

/* ==========================================       seleção de tipos de hospedagem */
SELECT * FROM hospedagem_tipo ORDER BY hospedagem_tipo_nome;

/* ==========================================       criação de hospedagens */
CREATE TABLE hospedagem
(hospedagem_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
 hospedagem_nome VARCHAR(100) NOT NULL,
 hospedagem_cnpj VARCHAR(18) NOT NULL UNIQUE,
 hospedagem_ie VARCHAR(15) NOT NULL, 
 hospedagem_endereco VARCHAR(100) NOT NULL,
 hospedagem_nro VARCHAR(10) NOT NULL,
 hospedagem_complemento VARCHAR(50) NOT NULL,
 hospedagem_bairro VARCHAR(50) NOT NULL,
 hospedagem_cep VARCHAR(50) NOT NULL ,
 hospedagem_telefone VARCHAR(50) NOT NULL,
 hospedagem_site VARCHAR(50) NOT NULL,
 hospedagem_email VARCHAR(50) NOT NULL,
 cidade_id INTEGER NOT NULL, 
 tipo_id INTEGER NOT NULL,
 FOREIGN KEY (cidade_id) REFERENCES cidade (cidade_id),
 FOREIGN KEY (tipo_id) REFERENCES hospedagem_tipo (hospedagem_tipo_id));

/* ==========================================       inserção de hospedagens */ 
INSERT INTO hospedagem (hospedagem_nome, hospedagem_cnpj, hospedagem_ie,  hospedagem_endereco, hospedagem_nro, hospedagem_complemento, hospedagem_bairro, hospedagem_cep, hospedagem_telefone, hospedagem_site, hospedagem_email, cidade_id,  tipo_id)
VALUES
("Hotel da Vila", "55.444.555/0001-01","152.152.152.152", "Avenida da Vila", 560, "", "Praia",  60060-292, "(51)3333-4458", "www.hoteldavila.nossoprojeto.com.br", "contato@nossoprojeto.com.br", 8 , 1);

INSERT INTO hospedagem (hospedagem_nome, hospedagem_cnpj, hospedagem_ie,  hospedagem_endereco, hospedagem_nro, hospedagem_complemento, hospedagem_bairro, hospedagem_cep, hospedagem_telefone, hospedagem_site, hospedagem_email, cidade_id,  tipo_id)
VALUES
("Gran Hotel", "66.777.888/0001-23","521.521.521.521", "Avenida do Areião", 1500, "", "Vila Rica",  60060-295, "(51)3333-8874", "www.granbeachotel.nossoprojeto.com.br", "granbeachotel@nossoprojeto.com.br", 8 , 1);

INSERT INTO hospedagem (hospedagem_nome, hospedagem_cnpj, hospedagem_ie,  hospedagem_endereco, hospedagem_nro, hospedagem_complemento, hospedagem_bairro, hospedagem_cep, hospedagem_telefone, hospedagem_site, hospedagem_email, cidade_id,  tipo_id)
VALUES
("Beach Park", "55.444.555/0001-02","656.656.566.655", "Rua dos Morros", 133, "", "Praia",  55525-111, "(21)4848-8484", "www.beachlindo.nossoprojeto.com.br", "beachlindo@nossoprojeto.com.br", 1 , 1);

INSERT INTO hospedagem (hospedagem_nome, hospedagem_cnpj, hospedagem_ie,  hospedagem_endereco, hospedagem_nro, hospedagem_complemento, hospedagem_bairro, hospedagem_cep, hospedagem_telefone, hospedagem_site, hospedagem_email, cidade_id,  tipo_id)
VALUES
("Sky Gramado", "55.444.555/0001-03","452.452.452.452", "Rua das Rodas", 145, "", "Centro",  95670-000, "(18)4141-4141", "www.sky.nossoprojeto.com.br", "sky@nossoprojeto.com.br", 9 , 1);

/* ==========================================       seleção hospedagem por cidade */
SELECT cidade_nome, hospedagem_nome, hospedagem_telefone, hospedagem_email, hospedagem_site 
FROM hospedagem h 
INNER JOIN cidade c
   ON h.cidade_id = c.cidade_id
ORDER BY cidade_nome, hospedagem_nome;    

/* ==========================================       criação cliente x hospedagem */
CREATE TABLE cliente_hospedagem
(cliente_hospedagem_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
 cliente_id INTEGER NOT NULL,
 hospedagem_id INTEGER NOT NULL,
 data_reserva date,
 data_entrada date,
 data_saida date,
 quantidade_adultos INTEGER NOT NULL,
 quantidade_criancas INTEGER NOT NULL,
 valor_diaria DOUBLE NOT NULL,
 valor_total DOUBLE NOT NULL,
 FOREIGN KEY (cliente_id) REFERENCES cliente (cliente_id),
 FOREIGN KEY (hospedagem_id) REFERENCES hospedagem (hospedagem_id));    
    
/* ==========================================       inserção cliente x hospedagem */

INSERT INTO cliente_hospedagem (cliente_id, hospedagem_id, data_reserva, data_entrada, data_saida, quantidade_adultos, quantidade_criancas, valor_diaria, valor_total)
VALUES
(1, 1, "2022-09-15", "2022-12-25", "2023-01-05", 2, 1, 100.00 , 1000.00);

INSERT INTO cliente_hospedagem (cliente_id, hospedagem_id, data_reserva, data_entrada, data_saida, quantidade_adultos, quantidade_criancas, valor_diaria, valor_total)
VALUES
(1, 4, "2022-09-15", "2023-03-15", "2023-03-20", 2, 1, 150.00 , 750.00);

INSERT INTO cliente_hospedagem (cliente_id, hospedagem_id, data_reserva, data_entrada, data_saida, quantidade_adultos, quantidade_criancas, valor_diaria, valor_total)
VALUES
(2, 2, "2022-09-15", "2023-01-01", "2023-01-15", 2, 0, 200.00 , 3000.00);

INSERT INTO cliente_hospedagem (cliente_id, hospedagem_id, data_reserva, data_entrada, data_saida, quantidade_adultos, quantidade_criancas, valor_diaria, valor_total)
VALUES
(3, 3, "2022-09-16", "2023-02-01", "2023-02-07", 2, 0, 100.00 , 700.00);


SELECT cliente_nome, hospedagem_nome, data_reserva, data_entrada, data_saida
FROM cliente_hospedagem ch 
INNER JOIN cliente c
ON ch.cliente_id = c.cliente_id  
INNER JOIN hospedagem h
 ON ch.hospedagem_id = h.hospedagem_id
ORDER BY cliente_nome, data_reserva;

