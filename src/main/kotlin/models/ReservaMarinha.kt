package models

import ConservacaoMarinha
import enums.TipoAmbienteMarinho

data class ReservaMarinha(
    val tipoReserva: String,
    override val tipoAmbiente: TipoAmbienteMarinho,
    override val areaProtegidaEmKm2: Double,
    override val possuiProgramaMonitoramento: Boolean
) : ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento)