
![GitHub repo size](https://img.shields.io/github/repo-size/raquelsscode/Girls-Tech-Power?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/raquelsscode/Girls-Tech-Power?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/raquelsscode/Girls-Tech-Power?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/raquelsscode/Girls-Tech-Power?style=for-the-badge)

# Consultoria Cravo & Canela

Projeto de uma consultoria de turismo fictícia chamada Cravo&Canela, com o objetivo de construir uma nova plataforma com uma API para gerenciar transações. O sistema permite cadastrar, listar, atualizar e deletar clientes.

<img style="display: block; margin-left: auto; margin-right: auto;" src="https://i.postimg.cc/2jGHZNYs/capa-github.jpg" alt=""/><br><br/>

> Status do Projeto: Em desenvolvimento :warning:

---


## Funcionalidades 📄

- [x]  Cadastrar
- [x]  Listar
- [x]  Atualizar
- [x]  Deletar
- [x]  Histórico de Reservas

---

## Demonstração 🎨

O layout da aplicação está disponível no Figma:
[Cravo&Canela Consultoria](https://www.figma.com/proto/tlQ5tutvgwqbW5jTcfpYsQ/Consultoria-Cravo%26Canela?node-id=3%3A105&scaling=scale-down&page-id=2%3A2&starting-point-node-id=69%3A2105)

---

## Stack utilizada 🛠

**Front-end:** CSS, HTML, JavaScript

**Back-end:** Java, SpringBoot, AWS

---

## Documentação da API

<details><summary><strong><h3>Clientes</strong></h3></summary>


<details>
<summary><strong>Retorna todos os clientes</strong></summary>

```http
  GET /cliente
```
</details>

<details>

<summary><strong>Retorna um cliente</strong></summary>

```http
  GET /cliente/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cliente_id`      | `number` | **Obrigatório**. O ID do item que você quer |

</details>

<details>

<summary><strong>Cadastra um novo cliente</strong></summary>

```http
  POST /cliente
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cliente_nome`      | `string` | **Obrigatório**. O nome do cliente|
| `cliente_data_nascimento`      | `date` | **Obrigatório**. A data de nascimento do cliente |
| `cliente_cpf`      | `string` | **Obrigatório**. O CPF do cliente |
| `cliente_rg`      | `string` | **Obrigatório**. O RG do cliente|
| `cliente_endereco`      | `string` | **Opcional**. O endereco do cliente |
| `cliente_numero`      | `string` | **Opcional**. O numero do endereco do cliente |
| `cliente_complemento`      | `string` | **Opcional**. O complemento do endereco do cliente |
| `cliente_bairro`      | `string` | **Opcional**. O bairro do cliente |
| `cliente_cep`      | `string` | **Opcional**. O CEP do cliente |
| `cliente_email`      | `string` | **Obrigatório**. O email do cliente |
| `cliente_telefone`      | `string` | **Opcional**. O telefone do cliente |

</details>

<details>

<summary><strong>Atualizar Cliente</strong></summary>

```http
  PUT /cliente/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cliente_nome`      | `string` | **Obrigatório**. O nome do cliente|
| `cliente_data_nascimento`      | `date` | **Obrigatório**. A data de nascimento do cliente |
| `cliente_cpf`      | `string` | **Obrigatório**. O CPF do cliente |
| `cliente_rg`      | `string` | **Obrigatório**. O RG do cliente|
| `cliente_endereco`      | `string` | **Opcional**. O endereco do cliente |
| `cliente_numero`      | `string` | **Opcional**. O numero do endereco do cliente |
| `cliente_complemento`      | `string` | **Opcional**. O complemento do endereco do cliente |
| `cliente_bairro`      | `string` | **Opcional**. O bairro do cliente |
| `cliente_cep`      | `string` | **Opcional**. O CEP do cliente |
| `cliente_email`      | `string` | **Obrigatório**. O email do cliente |
| `cliente_telefone`      | `string` | **Opcional**. O telefone do cliente |

</details>

<details>

<summary><strong>Deletar cliente</strong></summary>

```http
  DELETE /cliente/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cliente_id`      | `number` | **Obrigatório**. O ID do item que você quer deletar |

</details>

</details>

<details><summary><strong><h3>Cidades</strong></h3></summary>

<details>
<summary><strong>Retorna todas as cidades</strong></summary>

```http
  GET /cidade
```
</details>

<details>

<summary><strong>Retorna uma cidade</strong></summary>

```http
  GET /cidade/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cidade_id`      | `number` | **Obrigatório**. O ID do item que você quer |

</details>

<details>

<summary><strong>Cadastra uma nova cidade</strong></summary>

```http
  POST /cidade
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cidade_nome`      | `string` | **Obrigatório**. O nome da cidade|

</details>

<details>
<summary><strong>Atualiza Cidade</strong></summary>

```http
  PUT /cidade/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cidade_nome`      | `string` | **Obrigatório**. O nome do cidade|

</details>

<details>
<summary><strong>Deletar cidade</strong></summary>

```http
  DELETE /clientes/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cidade_id`      | `number` | **Obrigatório**. O ID do item que você quer deletar |

</details>
</details>

<details><summary><strong><h3>ClienteHospedagem</strong></h3></summary>


<details>
<summary><strong>Retorna todas as hospedagens de Clientes</strong></summary>

```http
  GET /clienteHospedagem
```
</details>

<details>

<summary><strong>Retorna uma hospedagem de Cliente</strong></summary>

```http
  GET /clienteHospedagem/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cliente_hospedagem_id`      | `number` | **Obrigatório**. O ID do item que você quer |

</details>

<details>

<summary><strong>Cadastra uma nova hospedagem de cliente</strong></summary>

```http
  POST /clienteHospedagem
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `data_reserva`      | `Date` | **Opcional**. A data da reserva|
| `data_entrada`      | `Date` | **Opcional**. A data de entrada na hospedagem |
| `data_saida`      | `Date` | **Opcional**. A data de saída do cliente |
| `quantidade_adultos`      | `number` | **Obrigatório**. numero de clientes adultos|
| `quantidade_criancas`      | `number` | **Obrigatório**. Numero de clientes crinaças |
| `valor_diaria`      | `number` | **Obrigatório**. valor da diária |
| `valor_total`      | `number` | **Obrigatório**. valor total da diaria |

</details>

<details>

<summary><strong>Atualizar hospedagem de Cliente</strong></summary>

```http
  PUT /clienteHospedagem/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `data_reserva`      | `Date` | **Opcional**. A data da reserva|
| `data_entrada`      | `Date` | **Opcional**. A data de entrada na hospedagem |
| `data_saida`      | `Date` | **Opcional**. A data de saída do cliente |
| `quantidade_adultos`      | `number` | **Obrigatório**. numero de clientes adultos|
| `quantidade_criancas`      | `number` | **Obrigatório**. Numero de clientes crinaças |
| `valor_diaria`      | `number` | **Obrigatório**. valor da diária |
| `valor_total`      | `number` | **Obrigatório**. valor total da diaria |

</details>

<details>

<summary><strong>Deletar hospedagem de cliente</strong></summary>

```http
  DELETE /clienteHospedagem/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cliente_hospedagem_id`      | `number` | **Obrigatório**. O ID do item que você quer deletar |

</details>

</details>

<details><summary><strong><h3>Estado</strong></h3></summary>


<details>
<summary><strong>Retorna todos os estados</strong></summary>

```http
  GET /estado
```
</details>

<details>

<summary><strong>Retorna um estado</strong></summary>

```http
  GET /estado/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `estado_id`      | `number` | **Obrigatório**. O ID do item que você quer |

</details>

<details>

<summary><strong>Cadastra um novo estado</strong></summary>

```http
  POST /estado
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `estado_nome`      | `string` | **Obrigatório**. O nome do estado|
| `estado_sigla`      | `string` | **Obrigatório**. A sigla do estado|

</details>

<details>

<summary><strong>Atualizar estado</strong></summary>

```http
  PUT /estado/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `estado_nome`      | `string` | **Obrigatório**. O nome do estado|
| `estado_sigla`      | `string` | **Obrigatório**. A sigla do estado|

</details>

<details>

<summary><strong>Deletar estado</strong></summary>

```http
  DELETE /estado/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `estado_id`      | `number` | **Obrigatório**. O ID do item que você quer deletar |

</details>

</details>

<details><summary><strong><h3>Hospedagem</strong></h3></summary>


<details>
<summary><strong>Retorna todas as hospedagens</strong></summary>

```http
  GET /hospedagem
```
</details>

<details>

<summary><strong>Retorna uma hospedagem</strong></summary>

```http
  GET /hospedagem/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `hospedagem_id`      | `number` | **Obrigatório**. O ID do item que você quer |

</details>

<details>

<summary><strong>Cadastra uma nova hospedagem</strong></summary>

```http
  POST /hospedagem
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `hospedagem_nome`      | `string` | **Obrigatório**. O nome da hospedagem|
| `hospedagem_cnpj`      | `string` | **Obrigatório**. O CNPJ da hospedagem|
| `hospedagem_ie`      | `string` | **Obrigatório**. A Inscrição Estadual da hospedagem |
| `hospedagem_endereco`      | `string` | **Opcional**. Endereço da hospedagem|
| `hospedagem_nro`      | `string` | **Opcional**. Numero da hospedagem |
| `hospedagem_complemento`      | `string` | **Opcional**. Complemento hospedagem |
| `hospedagem_bairro`      | `string` | **Opcional**. Bairro que se localiza a hospedagem |
| `hospedagem_cep`      | `string` | **Opcional**. CEP da Hospedagem |
| `hospedagem_email`      | `string` | **Opcional**. Email da hospedagem |
| `hospedagem_telefone`      | `string` | **Opcional**. Telefone da Hospedagem |

</details>

<details>

<summary><strong>Atualizar hospedagem</strong></summary>

```http
  PUT /hospedagem/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `hospedagem_nome`      | `string` | **Obrigatório**. O nome da hospedagem|
| `hospedagem_cnpj`      | `string` | **Obrigatório**. O CNPJ da hospedagem|
| `hospedagem_ie`      | `string` | **Obrigatório**. A Inscrição Estadual da hospedagem |
| `hospedagem_endereco`      | `string` | **Opcional**. Endereço da hospedagem|
| `hospedagem_nro`      | `string` | **Opcional**. Numero da hospedagem |
| `hospedagem_complemento`      | `string` | **Opcional**. Complemento hospedagem |
| `hospedagem_bairro`      | `string` | **Opcional**. Bairro que se localiza a hospedagem |
| `hospedagem_cep`      | `string` | **Opcional**. CEP da Hospedagem |
| `hospedagem_email`      | `string` | **Opcional**. Email da hospedagem |
| `hospedagem_telefone`      | `string` | **Opcional**. Telefone da Hospedagem |

</details>

<details>

<summary><strong>Deletar hospedagem</strong></summary>

```http
  DELETE /hospedagem/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `hospedagem_id`      | `number` | **Obrigatório**. O ID do item que você quer deletar |

</details>

</details>

<details><summary><strong><h3>Tipo de Hospedagem</strong></h3></summary>


<details>
<summary><strong>Retorna todos os tipos de hospedagens</strong></summary>

```http
  GET /hospedagemTipo
```
</details>

<details>

<summary><strong>Retorna um tipo de hospedagem</strong></summary>

```http
  GET /hospedagemTipo/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `hospedagem_tipo_id`      | `number` | **Obrigatório**. O ID do item que você quer |

</details>

<details>

<summary><strong>Cadastra um novo tipo de hospedagem</strong></summary>

```http
  POST /hospedagemTipo
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `hospedagem_tipo_nome`      | `string` | **Obrigatório** **Unico**. O tipo de Hospedagem|

</details>

<details>

<summary><strong>Atualizar tipo de hospedagem</strong></summary>

```http
  PUT /hospedagemTipo/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `hospedagem_tipo_nome`      | `string` | **Obrigatório** **Unico**. O tipo de Hospedagem|


</details>

<details>

<summary><strong>Deletar tipo de hospedagem</strong></summary>

```http
  DELETE /hospedagemTipo/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `hospedagem_tipo_id`      | `number` | **Obrigatório**. O ID do item que você quer deletar |

</details>

</details>

<details><summary><strong><h3>País</strong></h3></summary>


<details>
<summary><strong>Retorna todos os paises</strong></summary>

```http
  GET /pais
```
</details>

<details>

<summary><strong>Retorna um país</strong></summary>

```http
  GET /pais/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `pais_id`      | `number` | **Obrigatório**. O ID do item que você quer |

</details>

<details>

<summary><strong>Cadastra um novo pais</strong></summary>

```http
  POST /pais
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `pais_nome`      | `string` | **Obrigatório** **Unico**. O nome do país|

</details>

<details>

<summary><strong>Atualizar país/strong></summary>

```http
  PUT /paiso/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `pais_nome`      | `string` | **Obrigatório** **Unico**. O nome do país|


</details>

<details>

<summary><strong>Deletar país</strong></summary>

```http
  DELETE /país/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `pais_id`      | `number` | **Obrigatório**. O ID do item que você quer deletar |

</details>

</details>

<details><summary><strong><h3>Reservas de Clientes</strong></h3></summary>


<details>
<summary><strong>Retorna todas as reservas</strong></summary>

```http
  GET /reservasclientes
```
</details>

<details>

<summary><strong>Retorna uma reserva</strong></summary>

```http
  GET /reservasclientes/{nome}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cliente_nome`      | `number` | **Obrigatório**. O nome do cliente que voce quer buscar a reserva |

</details>

</details>



---

## Instalação 📂

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Java](https://www.java.com/pt-BR/).

Além disto é bom ter um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/) ou [Eclipse](https://www.eclipse.org/downloads/)

```bash
# Clone este repositório
$ git clone git@github.com:raquelsscode/Girls-Tech-Power.git

# Acesse a pasta do projeto no terminal/cmd
$ cd Girls-Tech-Power

# Iniciar API no Eclipse
```
---

## Autoras 👥

- [Barbara Cortez](https://github.com/Barbaraccortez)
- [Carolina Zampieri](https://github.com/Carolina-Zampieri)
- [Daniela Cabrera](https://github.com/danielacabrera2103)
- [Juliana Abumansur](https://github.com/jtabumansur)
- [Raquel Santos](https://github.com/raquelsscode)
