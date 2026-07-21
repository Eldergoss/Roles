# Sistema de Gestión de Usuarios (Java)

Proyecto desarrollado como práctica de Programación Orientada a Objetos (POO) en Java.

El objetivo es simular un sistema de administración de usuarios mediante distintos niveles de permisos utilizando herencia, encapsulamiento y composición.

---

## Características

- Crear usuarios.
- Agregar usuarios al sistema.
- Eliminar usuarios.
- Promover usuarios a administradores.
- Visualizar usuarios registrados.
- Visualizar administradores registrados.

---

## Arquitectura

### User

Clase base del sistema.

Responsabilidades:

- Almacenar información del usuario.
- Definir el rol del usuario.

Atributos principales:

- nombre
- correo
- contraseña
- rol

---

### Admin

Hereda de `User`.

Responsabilidades:

- Agregar usuarios al tablero.
- Eliminar usuarios.
- Consultar la lista de usuarios.

---

### SuperAdmin

Hereda de `User`.

Responsabilidades:

- Promover usuarios a administradores.
- Consultar la lista de administradores.
- Eliminar administradores (en desarrollo).

---

### Tablero

Clase encargada únicamente de almacenar la información del sistema.

Responsabilidades:

- Mantener la lista de usuarios.
- Mantener la lista de administradores.
- Proporcionar métodos para agregar, eliminar y consultar dichas listas.

---

## Modelo del proyecto

```
                 User
                   ▲
          ┌────────┴────────┐
          │                 │
        Admin         SuperAdmin
          │                 │
          └────────┬────────┘
                   │
              interactúan con
                   │
                Tablero
         ┌─────────┴─────────┐
         │                   │
     Usuarios             Administradores
```

---

## Conceptos aplicados

- Programación Orientada a Objetos (POO)
- Herencia
- Encapsulamiento
- Polimorfismo
- Composición
- Responsabilidad única (SRP)
- Comunicación entre objetos

---

## Flujo de trabajo

1. Se crea un `Tablero`.
2. Se crean los usuarios.
3. Un `Admin` agrega usuarios al tablero.
4. Un `SuperAdmin` promueve usuarios a administradores.
5. El sistema mantiene listas separadas para usuarios y administradores.

---

## Tecnologías

- Java
- ArrayList
- Programación Orientada a Objetos

---

## Estado del proyecto

En desarrollo.

### Próximas mejoras

- Evitar usuarios duplicados.
- Buscar usuarios por nombre.
- Convertir listas en colecciones más robustas.
- Implementar autenticación.
- Mejorar el manejo de permisos.
- Separar completamente la lógica del dominio.
