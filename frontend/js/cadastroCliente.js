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
const InumeroCasa = document.getElementById("numero");
const Icomplemento = document.getElementById("complemento");
const Itelefone = document.getElementById("telefone");
const Icep = document.getElementById("cep");
const Ibairro = document.getElementById("bairro");
const Iendereco = document.getElementById("endereco");
const Ipais = {}
const Icidade = {};
const IcidadeId ={};
const Iestado = {};

const headers = {
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin' : '*',
    'Access-Control-Allow-Methods': 'DELETE, POST, GET, OPTIONS',
    'Access-Control-Allow-Headers' : 'Content-Type, Authorization, X-Requested-With'
};

//
//API CEP
//
function consultarCep() {
    debugger;
    const Icpf = document.getElementById("cep").value.replace(/\D/g, '');
    var url = 'https://viacep.com.br/ws/' + Icpf + '/json/';
    
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
        Icidade.value = data.localidade;   
        Iestado.value =data.ibge.substring(0, 2);
        buscarCidade();
        
    }
}

//
//CADASTRO DE CLIENTES
//
formulario.addEventListener('submit', function(event){   
    debugger;  
    cadastrarCliente();
    formulario.reset();

})
 
function cadastrarCliente(){        
    debugger; 
    var url ="http://localhost:8080/cliente";
    var options = {
        method: "POST",
        headers: headers,
        body: dadosFormulario()
    }  

    fetch(url,options)  
    .then(function(res){alert("Cliente cadastrado com sucesso");})
    .catch(function(res){alert("Nao foi possivel salvar");})
    
};

function dadosFormulario(){   
    debugger;
    
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
        cidade : {
            cidadeId : IcidadeId.value
        }
        
    })  
       
}

function cadastrarCidade(){        
    debugger;   
    var url ="http://localhost:8080/cidade";
    var options = {
        method: "POST",
        headers: headers,
        body: JSON.stringify({
            cidadeNome : Icidade.value,
            estado : {
                estadoId :Iestado.value
            }
        })
    }   
    fetch(url,options)  
    .then(function(res){console.log(res)})
    .catch(function(res){console.log(res)})

    buscarCidade();
    
};

function buscarCidade(){
    debugger;
    var url ="http://localhost:8080/cidade/"+Icidade.value;
    var options = {
        method: "GET",
        mode: "cors",
        headers: headers
    }     
    fetch(url, options).then(response => {
        return response.json();
    })
        .then(data => {
            atribuirCamposCidade(data);
        })
        .catch(function(res){cadastrarCidade();})


   function atribuirCamposCidade(data){
        IcidadeId.value = data.cidadeId;
        
    }

    function exibeAlert(msg){
        alert(msg);
    }

    
    
}


