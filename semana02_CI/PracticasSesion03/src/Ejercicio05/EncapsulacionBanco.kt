package Ejercicio05

//Sistema de banco
//Un banco nacional desea modelar cuentas bancarias.

class CuentaBancaria (
    private val numeroCuenta : Int,
    private var saldo : Double
){

    fun getNumeroCuenta(): Int {
        return numeroCuenta
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun depositar (): String{
        return "El deposito realizado a la cuenta '$numeroCuenta' se ha completado con éxito."
    }

    fun retirar (): String{
        return "El retiro realizado a la cuenta '$numeroCuenta' se ha completado con éxito."
    }

    fun consultarSaldo(): String{
        return "El saldo en la cuenta '$numeroCuenta' es de: $$saldo."
    }
}

fun main(){
    val cuentaBancaria = CuentaBancaria(123456789, 500.0)
    println("Número de cuenta: ${cuentaBancaria.getNumeroCuenta()}")
    println("Saldo: ${cuentaBancaria.getSaldo()}")

    println(cuentaBancaria.depositar())
    println(cuentaBancaria.retirar())
    println(cuentaBancaria.consultarSaldo())
}