
# Consultoria Cravo & Canela

Projeto de uma consultoria de turismo fictícia chamada Cravo&Canela, com o objetivo de construir uma nova plataforma com uma API para gerenciar transações. O sistema permite cadastrar, listar, atualizar e deletar clientes.

> Status do Projeto: Em desenvolvimento :warning:

---


## Funcionalidades 📄

- [ ]  Cadastrar Clientes
- [ ]  Listar Clientes
- [ ]  Atualizar Clientes
- [ ]  Deletar Clientes
- [ ]  Histórico de Clientes

---

## Demonstração 🎨

O layout da aplicação está disponível no Figma:
[Cravo&Canela Consultoria](https://www.figma.com/proto/tlQ5tutvgwqbW5jTcfpYsQ/Consultoria-Cravo%26Canela?node-id=3%3A105&scaling=scale-down&page-id=2%3A2&starting-point-node-id=69%3A2105)

---

## Stack utilizada 🛠

**Front-end:** CSS

**Back-end:** Java, SpringBoot, AWS

---

## Documentação da API

#### Retorna todos os clientes

```http
  GET /cliente
```

#### Retorna um cliente

```http
  GET /cliente/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cliente_id`      | `number` | **Obrigatório**. O ID do item que você quer |

#### Cadastra um novo cliente

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

#### Atualizar Cliente

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


#### Deletar cliente

```http
  DELETE /clientes/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cliente_id`      | `number` | **Obrigatório**. O ID do item que você quer deletar |

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
```

---

## Autoras 👥

- [Barbara Cortez](https://github.com/Barbaraccortez)
- [Carolina Zampieri](https://github.com/Carolina-Zampieri)
- [Daniela Cabrera](https://github.com/danielacabrera2103)
- [Juliana Abumansur](https://github.com/jtabumansur)
- [Raquel Santos](https://github.com/raquelsscode)
