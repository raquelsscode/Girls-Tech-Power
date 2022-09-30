const formulario  = document.getElementById("form");
const headers = {
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin' : '*',
    'Access-Control-Allow-Methods': 'DELETE, POST, GET, OPTIONS',
    'Access-Control-Allow-Headers' : 'Content-Type, Authorization, X-Requested-With'
};


const data = [
    {
        "clienteReserva": 1,
        "clienteId": 1,
        "clienteNome": "Daniela Cabrera",
        "cidadeNome": "Fortaleza",
        "estadoSigla": "CE",
        "hospedagemNome": "Hotel da Vila",
        "dataSaida": "2023-01-05T03:00:00.000+00:00",
        "dataReserva": "2022-09-15T03:00:00.000+00:00",
        "dataEntrada": "2022-12-25T03:00:00.000+00:00",
        "quantidadeAdultos": 2,
        "quantidadeCriancas": 1,
        "valorDiaria": 100.0,
        "dias": 11,
        "total": 1100.0
    },
    {
        "clienteReserva": 2,
        "clienteId": 1,
        "clienteNome": "Daniela Cabrera",
        "cidadeNome": "Gramado",
        "estadoSigla": "RS",
        "hospedagemNome": "Sky Gramado",
        "dataSaida": "2023-03-20T03:00:00.000+00:00",
        "dataReserva": "2022-09-15T03:00:00.000+00:00",
        "dataEntrada": "2023-03-15T03:00:00.000+00:00",
        "quantidadeAdultos": 2,
        "quantidadeCriancas": 1,
        "valorDiaria": 150.0,
        "dias": 5,
        "total": 750.0
    },
    {
        "clienteReserva": 3,
        "clienteId": 2,
        "clienteNome": "Juliana Trench",
        "cidadeNome": "Fortaleza",
        "estadoSigla": "CE",
        "hospedagemNome": "Gran Hotel",
        "dataSaida": "2023-01-15T03:00:00.000+00:00",
        "dataReserva": "2022-09-15T03:00:00.000+00:00",
        "dataEntrada": "2023-01-01T03:00:00.000+00:00",
        "quantidadeAdultos": 2,
        "quantidadeCriancas": 0,
        "valorDiaria": 200.0,
        "dias": 14,
        "total": 2800.0
    },
    {
        "clienteReserva": 4,
        "clienteId": 3,
        "clienteNome": "Eliza Pimentel Pereira",
        "cidadeNome": "Rio de Janeiro",
        "estadoSigla": "RJ",
        "hospedagemNome": "Beach Park",
        "dataSaida": "2023-02-07T03:00:00.000+00:00",
        "dataReserva": "2022-09-16T03:00:00.000+00:00",
        "dataEntrada": "2023-02-01T03:00:00.000+00:00",
        "quantidadeAdultos": 2,
        "quantidadeCriancas": 0,
        "valorDiaria": 100.0,
        "dias": 6,
        "total": 600.0
    }
];


formulario.addEventListener('submit', function(event){     
    //buscarReservas();    
    addRows(data);

})

function limparCampos(){
    table.destroy();
    formulario.reset();
}


function buscarReservas(){
    
    const Inome = document.getElementById("nome");
    //TODO implementar os outros filtros , por hora deixamos somente nome
    var url ="http://localhost:8080/reservasclientes/"+Inome.value;
    var options = {
        method: "GET",
        mode: "cors",
        headers: headers
    }     
    fetch(url, options).then(response => {
        return response.json();
    })
        .then(data => {
            addRows(data);
        })
        .catch(function(res){console.log(res);})
    
}


function addRows(data){ 
    debugger;
    const dado = data;
	let col = [];
    let colunas = ["clienteNome","cidadeNome","hospedagemNome","estadoNome","dias"];
    for (let i = 0; i < dado.length; i++) {
      for (let key in dado[i]) {
        if(key == "clienteNome"|| key == "cidadeNome" || key == "hospedagemNome" || key == "estadoNome" || key == "dias"){
        if (col.indexOf(key) === -1) {
          col.push(key);
        }
    }
      }
    }
    // Create table.
    
    const table = document.createElement("table");
    
    // Create table header row using the extracted headers above.
    let tr = table.insertRow(-1);                   // table row.

    for (let i = 0; i < col.length; i++) {
    let th = document.createElement("th");      // table header.
    th.innerHTML = col[i];
    tr.appendChild(th);
    }


    // add json data to the table as rows.
    for (let i = 0; i < colunas.length; i++) {

    tr = table.insertRow(-1);

    for (let j = 0; j < col.length; j++) {
    let tabCell = tr.insertCell(-1);
    tabCell.innerHTML = dado[i][col[j]];
    }

    // Now, add the newly created table with json data, to a container.
    const divShowData = document.getElementById('showData');
    divShowData.innerHTML = "";
    divShowData.appendChild(table);

    }
}
