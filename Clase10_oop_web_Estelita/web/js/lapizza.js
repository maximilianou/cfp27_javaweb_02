PIZZA = {};
PIZZA.pedido = function(){
    // Obtener los Parametros del Formmulario
    // Enviar los Parametros al Servidor
    var xhr = new XMLHttpRequest();
    xhr.open( "POST", "PedidoPizza");
    xhr.onreadystatechange = function(){
        if( xhr.readyState === 4){
            if( xhr.status === 200 ){
                
//document.querySelector("#panelOK").innerHTML = "Viene OK";
document.querySelector("#panelOK").innerHTML = xhr.responseText;

            }else{
                
document.querySelector("#panelERROR").innerHTML = "Viene ERROR!!";

            }
        }
    };
    // Mostrar el Resultado del Servidor en la pagina
    var losParametros = {};
    losParametros.mesa_id  = document.querySelector('#mesa_id').value;
    losParametros.mozo_id  = document.querySelector('#mozo_id').value;
    losParametros.pizza_id = document.querySelector('#pizza_id').value;
    
    xhr.send( JSON.stringify( losParametros  ) );
};









