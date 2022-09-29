USE databasegtp

CREATE TABLE reservas_cliente
(cliente_reserva INTEGER NOT NULL PRIMARY KEY,
 cliente_id INTEGER NOT NULL,
 cliente_nome varchar(100) NULL, 
 cidade_nome varchar(100) NULL,  
 estado_nome varchar(2) NULL,  
 hospedagem_nome varchar(100) NULL, 
 data_reserva date NULL, 
 data_entrada date NULL, 
 data_saida date NULL, 
 quantidade_adultos INTEGER NULL,
 quantidade_criancas INTEGER NULL, 
 valor_diaria double NULL,
 dias INTEGER NULL,
 total double NULL)



insert into reservas_cliente
SELECT cliente_hospedagem_id as cliente_reserva,
       ch.cliente_id, 
       c.cliente_nome, 
       cc.cidade_nome, 
       h.hospedagem_nome, 
       estado_sigla,
       ch.data_reserva, 
       ch.data_entrada, 
       ch.data_saida, 
       ch.quantidade_adultos, 
       ch.quantidade_criancas, 
       ch.valor_diaria, 
       datediff(ch.data_saida, ch.data_entrada) as dias,
       datediff(ch.data_saida, ch.data_entrada) * ch.valor_diaria as total
FROM cliente_hospedagem ch
INNER JOIN  cliente c
ON ch.cliente_id = c.cliente_id

INNER JOIN hospedagem h
ON ch.hospedagem_id  = h.hospedagem_id

INNER JOIN cidade cc 
ON h.cidade_id = cc.cidade_id 

INNER JOIN estado e
ON cc.estado_id = e.estado_id

ORDER BY c.cliente_nome, ch.data_entrada 
