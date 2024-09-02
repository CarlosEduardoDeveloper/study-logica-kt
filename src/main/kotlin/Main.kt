import enums.TipoAmbienteMarinho
import models.AreaProtegidaMarinha
import models.ReservaMarinha

fun main() {
    val reserva = ReservaMarinha(
        tipoReserva = "Reserva Biológica",
        tipoAmbiente = TipoAmbienteMarinho.OCEANO,
        areaProtegidaEmKm2 = 1200.0,
        possuiProgramaMonitoramento = true
    )

    val areaProtegida = AreaProtegidaMarinha(
        tipoProtecao = "Proteção Integral",
        tipoAmbiente = TipoAmbienteMarinho.RECIFE_CORAL,
        areaProtegidaEmKm2 = 500.0,
        possuiProgramaMonitoramento = false
    )

    println("Reserva: $reserva")
    println("Área protegida: $areaProtegida")
}