"use strict";
class Partida {
    
    static jugar(elSelector){
        let listaInput = document.querySelectorAll(elSelector);
        for( let indice = 0; indice < listaInput.length ; indice++ ){
            listaInput[indice].nombre = listaInput[indice].id;
            listaInput[indice].valor = listaInput[indice].value;
        }
        document.querySelector("#panelResultado").innerHTML = JSON.stringify(listaInput);
        document.querySelector("#panelOK").innerHTML = "Funciona con OOP, object oriented programming." ;
        document.querySelector("#panelERROR").innerHTML = "Cuidado con los Errores." ;
        
    }
    
}
