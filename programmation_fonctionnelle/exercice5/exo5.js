function carreDesNombres(nombre) {
    let chiffres = nombre.toString().split('');
    let carres = chiffres.map(chiffre => Math.pow(parseInt(chiffre), 2));
    return carres.join('');
}

let nombre = 9119;
let resultat = carreDesNombres(nombre);
console.log(resultat); 
