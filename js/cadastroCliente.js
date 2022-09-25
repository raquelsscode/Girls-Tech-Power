//
//DADOS FORMULARIO
//

const formulario  = document.getElementById("form");
const Inome = document.getElementById("nome");
const Iemail = document.getElementById("email");
const Isobrenome = document.getElementById("sobrenome");
const Idatanascimento = document.getElementById("datanascimento");
const Icpf = document.getElementById("cpf");
const Irg = document.getElementById("rg");
const InumeroCasa = document.getElementById("numeroCasa");
const Icomplemento = document.getElementById("complemento");
const Itelefone = document.getElementById("telefone");
const Icep = document.getElementById("cep");
const Ibairro = document.getElementById("bairro");
const Iendereco = document.getElementById("endereco");


//
//API CEP
//
function consultarCep() {
    const Icpf = document.getElementById("cep").value.replace(/\D/g, '');
    var url = 'https://viacep.com.br/ws/' + Icpf + '/json/';
    const request = new XMLHttpRequest()

    var options = {
        method: "GET",
        mode: "cors",
        headers: {
            'content-type': 'application/json;charset=utf-8',
            'Access-Control-Allow-Origin': '*'
        }
    }   
  
    fetch(url, options).then(response => {
        return response.json();
    })
        .then(data => {
            atribuirCampos(data);
        })
        .catch(() => document.getElementById('return').innerHTML = 'API offline ou CEP incorreto');

    function atribuirCampos(data) {
        Iendereco.value = data.logradouro;
        Ibairro.value =  data.bairro;        
    }
}

//
//CADASTRO DE CLIENTES
//

function cadastrar(){         
    var url ="http://localhost:8080/cliente";
    var options = {
        method: "POST",
        headers: {
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin' : '*',
            'Access-Control-Allow-Methods': 'DELETE, POST, GET, OPTIONS',
            'Access-Control-Allow-Headers' : 'Content-Type, Authorization, X-Requested-With'
        },
        body: dadosFormulario()
    }   

    fetch(url,options)  
    .then(function(res){console.log(res)})
    .catch(function(res){console.log(res)})
};

function dadosFormulario(){
    return JSON.stringify({
        clienteNome : Inome.value + ' ' + Isobrenome.value,
        clienteDataNascimento : Idatanascimento.value,
        clienteCpf : Icpf.value,
        clienteRg : Irg.value,
        clienteEndereco : Iendereco.value ,
        clienteNumero : InumeroCasa.value,
        clienteComplemento : Icomplemento.value ,
        clienteBairro : Ibairro.value ,
        clienteCep : Icep.value ,
        clienteEmail : Iemail.value,
        clienteTelefone : Itelefone.value,
        //Esse cidade devera sair assim que alterarmos o banco
        cidade : {
            cidadeId : 1
        }
        
    })  
       
}

formulario.addEventListener('submit', function(event){
  cadastrar();
  formulario.reset();

})
 

