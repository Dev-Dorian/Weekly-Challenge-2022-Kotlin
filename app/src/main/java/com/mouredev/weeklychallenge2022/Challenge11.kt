package com.mouredev.weeklychallenge2022

/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Fecha publicación enunciado: 14/03/22
 * Fecha publicación resolución: 21/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

function cadena (str1, str2) {
    let str1List = new Set(str1)
    let str2List = new Set(str2)

    let out1 = ''
    let out2 = ''

    str1List.forEach(element => {
        if (!str2List.has(element)) {
            out1 += element
        }
    })
    console.log(out1);

    str2List.forEach(element => {
        if (!str1List.has(element)) {
            out2 += element
        }
    })
    console.log(out2);
}

cadena('holar','holag')