const formulario  = document.getElementById("form");
const headers = {
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin' : '*',
    'Access-Control-Allow-Methods': 'DELETE, POST, GET, OPTIONS',
    'Access-Control-Allow-Headers' : 'Content-Type, Authorization, X-Requested-With'
};


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
    let colunas = ["Cliente","Cidade","Hospedagem","Estado","Diarias"];
    //let colunas = ["clienteNome","cidadeNome","hospedagemNome","estadoNome","dias"];
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
    th.innerHTML = colunas[i];
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
