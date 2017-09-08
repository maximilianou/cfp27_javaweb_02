class Heladeria {
    static consultar() {
        let xhr = new XMLHttpRequest();
        xhr.open('GET', 'Gusto');
        xhr.onreadystatechange = function () {
            if (xhr.readyState === 4) {
                if (xhr.status === 200) {
                    document.querySelector('#panelResultado').innerHTML 
                            = xhr.responseText ;
                    document.querySelector('#panelOK').innerHTML 
                            = "Consultar Gustos";
                } else {

                    document.querySelector('#panelError').innerHTML 
                            = "En este panel, los errores. Por Consultar";
                }
            }
        };
        xhr.send();
    }
    static pedir() {
        let xhr = new XMLHttpRequest();
        xhr.open('POST', 'Gusto');
        xhr.onreadystatechange = function () {
            if (xhr.readyState === 4) {
                if (xhr.status === 200) {
                    document.querySelector('#panelResultado').innerHTML = xhr.responseText ;
                    document.querySelector('#panelOK').innerHTML = "Pedimos Gustos";
                } else {

                    document.querySelector('#panelError').innerHTML = "En este panel, los errores. Por Pedir";
                }
            }
        };
        xhr.send();
    }

}

