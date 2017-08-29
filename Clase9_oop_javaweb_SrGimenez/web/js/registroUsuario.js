PET = {};
PET.altaUsuario = function(){
    //alert("Dando de Alta un Registro de Usuario.!!!");
    /** Selectores de CSS
     * https://www.w3schools.com/cssref/css_selectors.asp */
    var losInput = 
        document.querySelectorAll("#form_registro_usuario input");
//        document.querySelectorAll(
//          "#form_registro_usuario input[type=text], "
//        + "#form_registro_usuario input[type=password] ");
    var panelOK = document.querySelector("#panelOK");
    var panelERROR = document.querySelector("#panelERROR");
    for( var indice = 0; indice < losInput.length ; indice++ ){
        losInput[indice].nombre = losInput[indice].name;
        losInput[indice].valor  = losInput[indice].value;
    }
    
    var xhr = new XMLHttpRequest();
    xhr.open('POST','./RegistrarUsuario');
    xhr.onreadystatechange = function(){
        if( xhr.readyState === 4 ){
            if( xhr.status === 200 ){
                panelOK.innerHTML = xhr.responseText;
            }else {
                panelERROR.innerHTML = "error::: " 
                        + xhr.status + "::" 
                        + xhr.statusText ;
            }
        }
    };
    xhr.send( JSON.stringify( losInput ) );
    //panelOK.innerHTML = JSON.stringify( losInput );
    
    //panelERROR.innerHTML = JSON.stringify( losInput );
};
//alert("Estoy queriendo dar de alta usuarios!");
