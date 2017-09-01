JUEGO = {};
JUEGO.hacerPedido = function(){    
    //alert( "Estoy Haciendo un Pedido" );
    var xhr = new XMLHttpRequest();
    xhr.open( "POST", "VideoJuego" );
    xhr.onreadystatechange = function(){
        if( xhr.readyState === 4 ){
            if( xhr.status === 200 ){
                var elPanelOK = document.querySelector('#panelOK');
                elPanelOK.innerHTML = xhr.responseText;
            }else{
                var elPanelERROR = document.querySelector('#panelERROR');
                elPanelERROR.innerHTML = xhr.responseText;
            }
        }
    };
    xhr.send();
};
//alert( "El Javascript Esta Funcionando !!!!!! " );

