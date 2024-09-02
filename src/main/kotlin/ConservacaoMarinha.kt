import enums.TipoAmbienteMarinho

open class ConservacaoMarinha(
    open val tipoAmbiente: TipoAmbienteMarinho,
    open val areaProtegidaEmKm2: Double,
    open val possuiProgramaMonitoramento: Boolean
)