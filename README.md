# 📝 Sistema de Gestión de Tareas Colaborativas

**Proyecto de Programación Orientada a Objetos – 
Primer entregable**

**Construcción:** Gradle

**Ejecución:** Consola (datos quemados)

---

## Descripción general del proyecto

Este proyecto implementa un **sistema de gestión de tareas y recordatorios**, permitiendo que distintos usuarios creen, organicen y administren elementos personales.
La idea principal es aplicar correctamente los fundamentos de la **Programación Orientada a Objetos (POO)**:

* Abstracción
* Herencia
* Polimorfismo
* Encapsulamiento

En este primer entregable **solo se trabaja en consola**, sin interfaz gráfica, y se utilizan **datos quemados** para probar el funcionamiento.

---

## Objetivos del Entregable 1: Modelado y estructura inicial

El entregable tiene como propósito:

* Diseñar el modelo del sistema usando UML.
* Aplicar clases abstractas e interfaces.
* Demostrar herencia, polimorfismo y encapsulamiento mediante las clases del proyecto.
* Implementar el modelo UML en Java utilizando Gradle.
* Crear un conjunto de pruebas mediante **datos quemados** en el método `main`.
* Mostrar la creación, validación y visualización de tareas y recordatorios.
* Probar el comportamiento de usuarios clásicos y premium.

---

## Estructura del modelo: Clases principales
Las clases más importantes implementadas son:

### 🟦 **Elemento (abstracta)**

Clase base para Tarea y Recordatorio, contiene:

* id
* título
* descripción
* prioridad
* tipo de elemento
* métodos comunes

### 🟦 **Tarea**

Agrega:

* estado
* categoría
* validación de duplicados

### 🟦 **Recordatorio**

Agrega:

* fecha
* estado de alerta
* validación de duplicados

### 🟦 **Usuario (abstracta)**

Cualquier usuario posee:

* id
* nombre
* correo
* contraseña
* gestor de tareas
* gestor de recordatorios

### 🟦 **UsuarioClásico**

* Máximo 5 tareas
* Recordatorios ilimitados

### 🟦 **UsuarioPremium**

* Tareas y recordatorios ilimitados

---

## Guía de uso del proyecto en Java

### ✔ Cómo ejecutar el proyecto en IntelliJ

1. Abre el repositorio en IntelliJ.
2. Asegúrarse de que Gradle haya sincronizado (barra lateral derecha → botón de recargar).
3. Ir a:

```
src/main/java/Main.java
```

4. Clic derecho → **Run 'Main.main()'**
5. Observar los resultados en la consola.

---

## Indicaciones para probar el proyecto

La ejecución del `Main` realiza automáticamente pruebas del sistema usando **datos quemados**.

Incluye:

### 🔹 **1. Registro de usuarios**

Se crean:

* UsuarioClásico (5 tareas máx.)
* UsuarioPremium (sin límite)

### 🔹 **2. Login**

Se prueba el método `autenticar`.

### 🔹 **3. Gestión de tareas**

* Agregar tareas
* Validar duplicados
* Validar límites según tipo de usuario

### 🔹 **4. Gestión de recordatorios**

* Agregar recordatorios
* Validar duplicados

### 🔹 **5. Impresión de resultados**

* Muestra todas las tareas y recordatorios de cada usuario
* Muestra mensajes específicos cuando hay límites o duplicados

---

## Ejemplos prácticos de entrada y salida

### ✔  Ejemplo de creación de tareas por un usuario clásico:

```java
Tarea t1 = new Tarea(1, "Estudiar", TipoElemento.TAREA, "POO examen",
                    Prioridad.ALTA, Estado.PENDIENTE, "Estudio");

u1.crearTarea(t1);
```

### ✔ Ejemplo de detección de tarea duplicada:

```java
Tarea t3 = new Tarea(3, "Estudiar", TipoElemento.TAREA, "POO examen",
                     Prioridad.ALTA, Estado.PENDIENTE, "Estudio");
// → El sistema marca duplicado
u1.crearTarea(t3);
```

### ✔ Límite de tareas para usuario clásico:

```
Alcanzaste el limite de tareas
```

### ✔ Ejemplo de salida final (fragmento):

```
=== USUARIO CLÁSICO ===
Nombre: Angel
Correo: angel@gmail.com

--- TAREAS ---
ID: 1
Titulo: Estudiar
Tipo: TAREA
Descripcion: POO examen
Prioridad: ALTA
Estado: PENDIENTE
Categoria: Estudio
---------------------------
...
```