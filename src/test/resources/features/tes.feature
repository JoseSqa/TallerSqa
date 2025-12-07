Feature: Selección de fecha en un mes diferente

  Como usuario de la aplicación
  Quiero seleccionar una fecha en un mes diferente al actual
  Para evitar errores al ingresar fechas manualmente

  Scenario: Seleccionar una fecha específica en un mes diferente al actual
    Given que el usuario abre el Datepicker de jQuery
    When selecciona el dia "15" del mes "March" del anio "2026"
    Then la fecha seleccionada debe mostrarse en el campo de fecha




