# Reto Técnico – Automatización DatePicker 

## Descripción del proyecto
Este proyecto implementa la automatización de la funcionalidad **DatePicker** del sitio de ejemplo de jQuery UI (`https://jqueryui.com/datepicker/`) utilizando **Serenity BDD**, **Cucumber** y el patrón de diseño **Screenplay** en **Java**.  
El objetivo principal es validar que un usuario pueda **seleccionar una fecha en un mes diferente al actual** y que dicha fecha se refleje correctamente en el campo de entrada del formulario.

## Objetivo del proyecto
Garantizar, mediante pruebas automatizadas, que la funcionalidad de selección de fechas del DatePicker:
- Permita la selección de una fecha específica en un mes distinto al actual.
- Muestre la fecha seleccionada en el campo de texto.
- Sea fácilmente mantenible y ampliable siguiendo las buenas prácticas de automatización definidas por SQA.

---

### Funcionalidad automatizada
Historia de Usuario **HU-001 – Selección de fecha en un campo de formulario**:

> Como usuario de la aplicación, quiero poder seleccionar una fecha desde un calendario emergente en el campo de entrada, para evitar errores al ingresar fechas manualmente.

---

### Escenarios automatizados

1. **CP02 – Seleccionar una fecha en un mes diferente**  
   _Script_: `SelectDifferentMonthDateTest`  
   - Abrir la página del DatePicker de jQuery UI.  
   - Cambiar al iframe del demo.  
   - Abrir el calendario.  
   - Navegar al mes/año deseado.  
   - Seleccionar el día indicado.  
   - Verificar que el campo de fecha muestre una fecha válida (formato `MM/DD/YYYY`).

2. **Verificación del valor del campo de fecha**  
   - Validar que el campo de fecha muestre exactamente el valor esperado después de la selección ("03/15/2026"`).
![](Feacture.png)
---

## Tecnologías utilizadas

- **Lenguaje:** Java  
- **Patrón de diseño:** Screenplay (Serenity BDD Screenplay)  
- **Framework de automatización:** Serenity BDD + Cucumber  
- **Build tool:** Gradle  
- **Navegador:** Chrome (WebDriver administrado por Serenity)  
- **Análisis de código estático:** SonarQube  

---

## Estructura del proyecto

```text
Template_Automatizacion_SQA /
├── .gradle
├── gradle
│   └── wrapper
├── build
├── src
    └── test
        ├── java
        │   └── co
        │       └── sqasa
        │           ├── runners
        │           │   └── testRunner.java
        │           └── StepDef
        │               └── DatePickerStepDefinitions.java
        └── resources
            └── features
                └── test.feature
---

## Configuración y ejecución de las prueba

### Requisitos previos
- Java 8+ instalado y configurado en el **PATH**.
- Navegador **Google Chrome** instalado.
- Conexión a Internet (para abrir `https://jqueryui.com/datepicker/`).
- Gradle Wrapper incluido en el proyecto (uso de `./gradlew`).

## Evidencias

![](img2.png)
![](img3.png)
![](img4.png)
![](img5.png)
![](img6.png)




