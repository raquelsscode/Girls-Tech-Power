const formulario  = document.querySelector("form");
const Inome = document.getElementById("nome");
const Iemail = document.getElementById("email");
const Isobrenome = document.getElementById("sobrenome");
const Idatanascimento = document.getElementById("datanascimento");
const Icpf = document.getElementById("cpf");
const Irg = document.getElementById("rg");
const Iendereco = document.getElementById("endereco");
const InumeroCasa = document.getElementById("numeroCasa");
const Icomplemento = document.getElementById("complemento");
const Ibairro = document.getElementById("bairro");
const Icep = document.getElementById("cep");
const Itelefone = document.getElementById("telefone");


function cadastrar(){
    debugger;
    fetch("http://localhost:8080/cliente",
    {
        headers: {
            // 'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin' : '*',
            'Access-Control-Allow-Methods': 'DELETE, POST, GET, OPTIONS',
            'Access-Control-Allow-Headers' : 'Content-Type, Authorization, X-Requested-With'
        },
        method: "POST",
        body: JSON.stringify({
            clienteNome : data.get('nome') + ' ' + data.get('sobrenome'),
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
                cidadeId : 1
            }
            
        })
    })
    .then(function(res){console.log(res)})
    .catch(function(res){console.log(res)})
};


formulario.addEventListener('submit', function(event){
  cadastrar();
  limpar();
  formulario.reset();

})
 
