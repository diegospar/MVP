package com.example.mvp

class CalculoModel : CalculoContract.Model {

    override fun numAlCuadrado(num: Int?, onFinishedListener: CalculoContract.Model.OnFinishedListener) {
    if (num != null){
        val resultado= num*num
        onFinishedListener.onSucessGetNumber(resultado.toString())
    }else onFinishedListener.onFailureGetNumber("valor inválido")

    }
}