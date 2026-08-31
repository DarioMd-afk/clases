@startuml casos_uso
left to right direction

actor Cliente
actor Taquilla
actor administrador

rectangle "Sistema de Reservas" {
  usecase "Realizar Reserva"
  usecase "Cancelar Reserva"
  usecase "Registrar Ingreso"
  usecase "Reservar Sala"
  usecase "generar reportes"
}

Cliente --> "Realizar Reserva"
Cliente --> "Cancelar Reserva"
Taquilla --> "Registrar Ingreso"
Cliente --> "Reservar Sala"
administrador --> "generar reportes"

@enduml
